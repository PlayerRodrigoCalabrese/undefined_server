package variables.personaje;

import estaticos.Constantes;

public class SetRapido {
	private final int _id;
    private final int _icono;
	private final int[] _objetos = new int[18];
	private final String _nombre;
	
	public SetRapido(int id, String nombre, int icono, String data) {
		_id = id;
		_icono = icono;
		_nombre = nombre;
		for (String s : data.split(";")) {
			if (s.isEmpty()) {
				continue;
			}
			int idObjeto = Integer.parseInt(s.split(",")[0]);
			int posObjeto = Integer.parseInt(s.split(",")[1]);
			try {
				_objetos[posObjeto] = idObjeto;
			} catch (Exception ignored) {}
		}
	}
	
	public boolean actualizarObjetos(int oldID, int newID, byte oldPos, byte newPos) {
		boolean b = false;
		for (byte i = 0; i < _objetos.length; i++) {
			if ((oldPos == Constantes.OBJETO_POS_NO_EQUIPADO || oldPos == i) && _objetos[i] == oldID) {
				if (newPos != i) {
					b = true;
					_objetos[i] = newID;
				}
			}
		}
		return b;
	}
	
	public int getID() {
		return _id;
	}
	
	public String getNombre() {
		return _nombre;
	}
	
	public int[] getObjetos() {
		return _objetos;
	}
	
	public String getString() {
		StringBuilder data = new StringBuilder();
		for (byte i = 0; i < _objetos.length; i++) {
			if (_objetos[i] <= 0) {
				continue;
			}
			if (data.length() > 0) {
				data.append(";");
			}
			data.append(_objetos[i]).append(",").append(i);
		}
		return _id + "|" + _nombre + "|" + _icono + "|" + data.toString();
	}
}