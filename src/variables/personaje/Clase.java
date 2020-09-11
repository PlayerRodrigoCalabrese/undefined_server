package variables.personaje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import estaticos.Constantes;

public class Clase {
	private final int _id;
    private int _PDV = 50;
	private final short _mapaInicio, _celdaInicio;
	private final ArrayList<Integer> _gfxs = new ArrayList<>(3);
	private final ArrayList<Integer> _tallas = new ArrayList<>(3);
	private final ArrayList<BoostStat> _boostFuerza = new ArrayList<>();
	private final ArrayList<BoostStat> _boostInteligencia = new ArrayList<>();
	private final ArrayList<BoostStat> _boostVitalidad = new ArrayList<>();
	private final ArrayList<BoostStat> _boostSabiduria = new ArrayList<>();
	private final ArrayList<BoostStat> _boostAgilidad = new ArrayList<>();
	private final ArrayList<BoostStat> _boostSuerte = new ArrayList<>();
	private final Map<Integer, Integer> _stats = new HashMap<>();
	private final Map<Integer, Integer> _hechizos = new HashMap<>();
	
	public Clase(int id, String gfxs, String tallas, short mapaInicio, short celdaInicio, int PDV, String boostVitalidad,
	String boostSabiduria, String boostFuerza, String boostInteligencia, String boostAgilidad, String boostSuerte,
	String stats, String hechizos) {
		_id = id;
		_mapaInicio = mapaInicio;
		_celdaInicio = celdaInicio;
		_PDV = PDV;
		for (String s : gfxs.split(",")) {
			try {
				_gfxs.add(Integer.parseInt(s));
			} catch (Exception ignored) {}
		}
		for (String s : tallas.split(",")) {
			try {
				_tallas.add(Integer.parseInt(s));
			} catch (Exception ignored) {}
		}
		addBoostStat(boostVitalidad, _boostVitalidad);
		addBoostStat(boostSabiduria, _boostSabiduria);
		addBoostStat(boostFuerza, _boostFuerza);
		addBoostStat(boostInteligencia, _boostInteligencia);
		addBoostStat(boostAgilidad, _boostAgilidad);
		addBoostStat(boostSuerte, _boostSuerte);
		for (String s : stats.split("\\|")) {
			try {
				_stats.put(Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1]));
			} catch (Exception ignored) {}
		}
		for (String s : hechizos.split("\\|")) {
			try {
				_hechizos.put(Integer.parseInt(s.split(",")[1]), Integer.parseInt(s.split(",")[0]));
			} catch (Exception ignored) {}
		}
	}
	
	private void addBoostStat(String sBoost, ArrayList<BoostStat> boost) {
		for (String s : sBoost.split("\\|")) {
			try {
				String[] ss = s.split(",");
				int inicio = Integer.parseInt(ss[0]);
				int coste = Integer.parseInt(ss[1]);
				int puntos = 1;
				try {
					puntos = Integer.parseInt(ss[2]);
				} catch (Exception ignored) {}
				boost.add(new BoostStat(inicio, coste, puntos));
			} catch (Exception ignored) {}
		}
	}
	
	public BoostStat getBoostStat(int statID, int valorStat) {
		ArrayList<BoostStat> boosts = switch (statID) {
			case Constantes.STAT_MAS_VITALIDAD -> _boostVitalidad;
			case Constantes.STAT_MAS_FUERZA -> _boostFuerza;
			case Constantes.STAT_MAS_INTELIGENCIA -> _boostInteligencia;
			case Constantes.STAT_MAS_AGILIDAD -> _boostAgilidad;
			case Constantes.STAT_MAS_SUERTE -> _boostSuerte;
			default -> _boostSabiduria;
		};
		BoostStat boost = BoostStat.BoostDefecto;
		int temp = -1;
		for (BoostStat b : boosts) {
			if (b._inicio <= valorStat && b._inicio > temp) {
				temp = b._inicio;
				boost = b;
			}
		}
		return boost;
	}
	
	public void aprenderHechizo(Personaje perso, int nivel) {
		for (Entry<Integer, Integer> entry : _hechizos.entrySet()) {
			if (entry.getValue() == nivel) {
				perso.fijarNivelHechizoOAprender(entry.getKey(), 1, false);
			}
		}
	}
	
	public int getID() {
		return _id;
	}
	
	public short getMapaInicio() {
		return _mapaInicio;
	}
	
	public short getCeldaInicio() {
		return _celdaInicio;
	}
	
	public int getPDV() {
		return _PDV;
	}
	
	public Map<Integer, Integer> getStats() {
		return _stats;
	}
	
	public int getGfxs(int index) {
		try {
			return _gfxs.get(index);
		} catch (Exception e) {
			return (_id * 10) + 3;
		}
	}
	
	public int getTallas(int index) {
		try {
			return _tallas.get(index);
		} catch (Exception e) {
			return 100;
		}
	}
	public static class BoostStat {
		public static BoostStat BoostDefecto = new BoostStat(0, 1, 1);
		private final int _inicio;
        private final int _coste;
        private final int _puntos;
		
		public BoostStat(int inicio, int coste, int puntos) {
			_inicio = inicio;
			_coste = coste;
			_puntos = puntos;
		}
		
		public int getCoste() {
			return _coste;
		}
		
		public int getPuntos() {
			return _puntos;
		}
	}
}
