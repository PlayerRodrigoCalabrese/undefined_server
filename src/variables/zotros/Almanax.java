package variables.zotros;

import estaticos.Mundo.Duo;

public class Almanax {
	private final int _id;
	private final int _tipo;
	private final int _bonus;
	private final Duo<Integer, Integer> _ofrenda;
	
	public Almanax(int id, int tipo, int bonus, String ofrenda) {
		_id = id;
		_tipo = tipo;
		_bonus = bonus;
		int idObjeto = Integer.parseInt(ofrenda.split(",")[0]);
		int cantidad = Integer.parseInt(ofrenda.split(",")[1]);
		_ofrenda = new Duo<>(idObjeto, cantidad);
	}
	
	public Duo<Integer, Integer> getOfrenda() {
		return _ofrenda;
	}
	
	public int getID() {
		return _id;
	}
	
	public int getTipo() {
		return _tipo;
	}
	
	public int getBonus() {
		return _bonus;
	}
}
