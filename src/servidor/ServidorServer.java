package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import variables.personaje.Cuenta;
import variables.personaje.Personaje;
import estaticos.Constantes;
import estaticos.GestorSQL;
import estaticos.GestorSalida;
import estaticos.MainServidor;
import estaticos.Mundo;
import servidor.ServidorThread.*;

public class ServidorServer extends Thread {
	private static ServerSocket _serverSocket;
	private static final Map<String, ArrayList<ServidorSocket>> _IpsClientes = new ConcurrentHashMap<>();
	private static final CopyOnWriteArrayList<ServidorSocket> _clientes = new CopyOnWriteArrayList<>();
	private static final CopyOnWriteArrayList<Cuenta> _cuentasEspera = new CopyOnWriteArrayList<>();
	private static final CopyOnWriteArrayList<String> _IpsEspera = new CopyOnWriteArrayList<>();
	public static int _j = 0, _recordJugadores = 0;
	public static int[] _conexiones = new int[5];
	public static int _segundosON = 0;
	
	private static void contador() {
		if (!MainServidor.MENSAJE_TIMER_REBOOT.isEmpty() && MainServidor.SEGUNDOS_REBOOT_SERVER > 0) {
			Mundo.SEG_CUENTA_REGRESIVA = MainServidor.SEGUNDOS_REBOOT_SERVER;
			Mundo.MSJ_CUENTA_REGRESIVA = MainServidor.MENSAJE_TIMER_REBOOT;
		}
		if (MainServidor.PARAM_LOTERIA) {
			new IniciarLoteria();
		}
		Timer segundero = new Timer();
		segundero.schedule(new TimerTask() {
			public void run() {
				if (Mundo.SERVIDOR_ESTADO == Constantes.SERVIDOR_OFFLINE) {
					this.cancel();
					return;
				}
				new AumentarSegundos();
				if (MainServidor.PARAM_STOP_SEGUNDERO) {
					return;
				}
				if (MainServidor.SEGUNDOS_REBOOT_SERVER > 0) {
					MainServidor.SEGUNDOS_REBOOT_SERVER--;
					if (MainServidor.SEGUNDOS_REBOOT_SERVER == 0) {
						new Reiniciar(1);
						this.cancel();
						return;
					} else {
						final int segundosFaltan = MainServidor.SEGUNDOS_REBOOT_SERVER;
						if (segundosFaltan % 60 == 0) {
							int minutosFaltan = segundosFaltan / 60;
							if (minutosFaltan <= 60 && (minutosFaltan % 10 == 0 || minutosFaltan <= 5)) {
								new MensajeReset(minutosFaltan + " minutes");
							}
						}
					}
				}
				if (MainServidor.PARAM_ANTI_DDOS) {
					new AntiDDOS(_segundosON);
				}
				if (MainServidor.PARAM_LADDER_NIVEL) {
					if (_segundosON % 60 == 0) {
						new ActualizarLadder();
					}
				}
				if (MainServidor.SEGUNDOS_INACTIVIDAD > 0) {
					if (_segundosON % 3000 == 0) { // es 3000 para q se refresque rapido
						new ExpulsarInactivos();
					}
				}
				if (MainServidor.SEGUNDOS_SALVAR > 0) {
					if (_segundosON % MainServidor.SEGUNDOS_SALVAR == 0) {
						new SalvarServidor(false);
					}
				}
				if (MainServidor.SEGUNDOS_RESET_RATES > 0) {
					if (_segundosON % MainServidor.SEGUNDOS_RESET_RATES == 0) {
						new ResetRates();
					}
				}
				if (MainServidor.SEGUNDOS_LIVE_ACTION > 0) {
					if (_segundosON % MainServidor.SEGUNDOS_LIVE_ACTION == 0) {
						new LiveAction();
					}
				}
				if (MainServidor.SEGUNDOS_LIMPIAR_MEMORIA > 0) {
					if (_segundosON % MainServidor.SEGUNDOS_LIMPIAR_MEMORIA == 0) {
						new GarbageCollector();
					}
				}
				if (MainServidor.SEGUNDOS_ESTRELLAS_GRUPO_MOBS > 0) {
					if (_segundosON % MainServidor.SEGUNDOS_ESTRELLAS_GRUPO_MOBS == 0) {
						new SubirEstrellas();
					}
				}
				if (MainServidor.SEGUNDOS_DETECTAR_DDOS > 0) {
					if (_segundosON % MainServidor.SEGUNDOS_DETECTAR_DDOS == 0) {
						new DetectarDDOS();
					}
				}
				if (MainServidor.SEGUNDOS_MOVER_MONTURAS > 0) {
					if (_segundosON % MainServidor.SEGUNDOS_MOVER_MONTURAS == 0) {
						new MoverPavos();
					}
				}
				if (MainServidor.SEGUNDOS_MOVER_GRUPO_MOBS > 0) {
					if (_segundosON % MainServidor.SEGUNDOS_MOVER_GRUPO_MOBS == 0) {
						new MoverMobs();
					}
				}
				if (MainServidor.SEGUNDOS_PUBLICIDAD > 0) {
					if (_segundosON % MainServidor.SEGUNDOS_PUBLICIDAD == 0) {
						new Publicidad();
					}
				}
				if (MainServidor.PARAM_LOTERIA) {
					if (Mundo.SEG_CUENTA_REGRESIVA > 0) {
						if (Mundo.SEG_CUENTA_REGRESIVA - 1 == 0) {
							if (Mundo.MSJ_CUENTA_REGRESIVA.equalsIgnoreCase("LOTERIA")) {
								new SortearLoteria();
							} else {
								GestorSalida.ENVIAR_ÑL_BOTON_LOTERIA_TODOS(false);
							}
						}
					} else if (_segundosON % 3600 == 0) {
						new IniciarLoteria();
					}
				}
				if (Mundo.SEG_CUENTA_REGRESIVA > 0) {
					if (--Mundo.SEG_CUENTA_REGRESIVA == 0) {
						new BorrarCuentaRegresiva();
					}
				}
				if (MainServidor.PARAM_KOLISEO) {
					new Koliseo();
				}
				// new EmbarazoMonturas();
				// cada segundo
				new DisminuirFatiga();
				new CheckearObjInteractivos();
				new MoverRecaudadores();
				int dia = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
				if (Mundo.DIA_DEL_AÑO != dia) {
					Mundo.DIA_DEL_AÑO = dia;
					new ResetExpDia();
				}
			}
		}, 1000, 1000);
		Timer autoSelect = new Timer();
		autoSelect.schedule(new TimerTask() {
			public void run() {
				if (Mundo.SERVIDOR_ESTADO == Constantes.SERVIDOR_OFFLINE) {
					this.cancel();
					return;
				}
				GestorSQL.ES_IP_BANEADA("111.222.333.444");// para usar el sql y q no se crashee
			}
		}, 300000, 300000);
	}
	
