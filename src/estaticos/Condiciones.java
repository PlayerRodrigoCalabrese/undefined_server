package estaticos;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import variables.mapa.Mapa;
import variables.mision.Mision;
import variables.mob.GrupoMob;
import variables.mob.MobGradoModelo;
import variables.objeto.Objeto;
import variables.personaje.Personaje;
import variables.stats.Stats;
import variables.stats.TotalStats;
import com.singularsys.jep.Jep;

public class Condiciones {
	public static boolean validaCondiciones(final Personaje perso, String condiciones) {
		try {
			if (perso == null) {
				return false;
			}
			if (condiciones == null || condiciones.isEmpty() || condiciones.equals("BN") || condiciones.equals("-1")
			|| condiciones.equalsIgnoreCase("ALL")) {
				return true;
			}
			final Jep jep = new Jep();
			for (String s : splittear(condiciones)) {
				try {
					if (s.isEmpty()) {
						continue;
					}
					String cond = s.substring(0, 2);
					// ------------------------
					// ------------------------
					// DE AQUI PARA ABAJO SON ADD VARIABLE
					// ------------------------
					// ------------------------
					switch (cond) {
// drop fijo
						case "-1", "PX", "MK", "AO", "PN", "Pz", "DF" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), "true");
						case "BI" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), "false");
						case "Pj" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneOficio(s, perso));
						case "PJ" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneNivelOficio(s, perso));
						case "OR" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneObjetoRecibidoDespuesDeHoras(s, perso));
						case "DH" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneObjetoRecibidoDespuesDeHoras(s, perso));
						case "DM" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneObjetoRecibidoDespuesDeMinutos(s, perso));
						case "DS" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneObjetoRecibidoDespuesDeSegundos(s, perso));
						case "TE" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneEtapa(s, perso));
						case "TO" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneEstadoObjetivo(s, perso));
						case "TM" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneEstadoMision(s, perso));
						case "QO" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), confirmarObjetivoMision(s, perso));
						case "QE" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), confirmarEtapaMision(s, perso));
						case "SO" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneStatObjetoLlaveoAlma(s, perso));
						case "So" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneStatObjeto(s, perso));
						case "PO" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneObjModeloNoEquip(s, perso));
						case "EQ" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneObjModeloEquipado(s, perso));
// don
						case "Pg" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneDon(s, perso));
						case "XO" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), celdasOcupadasPersonajesOtroMapa(s, perso));
// celda ocupada personaje
						case "CO" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), celdasOcupadasPersonajes(s, perso));
