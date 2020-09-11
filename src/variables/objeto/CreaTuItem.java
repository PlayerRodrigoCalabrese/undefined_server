package variables.objeto;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CreaTuItem {
	public static Map<Integer, Float> PRECIOS = new TreeMap<>();
	private final int _id;
	private final Map<Integer, Integer> _statsMaximos = new TreeMap<>();
	private final int _maxOgrinas;
	private final int _precioBase;
	
	public CreaTuItem(int _id, String _statsMaximos, int _maxOgrinas, int precioBase) {
		this._id = _id;
		for (String s : _statsMaximos.split("\\|")) {
			try {
				this._statsMaximos.put(Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1]));
			} catch (Exception ignored) {}
		}
		this._maxOgrinas = _maxOgrinas;
		this._precioBase = precioBase;
	}
	
	public int getMaxOgrinas() {
		return _maxOgrinas;
	}
	
	public int getMaximoStat(int stat) {
		if (_statsMaximos.get(stat) == null) {
			return 0;
		}
		return _statsMaximos.get(stat);
	}
	
	public String getMaximosStats() {
		StringBuilder s = new StringBuilder();
		for (Entry<Integer, Integer> entry : _statsMaximos.entrySet()) {
			if (s.length() > 0) {
				s.append(",");
			}
			s.append(entry.getKey()).append("*").append(entry.getValue());
		}
		return s.toString();
	}
	
	public int getID() {
		return _id;
	}
	
	public int getPrecioBase() {
		return _precioBase;
	}
}
