package servidor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import estaticos.Constantes;
import estaticos.GestorSQL;
import estaticos.GestorSalida;
import estaticos.MainServidor;
import estaticos.Mundo;
import sincronizador.SincronizadorSocket;

public abstract class ServidorThread extends Thread {
	private static HashMap<String, Boolean> ACTIVOS = new HashMap<>();
	private String _nameClass;
	
	public ServidorThread() {
		_nameClass = this.getClass().getSimpleName();
	}
	
	public void load(int priority) {
		if (ACTIVOS.containsKey(_nameClass) && ACTIVOS.get(_nameClass)) {
			return;
		}
		ACTIVOS.put(_nameClass, true);
		this.setDaemon(true);
		this.setPriority(priority);
		this.start();
	}
	
	abstract void exec();
	
	public void run() {
		exec();
		ACTIVOS.put(_nameClass, false);
	}
	public static class Reiniciar extends ServidorThread {
		private int _i = 0;
		
		public Reiniciar(int i) {
			_i = 0;
			load(10);
		}
		
		public void exec() {
			System.exit(_i);
		}
	}
	public static class SalvarServidor extends ServidorThread {
		private boolean _inclusoOffline = false;
		
		public SalvarServidor(boolean inclusoOffline) {
			_inclusoOffline = inclusoOffline;
			load(9);
		}
		
		public void exec() {
			if (Mundo.SERVIDOR_ESTADO == Constantes.SERVIDOR_SALVANDO) {
				MainServidor.redactarLogServidorln(
				"Se esta intentando salvar el servidor, cuando este ya se esta salvando (MUNDO DOFUS)");
			} else {
				GestorSalida.ENVIAR_Im_INFORMACION_A_TODOS("1164");
				Mundo.salvarServidor(_inclusoOffline);
				GestorSalida.ENVIAR_Im_INFORMACION_A_TODOS("1165");
			}
		}
	}
	public static class RefrescarTodosMobs extends ServidorThread {
		public RefrescarTodosMobs() {
			load(5);
		}
		
		public void exec() {
			Mundo.refrescarTodosMobs();
		}
	}
	public static class ResetRates extends ServidorThread {
		public ResetRates() {
			load(5);
		}
		
		public void exec() {
			MainServidor.resetRates();
			GestorSalida.ENVIAR_Im_INFORMACION_A_TODOS("1FINISH_SUPER_RATES");
			MainServidor.SEGUNDOS_RESET_RATES = 0;
		}
	}
	public static class DisminuirFatiga extends ServidorThread {
		public DisminuirFatiga() {
			load(5);
		}
		
		public void exec() {
			Mundo.disminuirFatigaMonturas();
		}
	}
	public static class CheckearObjInteractivos extends ServidorThread {
		public CheckearObjInteractivos() {
			load(5);
		}
		
		public void exec() {
			Mundo.checkearObjInteractivos();
		}
	}
	public static class MoverPavos extends ServidorThread {
		public MoverPavos() {
			load(5);
		}
		
		public void exec() {
			Mundo.moverMonturas();
		}
	}
	public static class MoverRecaudadores extends ServidorThread {
		public MoverRecaudadores() {
			load(5);
		}
		
		public void exec() {
			Mundo.moverRecaudadores();
		}
	}
	public static class MoverMobs extends ServidorThread {
		public MoverMobs() {
			load(5);
		}
		
		public void exec() {
			Mundo.moverMobs();
		}
	}
	public static class ResetExpDia extends ServidorThread {
		public ResetExpDia() {
			load(5);
		}
		
		public void exec() {
			Mundo.resetExpDia();
		}
	}
	public static class SubirEstrellas extends ServidorThread {
		public SubirEstrellas() {
			load(5);
		}
		
		public void exec() {
			Mundo.subirEstrellasMobs(1);
		}
	}
	public static class IniciarLoteria extends ServidorThread {
		public IniciarLoteria() {
			load(5);
		}
		
		public void exec() {
			Mundo.iniciarLoteria();
		}
	}
	public static class AumentarSegundos extends ServidorThread {
		public AumentarSegundos() {
			ServidorServer._segundosON++;
			load(5);
		}
		
		public void exec() {
			SincronizadorSocket.sendPacket("C" + ServidorServer.nroJugadoresLinea(), false);
		}
	}
	public static class SortearLoteria extends ServidorThread {
		public SortearLoteria() {
			load(5);
		}
		
		public void exec() {
			Mundo.sortearBoletos();
		}
	}
	public static class BorrarCuentaRegresiva extends ServidorThread {
		public BorrarCuentaRegresiva() {
			load(5);
		}
		
		public void exec() {
			if (MainServidor.SEGUNDOS_REBOOT_SERVER > 0) {
				Mundo.SEG_CUENTA_REGRESIVA = MainServidor.SEGUNDOS_REBOOT_SERVER;
			}
			Mundo.MSJ_CUENTA_REGRESIVA = MainServidor.MENSAJE_TIMER_REBOOT;
			GestorSalida.ENVIAR_bRS_PARAR_CUENTA_REGRESIVA_TODOS();
		}
	}
	public static class ActualizarLadder extends ServidorThread {
		public ActualizarLadder() {
			load(5);
		}
		
		public void exec() {
			Mundo.actualizarRankings();
		}
	}
	public static class Koliseo extends ServidorThread {
		public Koliseo() {
			Mundo.SEGUNDOS_INICIO_KOLISEO--;
			load(5);
		}
		