	public ServidorServer() {
		try {
			contador();
			// muestra en el banner el tiempo para reboot
			_serverSocket = new ServerSocket(MainServidor.PUERTO_SERVIDOR);
			Thread _thread = new Thread(this);
			_thread.setDaemon(true);
			_thread.setPriority(MAX_PRIORITY);
			_thread.start();
			System.out.println("Aperturado el Servidor, PUERTO SERVIDOR " + MainServidor.PUERTO_SERVIDOR);
		} catch (final Exception e) {
			MainServidor.redactarLogServidorln("ERROR AL CREAR EL SERVIDOR PERSONAJE" + e.toString());
			e.printStackTrace();
			// System.exit(1);
		}
	}
	
	public void run() {
		try {
			while (true) {
				final Socket socket = _serverSocket.accept();
				_conexiones[_j]++;
				new ServidorSocket(socket);
			}
		} catch (final IOException e) {
			MainServidor.redactarLogServidorln("EXCEPTION IO RUN SERVIDOR SERVER (FOR COMMAND EXIT)");
		} catch (final Exception e) {
			MainServidor.redactarLogServidorln("EXCEPTION GENERAL RUN SERVIDOR SERVER : " + e.toString());
			e.printStackTrace();
		} finally {
			try {
				if (!_serverSocket.isClosed()) {
					_serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			MainServidor.redactarLogServidorln("FINALLY SERVIDOR SERVER - CERRANDO SERVIDOR");
		}
	}
	
	public static void cerrarSocketServidor() {
		try {
			for (final ServidorSocket ep : _clientes) {
				ep.cerrarSocket(false, "cerrarServidor()");
			}
			MainServidor.redactarLogServidor(" SE EXPULSARON LOS CLIENTES ");
			if (!_serverSocket.isClosed()) {
				_serverSocket.close();
			}
		} catch (Exception e) {
			MainServidor.redactarLogServidorln("EXCEPTION CERRAR SERVIDOR : " + e.toString());
			e.printStackTrace();
		}
	}
	
	public static int getSegundosON() {
		return _segundosON;
	}
	
	public static int getRecordJugadores() {
		return _recordJugadores;
	}
	
	public static CopyOnWriteArrayList<ServidorSocket> getClientes() {
		return _clientes;
	}
	
	public static ServidorSocket getCliente(final int b) {
		return _clientes.get(b);
	}
	
	public static void addIPsClientes(ServidorSocket s) {
		String ip = s.getActualIP();
		_IpsClientes.computeIfAbsent(ip, k -> new ArrayList<ServidorSocket>());
		if (!_IpsClientes.get(ip).contains(s)) {
			_IpsClientes.get(ip).add(s);
		}
	}
	
	public static void borrarIPsClientes(ServidorSocket s) {
		String ip = s.getActualIP();
		if (_IpsClientes.get(ip) == null) {
			return;
		}
		_IpsClientes.get(ip).remove(s);
	}
	
	public static int getIPsClientes(String ip) {
		if (_IpsClientes.get(ip) == null) {
			return 0;
		}
		return _IpsClientes.get(ip).size();
	}
	
	public static void addCliente(ServidorSocket socket) {
		if (socket == null) {
			return;
		}
		addIPsClientes(socket);
		_clientes.add(socket);
		if (_clientes.size() > _recordJugadores) {
			_recordJugadores = _clientes.size();
		}
	}
	
	public static void borrarCliente(final ServidorSocket socket) {
		if (socket == null) {
			return;
		}
		borrarIPsClientes(socket);
		_clientes.remove(socket);
	}
	
	public static int nroJugadoresLinea() {
		return _clientes.size();
	}
	
	public static void delEsperandoCuenta(final Cuenta cuenta) {
		if (cuenta == null) {
			return;
		}
		_cuentasEspera.remove(cuenta);
	}
	
	public static void addEsperandoCuenta(final Cuenta cuenta) {
		if (cuenta != null) {
			_cuentasEspera.add(cuenta);
		}
	}
	
	public static Cuenta getEsperandoCuenta(final int id) {
		for (final Cuenta cuenta : _cuentasEspera) {
			if (cuenta.getID() == id) {
				return cuenta;
			}
		}
		return null;
	}
	
	public static boolean borrarIPEspera(final String ip) {
		return _IpsEspera.remove(ip);
	}
	
	public static void addIPEspera(final String ip) {
		_IpsEspera.add(ip);
	}
	
	public static String clientesDisponibles() {
		final ArrayList<String> IPs = new ArrayList<>();
		for (final ServidorSocket ep : _clientes) {
			try {
				if (!IPs.contains(ep.getActualIP())) {
					IPs.add(ep.getActualIP());
				}
			} catch (final Exception ignored) {}
		}
		return "IP Availables for attack: " + IPs.size();
	}
	
	public static String listaClientesBug(int segundos) {
		StringBuilder str = new StringBuilder();
		for (final ServidorSocket ep : _clientes) {
			try {
				if (ep.getPersonaje() != null) {
					if (!ep.getPersonaje().enLinea()) {
						ep.cerrarSocket(true, "listaClientesBug(1)");
						str.append("\n").append(ep.getActualIP());
					}
				} else {
					if (System.currentTimeMillis() - ep.getTiempoUltPacket() > segundos * 1000) {
						ep.cerrarSocket(true, "listaClientesBug(2)");
						str.append("\n").append(ep.getActualIP());
					}
				}
			} catch (final Exception ignored) {}
		}
		return str.toString();
	}
	
	public static int borrarClientesBug(int segundos) {
		int i = 0;
		for (final ServidorSocket ep : _clientes) {
			try {
				if (ep.getPersonaje() != null) {
					if (!ep.getPersonaje().enLinea()) {
						ep.cerrarSocket(true, "borrarClientesBug(1)");
						i++;
					}
				} else {
					if (System.currentTimeMillis() - ep.getTiempoUltPacket() > (segundos * 1000)) {
						ep.cerrarSocket(true, "borrarClientesBug(2)");
						i++;
					}
				}
			} catch (final Exception ignored) {}
		}
		return i;
	}
	
	public static String getHoraHoy(Personaje perso) {
		final Calendar hoy = Calendar.getInstance();
		if (perso.esDeDia()) {
			hoy.set(Calendar.HOUR_OF_DAY, MainServidor.HORA_DIA);
			hoy.set(Calendar.MINUTE, MainServidor.MINUTOS_DIA);
		} else if (perso.esDeNoche()) {
			hoy.set(Calendar.HOUR_OF_DAY, MainServidor.HORA_NOCHE);
			hoy.set(Calendar.MINUTE, MainServidor.MINUTOS_NOCHE);
		}
		return "BT" + (hoy.getTimeInMillis());// + hoy.getTimeZone().getRawOffset()
	}
	
	public static String getFechaHoy() {
		final Calendar hoy = Calendar.getInstance();
		StringBuilder dia = new StringBuilder(hoy.get(Calendar.DAY_OF_MONTH) + "");
		while (dia.length() < 2) {
			dia.insert(0, "0");
		}
		StringBuilder mes = new StringBuilder((hoy.get(Calendar.MONTH)) + "");
		while (mes.length() < 2) {
			mes.insert(0, "0");
		}
		int año = hoy.get(Calendar.YEAR);
		return "BD" + año + "|" + mes + "|" + dia;
	}
}