// celda ocupada mob
						case "Co" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), celdasOcupadasMob(s, perso));
						case "Cr" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), celdasObjetoTirado(s, perso));
						case "PH" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneHechizo(s, perso));
						case "FM" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneMobsEnPelea(s, perso));
						case "MM" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneMobsEnMapa(s, perso));
						case "Is" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneObjetosSet(s, perso));
						case "IS" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneCantObjetosSet(s, perso));
						case "BS" -> condiciones = condiciones.replaceFirst(Pattern.quote(s), tieneCantBonusSet(s, perso));
						case "CI", "CV", "CA", "CW", "CC", "CS", "CM", "CP" -> {
							final TotalStats totalStas = perso.getTotalStats();
							jep.addVariable("CI", totalStas.getTotalStatParaMostrar(Constantes.STAT_MAS_INTELIGENCIA));
							jep.addVariable("CV", totalStas.getTotalStatParaMostrar(Constantes.STAT_MAS_VITALIDAD));
							jep.addVariable("CA", totalStas.getTotalStatParaMostrar(Constantes.STAT_MAS_AGILIDAD));
							jep.addVariable("CW", totalStas.getTotalStatParaMostrar(Constantes.STAT_MAS_SABIDURIA));
							jep.addVariable("CC", totalStas.getTotalStatParaMostrar(Constantes.STAT_MAS_SUERTE));
							jep.addVariable("CS", totalStas.getTotalStatParaMostrar(Constantes.STAT_MAS_FUERZA));
							jep.addVariable("CM", totalStas.getTotalStatParaMostrar(Constantes.STAT_MAS_PM));
							jep.addVariable("CP", totalStas.getTotalStatParaMostrar(Constantes.STAT_MAS_PA));
						}
						case "Ci", "Cv", "Ca", "Cw", "Cc", "Cs" -> {
							final Stats statsBase = perso.getTotalStats().getStatsBase();
							jep.addVariable("Ci", statsBase.getStatParaMostrar(Constantes.STAT_MAS_INTELIGENCIA));
							jep.addVariable("Cv", statsBase.getStatParaMostrar(Constantes.STAT_MAS_VITALIDAD));
							jep.addVariable("Ca", statsBase.getStatParaMostrar(Constantes.STAT_MAS_AGILIDAD));
							jep.addVariable("Cw", statsBase.getStatParaMostrar(Constantes.STAT_MAS_SABIDURIA));
							jep.addVariable("Cc", statsBase.getStatParaMostrar(Constantes.STAT_MAS_SUERTE));
							jep.addVariable("Cs", statsBase.getStatParaMostrar(Constantes.STAT_MAS_FUERZA));
						}
						case "PQ" -> jep.addVariable(cond, perso.getPreguntaID());
						case "PG" -> jep.addVariable(cond, perso.getClaseID(true));
						case "PD" -> jep.addVariable(cond, perso.getDeshonor());
						case "PK" -> jep.addVariable(cond, perso.getKamas());
						case "PF" -> jep.addVariable(cond, perso.getPelea() == null ? -1 : perso.getPelea().getTipoPelea());
						case "FP" -> jep.addVariable(cond, perso.getPelea() == null ? -1 : perso.getPelea().getProspeccionEquipo());
						case "Fp" -> jep.addVariable(cond, perso.getPelea() == null
								? -1
								: perso.getPelea().getLuchadorPorID(perso.getID()).getProspeccionLuchador());
						case "PL" -> jep.addVariable(cond, perso.getNivel());
						case "PP" -> jep.addVariable(cond, perso.getGradoAlineacion());
						case "Ps" -> jep.addVariable(cond, perso.getAlineacion());
						case "Pa" -> jep.addVariable(cond, perso.getOrdenNivel());
						case "Pr" -> jep.addVariable(cond, perso.getEspecialidad());
						case "PS" -> jep.addVariable(cond, perso.getSexo());
						case "PW" -> jep.addVariable(cond, perso.alasActivadas());
						case "PM" -> jep.addVariable(cond, perso.getGfxID(false));
						case "PR" -> jep.addVariable(cond, perso.getEsposoID() != 0);
						case "PC" -> jep.addVariable(cond, perso.puedeCasarse());
						case "PZ" -> jep.addVariable(cond, perso.esAbonado() ? 1 : 0);
						case "PV" -> jep.addVariable(cond, perso.esAbonado());
						case "GL" -> jep.addVariable(cond, perso.getNivelGremio());
						case "MA" -> jep.addVariable(cond, perso.realizoMisionDelDia());
						case "Mi" -> jep.addVariable(cond, perso.getID());
						case "NR" -> jep.addVariable(cond, perso.getResets());
						case "mK" -> jep.addVariable(cond, perso.getMapa().getID());
						case "mC" -> jep.addVariable(cond, perso.getCelda().getID());
						case "Tc" -> jep.addVariable(cond, (System.currentTimeMillis() - perso.getCelda().getUltimoUsoTrigger()) / 1000);
					}
				} catch (Exception e) {
					MainServidor.redactarLogServidorln("EXCEPTION condicion: " + s + " validaCondiones(splittear) " + e
					.toString());
					e.printStackTrace();
				}
			}
			condiciones = condiciones.replace("&", "&&").replace("=", "==").replace("|", "||").replace("!", "!=");
			jep.parse(condiciones);
			// System.out.println("jep condition: " + jep.rootNodeToString());
			final Object resultado = jep.evaluate();
			boolean ok = false;
			if (resultado != null) {
				ok = Boolean.parseBoolean(resultado.toString());
			}
			return ok;
		} catch (final Exception e) {
			MainServidor.redactarLogServidorln("EXCEPTION Condiciones: " + condiciones + ", validaCondiciones" + e
			.toString());
			e.printStackTrace();
			return false;
		}
	}
	
	private static String[] splittear(String cond) {
		return cond.replaceAll("[ ()]", "").split("[|&]");
		// FIXME los corchetes en un split, quiere decir q cada simbolo sera un split para el string
	}
	
	private static String tieneObjetosSet(String s, final Personaje perso) {
		try {
			String[] args = s.substring(3).split(",");
			final int setID = Integer.parseInt(args[0]);
			final int cant = Integer.parseInt(args[1]);
			int tiene = perso.getNroObjEquipadosDeSet(setID);
			return tiene + "" + s.charAt(2) + "" + cant;
		} catch (Exception ignored) {}
		return "false";
	}
	
	private static String tieneCantBonusSet(String s, final Personaje perso) {
		try {
			String[] args = s.substring(3).split(",");
			final int cant = Integer.parseInt(args[0]);
			Map<Integer, Integer> map = new TreeMap<>();
			for (byte pos : Constantes.POSICIONES_EQUIPAMIENTO) {
				final Objeto obj = perso.getObjPosicion(pos);
				if (obj == null) {
					continue;
				}
				int setID = obj.getObjModelo().getSetID();
				if (setID < 1) {
					continue;
				}
				int v = 1;
				if (map.containsKey(setID)) {
					v = map.get(setID) + 1;
				}
				map.put(setID, v);
			}
			int tiene = 0;
			for (int v : map.values()) {
				tiene += v - 1;
			}
			return tiene + "" + s.charAt(2) + "" + cant;
		} catch (Exception ignored) {}
		return "false";
	}
	
	private static String tieneCantObjetosSet(String s, final Personaje perso) {
		try {
			String[] args = s.substring(3).split(",");
			final int cant = Integer.parseInt(args[0]);
			Map<Integer, Integer> map = new TreeMap<>();
			for (byte pos : Constantes.POSICIONES_EQUIPAMIENTO) {
				final Objeto obj = perso.getObjPosicion(pos);
				if (obj == null) {
					continue;
				}
				int setID = obj.getObjModelo().getSetID();
				if (setID < 1) {
					continue;
				}
				int v = 1;
				if (map.containsKey(setID)) {
					v = map.get(setID) + 1;
				}
				map.put(setID, v);
			}
			int tiene = 0;
			for (int v : map.values()) {
				if (v > tiene) {
					tiene = v;
				}
			}
			return tiene + "" + s.charAt(2) + "" + cant;
		} catch (Exception ignored) {}
		return "false";
	}
	
	private static String tieneMobsEnMapa(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] ss = s.substring(3).split(";");
			String[] args = ss[1].split(",");
			final int mobID = Integer.parseInt(args[0]);
			int lvlMin = 0;
			int lvlMax = 99999;
			try {
				if (args.length > 1) {
					lvlMin = Integer.parseInt(args[1]);
					lvlMax = Integer.parseInt(args[2]);
				}
			} catch (Exception ignored) {}
			for (String m : ss[0].split(",")) {
				if (m.isEmpty()) {
					continue;
				}
				try {
					Mapa mapa = Mundo.getMapa(Short.parseShort(m));
					if (mapa == null) {
						continue;
					}
					for (GrupoMob gm : mapa.getGrupoMobsTotales().values()) {
						if (gm.tieneMobModeloID(mobID, lvlMin, lvlMax)) {
							b = true;
							break;
						}
					}
				} catch (Exception ignored) {}
			}
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneMobsEnPelea(String s, final Personaje perso) {
		boolean b = false;
		try {
			if (perso.getPelea() != null) {
                CopyOnWriteArrayList<MobGradoModelo> mobs = new CopyOnWriteArrayList<>(perso.getPelea().getMobGrupo().getMobs());
				String[] ss = s.substring(3).split(";");
				for (String a : ss) {
					String[] args = a.split(",");
					final int mobID = Integer.parseInt(args[0]);
					int lvlMin = 0;
					int lvlMax = 99999;
					try {
						if (args.length > 1) {
							lvlMin = Integer.parseInt(args[1]);
							lvlMax = Integer.parseInt(args[2]);
						}
					} catch (Exception ignored) {}
					boolean tiene = false;
					for (MobGradoModelo gm : mobs) {
						if (gm.getIDModelo() == mobID) {
							if (gm.getNivel() >= lvlMin && gm.getNivel() <= lvlMax) {
								mobs.remove(gm);
								tiene = true;
								b = true;
								break;
							}
						}
					}
					if (!tiene) {
						b = false;
						break;
					}
					if (s.contains("!")) {
						b = !b;
					}
				}
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String celdasObjetoTirado(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int id = Integer.parseInt(args[0]);
			final int objetoID = Integer.parseInt(args[1]);
			Objeto obj = perso.getMapa().getCelda((short) id).getObjetoTirado();
			if (obj != null) {
				b = objetoID == obj.getObjModeloID();
			}
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String celdasOcupadasPersonajesOtroMapa(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int mapaID = Integer.parseInt(args[0]);
			final int celdaID = Integer.parseInt(args[1]);
			byte clase = -1;
			if (args.length > 2) {
				clase = Byte.parseByte(args[2]);
			}
			byte sexo = -1;
			if (args.length > 2) {
				sexo = Byte.parseByte(args[3]);
			}
			Personaje p = Mundo.getMapa((short) mapaID).getCelda((short) celdaID).getPrimerPersonaje();
			b = p != null;
			if (b && sexo != -1) {
				b = p.getSexo() == sexo;
			}
			if (b && clase != -1) {
				b = p.getClaseID(true) == clase;
			}
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String celdasOcupadasPersonajes(String s, final Personaje perso) {
		boolean b = false;
		try {
			final int id = Integer.parseInt(s.substring(3));
			b = perso.getMapa().getCelda((short) id).getPrimerPersonaje() != null;
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String celdasOcupadasMob(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int celdaID = Integer.parseInt(args[0]);
			final int mobID = Integer.parseInt(args[1]);
			for (GrupoMob gm : perso.getMapa().getGrupoMobsTotales().values()) {
				if (gm.getCeldaID() == celdaID) {
					if (gm.tieneMobModeloID(mobID, 0, 99999)) {
						b = true;
						break;
					}
				}
			}
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneStatObjeto(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int objetoID = Integer.parseInt(args[0]);
			final int statVerificar = Integer.parseInt(args[1]);
			for (Objeto obj : perso.getObjetosTodos()) {
				if (obj.getObjModeloID() != objetoID) {
					continue;
				}
				String[] stats = obj.convertirStatsAString(true).split(",");
				for (String st : stats) {
					int statID = Integer.parseInt(st.split("#")[0], 16);
					if (statID == statVerificar) {
						b = true;
					}
				}
				if (b) {
					break;
				}
			}
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneStatObjetoLlaveoAlma(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int objetoID = Integer.parseInt(args[0]);
			final int solicitaID = Integer.parseInt(args[1]);
			int statVerificar = Constantes.STAT_LLAVE_MAZMORRA;
			for (Objeto obj : perso.getObjetosTodos()) {
				if (objetoID == 7010) {
					switch (obj.getObjModeloID()) {
						case 7010 :
						case 9720 :
						case 10417 :
						case 10418 :
							statVerificar = Constantes.STAT_INVOCA_MOB;
							break;
						default :
							continue;
					}
				} else if (obj.getObjModeloID() != objetoID) {
					continue;
				}
				String[] stats = obj.convertirStatsAString(true).split(",");
				for (String st : stats) {
					int statID = Integer.parseInt(st.split("#")[0], 16);
					int tSolicitaID = Integer.parseInt(st.split("#")[3], 16);
					if (statID != statVerificar) {
						continue;
					}
					if (tSolicitaID == solicitaID) {
						b = true;
					}
				}
				if (b) {
					break;
				}
			}
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneObjModeloNoEquip(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int id = Integer.parseInt(args[0]);
			int cant = 1;
			try {
				cant = Integer.parseInt(args[1]);
			} catch (Exception ignored) {}
			cant = Math.max(1, cant);
			b = perso.getObjModeloNoEquipado(id, cant) != null;
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneObjModeloEquipado(String s, final Personaje perso) {
		boolean b = false;
		try {
			final int id = Integer.parseInt(s.substring(3));
			b = perso.tieneObjModeloEquipado(id);
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneHechizo(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int id = Integer.parseInt(args[0]);
			b = perso.tieneHechizoID(id);
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneDon(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int id = Integer.parseInt(args[0]);
			int nivel = 1;
			try {
				nivel = Integer.parseInt(args[1]);
			} catch (Exception ignored) {}
			nivel = Math.max(1, nivel);
			b = perso.tieneDon(id, nivel);
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneObjetoRecibidoDespuesDeHoras(String s, final Personaje perso) {
		try {
			long dHoras = -1;
			String[] args = s.substring(3).split(",");
			final int objetoID = Integer.parseInt(args[0]);
			int horas = Math.max(0, Integer.parseInt(args[1]));
			for (Objeto obj : perso.getObjetosTodos()) {
				if (obj == null) {
					continue;
				}
				if (obj.getObjModeloID() != objetoID) {
					continue;
				}
				if (!obj.tieneStatTexto(Constantes.STAT_RECIBIDO_EL)) {
					continue;
				}
				long tHoras = obj.getDiferenciaTiempo(Constantes.STAT_RECIBIDO_EL, 60 * 60 * 1000);
				if (tHoras > dHoras) {
					dHoras = tHoras;
				}
			}
			if (dHoras > -1) {
				return dHoras + "" + s.charAt(2) + "" + (horas);
			}
		} catch (Exception ignored) {}
		return "false";
	}
	
	private static String tieneObjetoRecibidoDespuesDeMinutos(String s, final Personaje perso) {
		try {
			long dMinutos = -1;
			String[] args = s.substring(3).split(",");
			final int objetoID = Integer.parseInt(args[0]);
			int minutos = Math.max(0, Integer.parseInt(args[1]));
			for (Objeto obj : perso.getObjetosTodos()) {
				if (obj == null) {
					continue;
				}
				if (obj.getObjModeloID() != objetoID) {
					continue;
				}
				if (!obj.tieneStatTexto(Constantes.STAT_RECIBIDO_EL)) {
					continue;
				}
				long tMinutos = obj.getDiferenciaTiempo(Constantes.STAT_RECIBIDO_EL, 60 * 1000);
				if (tMinutos > dMinutos) {
					dMinutos = tMinutos;
				}
			}
			if (dMinutos > -1) {
				return dMinutos + "" + s.charAt(2) + "" + (minutos);
			}
		} catch (Exception ignored) {}
		return "false";
	}
	
	private static String tieneObjetoRecibidoDespuesDeSegundos(String s, final Personaje perso) {
		try {
			long dSegundos = -1;
			String[] args = s.substring(3).split(",");
			final int objetoID = Integer.parseInt(args[0]);
			int segundos = Math.max(0, Integer.parseInt(args[1]));
			for (Objeto obj : perso.getObjetosTodos()) {
				if (obj == null) {
					continue;
				}
				if (obj.getObjModeloID() != objetoID) {
					continue;
				}
				if (!obj.tieneStatTexto(Constantes.STAT_RECIBIDO_EL)) {
					continue;
				}
				long tSegundos = obj.getDiferenciaTiempo(Constantes.STAT_RECIBIDO_EL, 1000);
				if (tSegundos > dSegundos) {
					dSegundos = tSegundos;
				}
			}
			if (dSegundos > -1) {
				return dSegundos + "" + s.charAt(2) + "" + (segundos);
			}
		} catch (Exception ignored) {}
		return "false";
	}
	
	private static String tieneNivelOficio(String s, final Personaje perso) {
		try {
			String[] a = s.substring(3).split(",");
			if (a.length > 1) {
				return perso.getNivelStatOficio(Integer.parseInt(a[0])) + "" + s.charAt(2) + "" + a[1];
			} else {
				return (perso.getStatOficioPorID(Integer.parseInt(a[0])) != null) + "";
			}
		} catch (Exception ignored) {}
		return "false";
	}
	
	private static String tieneOficio(String s, final Personaje perso) {
		boolean b = false;
		try {
			final int id = Integer.parseInt(s.substring(3));
			b = perso.getStatOficioPorID(id) != null;
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneEtapa(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int id = Integer.parseInt(args[0]);
			b = perso.tieneEtapa(id);
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneEstadoObjetivo(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int id = Integer.parseInt(args[0]);
			int realizado = Mision.ESTADO_NO_TIENE;
			try {
				realizado = Integer.parseInt(args[1]);
				b = perso.getEstadoObjetivo(id) == realizado;
			} catch (Exception e) {
				b = perso.getEstadoObjetivo(id) != realizado;
			}
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String tieneEstadoMision(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int id = Integer.parseInt(args[0]);
			int realizado = Mision.ESTADO_NO_TIENE;
			try {
				realizado = Integer.parseInt(args[1]);
				b = perso.getEstadoMision(id) == realizado;
			} catch (Exception e) {
				b = perso.getEstadoMision(id) != realizado;
			}
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String confirmarObjetivoMision(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int id = Integer.parseInt(args[0]);
			boolean preConfirma = true;
			try {
				preConfirma = !args[1].equals("1");
			} catch (Exception ignored) {}
			b = Mundo.getMisionObjetivoModelo(id).confirmar(perso, null, preConfirma, 0);
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
	
	private static String confirmarEtapaMision(String s, final Personaje perso) {
		boolean b = false;
		try {
			String[] args = s.substring(3).split(",");
			final int id = Integer.parseInt(args[0]);
			boolean preConfirma = true;
			try {
				preConfirma = !args[1].equals("1");
			} catch (Exception ignored) {}
			b = perso.confirmarEtapa(id, preConfirma);
			if (s.contains("!")) {
				b = !b;
			}
		} catch (Exception ignored) {}
		return b + "";
	}
}
