package variables.mision;
public class MisionPregunta {
	private final int _id;
	private final int _npc;
	private final String _condicion;
	
	public MisionPregunta(int id, int npc, String condicion) {
		_id = id;
		_npc = npc;
		_condicion = condicion;
	}
	
	public int getPreguntaID() {
		return _id;
	}
	
	public int getNPCID() {
		return _npc;
	}
	
	public String getCondicion() {
		return _condicion;
	}
}