		public void exec() {
			if (Mundo.SEGUNDOS_INICIO_KOLISEO == 60) {
				GestorSalida.ENVIAR_Im_INFORMACION_KOLISEO("1KOLISEO_1_MINUTO_INICIA");
			} else if (Mundo.SEGUNDOS_INICIO_KOLISEO == 5) {
				GestorSalida.ENVIAR_Im_INFORMACION_KOLISEO("1KOLISEO_5_SEGUNDOS_INICIA");
			} else if (Mundo.SEGUNDOS_INICIO_KOLISEO == 0) {
				Mundo.iniciarKoliseo();
			}
		}
	}
	public static class LiveAction extends ServidorThread {
		public LiveAction() {
			load(5);
		}
		
		public void exec() {
			GestorSQL.CARGAR_LIVE_ACTION();
			GestorSQL.VACIAR_LIVE_ACTION();
		}
	}
	public static class ExpulsarInactivos extends ServidorThread {
		public ExpulsarInactivos() {
			load(5);
		}
		
		public void exec() {
			Mundo.expulsarInactivos();
		}
	}
	public static class GarbageCollector extends ServidorThread {
		public GarbageCollector() {
			load(8);
		}
		
		public void exec() {
			System.gc();
		}
	}
	public static class MensajeReset extends ServidorThread {
		private String _str;
		
		public MensajeReset(final String str) {
			_str = str;
			load(5);
		}
		
		public void exec() {
			GestorSalida.ENVIAR_Im_INFORMACION_A_TODOS("115;" + _str);
		}
	}
	public static class Publicidad extends ServidorThread {
		private String _str;
		private static int _nroPub = 0;
		
		public Publicidad() {
			if (MainServidor.PUBLICIDAD.isEmpty()) {
				return;
			}
			_str = MainServidor.PUBLICIDAD.get(_nroPub);
			_nroPub++;
			if (_nroPub >= MainServidor.PUBLICIDAD.size()) {
				_nroPub = 0;
			}
			load(5);
		}
		
		public void exec() {
			GestorSalida.ENVIAR_Im1223_MENSAJE_IMBORRABLE_TODOS(_str);
		}
	}
	public static class AntiDDOS extends ServidorThread {
		private int _minConexionesXSeg = 5;
		
		public AntiDDOS(int segundos) {
			load(5);
		}
		
		public void exec() {
			if (!Mundo.BLOQUEANDO) {
				boolean ataque = true;
				for (int i = 0; i < ServidorServer._conexiones.length; i++) {
					ataque &= ServidorServer._conexiones[i] > _minConexionesXSeg;
				}
				if (ataque) {
					Mundo.BLOQUEANDO = true;
					MainServidor.redactarLogServidorln("SE ACTIVO EL BLOQUEO AUTOMATICO CONTRA ATAQUES");
				}
			} else if (Mundo.BLOQUEANDO) {
				boolean ataque = true;
				for (int i = 0; i < ServidorServer._conexiones.length; i++) {
					ataque &= ServidorServer._conexiones[i] < _minConexionesXSeg;
				}
				if (ataque) {
					try {
						for (final ServidorSocket ss : ServidorServer.getClientes()) {
							if (ss.getPersonaje() == null) {
								// expulsa a los q no tienen personajes
								GestorSalida.ENVIAR_M0_MENSAJE_BASICOS_SVR_MUESTRA_DISCONNECT(ss, "16", "", "");
								ss.cerrarSocket(true, "Antiddos.run()");
							}
						}
					} catch (final Exception e) {}
					Mundo.BLOQUEANDO = false;
					MainServidor.redactarLogServidorln("SE DESACTIVO EL BLOQUEO AUTOMATICO CONTRA ATAQUES");
				}
			}
			ServidorServer._j = (ServidorServer._j + 1) % 5;
			ServidorServer._conexiones[ServidorServer._j] = 0;
		}
	}
	public static class DetectarDDOS extends ServidorThread {
		public DetectarDDOS() {
			load(5);
		}
		
		public void exec() {
			try {
				if (MainServidor.URL_DETECTAR_DDOS.isEmpty()) {
					return;
				}
				URL obj = new URL(MainServidor.URL_DETECTAR_DDOS);
				URLConnection con = obj.openConnection();
				con.setRequestProperty("Content-type", "charset=Unicode");
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				while ((in.readLine()) != null) {
					Thread.sleep(1);
				}
				in.close();
				if (!MainServidor.PARAM_JUGADORES_HEROICO_MORIR) {
					MainServidor.redactarLogServidorln("============= SE HA FINALIZADO ATAQUE DDOS (" + new Date()
					+ ") =============");
					MainServidor.PARAM_JUGADORES_HEROICO_MORIR = true;
					GestorSalida.ENVIAR_Im_INFORMACION_A_TODOS("1SERVER_RESTORING_ATTACK");
				}
			} catch (MalformedURLException | UnknownHostException e1) {
				if (MainServidor.PARAM_JUGADORES_HEROICO_MORIR) {
					MainServidor.redactarLogServidorln("============= SE DETECTO ATAQUE DDOS (" + new Date() + ") =============");
					MainServidor.PARAM_JUGADORES_HEROICO_MORIR = false;
					GestorSalida.ENVIAR_Im_INFORMACION_A_TODOS("1SERVER_IS_BEING_ATTACKED");
					Mundo.salvarServidor(false);
				}
			} catch (Exception e) {
				MainServidor.redactarLogServidorln("EXCEPTION DE DETECTAR DDOS: " + e.toString());
				e.printStackTrace();
			}
		}
	}
}
