package variables.hechizo;

import java.util.ArrayList;
import variables.mapa.Celda;
import variables.pelea.Luchador;
import variables.pelea.Pelea;
import estaticos.MainServidor;
import estaticos.Mundo;

public class Buff extends EfectoHechizo {
	private final Luchador _lanzador;
	private int _turnoRestantes;
	private boolean _desbuffeable;
	private String _condicionBuff = "";
	// por el momento las condiciones son
	// SOIN, BN,DN,DE,DA,DW,DF,-PA,-PM,PA,PM
	private final TipoDaño _tipo;
	
	public Buff(final int efectoID, final int hechizoID, final boolean desbufeable, final int turnos,
	final Luchador lanzador, final String args, final TipoDaño tipo) {
		super(hechizoID);
		_efectoID = efectoID;
		_desbuffeable = desbufeable;
		_turnoRestantes = turnos <= -1 ? -3 : turnos;
		_duracion = 0;
		_lanzador = lanzador;
		if (tipo == TipoDaño.GLIFO || tipo == TipoDaño.TRAMPA) {
			_tipo = tipo;
		} else {
			_tipo = TipoDaño.POST_TURNOS;
		}
		setArgs(args);
	}
	
	@Override
	public void setArgs(String args) {
		_args = args;
		final String[] split = _args.split(",");
		try {
			_primerValor = Integer.parseInt(split[0]);// valor
		} catch (final Exception ignored) {}
		try {
			_segundoValor = Integer.parseInt(split[1]);// valor max
		} catch (final Exception ignored) {}
		try {
			_tercerValor = Integer.parseInt(split[2]);
		} catch (final Exception ignored) {}
	}
	
	public void setCondBuff(String condicion) {
		_condicionBuff = condicion.toUpperCase();
	}
	
	public String getCondicionBuff() {
		return _condicionBuff;
	}
	
	public int getTurnosRestantes(boolean puedeJugar) {
		if (!puedeJugar || _turnoRestantes <= -1) {
			return _turnoRestantes;
		}
		return _turnoRestantes - 1;
	}
	
	public int getTurnosRestantesOriginal() {
		return _turnoRestantes;
	}
	
	public int disminuirTurnosRestantes() {
		if (_turnoRestantes > 0) {
			_turnoRestantes--;
		}
		return _turnoRestantes;
	}
	
	public boolean esDesbufeable() {
		return _desbuffeable;
	}
	
	public void setDesbufeable(boolean b) {
		_desbuffeable = b;
	}
	
	public Luchador getLanzador() {
		return _lanzador;
	}
	
	public void aplicarBuffDeInicioTurno(final Pelea pelea, Luchador objetivo) {
		try {
			ArrayList<Luchador> obj2 = new ArrayList<>();
			obj2.add(objetivo);
			switch (_efectoID) {
// Daños Neutral %vida del atacante
				case 85, 86, 87, 88, 89 -> {
					efecto_Daños_Porc_Elemental(obj2, pelea, _lanzador, _tipo, false);
					return;
				}
// Robar Vida(neutral)
				case 91, 92, 93, 94, 95 -> {
					efecto_Roba_PDV_Elemental(obj2, pelea, _lanzador, _tipo, false);
					return;
				}
// Daños Neutral
				case 96, 97, 98, 99, 100 -> {
					efecto_Daños_Elemental(obj2, pelea, _lanzador, _tipo, false);
					return;
				}
// Cura, PDV devueltos
				case 81, 108 -> {
					efecto_Cura(obj2, pelea, _lanzador, _tipo);
					return;
				}
				case 301 -> {
					aplicarHechizoDeBuff(pelea, objetivo, objetivo.getCeldaPelea());
					return;
				}
// activa un hechizo despues de varios turnos
				case 787 -> {
					aplicarHechizoDeBuff(pelea, objetivo, objetivo.getCeldaPelea());
					return;
				}
			}
		} catch (Exception e) {
			MainServidor.redactarLogServidorln("EXCEPTION BUFF INICIO, HECHIZO:" + _hechizoID + ", ARGS:" + _args);
			e.printStackTrace();
		}
	}
	
	public void aplicarBuffCondicional(Luchador objetivo) {
		ArrayList<Luchador> objetivos = new ArrayList<>();
		objetivos.add(objetivo);
		String c = _condicionBuff;
		_condicionBuff = "";
		aplicarEfecto(objetivo.getPelea(), objetivo, objetivos, objetivo.getCeldaPelea(), _tipo, false);
		_condicionBuff = c;
	}
	
	public void aplicarHechizoDeBuff(Pelea pelea, Luchador objetivo, Celda celdaObjetivo) {
		final Hechizo hechizo = Mundo.getHechizo(_primerValor);
		if (hechizo == null) {
			return;
		}
		StatHechizo sh = hechizo.getStatsPorNivel(_segundoValor);
		if (sh == null) {
			return;
		}
		Hechizo.aplicaHechizoAPelea(pelea, objetivo, celdaObjetivo, sh.getEfectosNormales(), TipoDaño.NORMAL, false);
	}
}