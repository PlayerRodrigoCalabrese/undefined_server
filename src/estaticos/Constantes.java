package estaticos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;
import variables.hechizo.StatHechizo;
import variables.mapa.Celda;
import variables.mapa.Mapa;
import variables.mob.GrupoMob;
import variables.mob.MobModelo.TipoGrupo;
import variables.montura.MonturaModelo;
import variables.objeto.Objeto;
import variables.oficio.StatOficio;
import variables.oficio.Trabajo;
import variables.pelea.Luchador;
import variables.pelea.Pelea;
import variables.pelea.Reto;
import variables.personaje.Personaje;
import variables.stats.Stats;
import variables.stats.TotalStats;
import estaticos.Mundo.Duo;

public class Constantes {
	public static final String ZAAPI_BONTA = "6159,4174,8758,4299,4180,8759,4183,2221,4217,4098,8757,4223,8760,2214,4179,4229,4232,8478,4238,4263,4216,4172,4247,4272,4271,4250,4178,4106,4181,4259,4090,4262,4287,4300,4240,4218,4074,4308";
	public static final String ZAAPI_BRAKMAR = "8756,8755,8493,5304,5311,5277,5317,4612,4618,5112,4639,4637,5116,5332,4579,4588,4549,4562,5334,5295,4646,4629,4601,4551,4607,4930,4622,4620,4615,4595,4627,4623,4604,8754,8753,4630,6167";
	public static final String ESTATUAS_FENIX = "12;12;270|-1;33;1399|10;19;268|5;-9;7796|2;-12;8534|-30;-54;4285|-26;35;4551|-23;38;12169|-11;-54;3360|-43;0;10430|-10;13;9227|-41;-17;9539|36;5;1118|24;-43;7910|27;-33;8054|-60;-3;10672|-58;18;10590|-14;31;5717|25;-4;844|";
	// CREA TU ITEM
	public static final ArrayList<Integer> GFX_CREA_TU_ITEM_CAPAS = new ArrayList<>();
	public static final ArrayList<Integer> GFX_CREA_TU_ITEM_AMULETOS = new ArrayList<>();
	public static final ArrayList<Integer> GFX_CREA_TU_ITEM_ANILLOS = new ArrayList<>();
	public static final ArrayList<Integer> GFX_CREA_TU_ITEM_CINTURONES = new ArrayList<>();
	public static final ArrayList<Integer> GFX_CREA_TU_ITEM_BOTAS = new ArrayList<>();
	public static final ArrayList<Integer> GFX_CREA_TU_ITEM_SOMBREROS = new ArrayList<>();
	public static final ArrayList<Integer> GFX_CREA_TU_ITEM_ESCUDOS = new ArrayList<>();
	public static final ArrayList<Integer> GFX_CREA_TU_ITEM_DOFUS = new ArrayList<>();
	public static final Map<Integer, ArrayList<Integer>> GFXS_CREA_TU_ITEM = new TreeMap<>();
	// CORPULENCIA
	public static final byte CORPULENCIA_NORMAL = 0;
	public static final byte CORPULENCIA_OBESO = 1;
	public static final byte CORPULENCIA_DELGADO = 2;
	// ESTADOS SERVIDOR
	public static final byte SERVIDOR_SALVANDO = 2;
	public static final byte SERVIDOR_ONLINE = 1;
	public static final byte SERVIDOR_OFFLINE = 0;
	// DERECHOS GREMIO
	public static final int G_TODOS_LOS_DERECHOS = 1;
	public static final int G_MODIF_BOOST = 2; // Modificar los boost
	public static final int G_MODIF_DERECHOS = 4; // Modificar los derechos
	public static final int G_INVITAR = 8; // Invitar a nuevos miembros
	public static final int G_BANEAR = 16; // Bannear
	public static final int G_TODAS_XP_DONADAS = 32; // Modificar las reparticiones de xp
	public static final int G_SU_XP_DONADA = 256; // Modificar su repartacion de xp
	public static final int G_MODIF_RANGOS = 64; // Modificar los rangos
	public static final int G_PONER_RECAUDADOR = 128; // Poner un recaudador
	public static final int G_RECOLECTAR_RECAUDADOR = 512; // Recolectar los recaudadores
	public static final int G_USAR_CERCADOS = 4096; // Utilizar los cercados
	public static final int G_MEJORAR_CERCADOS = 8192; // Mejorar los cercados
	public static final int G_OTRAS_MONTURAS = 16384; // Modidicar las monturas de otros miembros
	// DERECHOS CASA
	public static final int C_VISIBLE_PARA_GREMIO = 1;// casa visible para el gremio
	public static final int C_ESCUDO_VISIBLE_MIEMBROS = 2; // escudo visible solo para gremio
	public static final int C_ESCUDO_VISIBLE_PARA_TODOS = 4; // escudo visible para todos
	public static final int C_ACCESOS_MIEMBROS_SIN_CODIGO = 8; // Entrar sin codigo para el gremio
	public static final int C_ACCESO_PROHIBIDO_NO_MIEMBROS = 16; // Acceso prohibido no miembros
	public static final int C_ACCESOS_COFRES_MIEMBROS_SIN_CODIGO = 32; // Cofres sin codigo para el
	// gremio
	public static final int C_ACCESO_PROHIBIDO_COFRES_NO_MIEMBROS = 64; // Cofre imposible para los q
	public static final int C_TELEPORT_GREMIO = 128; // Gremio derecho a teleport
	public static final int C_DESCANSO_GREMIO = 256; // Gremio derecho a descanso
	// COLORES
	public static final String COLOR_AMARILLO = "FFFF00";
	public static final String COLOR_ROJO = "FF0000";
	public static final String COLOR_AZUL = "0000FF";
	public static final String COLOR_VERDE_CLARO = "00FF00";
	public static final String COLOR_VERDE_OSCURO = "006600";
	public static final String COLOR_NEGRO = "000000";
	public static final String COLOR_BLANCO = "FFFFFF";
	public static final String COLOR_NARANJA = "FF9900";
	public static final String COLOR_MARRON = "663300";
	public static final String COLOR_CELESTE = "66CCFF";
	public static final String COLOR_MORADO = "990099";
	public static final String COLOR_CREMA = "FFCC00";
	public static final String COLOR_ROSADO = "FF99CC";
	public static final String COLOR_PLOMO = "666666";
	// ESTADO
	public static final byte ESTADO_NEUTRAL = 0;
	public static final byte ESTADO_BORRACHO = 1;
	public static final byte ESTADO_CAPT_ALMAS = 2;
	public static final byte ESTADO_PORTADOR = 3;
	public static final byte ESTADO_TEMEROSO = 4;
	public static final byte ESTADO_DESORIENTADO = 5;
	// Hace que su lanzador ya no sea empujado, ni intercambiado
	// Hace que su lanzador ya no sea placado.
	// Le impide placar a sus enemigos.
	public static final byte ESTADO_ARRAIGADO = 6;
	public static final byte ESTADO_PESADO = 7;
	public static final byte ESTADO_TRANSPORTADO = 8;
	public static final byte ESTADO_MOTIVACION_SILVESTRE = 9;
	public static final byte ESTADO_DOMESTICACI�N = 10;
	public static final byte ESTADO_CABALGANDO = 11;
	public static final byte ESTADO_REVOLTOSO = 12;
	public static final byte ESTADO_MUY_REVOLTOSO = 13;
	public static final byte ESTADO_NEVADO = 14;
	public static final byte ESTADO_DESPIERTO = 15;
	public static final byte ESTADO_FRAGILIZADO = 16;
	public static final byte ESTADO_SEPARADO = 17;
	public static final byte ESTADO_HELADO = 18;
	public static final byte ESTADO_AGRIETADO = 19;
	public static final byte ESTADO_DORMIDO = 26;
	public static final byte ESTADO_LEOPARDO = 27;
	public static final byte ESTADO_LIBRE = 28;
	public static final byte ESTADO_GLIFO_IMPAR = 29;
	public static final byte ESTADO_GLIFO_PAR = 30;
	public static final byte ESTADO_TINTA_PRIMARIA = 31;
	public static final byte ESTADO_TINTA_ECUNDARIA = 32;
	public static final byte ESTADO_TINTA_TERCIARIA = 33;
	public static final byte ESTADO_TINTA_CUATERNARIA = 34;
	public static final byte ESTADO_GANAS_DE_MATAR = 35;
	public static final byte ESTADO_GANAS_DE_PARALIZAR = 36;
	public static final byte ESTADO_GANAS_DE_MALDECIR = 37;
	public static final byte ESTADO_GANAS_DE_ENVENENAR = 38;
	public static final byte ESTADO_TURBIO = 39;
	public static final byte ESTADO_CORRUPTO = 40;
	public static final byte ESTADO_SILENCIOSO = 41;
	public static final byte ESTADO_DEBILITADO = 42;
	public static final byte ESTADO_OVNI = 43;
	public static final byte ESTADO_DESCONTENTA = 44;
	public static final byte ESTADO_CONTENTA = 46;
	public static final byte ESTADO_DE_MAL_HUMOR = 47;
	public static final byte ESTADO_DESCONCERTADO = 48;
	public static final byte ESTADO_GHULIFICADO = 49;
	// Este estado hace que no se puedan usar hechizos de curaci�n ni que pueda curarse de ninguna
	// forma.
	public static final byte ESTADO_ALTRUISTA = 50;
	public static final byte ESTADO_JUBILADO = 55;
	public static final byte ESTADO_CUENTA_ATRAS_2 = 57;
	public static final byte ESTADO_CUENTA_ATRAS_1 = 58;
	public static final byte ESTADO_LEAL = 60;
	public static final byte ESTADO_CAMORRISTA = 61;
	public static final byte ESTADO_ESKERDIKAT = 62;
	public static final byte ESTADO_ZOBAL = 63;
	public static final byte ESTADO_ZAIKOPAT = 64;
	public static final byte ESTADO_INCURABLE = 65;
	public static final byte ESTADO_NO_BLOQUEABLE = 66;
	public static final byte ESTADO_INDESPLAZABLE = 81;
	public static final byte ESTADO_PROTEGIDO = 82;
	public static final byte ESTADO_ESCARIFICADO = 83;
	// OBJETOS INTERACTIVOS
	public static final byte OI_ESTADO_LLENO = 1;
	public static final byte OI_ESTADO_ESPERA = 2;
	public static final byte OI_ESTADO_VACIANDO = 3;
	public static final byte OI_ESTADO_VACIO = 4;
	public static final byte OI_ESTADO_LLENANDO = 5;
	public static final byte OI_ESTADO_PALANCA_ABAJO = 7;
	// CELDAS INTERACTIVAS
	public static final byte CI_ESTADO_LLENO = 1;
	public static final byte CI_ESTADO_VACIANDO = 2;
	public static final byte CI_ESTADO_VACIO = 3;
	public static final byte CI_ESTADO_LLENANDO = 4;
	// INTERCAMBIO
	public static final byte INTERCAMBIO_TIPO_NULO = -1;
	public static final byte INTERCAMBIO_TIPO_TIENDA_NPC = 0;
	public static final byte INTERCAMBIO_TIPO_PERSONAJE = 1;
	public static final byte INTERCAMBIO_TIPO_TRUEQUE = 2;
	public static final byte INTERCAMBIO_TIPO_TALLER = 3;
	public static final byte INTERCAMBIO_TIPO_MERCANTE = 4;
	public static final byte INTERCAMBIO_TIPO_COFRE = 5;
	public static final byte INTERCAMBIO_TIPO_MI_TIENDA = 6;
	public static final byte INTERCAMBIO_TIPO_RECAUDADOR = 8;
	public static final byte INTERCAMBIO_TIPO_MERCADILLO_VENDER = 10;
	public static final byte INTERCAMBIO_TIPO_MERCADILLO_COMPRAR = 11;
	public static final byte INTERCAMBIO_TIPO_TALLER_ARTESANO = 12;
	public static final byte INTERCAMBIO_TIPO_TALLER_CLIENTE = 13;
	public static final byte INTERCAMBIO_TIPO_LIBRO_ARTESANOS = 14;
	public static final byte INTERCAMBIO_TIPO_MONTURA = 15;
	public static final byte INTERCAMBIO_TIPO_CERCADO = 16;
	public static final byte INTERCAMBIO_TIPO_RESUCITAR_MASCOTA = 17;
	public static final byte INTERCAMBIO_TIPO_BOUTIQUE = 20;
	// TIPO DE PELEAS
	public static final byte PELEA_TIPO_DESAFIO = 0;// Desafio
	public static final byte PELEA_TIPO_PVP = 1;// Agresion PVP
	public static final byte PELEA_TIPO_PRISMA = 2;// Mobs con alineacion
	public static final byte PELEA_TIPO_PVM_NO_ESPADA = 3;
	public static final byte PELEA_TIPO_PVM = 4;// PVM personaje vs mobs
	public static final byte PELEA_TIPO_RECAUDADOR = 5;// Recaudador
	public static final byte PELEA_TIPO_KOLISEO = 6; // Coliseo
	public static final byte PELEA_TIPO_CACERIA = 7;
	// ESTADO DE PELEAS
	public static final byte PELEA_FASE_INICIO = 1;
	public static final byte PELEA_FASE_POSICION = 2;
	public static final byte PELEA_FASE_COMBATE = 3;
	public static final byte PELEA_FASE_FINALIZADO = 4;
	// RETOS
	public static final byte RETO_ZOMBI = 1;// Utiliza s�lo un punto de movimiento en cada turno.
	public static final byte RETO_ESTATUA = 2;// Acaba tu turno en la misma casilla donde lo
	// empezaste, hasta que acabe el combate.
	public static final byte RETO_ELEGIDO_VOLUNTARIO = 3;// Matar %1 el primero.
	public static final byte RETO_APLAZAMIENTO = 4;// Matar %1 el �ltimo.
	public static final byte RETO_AHORRADOR = 5;// Durante el tiempo que dure el combate, cada
	// personaje s�lo debe utilizar la misma acci�n una
	// �nica vez.
	public static final byte RETO_VERSATIL = 6;// Durante su turno, cada jugador s�lo puede utilizar
	// una vez la misma acci�n.
	public static final byte RETO_JARDINERO = 7;// Durante el tiempo que dure el combate, planta una
	// Zanahowia cada vez que el hechizo est� disponible.
	public static final byte RETO_NOMADA = 8;// Durante el tiempo que dure el combate, utiliza todos
	// tus PM disponibles en cada turno.
	public static final byte RETO_BARBARO = 9;// No utilices ning�n hechizo durante el tiempo que dure
	// este combate.
	public static final byte RETO_CRUEL = 10;// Debes matar a los adversarios en orden creciente de
	// nivel.
	public static final byte RETO_MISTICO = 11;// Durante el tiempo que dure el combate, utiliza
	// solamente hechizos.
	public static final byte RETO_SEPULTURERO = 12;// Durante el tiempo que dure el combate, invoca un
	// Chaferloko cada vez que el hechizo est�
	// disponible.
	public static final byte RETO_CASINO_REAL = 14;// Durante el tiempo que dure el combate, lanzar el
	// hechizo Ruleta cada vez que se encuentre
	// disponible.
	public static final byte RETO_ARACNOFILO = 15;// Invocar una arakna cada vez que el hechizo est�
	// disponible. V�lido durante todo el combate.
	public static final byte RETO_ENTOMOLOGO = 16;// Invocar una Llamita cada vez que el hechizo est�
	// disponible. V�lido durante todo el combate.
	public static final byte RETO_INTOCABLE = 17;// No perder puntos de vida durante el tiempo que
	// dure el combate.
	public static final byte RETO_INCURABLE = 18;// No curar durante el tiempo que dure el combate.
	public static final byte RETO_MANOS_LIMPIAS = 19;// Acabar con los monstruos sin ocasionarles
	// da�os directos durante lo que dure el
	// combate. Se puede utilizar trampas, glifos,
	// venenos, da�os ocasionados por desplazamiento
	// as� como los ataques de invocaciones.
	public static final byte RETO_ELEMENTAL = 20;// Utiliza el mismo elemento de ataque durante todo
	// el combate.
	public static final byte RETO_CIRCULEN = 21;// No quitar PM a los adversarios mientras dure el
	// combate.
	public static final byte RETO_EL_TIEMPO_PASA = 22;// No quitar PA a los adversarios durante el
	// tiempo que dure el combate.
	public static final byte RETO_PERDIDO_DE_VISTA = 23;// No reducir el alcance de los adversarios
	// durante el tiempo que dure el combate.
	public static final byte RETO_LIMITADO = 24;// Utilizar el mismo hechizo o el mismo ataque cuerpo
	// a cuerpo durante el tiempo que dure el combate.
	public static final byte RETO_ORDENADO = 25;// Se debe acabar con los adversarios en orden
	// descendiente de nivel.
	public static final byte RETO_NI_PIAS_NI_SUMISAS = 28;// Los personajes de sexo masculino deben
	// dejar que los de sexo femenino acaben con
	// los adversarios. V�lido durante todo el
	// combate.
	public static final byte RETO_NI_PIOS_NI_SUMISOS = 29;// Los personajes de sexo femenino deben
	// dejar que los de sexo masculino acaben
	// con los adversarios. V�lido durante todo
	// el combate.
	public static final byte RETO_LOS_PEQUE�OS_ANTES = 30;// El personaje de menor nivel debe acabar
	// con los adversarios.
	public static final byte RETO_FOCALIZACION = 31;// Cuando se ataca a un adversario, hay que
	// matarlo antes de atacar a otro adversario.
	public static final byte RETO_ELITISTA = 32;// Todos los ataques deben ir dirigidos a %1 hasta que
	// muera.
	public static final byte RETO_SUPERVIVIENTE = 33;// Ning�n aliado debe morir.
	public static final byte RETO_IMPREVISIBLE = 34;// Todos los ataques deben ir dirigidos a un mismo
	// objetivo que se designa en cada turno de un
	// personaje.
	public static final byte RETO_ASESINO_A_SUELDO = 35;// Debes matar a los adversarios en el orden
	// indicado. Cada vez que mates a un objetivo,
	// obtendr�s el nombre del pr�ximo al que
	// tienes que matar
	public static final byte RETO_AUDAZ = 36;// Acaba tu turno en una de las casillas pegadas a las de
	// uno de tus adversarios.
	public static final byte RETO_PEGAJOSO = 37;// Acaba tu turno en una de las casillas pegadas a las
	// de uno de tus aliados.
	public static final byte RETO_BLITZKRIEG = 38;// Cuando se ataca a un adversario, hay que matarlo
	// antes de que comience su turno.
	public static final byte RETO_ANACORETA = 39;// No termines nunca tu turno en una casilla
	// adyacente a la de uno de tus aliados.
	public static final byte RETO_PUSILANIME = 40;// No termines nunca tu turno en una casilla
	// adyacente a la de uno de tus adversarios.
	public static final byte RETO_IMPETUOSO = 41;// Utiliza todos tus puntos de acci�n antes de acabar
	// tu turno.
	// Cuando un personaje mata a un adversario, tiene que matar obligatoriamente a un (y s�lo a un)
	// segundo adversario durante su turno.
	public static final byte RETO_EL_DOS_POR_UNO = 42;
	// Nadie puede recibir curas durante su turno.
	public static final byte RETO_ABNEGACION = 43;
	// Cada personaje debe matar al menos a un adversario (que no sea una invocaci�n) durante el
	// combate.
	public static final byte RETO_REPARTO = 44;
	// Cuando un personaje ataca a un adversario, ning�n otro personaje debe atacar a ese mismo
	// adversario durante el tiempo que dure el combate.
	public static final byte RETO_DUELO = 45;
	// Cada personaje debe matar al menos a un adversario durante el combate. Cuando un personaje
	// ataca a un adversario, ning�n otro personaje puede atacar a ese mismo adversario durante el
	// combate.
	public static final byte RETO_CADA_UNO_CON_SU_MONSTRUO = 46;
	// Cuando un aliado pierde puntos de vida, dispones de 3 turnos para rematar a tu aliado o �ganar
	// el combate!
	public static final byte RETO_CONTAMINACION = 47;
	// El personaje secundario de menor nivel tiene que matar a todos los adversarios (as� aprender�s
	// a querer abusar como un puerkazo).
	public static final byte RETO_LOS_PERSONAJES_SECUNDARIOS_PRIMERO = 48;
	// Aliados y personajes secundarios deben acabar vivos el combate.
	public static final byte RETO_PROTEJAN_A_SUS_PERSONAJES_SECUNDARIOS = 49;
	// Acaba el combate, para ganar el desaf�o. Ya se sabe, los desarrolladores del juego son unos
	// tramposos...
	public static final byte RETO_LA_TRAMPA_DE_LOS_DESARROLLADORES = 50;
	// OFICIOS
	public static final int OFICIO_BASE = 1;
	public static final int OFICIO_LE�ADOR = 2;
	public static final int OFICIO_FORJADOR_ESPADAS = 11;
	public static final int OFICIO_ESCULTOR_ARCOS = 13;
	public static final int OFICIO_FORJADOR_MARTILLOS = 14;
	public static final int OFICIO_ZAPATERO = 15;
	public static final int OFICIO_JOYERO = 16;
	public static final int OFICIO_FORJADOR_DAGAS = 17;
	public static final int OFICIO_ESCULTOR_BASTONES = 18;
	public static final int OFICIO_ESCULTOR_VARITAS = 19;
	public static final int OFICIO_FORJADOR_PALAS = 20;
	public static final int OFICIO_MINERO = 24;
	public static final int OFICIO_PANADERO = 25;
	public static final int OFICIO_ALQUIMISTA = 26;
	public static final int OFICIO_SASTRE = 27;
	public static final int OFICIO_CAMPESINO = 28;
	public static final int OFICIO_FORJADOR_HACHAS = 31;
	public static final int OFICIO_PESCADOR = 36;
	public static final int OFICIO_CAZADOR = 41;
	public static final int OFICIO_FORJAMAGO_DAGAS = 43;
	public static final int OFICIO_FORJAMAGO_ESPADAS = 44;
	public static final int OFICIO_FORJAMAGO_MARTILLOS = 45;
	public static final int OFICIO_FORJAMAGO_PALAS = 46;
	public static final int OFICIO_FORJAMAGO_HACHAS = 47;
	public static final int OFICIO_ESCULTORMAGO_ARCOS = 48;
	public static final int OFICIO_ESCULTORMAGO_VARITAS = 49;
	public static final int OFICIO_ESCULTORMAGO_BASTONES = 50;
	public static final int OFICIO_CARNICERO = 56;
	public static final int OFICIO_PESCADERO = 58;
	public static final int OFICIO_FORJADOR_ESCUDOS = 60;
	public static final int OFICIO_ZAPATEROMAGO = 62;
	public static final int OFICIO_JOYEROMAGO = 63;
	public static final int OFICIO_SASTREMAGO = 64;
	public static final int OFICIO_MANITAS = 65;
	public static final int OFICIO_BIJOYERO = 66;
	public static final int OFICIO_JOYERO2 = 67;
	// EMOTES
	public static final byte EMOTE_NULO = 0;
	public static final byte EMOTE_SENTARSE = 1;
	public static final byte EMOTE_SE�AL_CON_MANO = 2;
	public static final byte EMOTE_APLAUDIR = 3;
	public static final byte EMOTE_ENFADARSE = 4;
	public static final byte EMOTE_MIEDO = 5;
	public static final byte EMOTE_MOSTRAR_ARMA = 6;
	public static final byte EMOTE_FLAUTA = 7;
	public static final byte EMOTE_PEDO = 8;
	public static final byte EMOTE_SALUDAR = 9;
	public static final byte EMOTE_BESO = 10;
	public static final byte EMOTE_PIEDRA = 11;
	public static final byte EMOTE_HOJA = 12;
	public static final byte EMOTE_TIJERAS = 13;
	public static final byte EMOTE_CRUZARSE_BRAZOS = 14;
	public static final byte EMOTE_SE�ALAR_DEDO = 15;
	public static final byte EMOTE_CROW = 16;
	public static final byte EMOTE_COMER = 17;
	public static final byte EMOTE_BEBER = 18;
	public static final byte EMOTE_ACOSTARSE = 19;
	public static final byte EMOTE_CAMPEON = 21;
	public static final byte EMOTE_AURA_PODER = 22;
	public static final byte EMOTE_AURA_VAMPIRICA = 23;
	// POSICION DE OBJETOS
	public static final byte OBJETO_POS_NO_EQUIPADO = -1;
	public static final byte OBJETO_POS_AMULETO = 0;
	public static final byte OBJETO_POS_ARMA = 1;
	public static final byte OBJETO_POS_ANILLO1 = 2;
	public static final byte OBJETO_POS_CINTURON = 3;
	public static final byte OBJETO_POS_ANILLO_DERECHO = 4;
	public static final byte OBJETO_POS_BOTAS = 5;
	public static final byte OBJETO_POS_SOMBRERO = 6;
	public static final byte OBJETO_POS_CAPA = 7;
	public static final byte OBJETO_POS_MASCOTA = 8;
	public static final byte OBJETO_POS_DOFUS1 = 9;
	public static final byte OBJETO_POS_DOFUS2 = 10;
	public static final byte OBJETO_POS_DOFUS3 = 11;
	public static final byte OBJETO_POS_DOFUS4 = 12;
	public static final byte OBJETO_POS_DOFUS5 = 13;
	public static final byte OBJETO_POS_DOFUS6 = 14;
	public static final byte OBJETO_POS_ESCUDO = 15;
	public static final byte OBJETO_POS_MONTURA = 16;
	public static final byte OBJETO_POS_COMPA�ERO = 17;
	public static final byte OBJETO_POS_OBJ_MUTACION = 20;
	public static final byte OBJETO_POS_BOOST = 21;
	public static final byte OBJETO_POS_MALDICION = 22;
	public static final byte OBJETO_POS_BENDICION = 23;
	public static final byte OBJETO_POS_ROLEPLAY = 24;
	public static final byte OBJETO_POS_PJ_SEGUIDOR = 25;
	public static final byte[] POSICIONES_TODOS = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 20, 21, 22,
	23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};
	public static final byte[] POSICIONES_EQUIPAMIENTO = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 20,
	21, 22, 23, 24, 25, 26, 27};
	public static final byte[] POSICIONES_EQUIPAMIENTO_VISUAL = {OBJETO_POS_SOMBRERO, OBJETO_POS_CAPA, OBJETO_POS_MASCOTA,
	OBJETO_POS_ESCUDO, OBJETO_POS_ARMA};
	public static final byte[] POSICIONES_BOOST = {20, 21, 22, 23, 24, 25, 26, 27};
	// TIPOS DE OBJETOS
	public static final int OBJETO_TIPO_AMULETO = 1;
	public static final int OBJETO_TIPO_ARCO = 2;
	public static final int OBJETO_TIPO_VARITA = 3;
	public static final int OBJETO_TIPO_BASTON = 4;
	public static final int OBJETO_TIPO_DAGAS = 5;
	public static final int OBJETO_TIPO_ESPADA = 6;
	public static final int OBJETO_TIPO_MARTILLO = 7;
	public static final int OBJETO_TIPO_PALA = 8;
	public static final int OBJETO_TIPO_ANILLO = 9;
	public static final int OBJETO_TIPO_CINTURON = 10;
	public static final int OBJETO_TIPO_BOTAS = 11;
	public static final int OBJETO_TIPO_POCION = 12;
	public static final int OBJETO_TIPO_PERGAMINO_EXP = 13;
	public static final int OBJETO_TIPO_DONES = 14;
	public static final int OBJETO_TIPO_RECURSO = 15;
	public static final int OBJETO_TIPO_SOMBRERO = 16;
	public static final int OBJETO_TIPO_CAPA = 17;
	public static final int OBJETO_TIPO_MASCOTA = 18;
	public static final int OBJETO_TIPO_HACHA = 19;
	public static final int OBJETO_TIPO_HERRAMIENTA = 20;
	public static final int OBJETO_TIPO_PICO = 21;
	public static final int OBJETO_TIPO_GUADA�A = 22;
	public static final int OBJETO_TIPO_DOFUS = 23;
	public static final int OBJETO_TIPO_OBJETO_DE_BUSQUEDA = 24;
	public static final int OBJETO_TIPO_DOCUMENTO = 25;
	public static final int OBJETO_TIPO_POCION_FORJAMAGIA = 26;
	public static final int OBJETO_TIPO_OBJETO_MUTACION = 27;
	public static final int OBJETO_TIPO_ALIMENTO_BOOST = 28;
	public static final int OBJETO_TIPO_BENDICION = 29;
	public static final int OBJETO_TIPO_MALDICION = 30;
	public static final int OBJETO_TIPO_ROLEPLAY_BUFF = 31;
	public static final int OBJETO_TIPO_PJ_SEGUIDOR = 32;
	public static final int OBJETO_TIPO_PAN = 33;
	public static final int OBJETO_TIPO_CEREAL = 34;
	public static final int OBJETO_TIPO_FLOR = 35;
	public static final int OBJETO_TIPO_PLANTA = 36;
	public static final int OBJETO_TIPO_CERVEZA = 37;
	public static final int OBJETO_TIPO_MADERA = 38;
	public static final int OBJETO_TIPO_MINERAL = 39;
	public static final int OBJETO_TIPO_ALINEACION = 40;
	public static final int OBJETO_TIPO_PEZ = 41;
	public static final int OBJETO_TIPO_GOLOSINA = 42;
	public static final int OBJETO_TIPO_OLVIDO_HECHIZO = 43;
	public static final int OBJETO_TIPO_OLVIDO_OFICIO = 44;
	public static final int OBJETO_TIPO_OLVIDO_DOMINIO = 45;
	public static final int OBJETO_TIPO_FRUTA = 46;
	public static final int OBJETO_TIPO_HUESO = 47;
	public static final int OBJETO_TIPO_POLVO = 48;
	public static final int OBJETO_TIPO_PESCADO_COMESTIBLE = 49;
	public static final int OBJETO_TIPO_PIEDRA_PRECIOSA = 50;
	public static final int OBJETO_TIPO_PIEDRA_BRUTA = 51;
	public static final int OBJETO_TIPO_HARINA = 52;
	public static final int OBJETO_TIPO_PLUMA = 53;
	public static final int OBJETO_TIPO_PELO = 54;
	public static final int OBJETO_TIPO_TEJIDO = 55;
	public static final int OBJETO_TIPO_CUERO = 56;
	public static final int OBJETO_TIPO_LANA = 57;
	public static final int OBJETO_TIPO_SEMILLA = 58;
	public static final int OBJETO_TIPO_PIEL = 59;
	public static final int OBJETO_TIPO_ACEITE = 60;
	public static final int OBJETO_TIPO_PELUCHE = 61;
	public static final int OBJETO_TIPO_PESCADO_VACIADO = 62;
	public static final int OBJETO_TIPO_CARNE = 63;
	public static final int OBJETO_TIPO_CARNE_CONSERVADA = 64;
	public static final int OBJETO_TIPO_COLA = 65;
	public static final int OBJETO_TIPO_METARIA = 66;
	public static final int OBJETO_TIPO_LEGUMBRE = 68;
	public static final int OBJETO_TIPO_CARNE_COMESTIBLE = 69;
	public static final int OBJETO_TIPO_TINTE = 70;
	public static final int OBJETO_TIPO_MATERIA_ALQUIMIA = 71;
	public static final int OBJETO_TIPO_HUEVO_MASCOTA = 72;
	public static final int OBJETO_TIPO_DOMINIO = 73;
	public static final int OBJETO_TIPO_HADA_ARTIFICIAL = 74;
	public static final int OBJETO_TIPO_PERGAMINO_HECHIZO = 75;
	public static final int OBJETO_TIPO_PERGAMINO_CARACTERISTICA = 76;
	public static final int OBJETO_TIPO_CERTIFICADO_DE_LA_PETRERA = 77;
	public static final int OBJETO_TIPO_RUNA_FORJAMAGIA = 78;
	public static final int OBJETO_TIPO_BEBIDA = 79;
	public static final int OBJETO_TIPO_OBJETO_MISION = 80;
	public static final int OBJETO_TIPO_MOCHILA = 81;
	public static final int OBJETO_TIPO_ESCUDO = 82;
	public static final int OBJETO_TIPO_PIEDRA_DEL_ALMA = 83;
	public static final int OBJETO_TIPO_LLAVES = 84;
	public static final int OBJETO_TIPO_PIEDRA_DE_ALMA_LLENA = 85;
	public static final int OBJETO_TIPO_OLVIDO_RECAUDADOR = 86;
	public static final int OBJETO_TIPO_PERGAMINO_BUSQUEDA = 87;
	public static final int OBJETO_TIPO_PIEDRA_MAGICA = 88;
	public static final int OBJETO_TIPO_REGALOS = 89;
	public static final int OBJETO_TIPO_FANTASMA_MASCOTA = 90;
	public static final int OBJETO_TIPO_DRAGOPAVO = 91;
	public static final int OBJETO_TIPO_JALATO = 92;
	public static final int OBJETO_TIPO_OBJETO_CRIA = 93;
	public static final int OBJETO_TIPO_OBJETO_UTILIZABLE = 94;
	public static final int OBJETO_TIPO_TABLA = 95;
	public static final int OBJETO_TIPO_CORTEZA = 96;
	public static final int OBJETO_TIPO_CERTIFICADO_DE_MONTURA = 97;
	public static final int OBJETO_TIPO_RAIZ = 98;
	public static final int OBJETO_TIPO_RED_CAPTURA = 99;
	public static final int OBJETO_TIPO_SACO_RECURSOS = 100;
	public static final int OBJETO_TIPO_BALLESTA = 102;
	public static final int OBJETO_TIPO_PATA = 103;
	public static final int OBJETO_TIPO_ALA = 104;
	public static final int OBJETO_TIPO_HUEVO = 105;
	public static final int OBJETO_TIPO_OREJA = 106;
	public static final int OBJETO_TIPO_CAPARAZON = 107;
	public static final int OBJETO_TIPO_BROTE = 108;
	public static final int OBJETO_TIPO_OJO = 109;
	public static final int OBJETO_TIPO_GELATINA = 110;
	public static final int OBJETO_TIPO_CASCARA = 111;
	public static final int OBJETO_TIPO_PRISMA = 112;
	public static final int OBJETO_TIPO_OBJEVIVO = 113;
	public static final int OBJETO_TIPO_ARMA_MAGICA = 114;
	public static final int OBJETO_TIPO_FRAGMENTO_ALMA_SHUSHU = 115;
	public static final int OBJETO_TIPO_POCION_MASCOTA = 116;
	public static final int OBJETO_TIPO_ALIMENTO_MASCOTA = 117;
	public static final int OBJETO_TIPO_MONEDA_VIP = 118;
	public static final int OBJETO_TIPO_ESPECIALES = 150;
	public static final int OBJETO_TIPO_TROFEO = 151;
	public static final int OBJETO_TIPO_COMPA�ERO = 169;
	// ALINEACION
	public static final byte ALINEACION_NULL = -1;
	public static final byte ALINEACION_NEUTRAL = 0;
	public static final byte ALINEACION_BONTARIANO = 1;
	public static final byte ALINEACION_BRAKMARIANO = 2;
	public static final byte ALINEACION_MERCENARIO = 3;
	// ELEMENTOS
	public static final byte ELEMENTO_NULO = -1;
	public static final byte ELEMENTO_NEUTRAL = 0;
	public static final byte ELEMENTO_TIERRA = 1;// secunda krakens
	public static final byte ELEMENTO_FUEGO = 2;// terc
	public static final byte ELEMENTO_AGUA = 3;// cuater
	public static final byte ELEMENTO_AIRE = 4;// primer
	// SERVICIOS
	public static final int SERVICIO_CAMBIO_NOMBRE = 1;
	public static final int SERVICIO_CAMBIO_COLOR = 2;
	public static final int SERVICIO_CAMBIO_SEXO = 3;
	public static final int SERVICIO_REVIVIR = 4;
	public static final int SERVICIO_TITULO_PERSONALIZADO = 5;
	public static final int SERVICIO_MIMOBIONTE = 6;
	public static final int SERVICIO_CREA_TU_ITEM = 7;
	public static final int SERVICIO_SISTEMA_ITEMS = 8;
	public static final int SERVICIO_CAMBIO_EMBLEMA = 9;
	public static final int SERVICIO_MONTURA_CAMALEON = 10;
	public static final int SERVICIO_ESCOGER_NIVEL = 11;
	public static final int SERVICIO_ALINEACION_MERCENARIO = 12;
	public static final int SERVICIO_ABONO_DIA = 21;
	public static final int SERVICIO_ABONO_SEMANA = 22;
	public static final int SERVICIO_ABONO_MES = 23;
	public static final int SERVICIO_ABONO_TRES_MESES = 24;
	public static final int SERVICIO_TRANSFORMAR_MONTURA = 30;
	public static final int SERVICIO_CAMBIO_FECA = 101;
	public static final int SERVICIO_CAMBIO_OSAMODA = 102;
	public static final int SERVICIO_CAMBIO_ANUTROF = 103;
	public static final int SERVICIO_CAMBIO_SRAM = 104;
	public static final int SERVICIO_CAMBIO_XELOR = 105;
	public static final int SERVICIO_CAMBIO_ZURCARAK = 106;
	public static final int SERVICIO_CAMBIO_ANIRIPSA = 107;
	public static final int SERVICIO_CAMBIO_YOPUKA = 108;
	public static final int SERVICIO_CAMBIO_OCRA = 109;
	public static final int SERVICIO_CAMBIO_SADIDA = 110;
	public static final int SERVICIO_CAMBIO_SACROGITO = 111;
	public static final int SERVICIO_CAMBIO_PANDAWA = 112;
	public static final int SERVICIO_CAMBIO_TYMADOR = 113;
	public static final int SERVICIO_CAMBIO_ZOBAL = 114;
	public static final int SERVICIO_CAMBIO_STEAMER = 115;
	// CLASES
	public static final byte CLASE_FECA = 1;
	public static final byte CLASE_OSAMODAS = 2;
	public static final byte CLASE_ANUTROF = 3;
	public static final byte CLASE_SRAM = 4;
	public static final byte CLASE_XELOR = 5;
	public static final byte CLASE_ZURCARAK = 6;
	public static final byte CLASE_ANIRIPSA = 7;
	public static final byte CLASE_YOPUKA = 8;
	public static final byte CLASE_OCRA = 9;
	public static final byte CLASE_SADIDA = 10;
	public static final byte CLASE_SACROGITO = 11;
	public static final byte CLASE_PANDAWA = 12;
	public static final byte CLASE_TYMADOR = 13;
	public static final byte CLASE_ZOBAL = 14;
	public static final byte CLASE_STREAM = 15;
	public static final byte CLASE_MULTIMAN = 19;
	// public static final byte CLASE_ATORMENTADOR_GOTA = 20;
	// public static final byte CLASE_ATORMENTADOR_NUBE = 21;
	// public static final byte CLASE_ATORMENTADOR_HOJA = 22;
	// public static final byte CLASE_ATORMENTADOR_LLAMAS = 23;
	// public static final byte CLASE_ATORMENTADOR_TINIEBLAS = 24;
	// public static final byte CLASE_BANDIDO_HECHIZERO = 25;
	// public static final byte CLASE_BANDIDO_ARQUERO = 26;
	// public static final byte CLASE_BANDIDO_PENDENCIERO = 27;
	// public static final byte CLASE_BANDIDO_ESPADACHIN = 28;
	// SEXOS
	public static final byte SEXO_MASCULINO = 0;
	public static final byte SEXO_FEMENINO = 1;
	// CAPACIDADES DRAGOPAVOS
	// ID EFECTO MAXIMO
	public static final int BUFF_MAXIMO = 1500;
	public static final int[] BUFF_ARMAS = {81, 82, 83, 84, 85, 86, 87, 88, 89, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
	101, 108};
	public static final int[] NO_BOOST_CC_IDS = {101};
	public static final int[] BUFF_ACCION_RESPUESTA = {9, 79, 788, 776};
	// 9 - Esquiva un #1% de los golpes retrocediendo de #2 casilla(s)", c: 0, o: ""
	// 79 - #3% de posibilidades de que sufras da�os x#1, o de que te cure x#2", c: 0, o: ""
	// 788 - Castigo #2 durante #3 turno(s).", c: 0, o: "+"
	// 776 - +#1{~1~2 a }#2% de los da�os incurables sufridos", c: 75, o: "-", j: true
	public static final int[] BUFF_SET_CLASE = {281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292};
	// 281 Aumenta #3 casillas el alcance del hechizo #1", c: 0, o: "+"
	// 282 Vuelve modificable el alcance del hechizo #1", c: 0, o: "+"
	// 283 +#3 a los da�os del hechizo #1", c: 0, o: "+"
	// 284 +#3 a las curas del hechizo #1", c: 0, o: "+"
	// 285 Reduce en #3 el n�mero de PA que cuesta el hechizo #1.", c: 0, o: "+"
	// 286 Reduce en #3 el n�mero de turnos a esperar antes de poder volver a lanzar el hechizo
	// #1", c: 0, o: "+"
	// 287 +#3 al GC del hechizo #1", c: 0, o: "+"
	// 288 Desactiva el lanzamiento en l�nea recta del hechizo #1", c: 0, o: "+"
	// 289 Desactiva la l�nea de visi�n del hechizo #1", c: 0, o: "+"
	// 290 +#3 al n�mero m�ximo de veces por que se puede lanzar el hechizo #1", c: 0, o: "+"
	// 291 +#3 al n�mero m�ximo de veces que se le puede lanzar a un mismo objetivo el hechizo
	// #1", c: 0, o: "+"
	// 292 Fija a #3 el n�mero de turnos para volver a lanzar el hechizo #1", c: 0, o: "+"
	// STATS
	public static final int STAT_ROBA_PM = 77;
	public static final int STAT_MAS_PM_2 = 78;
	public static final int STAT_CURAR_2 = 81;
	public static final int STAT_ROBA_PA = 84;
	public static final int STAT_MENOS_PA = 101;
	public static final int STAT_DA�OS_ROBAR_AGUA = 91;// Robar Vida(agua)
	public static final int STAT_DA�OS_ROBAR_TIERRA = 92;// Robar Vida(tierra)
	public static final int STAT_DA�OS_ROBAR_AIRE = 93;// Robar Vida(aire)
	public static final int STAT_DA�OS_ROBAR_FUEGO = 94;// Robar Vida(fuego)
	public static final int STAT_DA�OS_ROBAR_NEUTRAL = 95;// Robar Vida(neutral)
	public static final int STAT_DA�OS_AGUA = 96;// Da�os Agua
	public static final int STAT_DA�OS_TIERRA = 97;// Da�os Tierra
	public static final int STAT_DA�OS_AIRE = 98;// Da�os Aire
	public static final int STAT_DA�OS_FUEGO = 99;// Da�os Fuego
	public static final int STAT_DA�OS_NEUTRAL = 100;// Da�os Neutral
	public static final int STAT_MAS_DA�OS_REDUCIDOS_NO_FECA = 105;
	public static final int STAT_REENVIA_HECHIZO = 106;
	public static final int STAT_DA�OS_DEVUELTOS = 107;
	public static final int STAT_CURAR = 108;
	public static final int STAT_MAS_VIDA = 110;
	public static final int STAT_MAS_PA = 111;
	public static final int STAT_MAS_DA�OS = 112;
	public static final int STAT_MULTIPLICA_DA�OS = 114;
	public static final int STAT_MAS_GOLPES_CRITICOS = 115;
	public static final int STAT_MENOS_ALCANCE = 116;
	public static final int STAT_MAS_ALCANCE = 117;
	public static final int STAT_MAS_FUERZA = 118;
	public static final int STAT_MAS_AGILIDAD = 119;
	public static final int STAT_MAS_PA_2 = 120;
	public static final int STAT_MAS_DA�OS_2 = 121;
	public static final int STAT_MAS_FALLOS_CRITICOS = 122;
	public static final int STAT_MAS_SUERTE = 123;
	public static final int STAT_MAS_SABIDURIA = 124;
	public static final int STAT_MAS_VITALIDAD = 125;
	public static final int STAT_MAS_INTELIGENCIA = 126;
	public static final int STAT_MENOS_PM = 127;
	public static final int STAT_MAS_PM = 128;
	public static final int STAT_MAS_PORC_DA�OS = 138;
	public static final int STAT_MAS_DA�O_FISICO = 142;
	public static final int STAT_MENOS_DA�OS = 145;
	public static final int STAT_CAMBIA_APARIENCIA = 149;
	public static final int STAT_MENOS_SUERTE = 152;
	public static final int STAT_MENOS_VITALIDAD = 153;
	public static final int STAT_MENOS_AGILIDAD = 154;
	public static final int STAT_MENOS_INTELIGENCIA = 155;
	public static final int STAT_MENOS_SABIDURIA = 156;
	public static final int STAT_MENOS_FUERZA = 157;
	public static final int STAT_MAS_PODS = 158;
	public static final int STAT_MENOS_PODS = 159;
	public static final int STAT_MAS_ESQUIVA_PERD_PA = 160;
	public static final int STAT_MAS_ESQUIVA_PERD_PM = 161;
	public static final int STAT_MENOS_ESQUIVA_PERD_PA = 162;
	public static final int STAT_MENOS_ESQUIVA_PERD_PM = 163;
	public static final int STAT_MENOS_DA�OS_REDUCIDOS = 164;
	public static final int STAT_MAS_DOMINIO = 165;
	public static final int STAT_MENOS_PA_FIJO = 168;
	public static final int STAT_MENOS_PM_FIJO = 169;
	public static final int STAT_MENOS_GOLPES_CRITICOS = 171;
	public static final int STAT_MAS_INICIATIVA = 174;
	public static final int STAT_MENOS_INICIATIVA = 175;
	public static final int STAT_MAS_PROSPECCION = 176;
	public static final int STAT_MENOS_PROSPECCION = 177;
	public static final int STAT_MAS_CURAS = 178;
	public static final int STAT_MENOS_CURAS = 179;
	public static final int STAT_MAS_CRIATURAS_INVO = 182;
	public static final int STAT_REDUCCION_MAGICA = 183;
	public static final int STAT_REDUCCION_FISICA = 184;
	public static final int STAT_MENOS_PORC_DA�OS = 186;
	public static final int STAT_GANAR_KAMAS = 194;
	public static final int STAT_MAS_RES_PORC_TIERRA = 210;
	public static final int STAT_MAS_RES_PORC_AGUA = 211;
	public static final int STAT_MAS_RES_PORC_AIRE = 212;
	public static final int STAT_MAS_RES_PORC_FUEGO = 213;
	public static final int STAT_MAS_RES_PORC_NEUTRAL = 214;
	public static final int STAT_MENOS_RES_PORC_TIERRA = 215;
	public static final int STAT_MENOS_RES_PORC_AGUA = 216;
	public static final int STAT_MENOS_RES_PORC_AIRE = 217;
	public static final int STAT_MENOS_RES_PORC_FUEGO = 218;
	public static final int STAT_MENOS_RES_PORC_NEUTRAL = 219;
	public static final int STAT_REENVIA_DA�OS = 220;
	public static final int STAT_MAS_DA�OS_TRAMPA = 225;
	public static final int STAT_MAS_PORC_DA�OS_TRAMPA = 226;
	public static final int STAT_MAS_RES_FIJA_TIERRA = 240;
	public static final int STAT_MAS_RES_FIJA_AGUA = 241;
	public static final int STAT_MAS_RES_FIJA_AIRE = 242;
	public static final int STAT_MAS_RES_FIJA_FUEGO = 243;
	public static final int STAT_MAS_RES_FIJA_NEUTRAL = 244;
	public static final int STAT_MENOS_RES_FIJA_TIERRA = 245;
	public static final int STAT_MENOS_RES_FIJA_AGUA = 246;
	public static final int STAT_MENOS_RES_FIJA_AIRE = 247;
	public static final int STAT_MENOS_RES_FIJA_FUEGO = 248;
	public static final int STAT_MENOS_RES_FIJA_NEUTRAL = 249;
	public static final int STAT_MAS_RES_PORC_PVP_TIERRA = 250;
	public static final int STAT_MAS_RES_PORC_PVP_AGUA = 251;
	public static final int STAT_MAS_RES_PORC_PVP_AIRE = 252;
	public static final int STAT_MAS_RES_PORC_PVP_FUEGO = 253;
	public static final int STAT_MAS_RES_PORC_PVP_NEUTRAL = 254;
	public static final int STAT_MENOS_RES_PORC_PVP_TIERRA = 255;
	public static final int STAT_MENOS_RES_PORC_PVP_AGUA = 256;
	public static final int STAT_MENOS_RES_PORC_PVP_AIRE = 257;
	public static final int STAT_MENOS_RES_PORC_PVP_FUEGO = 258;
	public static final int STAT_MENOS_RES_PORC_PVP_NEUTRAL = 259;
	public static final int STAT_MAS_RES_FIJA_PVP_TIERRA = 260;
	public static final int STAT_MAS_RES_FIJA_PVP_AGUA = 261;
	public static final int STAT_MAS_RES_FIJA_PVP_AIRE = 262;
	public static final int STAT_MAS_RES_FIJA_PVP_FUEGO = 263;
	public static final int STAT_MAS_RES_FIJA_PVP_NEUTRAL = 264;
	public static final int STAT_MAS_DA�OS_REDUCIDOS_ARMADURAS_FECA = 265;
	public static final int STAT_HECHIZO_CLASE_AUMENTA_ALCANCE = 281;
	public static final int STAT_HECHIZO_CLASE_VUELVE_MODIFICABLE_ALCANCE = 282;
	public static final int STAT_HECHIZO_CLASE_MAS_DA�OS = 283;
	public static final int STAT_HECHIZO_CLASE_MAS_CURAS = 284;
	public static final int STAT_HECHIZO_CLASE_REDUCE_COSTO_PA = 285;
	public static final int STAT_HECHIZO_CLASE_REDUCE_TURNOS_VOLVER_LANZAR = 286;
	public static final int STAT_HECHIZO_CLASE_MAS_GOLPES_CRITICOS = 287;
	public static final int STAT_HECHIZO_CLASE_DESACTIVA_LINEA_RECTA = 288;
	public static final int STAT_HECHIZO_CLASE_DESACTIVA_LINEA_DE_VUELO = 289;
	public static final int STAT_HECHIZO_CLASE_MAS_VECES_LANZAMIENTOS_POR_TURNO = 290;
	public static final int STAT_HECHIZO_CLASE_MAS_VECES_LANZAMIENTOS_POR_OBJETIVO = 291;
	public static final int STAT_HECHIZO_CLASE_FIJAR_TURNOS_VOLVER_A_LANZAR = 292;
	// E[293] = {d: "Aumenta los da�os de base del hechizo #1 en #3", c: 0, o: "+"};
	// E[294] = {d: "Disminuye el alcance del hechizo #1 de #3", c: 0, o: "-"};
	public static final int STAT_ROBA_ALCANCE = 320;
	public static final int STAT_MOVER_DESAPARECE_BUFF = 334;
	public static final int STAT_CAMBIA_APARIENCIA_2 = 335;
	public static final int STAT_MAS_HUIDA = 410;
	public static final int STAT_MENOS_HUIDA = 411;
	public static final int STAT_MAS_PLACAJE = 413;
	public static final int STAT_MENOS_PLACAJE = 414;
	public static final int STAT_MAS_DA�OS_DE_AGUA = 415;
	public static final int STAT_MAS_DA�OS_DE_TIERRA = 416;
	public static final int STAT_MAS_DA�OS_DE_AIRE = 417;
	public static final int STAT_MAS_DA�OS_DE_FUEGO = 418;
	public static final int STAT_MAS_DA�OS_DE_NEUTRAL = 419;
	public static final int STAT_QUITA_EFECTOS_HECHIZO = 420;
	public static final int STAT_RETROCEDE_CASILLAS = 421;
	public static final int STAT_MAS_PORC_ESCUDO_PDV = 422;
	public static final int STAT_AVANZAR_CASILLAS = 423;
	public static final int STAT_MENOS_PORC_PDV_TEMPORAL = 424;
	public static final int STAT_MAS_DA�OS_EMPUJE = 425;
	public static final int STAT_MAS_VELOCIDAD = 426;
	public static final int STAT_DETONAR_BOMBA = 427;
	public static final int STAT_INVOCA_BOMBA = 428;
	public static final int STAT_MAS_DA�OS_CRITICOS = 429;
	public static final int STAT_MAS_REDUCCION_CRITICOS = 430;
	public static final int STAT_MAS_RETIRO_PA = 431;
	public static final int STAT_MAS_RETIRO_PM = 432;
	public static final int STAT_MENOS_RETIRO_PA = 433;
	public static final int STAT_MENOS_RETIRO_PM = 434;
	public static final int STAT_MAS_REDUCCION_EMPUJE = 435;
	public static final int STAT_MENOS_DA�OS_DE_AGUA = 436;
	public static final int STAT_MENOS_DA�OS_DE_TIERRA = 437;
	public static final int STAT_MENOS_DA�OS_DE_AIRE = 438;
	public static final int STAT_MENOS_DA�OS_DE_FUEGO = 439;
	public static final int STAT_MENOS_DA�OS_DE_NEUTRAL = 440;
	public static final int STAT_MENOS_DA�OS_CRITICOS = 441;
	public static final int STAT_MENOS_REDUCCION_CRITICOS = 442;
	public static final int STAT_MENOS_DA�OS_EMPUJE = 443;
	public static final int STAT_MENOS_REDUCCION_EMPUJE = 444;
	public static final int STAT_DAR_OBJETO = 500;
	public static final int STAT_MAS_COMPA�ERO = 501;
	public static final int STAT_DAR_OGRINAS = 550;
	public static final int STAT_DAR_CREDITOS = 551;
	public static final int STAT_GANAR_EXPERIENCIA = 605;
	public static final int STAT_INVOCA_MOB = 623;
	public static final int STAT_INVOCA_MOB_2 = 628;
	public static final int STAT_ENCARNACION_NIVEL = 669;
	public static final int STAT_CAMBIO_ELEMENTO_DA�O = 700;
	public static final int STAT_POTENCIA_RUNA = 701;
	public static final int STAT_POTENCIA_CAPTURA_ALMA = 705;
	public static final int STAT_DOMESTICAR_MONTURA = 706;
	public static final int STAT_NOMBRE_MOB = 717;
	public static final int STAT_TITULO = 724;
	public static final int STAT_AGREDIR_AUTOMATICAMENTE = 731;
	public static final int STAT_BONUS_CAPTURA_ALMA = 750;
	public static final int STAT_PUNTOS_VIDA = 800;
	public static final int STAT_RECIBIDO_EL = 805;
	public static final int STAT_CORPULENCIA = 806;
	public static final int STAT_ULTIMA_COMIDA = 807;
	public static final int STAT_SE_HA_COMIDO_EL = 808;
	public static final int STAT_TAMA�O_POCES = 810;
	public static final int STAT_TURNOS = 811;
	public static final int STAT_RESISTENCIA = 812;
	public static final int STAT_LLAVE_MAZMORRA = 814;
	public static final int STAT_AURA = 850;
	public static final int STAT_COLOR_NOMBRE_OBJETO = 900;
	public static final int STAT_CAMBIAR_GFX_OBJETO = 901;
	public static final int STAT_CAMBIAR_NOMBRE_OBJETO = 902;
	public static final int STAT_LANZA_UN_COMBATE_CONTRA = 905;
	public static final int STAT_MAS_PORC_EXP = 910;
	public static final int STAT_APARIENCIA_OBJETO = 915;
	public static final int STAT_AUMENTAR_SERENIDAD = 930;
	public static final int STAT_AUMENTA_AGRESIVIDAD = 931;
	public static final int STAT_AUMENTA_RESISTENCIA = 932;// Aumenta la resistencia", c: 0, o: "+"
	public static final int STAT_DISMINUYE_RESITENCIA = 933;
	public static final int STAT_AUMENTA_AMOR = 934;// Aumenta el amor", c: 0, o: "+"
	public static final int STAT_DISMINUYE_AMOR = 935;// Disminuye el amor", c: 0, o: "-"
	public static final int STAT_ACELERA_MADUREZ = 936; // Acelera la madurez", c: 0, o: "+"
	public static final int STAT_RALENTIZA_MADUREZ = 937;// Ralentiza la madurez", c: 0, o: "-"
	public static final int STAT_AUMENTA_CAPACIDADES_MASCOTA = 939;
	public static final int STAT_CAPACIDADES_MEJORADAS = 940;// Capacidades mejoradas", c: 0, o: "+"
	public static final int STAT_QUITA_OBJETO_CRIA = 946;
	public static final int STAT_RECUPERAR_OBJETO_CERCADO = 947;
	public static final int STAT_OBJETO_CERCADO = 948;// Objeto para cercado", c: 0, o: "/"
	public static final int STAT_SUBIR_BAJAR_MONTURA = 949;
	public static final int STAT_DAR_ESTADO = 950;// Estado #3", c: 71, o: "/"
	public static final int STAT_QUITAR_ESTADO = 951;// Quita el estado \'\'#3\'\'", c: 71, o: "/"
	public static final int STAT_ALINEACION = 960;// Alineaci�n: #3", c: 0, o: "/"
	public static final int STAT_RANGO = 961;// Rango: #3", c: 0, o: "/"
	public static final int STAT_NIVEL = 962;// Nivel: #3", c: 0, o: "/"
	public static final int STAT_CREADA_HACE_DIAS = 963;// Creada hace: #3 d�a(s)", c: 0, o: "/"
	public static final int STAT_APELLIDOS = 964;// Apellidos: #4", c: 0, o: "/"
	public static final int STAT_REAL_GFX = 970;
	public static final int STAT_HUMOR_OBJEVIVO = 971;
	public static final int STAT_SKIN_OBJEVIVO = 972;
	public static final int STAT_REAL_TIPO = 973;
	public static final int STAT_EXP_OBJEVIVO = 974;
	public static final int STAT_INTERCAMBIABLE_DESDE = 983;
	public static final int STAT_ = 984;// null", c: 0, o: "/"
	public static final int STAT_MODIFICADO_POR = 985;// Modificado por: #4", c: 0, o: "/"
	public static final int STAT_PREPARA_PERGAMINOS = 986;
	public static final int STAT_PERTENECE_Y_NO_VENDER = 987;// Pertenece a: #4", c: 0, o: "/"
	public static final int STAT_FACBRICADO_POR = 988;// Fabricado por: #4", c: 0, o: "/"
	public static final int STAT_MISION = 989;
	public static final int STAT_NUMERO_COMIDAS = 990;
	public static final int STAT_POZO_RESIDUAL = 991;
	public static final int STAT_LIGADO_A_CUENTA = 992;
	public static final int STAT_CERTIFICADO_NO_VALIDO = 994;
	public static final int STAT_CONSULTAR_MONTURA = 995;
	public static final int STAT_PERTENECE_A = 996;
	public static final int STAT_NOMBRE = 997;
	public static final int STAT_VALIDEZ = 998;
	public static final int STAT_PERSONAJE_SEGUIDOR = 999;
	public static final int[] STAT_REPETIBLE = {STAT_INVOCA_MOB, STAT_INVOCA_MOB_2, STAT_NOMBRE_MOB, STAT_DAR_OBJETO,
	STAT_LLAVE_MAZMORRA};
	public static final int[] STAT_TEXTO = {7, 10, 146, 148, 188, 197, 201, 221, 222, 229, 230, 333, 501, 513, 600, 602,
	603, 604, 614, 615, 616, 620, 622, 624, 627, 640, 641, 642, 643, 645, 647, 648, 649, 669, 699, 700, 701, 705, 710,
	715, 716, 717, 720, 724, 725, 730, 751, 760, 765, 791, 795, 800, 805, 806, 807, 808, 810, 811, 813, 825, 900, 901,
	902, 905, 915, 930, 931, 932, 933, 934, 935, 936, 937, 939, 940, 946, 947, 948, 949, 950, 960, 961, 962, 963, 964,
	970, 971, 972, 973, 974, 983, 985, 986, 987, 988, 989, 990, 992, 994, 996, 997, 998, 999};
	// tipo de quests
	// Q.t[5] = "Descubre la zona: #1";
	// Q.t[0] = "#1";
	// Q.t[13] = "Elimina #1";
	// Q.t[4] = "Descubre el mapa: #1";
	// Q.t[1] = "Ve a ver a #1";
	// Q.t[10] = "Escolta a #1 #2";
	// Q.t[7] = "Vence al monstruo: #1";
	// Q.t[2] = "Ense�a a #1: #3 #2";
	// Q.t[3] = "Entrega a #1: x#3 #2";
	// Q.t[12] = "Lleva #3 alma(s) de #2 a #1";
	// Q.t[9] = "Vuelve a ver a #1";
	// Q.t[8] = "Utiliza: #1";
	// Q.t[11] = "Vence a un jugador en desaf�o #1";
	// Q.t[6] = "Vence a x#2 #1 en un solo combate";
	// otros efectos
	// OBJEVIVOS
	public static final int[] NIVELES_OBJEVIVOS = {0, 10, 21, 33, 46, 60, 75, 91, 108, 126, 145, 165, 186, 208, 231, 255,
	280, 306, 333, 361};
	// EXP OFICIO
	public static final int OFICIO_EXP_TIPO_RECOLECCION = 1;
	public static final int OFICIO_EXP_TIPO_CRAFT = 2;
	// ALMANAX
	public static final int ALMANAX_BONUS_EXP_PJ = 1;
	public static final int ALMANAX_BONUS_KAMAS = 2;
	public static final int ALMANAX_BONUS_DROP = 3;
	public static final int ALMANAX_BONUS_EXP_OFICIO_CRAFT = 4;
	public static final int ALMANAX_BONUS_EXP_OFICIO_RECOLECCION = 5;
	public static final int ALMANAX_BONUS_DROPS_RECOLECCION = 6;
	public static final int ALMANAX_BONUS_HONOR = 7;
	// CAPACIDADES DRAGOPAVOS
	public static final byte HABILIDAD_INFATIGABLE = 1;// Una montura infatigable tiene mucha m�s
	// energ�a que una montura normal y tambi�n
	// recupera mucho m�s r�pido
	public static final byte HABILIDAD_PORTADORA = 2;// Una montura portadora puede llevar una mayor
	// cantidad de objetos que una montura normal
	public static final byte HABILIDAD_REPRODUCTORA = 3;// Una montura reproductora trae al mundo m�s
	// monturitas que una montura normal
	public static final byte HABILIDAD_SABIA = 4;// Una montura sabia evoluciona dos veces m�s r�pido
	// que una montura normal
	public static final byte HABILIDAD_RESISTENTE = 5;// Una montura resistente se vuelve resistente
	// m�s r�pido que una montura normal
	public static final byte HABILIDAD_ENAMORADA = 6;// Una montura enamorada se enamora m�s que una
	// montura normal
	public static final byte HABILIDAD_PRECOZ = 7;// Una montura precoz se vuelve madura m�s r�pido
	// que una montura normal
	public static final byte HABILIDAD_PREDISPUESTA = 8;// Una montura predispuesta gen�ticamente
	// tiene m�s probabilidades de transmitir sus
	// caracter�sticas gen�ticas que una montura
	// normal
	public static final byte HABILIDAD_CAMALEON = 9;// Una montura camale�nica cambia su apariencia
	// seg�n el plumaje del aventurero que la monta
	// SKILLS
	public final static int SKILL_MAGUEAR_DAGA = 1;
	public final static int SKILL_TALAR_FRESNO = 6;
	public final static int SKILL_TALAR_ROBLE = 10;
	public final static int SKILL_CREAR_ANILLO = 11;
	public final static int SKILL_CREAR_AMULETO = 12;
	public final static int SKILL_CREAR_BOTAS = 13;
	public final static int SKILL_CREAR_CINTURON = 14;
	public final static int SKILL_CREAR_ARCO = 15;
	public final static int SKILL_CREAR_VARITA = 16;
	public final static int SKILL_CREAR_BASTON = 17;
	public final static int SKILL_CREAR_DAGA = 18;
	public final static int SKILL_CREAR_MARTILLO = 19;
	public final static int SKILL_CREAR_ESPADA = 20;
	public final static int SKILL_CREAR_PALA = 21;
	public final static int SKILL_PELAR_PATATAS = 22;
	public final static int SKILL_CREAR_POCIMA = 23;
	public final static int SKILL_RECOLECTAR_HIERRO = 24;
	public final static int SKILL_RECOLECTAR_COBRE = 25;
	public final static int SKILL_RECOLECTAR_BRONCE = 26;
	public final static int SKILL_HACER_PAN = 27;
	public final static int SKILL_RECOLECTAR_KOBALTO = 28;
	public final static int SKILL_RECOLECTAR_PLATA = 29;
	public final static int SKILL_RECOLECTAR_ORO = 30;
	public final static int SKILL_RECOLECTAR_BAUXITA = 31;
	public final static int SKILL_FUNDIR = 32;
	public final static int SKILL_TALAR_TEJO = 33;
	public final static int SKILL_TALAR_EBANO = 34;
	public final static int SKILL_TALAR_OLMO = 35;
	public final static int SKILL_TALAR_ARCE = 37;
	public final static int SKILL_TALAR_CARPE = 38;
	public final static int SKILL_TALAR_CASTA�O = 39;
	public final static int SKILL_TALAR_NOGAL = 40;
	public final static int SKILL_TALAR_CEREZO_SILVESTRE = 41;
	public final static int SKILL_RECOGER_PATATAS = 42;
	public final static int SKILL_GUARDAR_POSICION = 44;
	public final static int SKILL_SEGAR_TRIGO = 45;
	public final static int SKILL_SEGAR_LUPULO = 46;
	public final static int SKILL_MOLER = 47;
	public final static int SKILL_PULIR = 48;
	public final static int SKILL_SEGAR_LINO = 50;
	public final static int SKILL_SEGAR_CENTENO = 52;
	public final static int SKILL_SEGAR_CEBADA = 53;
	public final static int SKILL_SEGAR_CA�AMO = 54;
	public final static int SKILL_RECOLECTAR_ESTA�O = 55;
	public final static int SKILL_RECOLECTAR_MANGANESO = 56;
	public final static int SKILL_SEGAR_AVENA = 57;
	public final static int SKILL_SEGAR_MALTA = 58;
	public final static int SKILL_REGENERARSE = 62;
	public final static int SKILL_CREAR_SOMBRERO = 63;
	public final static int SKILL_CREAR_CAPA = 64;
	public final static int SKILL_CREAR_HACHA = 65;
	public final static int SKILL_CREAR_GUADA�A = 66;
	public final static int SKILL_CREAR_PICO = 67;
	public final static int SKILL_COSECHAR_LINO = 68;
	public final static int SKILL_COSECHAR_CA�AMO = 69;
	public final static int SKILL_COSECHAR_TREBOL = 71;
	public final static int SKILL_COSECHAR_MENTA_SALVAJE = 72;
	public final static int SKILL_COSECHAR_ORQUIDEA = 73;
	public final static int SKILL_COSECHAR_EDELWEISS = 74;
	public final static int SKILL_PONER_CERROJO_CASA = 81;
	public final static int SKILL_ENTRAR_CASA = 84;
	public final static int SKILL_HILA = 95;
	public final static int SKILL_HACER_CERVEZA = 96;
	public final static int SKILL_COMPRAR_CASA = 97;
	public final static int SKILL_VENDER_CASA = 98;
	public final static int SKILL_QUITAR_CERROJO_CASA = 100;
	public final static int SKILL_SERRAR = 101;
	public final static int SKILL_SACAR_AGUA = 102;
	public final static int SKILL_ABRIR_COFRE = 104;
	public final static int SKILL_PONER_CERROJO_COFRE = 105;
	public final static int SKILL_QUITAR_CERROJO_COFRE = 106;
	public final static int SKILL_MODIFICAR_PRECIO_CASA = 108;
	public final static int SKILL_HACER_CARAMELOS = 109;
	public final static int SKILL_UTILIZAR_BANCO = 110;
	public final static int SKILL_MAGUEAR_ESPADA = 113;
	public final static int SKILL_UTILIZAR_ZAAP = 114;
	public final static int SKILL_MAGUEAR_HACHA = 115;
	public final static int SKILL_MAGUEAR_MARTILLO = 116;
	public final static int SKILL_MAGUEAR_PALA = 117;
	public final static int SKILL_MAGUEAR_ARCO = 118;
	public final static int SKILL_MAGUEAR_VARITA = 119;
	public final static int SKILL_MAGUEAR_BASTON = 120;
	public final static int SKILL_MACHACAR_RECURSOS = 121;
	public final static int SKILL_DESGRANAR = 122;
	public final static int SKILL_CREAR_MOCHILA = 123;
	public final static int SKILL_PESCAR_PESCADITOS_RIO = 124;
	public final static int SKILL_PESCAR_PESCADOS_RIO = 125;
	public final static int SKILL_PESCAR_PECES_GORDOS_RIO = 126;
	public final static int SKILL_PESCAR_PESCADOS_GIGANTES_RIO = 127;
	public final static int SKILL_PESCAR_PESCADITOS_MAR = 128;
	public final static int SKILL_PESCAR_PESCADOS_MAR = 129;
	public final static int SKILL_PESCAR_PECES_GORDOS_MAR = 130;
	public final static int SKILL_PESCAR_PESCADOS_GIGANTES_MAR = 131;
	public final static int SKILL_PREPARAR_ENCIMERA = 132;
	public final static int SKILL_VACIAR_PESCADO = 133;
	public final static int SKILL_PREPARAR_CARNE = 134;
	public final static int SKILL_PREPARAR_PESCADO = 135;
	public final static int SKILL_PESCAR_PISCHI = 136;
	public final static int SKILL_TALAR_BOMBU = 139;
	public final static int SKILL_PESCAR_SOMBRA_EXTRA�A = 140;
	public final static int SKILL_TALAR_OLIVIOLETA = 141;
	public final static int SKILL_REPARAR_DAGA = 142;
	public final static int SKILL_REPARAR_HACHA = 143;
	public final static int SKILL_REPARAR_MARTILLO = 144;
	public final static int SKILL_REPARAR_ESPADA = 145;
	public final static int SKILL_REPARAR_PALA = 146;
	public final static int SKILL_REPARAR_BASTON = 147;
	public final static int SKILL_REPARAR_VARITA = 148;
	public final static int SKILL_REPARAR_ARCO = 149;
	public final static int SKILL_JUGAR_MAQUINA_FUERZA = 150;
	public final static int SKILL_INVOCAR_HADA = 151;
	public final static int SKILL_PESCAR_KUAKUA = 152;
	public final static int SKILL_REGISTRAR_BASURA = 153;
	public final static int SKILL_TALAR_BAMBU = 154;
	public final static int SKILL_TALAR_BAMBU_OSCURO = 155;
	public final static int SKILL_CREAR_ESCUDO = 156;
	public final static int SKILL_TRANSPORTE_ZAAPI = 157;
	public final static int SKILL_TALAR_BAMBU_SAGRADO = 158;
	public final static int SKILL_SEGAR_ARROZ = 159;
	public final static int SKILL_COSECHAR_PANDOJA = 160;
	public final static int SKILL_RECOLECTAR_DOLOMIA = 161;
	public final static int SKILL_RECOLECTAR_SILICATO = 162;
	public final static int SKILL_MAGUEAR_BOTAS = 163;
	public final static int SKILL_MAGUEAR_CINTURON = 164;
	public final static int SKILL_MAGUEAR_CAPA = 165;
	public final static int SKILL_MAGUEAR_SOMBRERO = 166;
	public final static int SKILL_MAGUEAR_MOCHILA = 167;
	public final static int SKILL_MAGUEAR_ANILLO = 168;
	public final static int SKILL_MAGUEAR_AMULETO = 169;
	public final static int SKILL_CONSULTAR_LIBRO_ARTESANOS = 170;
	public final static int SKILL_CREAR_CHAPUZA = 171;
	public final static int SKILL_TALAR_KALIPTO = 174;
	public final static int SKILL_ACCEDER_CERCADO = 175;
	public final static int SKILL_COMPRAR_CERCADO = 176;
	public final static int SKILL_VENDER_CERCADO = 177;
	public final static int SKILL_MODIFICAR_PRECIO_CERCADO = 178;
	public final static int SKILL_ACCIONAR_PALANCA = 179;
	public final static int SKILL_ROMPER_OBJETO = 181;
	public final static int SKILL_CREAR_LLAVE = 182;
	public static final String SKILLS_LIBRO_ARTESANOS = OFICIO_LE�ADOR + ";" + OFICIO_CAMPESINO + ";" + OFICIO_ALQUIMISTA
	+ ";" + OFICIO_MINERO + ";" + OFICIO_PESCADOR + ";" + OFICIO_CAZADOR + ";" + OFICIO_PANADERO + ";" + OFICIO_CARNICERO
	+ ";" + OFICIO_PESCADERO + ";" + OFICIO_ZAPATERO + ";" + OFICIO_JOYERO + ";" + OFICIO_SASTRE + ";"
	+ OFICIO_ESCULTOR_BASTONES + ";" + OFICIO_ESCULTOR_VARITAS + ";" + OFICIO_ESCULTOR_ARCOS + ";" + OFICIO_FORJADOR_DAGAS
	+ ";" + OFICIO_FORJADOR_ESPADAS + ";" + OFICIO_FORJADOR_MARTILLOS + ";" + OFICIO_FORJADOR_PALAS + ";"
	+ OFICIO_FORJADOR_HACHAS + ";" + OFICIO_FORJADOR_ESCUDOS + ";" + OFICIO_ZAPATEROMAGO + ";" + OFICIO_JOYEROMAGO + ";"
	+ OFICIO_SASTREMAGO + ";" + OFICIO_ESCULTORMAGO_BASTONES + ";" + OFICIO_ESCULTORMAGO_VARITAS + ";"
	+ OFICIO_ESCULTORMAGO_ARCOS + ";" + OFICIO_FORJAMAGO_DAGAS + ";" + OFICIO_FORJAMAGO_ESPADAS + ";"
	+ OFICIO_FORJAMAGO_MARTILLOS + ";" + OFICIO_FORJAMAGO_PALAS + ";" + OFICIO_FORJAMAGO_HACHAS + ";" + OFICIO_MANITAS;
	// REPORTES
	public final static byte REPORTE_BUGS = 0;
	public final static byte REPORTE_SUGERENCIAS = 1;
	public final static byte REPORTE_DENUNCIAS = 2;
	public final static byte REPORTE_OGRINAS = 3;
	// MOBS
	public final static int MOB_TIPO_SIN_CLASIFICAR = -1;
	public final static int MOB_TIPO_INVOCACIONES_DE_CLASE = 0;
	public final static int MOB_TIPO_JEFE_FINAL = 1;
	public final static int MOB_TIPO_BANDIDOS = 2;
	public final static int MOB_TIPO_WABBITS = 3;
	public final static int MOB_TIPO_DRAGOHUEVOS = 4;
	public final static int MOB_TIPO_BWORKS = 5;
	public final static int MOB_TIPO_GOBLINS = 6;
	public final static int MOB_TIPO_GELATINAS = 7;
	public final static int MOB_TIPO_MONSTRUOS_DE_LA_NOCHE = 8;
	public final static int MOB_TIPO_JALATOS = 9;
	public final static int MOB_TIPO_PLANTAS_DE_LOS_CAMPOS = 10;
	public final static int MOB_TIPO_LARVAS = 11;
	public final static int MOB_TIPO_KWAKS = 12;
	public final static int MOB_TIPO_CRUJIDORES = 13;
	public final static int MOB_TIPO_CERDOS = 16;
	public final static int MOB_TIPO_CHAFERS = 17;
	public final static int MOB_TIPO_DOPEULS_TEMPLO = 18;
	public final static int MOB_TIPO_PNJS = 19;
	public final static int MOB_TIPO_KANIBOLAS_DE_LA_ISLA_DE_MOON = 20;
	public final static int MOB_TIPO_DRAGOPAVO = 21;
	public final static int MOB_TIPO_ABRAKNIDEO = 22;
	public final static int MOB_TIPO_BLOPS = 23;
	public final static int MOB_TIPO_MONSTRUOS_DE_LAS_LLANURAS_DE_CANIA = 24;
	public final static int MOB_TIPO_MONSTRUOS_DE_LAS_LANDAS = 25;
	public final static int MOB_TIPO_GUARDIAS = 26;
	public final static int MOB_TIPO_MONSTRUOS_DE_LAS_CONQUISTAS_DE_TERRITORIOS = 27;
	public final static int MOB_TIPO_MONSTRUOS_DEL_PUEBLO_DE_LOS_DOPEULS = 28;
	public final static int MOB_TIPO_MONSTRUOS_TUTORIAL = 29;
	public final static int MOB_TIPO_SALTEADORILLOS = 30;
	public final static int MOB_TIPO_MONSTRUO_DE_LAS_ALCANTARILLAS = 31;
	public final static int MOB_TIPO_SE_BUSCA = 32;
	public final static int MOB_TIPO_PIOS = 33;
	public final static int MOB_TIPO_MONSTRUOS_DEL_PUEBLO_DE_PANDALA = 34;
	public final static int MOB_TIPO_MONSTRUOS_DE_PANDALA = 35;
	public final static int MOB_TIPO_FANTASMA_DE_PANDALA = 36;
	public final static int MOB_TIPO_ESCARAHOJA = 37;
	public final static int MOB_TIPO_ARAKNA = 38;
	public final static int MOB_TIPO_MILUBO = 39;
	public final static int MOB_TIPO_TORTUGAS_DE_MOON = 40;
	public final static int MOB_TIPO_PIRATAS_DE_MOON = 41;
	public final static int MOB_TIPO_PLANTAS_DE_MOON = 42;
	public final static int MOB_TIPO_MONSTRUOS_DE_MOON = 43;
	public final static int MOB_TIPO_COCODRAILS = 44;
	public final static int MOB_TIPO_SETAS = 45;
	public final static int MOB_TIPO_TOFUS = 46;
	public final static int MOB_TIPO_MOSKITOS = 47;
	public final static int MOB_TIPO_MONSTRUOS_DE_LOS_PANTANOS = 48;
	public final static int MOB_TIPO_ANIMALES_DEL_BOSQUE = 49;
	public final static int MOB_TIPO_MONSTRUOS_DE_BUSQUEDA = 50;
	public final static int MOB_TIPO_CUERBOKS = 51;
	public final static int MOB_TIPO_GUARDIANES_DE_LOS_PUEBLOS_DE_KWAKS = 52;
	public final static int MOB_TIPO_FANTASMAS = 53;
	public final static int MOB_TIPO_MASCOTAS_FANTASMAS = 54;
	public final static int MOB_TIPO_PLANTAS_DE_PANDALA = 55;
	public final static int MOB_TIPO_KITSUS = 56;
	public final static int MOB_TIPO_PANDAWAS = 57;
	public final static int MOB_TIPO_FIREFUX = 59;
	public final static int MOB_TIPO_KOALAKS = 60;
	public final static int MOB_TIPO_MONSTRUOS_DE_LAS_CUEVAS = 61;
	public final static int MOB_TIPO_PROTECTORES_DE_LOS_CEREALES = 62;
	public final static int MOB_TIPO_PROTECTORES_DE_LOS_MINERALES = 63;
	public final static int MOB_TIPO_PROTECTORES_DE_LOS_ARBOLES = 64;
	public final static int MOB_TIPO_PROTECTORES_DE_LOS_PECES = 65;
	public final static int MOB_TIPO_PROTECTORES_DE_LAS_PLANTAS = 66;
	public final static int MOB_TIPO_MINOS = 67;
	public final static int MOB_TIPO_MONSTRUOS_DE_NAWIDAD = 68;
	public final static int MOB_TIPO_MONSTRUOS_DE_LAS_PLAYAS = 69;
	public final static int MOB_TIPO_MONSTRUOS_DE_LA_ZONA_DE_NOVATOS = 70;
	public final static int MOB_TIPO_MONSTRUOS_DE_LAS_LLANURAS_HERBOSAS = 71;
	public final static int MOB_TIPO_MONSTRUOS_DE_LA_PLAYA_DE_CORAL = 72;
	public final static int MOB_TIPO_MONSTRUOS_DE_LA_TURBERA_SIN_FONDO = 73;
	public final static int MOB_TIPO_MONSTRUOS_DE_LA_OSCURA_SELVA = 74;
	public final static int MOB_TIPO_MONSTRUOS_DEL_ARBOL_HAKAM = 75;
	public final static int MOB_TIPO_MONSTRUOS_DEL_ARCA_DE_OTOMAI = 76;
	public final static int MOB_TIPO_MONSTRUOS_DE_LA_CANOPEA_DE_LAS_NIEBLAS = 77;
	public final static int MOB_TIPO_LOS_ARCHIMONSTRUOS = 78;
	public final static int MOB_TIPO_MONSTRUOS_DE_LOS_CAMPOS_DE_HIELO = 79;
	public final static int MOB_TIPO_MONSTRUOS_DEL_BURGO = 81;
	public final static int MOB_TIPO_MONSTRUOS_DEL_BOSQUE_DE_LOS_PINOS_PERDIDOS = 82;
	public final static int MOB_TIPO_MONSTRUOS_DEL_LAGO_HELADO = 83;
	public final static int MOB_TIPO_MONSTRUOS_DEL_MONTE_TORRIDO = 84;
	public final static int MOB_TIPO_MONSTRUOS_DE_LAS_LAGRIMAS_DE_URONIGRIDO = 85;
	public final static int MOB_TIPO_MONSTRUOS_DE_LA_CUNA_DE_ALMA = 86;
	public final static int MOB_TIPO_MONSTRUOS_DE_LOS_COL = 87;
	public final static int MOB_TIPO_MONSTRUOS_DE_LA_GRIETA_BU = 88;
	public final static int MOB_TIPO_MONSTRUOS_DEL_BOSQUE_PETRIFICADO = 89;
	public final static int MOB_TIPO_MONSTRUOS_SE_BUSCA_DE_FRIGOST = 90;
	public final static int MOB_TIPO_MONSTRUOS_DE_MISION_DE_FRIGOST = 91;
	// MOB SUPER TIPO
	public final static int MOB_SUPER_TIPO_CRIATURAS_DIVERSAS = 1;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LOS_CAMPOS = 2;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LA_MONTA�A = 3;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DEL_BOSQUE = 4;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LAS_LLANURAS = 5;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LAS_LANDAS = 6;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LA_ISLA_DE_MOON = 7;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LA_ISLA_DE_LOS_WABBITS = 8;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_PANDALA = 9;
	public final static int MOB_SUPER_TIPO_CRIATURAS_HUMANOIDES = 10;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LA_NOCHE = 11;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LOS_PANTANOS = 12;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LAS_CIUDADES = 13;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DEL_PUEBLO_DE_LOS_GANADEROS = 14;
	public final static int MOB_SUPER_TIPO_PROTECTORES_DE_LOS_RECURSOS = 15;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LA_ISLA_DE_MINOTAURORO = 16;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LAS_PLAYAS = 17;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LA_ZONA_DE_LOS_NOVATOS = 18;
	public final static int MOB_SUPER_TIPO_CRIATURAS_DE_LA_ISLA_DE_OTOMAI = 19;
	public final static int MOB_SUPER_TIPO_CRIATURAS_ARCHIMONSTRUO = 20;
	public final static int MOB_SUPER_TIPO_NULL = 21;
	// ARCHIMOBS
	// public static final int[] ARCHIMOBS = {31, 34, 36, 40, 41, 43, 44, 46, 47, 254, 48, 474, 52,
	// 255, 54, 55, 56, 57, 59,
	// 61, 62, 63, 64, 65, 68, 72, 74, 75, 76, 78, 79, 82, 87, 88, 89, 90, 91, 93, 94, 95, 96, 97, 99,
	// 102, 106, 108, 110,
	// 111, 112, 118, 119, 123, 124, 126, 127, 134, 148, 149, 150, 153, 154, 466, 155, 525, 157, 159,
	// 160, 161, 162, 163,
	// 164, 165, 166, 167, 168, 169, 170, 171, 200, 178, 179, 194, 198, 207, 208, 209, 211, 212, 213,
	// 214, 215, 216, 217,
	// 218, 220, 221, 222, 223, 228, 229, 231, 233, 491, 493, 492, 489, 490, 236, 240, 241, 249, 253,
	// 256, 259, 261, 263,
	// 273, 274, 275, 276, 277, 278, 279, 280, 281, 287, 288, 522, 290, 291, 292, 293, 297, 298, 299,
	// 397, 300, 301, 343,
	// 344, 370, 371, 378, 379, 932, 380, 442, 449, 475, 465, 447, 467, 473, 483, 495, 496, 498, 515,
	// 517, 566, 518, 519,
	// 523, 524, 527, 528, 529, 530, 531, 532, 534, 535, 537, 546, 547, 548, 549, 583, 584, 585, 586,
	// 587, 588, 589, 590,
	// 594, 595, 596, 598, 597, 603, 650, 651, 654, 655, 653, 652, 668, 744, 745, 746, 747, 748, 749,
	// 751, 752, 753, 754,
	// 755, 756, 758, 759, 760, 761, 763, 783, 784, 785, 786, 829, 830, 834, 835, 836, 886, 885, 848,
	// 884, 853, 855, 878,
	// 879, 858, 905, 862, 876, 920, 921, 922, 923, 924, 926, 1019, 1020, 1022, 1025, 1026, 1029,
	// 1041, 1043, 1044, 1046,
	// 1047, 1048, 1049, 1052, 1053, 1054, 1055, 1056, 1057, 1058, 1059, 1060, 1061, 1062, 1063, 1064,
	// 1065, 1066, 1067,
	// 1068, 1069, 1070, 1073, 1074, 1075, 1076, 1077, 1096, 1153, 1154, 1155, 1156, 1157, 1158};
	public static final int[][] TRABAJOS_Y_DROPS = {
	// machacar recursos
	{SKILL_PELAR_PATATAS}, {SKILL_UTILIZAR_BANCO}, {SKILL_MACHACAR_RECURSOS},
	// romper objetos
	{SKILL_ROMPER_OBJETO, OBJETO_TIPO_ANILLO, OBJETO_TIPO_AMULETO, OBJETO_TIPO_CAPA, OBJETO_TIPO_MOCHILA,
	OBJETO_TIPO_CINTURON, OBJETO_TIPO_BOTAS, OBJETO_TIPO_SOMBRERO, OBJETO_TIPO_DAGAS, OBJETO_TIPO_MARTILLO,
	OBJETO_TIPO_VARITA, OBJETO_TIPO_BASTON, OBJETO_TIPO_HACHA, OBJETO_TIPO_ESPADA, OBJETO_TIPO_ARCO, OBJETO_TIPO_PALA},
	//
	{101},
	// fresno
	{SKILL_TALAR_FRESNO, 303},
	// madera de casta�o
	{SKILL_TALAR_CASTA�O, 473},
	// madera de nogal
	{SKILL_TALAR_NOGAL, 476},
	// madera de roble
	{SKILL_TALAR_ROBLE, 460},
	// Madera de olivioleta
	{SKILL_TALAR_OLIVIOLETA, 2357},
	// Madera de bomb�
	{SKILL_TALAR_BOMBU, 2358},
	// Madera de arce
	{SKILL_TALAR_ARCE, 471},
	// Madera de bamb�
	{SKILL_TALAR_BAMBU, 7013},
	// Madera de tejo
	{SKILL_TALAR_TEJO, 461},
	// Madera de cerezo salvaje
	{SKILL_TALAR_CEREZO_SILVESTRE, 474},
	// Madera de �bano
	{SKILL_TALAR_EBANO, 449},
	// Madera de kalipto
	{SKILL_TALAR_KALIPTO, 7925},
	// Madera de bamb� oscuro
	{SKILL_TALAR_BAMBU_OSCURO, 7016},
	// Madera de carpe
	{SKILL_TALAR_CARPE, 472},
	// Madera de olmo
	{SKILL_TALAR_OLMO, 470},
	// Madera de bamb� sagrado
	{SKILL_TALAR_BAMBU_SAGRADO, 7014},
	//
	{48},
	//
	{32},
	// Hierro
	{SKILL_RECOLECTAR_HIERRO, 312},
	// Cobre
	{SKILL_RECOLECTAR_COBRE, 441},
	// Bronce
	{SKILL_RECOLECTAR_BRONCE, 442},
	// Kobalto
	{SKILL_RECOLECTAR_KOBALTO, 443},
	// Manganeso
	{SKILL_RECOLECTAR_MANGANESO, 445},
	// Silicato
	{SKILL_RECOLECTAR_SILICATO, 7032},
	// Esta�o
	{SKILL_RECOLECTAR_ESTA�O, 444},
	// Plata
	{SKILL_RECOLECTAR_PLATA, 350},
	// Bauxita
	{SKILL_RECOLECTAR_BAUXITA, 446},
	// Oro
	{SKILL_RECOLECTAR_ORO, 313},
	// Dolom�a
	{SKILL_RECOLECTAR_DOLOMIA, 7033},
	//
	{133},
	// Bamga, Bamga Horror
	{SKILL_PESCAR_PESCADITOS_MAR, 598, 1786},
	// Cangrejo Surimi, Cangrejo Surimi ex�tico
	{SKILL_PESCAR_PESCADITOS_MAR, 1757, 1759},
	// Pescado Empapado, Pez Igloo
	{SKILL_PESCAR_PESCADITOS_MAR, 1750, 1754},
	// Pez Gatito, Pez Tigre
	{SKILL_PESCAR_PESCADITOS_RIO, 603, 1762},
	// Gobio, Gobio Kesta
	{SKILL_PESCAR_PESCADITOS_RIO, 1782, 1790},
	// Trucha, Trucha de barro
	{SKILL_PESCAR_PESCADITOS_RIO, 1844, 607},
	// Trucha, Trucha de barro
	{SKILL_PESCAR_PESCADITOS_RIO, 1844, 1846},
	// Pischi Dicumpetici�n
	{SKILL_PESCAR_PISCHI, 2187},
	// Lucio, Lucio Tupe-Halett
	{SKILL_PESCAR_PESCADOS_RIO, 1847, 1849},
	// Carpa de Iem, Carpita de las arenas
	{SKILL_PESCAR_PESCADOS_RIO, 1794, 1796},
	// Kralamar �nico, Cangrejo Surimi ex�tico
	{SKILL_PESCAR_SOMBRA_EXTRA�A, 1799, 1759},
	// Kralamar, Kralamar �nico
	{SKILL_PESCAR_PESCADOS_MAR, 600, 1799},
	// Sardina brillante, Sardina oscura
	{SKILL_PESCAR_PESCADOS_MAR, 1805, 1807},
	// Lubina Mericana, Lubina F�nica
	{SKILL_PESCAR_PECES_GORDOS_RIO, 1779, 1792},
	// Raya azul, Raya de Farle
	{SKILL_PESCAR_PECES_GORDOS_MAR, 1784, 1788},
	// Perca, Gatito Perca
	{SKILL_PESCAR_PESCADOS_GIGANTES_RIO, 1801, 1803},
	// Pez Martillhoz, Tibur�n mercado libre
	{SKILL_PESCAR_PESCADOS_GIGANTES_MAR, 602, 1853},
	//
	{23},
	// Flor de lino
	{SKILL_COSECHAR_LINO, 421},
	// Flor de c��amo
	{SKILL_COSECHAR_CA�AMO, 428},
	// Tr�bol de 5 hojas
	{SKILL_COSECHAR_TREBOL, 395},
	// Hoja de menta salvaje
	{SKILL_COSECHAR_MENTA_SALVAJE, 380},
	// Orqu�dea Freyesca
	{SKILL_COSECHAR_ORQUIDEA, 593},
	// Edelweiss
	{SKILL_COSECHAR_EDELWEISS, 594},
	// Semilla de Pandoja
	{SKILL_COSECHAR_PANDOJA, 7059},
	//
	{122},
	//
	{47},
	// Trigo, Trigo de oro
	{SKILL_SEGAR_TRIGO, 289, 2018},
	// Cebada, Cebada azucarada
	{SKILL_SEGAR_CEBADA, 400, 2032},
	// Avena, Avena Aur�fera
	{SKILL_SEGAR_AVENA, 533, 2036},
	// L�pulo, L�pulo brillante
	{SKILL_SEGAR_LUPULO, 401, 2021},
	// Lino, Lino Tempestad
	{SKILL_SEGAR_LINO, 423, 2026},
	// Centeno, Centeno resistente
	{SKILL_SEGAR_CENTENO, 532, 2029},
	// Arroz
	{SKILL_SEGAR_ARROZ, 7018},
	// Malta
	{SKILL_SEGAR_MALTA, 405},
	// C��amo, C��amo euf�rico
	{SKILL_SEGAR_CA�AMO, 425, 2035},
	//
	{109},
	//
	{27},
	//
	{135},
	//
	{132},
	//
	{134},
	//
	{64},
	//
	{123},
	//
	{63},
	//
	{11},
	//
	{12},
	//
	{13},
	//
	{14},
	// reparar una espada
	{145},
	//
	{20},
	// reparar un martillo
	{144},
	//
	{19},
	//
	{142},
	//
	{18},
	// reparar una pala
	{146},
	//
	{21},
	//
	{65},
	// reparar un hacha
	{143},
	//
	{15},
	//
	{16},
	//
	{17},
	// reparar un baston
	{147},
	// reparar una varita
	{148},
	// reparar un arco
	{149},
	// volver a forjar un hacha
	{SKILL_MAGUEAR_HACHA, OBJETO_TIPO_HACHA, OBJETO_TIPO_RUNA_FORJAMAGIA, OBJETO_TIPO_POCION_FORJAMAGIA},
	// volver a forjar una daga
	{SKILL_MAGUEAR_DAGA, OBJETO_TIPO_DAGAS, OBJETO_TIPO_RUNA_FORJAMAGIA, OBJETO_TIPO_POCION_FORJAMAGIA},
	// volver a forjar un martillo
	{116, OBJETO_TIPO_MARTILLO, OBJETO_TIPO_RUNA_FORJAMAGIA, OBJETO_TIPO_POCION_FORJAMAGIA},
	// volver a forjar una espada
	{113, OBJETO_TIPO_ESPADA, OBJETO_TIPO_RUNA_FORJAMAGIA, OBJETO_TIPO_POCION_FORJAMAGIA},
	// volver a forjar una pala
	{117, OBJETO_TIPO_PALA, OBJETO_TIPO_RUNA_FORJAMAGIA, OBJETO_TIPO_POCION_FORJAMAGIA},
	// volver a esculpir un baston
	{120, OBJETO_TIPO_BASTON, OBJETO_TIPO_RUNA_FORJAMAGIA, OBJETO_TIPO_POCION_FORJAMAGIA},
	// volver a esculpir una varita
	{119, OBJETO_TIPO_VARITA, OBJETO_TIPO_RUNA_FORJAMAGIA, OBJETO_TIPO_POCION_FORJAMAGIA},
	// volver a esculpir un arco
	{118, OBJETO_TIPO_ARCO, OBJETO_TIPO_RUNA_FORJAMAGIA, OBJETO_TIPO_POCION_FORJAMAGIA},
	// mejorar una capa
	{165, OBJETO_TIPO_CAPA, OBJETO_TIPO_RUNA_FORJAMAGIA},
	// mejorar un sombrero
	{166, OBJETO_TIPO_SOMBRERO, OBJETO_TIPO_RUNA_FORJAMAGIA},
	// mejorar una mochila
	{167, OBJETO_TIPO_MOCHILA, OBJETO_TIPO_RUNA_FORJAMAGIA},
	// mejorar unas botas
	{163, OBJETO_TIPO_BOTAS, OBJETO_TIPO_RUNA_FORJAMAGIA},
	// mejorar un cinturon
	{164, OBJETO_TIPO_CINTURON, OBJETO_TIPO_RUNA_FORJAMAGIA},
	// Mejorar un amuleto
	{169, OBJETO_TIPO_AMULETO, OBJETO_TIPO_RUNA_FORJAMAGIA},
	// Mejorar un anillo
	{168, OBJETO_TIPO_ANILLO, OBJETO_TIPO_RUNA_FORJAMAGIA},
	// realizar una chapuza
	{171},
	// hacer una llave
	{182},
	// banco de madera, hay q configurarlo para reparar bastones, etc
	// {110},
	// yunque para escudos
	{SKILL_CREAR_ESCUDO}};
	
	// EM[1] = {n: "Sentarse", s: "sit"};
	// EM[2] = {n: "Hacer una se�al con la mano", s: "bye"};
	// EM[3] = {n: "Aplaudir", s: "appl"};
	// EM[4] = {n: "Enfadarse", s: "mad"};
	// EM[5] = {n: "Mostrar su miedo", s: "fear"};
	// EM[6] = {n: "Mostrar su arma", s: "weap"};
	// EM[7] = {n: "Tocar la flauta", s: "pipo"};
	// EM[8] = {n: "Tirarse un pedo", s: "oups"};
	// EM[9] = {n: "Saludar", s: "hi"};
	// EM[10] = {n: "Dar un beso", s: "kiss"};
	// EM[11] = {n: "Piedra", s: "pfc1"};
	// EM[12] = {n: "Hoja", s: "pfc2"};
	// EM[13] = {n: "Tijeras", s: "pfc3"};
	// EM[14] = {n: "Cruzarse de brazos", s: "cross"};
	// EM[15] = {n: "Se�alar con el dedo", s: "point"};
	// EM[16] = {n: ". . . . .", s: "crow"};
	// EM[19] = {n: "Acostarse", s: "rest"};
	// EM[21] = {n: "Campe�n", s: "champ"};
	// EM[22] = {n: "Aura de poder", s: "aura"};
	// EM[23] = {n: "Aura vamp�rica", s: "bat"};
	// Accion de Oficio {trabajoID, objeto recolectado,obj especial}
	public static int getMobSinHalloween(int id) {
		return switch (id) {
// jalato de haluin
			case 793 -> 101;
// tofu de haluin
			case 794 -> 98;
			default -> id;
		};
	}
	
	public static int getOficioPrimarioDeMago(int oficioID) {
		return switch (oficioID) {
			case OFICIO_FORJAMAGO_ESPADAS -> OFICIO_FORJADOR_ESPADAS;
			case OFICIO_ESCULTORMAGO_ARCOS -> OFICIO_ESCULTOR_ARCOS;
			case OFICIO_FORJAMAGO_MARTILLOS -> OFICIO_FORJADOR_MARTILLOS;
			case OFICIO_ZAPATEROMAGO -> OFICIO_ZAPATERO;
			case OFICIO_JOYEROMAGO -> OFICIO_JOYERO;
			case OFICIO_FORJAMAGO_DAGAS -> OFICIO_FORJADOR_DAGAS;
			case OFICIO_ESCULTORMAGO_BASTONES -> OFICIO_ESCULTOR_BASTONES;
			case OFICIO_ESCULTORMAGO_VARITAS -> OFICIO_ESCULTOR_VARITAS;
			case OFICIO_FORJAMAGO_PALAS -> OFICIO_FORJADOR_PALAS;
			case OFICIO_SASTREMAGO -> OFICIO_SASTRE;
			case OFICIO_FORJAMAGO_HACHAS -> OFICIO_FORJADOR_HACHAS;
			default -> -1;
		};
	}
	
	public static boolean esPosicionVisual(final byte pos) {
		for (final byte p : POSICIONES_EQUIPAMIENTO_VISUAL) {
			if (pos == p) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean esPosicionEquipamiento(final byte pos) {
		for (final byte p : POSICIONES_EQUIPAMIENTO) {
			if (pos == p) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean esPosicionObjeto(final byte pos) {
		for (final byte p : POSICIONES_TODOS) {
			if (pos == p) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean esEfectoSetClase(final int id) {
		for (int i : BUFF_SET_CLASE) {
			if (i == id)
				return true;
		}
		return false;
	}
	
	public static Stats getStatsEncarnacion(final int idModelo, final int nivel, Stats stats) {
		stats.clear();// FIXME las encarnaciones
		switch (idModelo) {
// ATORMENTADOR_TINIEBLAS;
			case 9544 -> {
				stats.fijarStatID(STAT_MAS_VITALIDAD, nivel);
				stats.fijarStatID(STAT_MAS_INTELIGENCIA, nivel / 2);
				stats.fijarStatID(STAT_MAS_FUERZA, nivel / 2);
				stats.fijarStatID(STAT_MAS_SUERTE, nivel / 2);
				stats.fijarStatID(STAT_MAS_AGILIDAD, nivel / 2);
			}
// ATORMENTADOR_LLAMAS;
			case 9545 -> {
				stats.fijarStatID(STAT_MAS_VITALIDAD, nivel);
				stats.fijarStatID(STAT_MAS_INTELIGENCIA, nivel);
			}
// ATORMENTADOR_HOJA;
			case 9546 -> {
				stats.fijarStatID(STAT_MAS_VITALIDAD, nivel);
				stats.fijarStatID(STAT_MAS_FUERZA, nivel);
			}
// ATORMENTADOR_GOTA;
			case 9547 -> {
				stats.fijarStatID(STAT_MAS_VITALIDAD, nivel);
				stats.fijarStatID(STAT_MAS_SUERTE, nivel);
			}
// ATORMENTADOR_NUBE;
			case 9548 -> {
				stats.fijarStatID(STAT_MAS_VITALIDAD, nivel);
				stats.fijarStatID(STAT_MAS_AGILIDAD, nivel);
			}
// BANDIDO_ARQUERO;
			case 10125 -> {
				stats.fijarStatID(STAT_MAS_ALCANCE, nivel / 25);
				stats.fijarStatID(STAT_MAS_INTELIGENCIA, nivel / 2);
				stats.fijarStatID(STAT_MAS_FUERZA, nivel / 2);
				stats.fijarStatID(STAT_MAS_SUERTE, nivel / 2);
				stats.fijarStatID(STAT_MAS_AGILIDAD, nivel / 2);
			}
// BANDIDO_ESPADACHIN;
			case 10126 -> stats.fijarStatID(STAT_MAS_GOLPES_CRITICOS, nivel / 10);
// BANDIDO_PENDENCIERO;
			case 10127 -> {
				stats.fijarStatID(STAT_MAS_RES_FIJA_AGUA, nivel / 10);
				stats.fijarStatID(STAT_MAS_RES_FIJA_TIERRA, nivel / 10);
				stats.fijarStatID(STAT_MAS_RES_FIJA_FUEGO, nivel / 10);
				stats.fijarStatID(STAT_MAS_RES_FIJA_AIRE, nivel / 10);
				stats.fijarStatID(STAT_MAS_RES_PORC_AGUA, nivel / 10);
				stats.fijarStatID(STAT_MAS_RES_PORC_TIERRA, nivel / 10);
				stats.fijarStatID(STAT_MAS_RES_PORC_FUEGO, nivel / 10);
				stats.fijarStatID(STAT_MAS_RES_PORC_AIRE, nivel / 10);
			}
// BANDIDO_HECHIZERO;
			case 10133 -> {
				stats.fijarStatID(STAT_MAS_INTELIGENCIA, nivel);
				stats.fijarStatID(STAT_MAS_FUERZA, nivel);
				stats.fijarStatID(STAT_MAS_SUERTE, nivel);
				stats.fijarStatID(STAT_MAS_AGILIDAD, nivel);
			}
		}
		return stats;
	}
	
	// public static final HashMap<Integer, StatHechizo> hechizosEncarnacion(final int clase, final
	// int nivel) {
	// final HashMap<Integer, StatHechizo> hechizos = new HashMap<Integer, StatHechizo>();
	// switch (clase) {
	// case CLASE_ATORMENTADOR_NUBE :
	// hechizos.put(1291, Mundo.getHechizo(1291).getStatsPorNivel(nivel));
	// hechizos.put(1296, Mundo.getHechizo(1296).getStatsPorNivel(nivel));
	// hechizos.put(1289, Mundo.getHechizo(1289).getStatsPorNivel(nivel));
	// hechizos.put(1285, Mundo.getHechizo(1285).getStatsPorNivel(nivel));
	// hechizos.put(1290, Mundo.getHechizo(1290).getStatsPorNivel(nivel));
	// break;
	// case CLASE_ATORMENTADOR_GOTA :
	// hechizos.put(1299, Mundo.getHechizo(1299).getStatsPorNivel(nivel));
	// hechizos.put(1288, Mundo.getHechizo(1288).getStatsPorNivel(nivel));
	// hechizos.put(1297, Mundo.getHechizo(1297).getStatsPorNivel(nivel));
	// hechizos.put(1285, Mundo.getHechizo(1285).getStatsPorNivel(nivel));
	// hechizos.put(1298, Mundo.getHechizo(1298).getStatsPorNivel(nivel));
	// break;
	// case CLASE_ATORMENTADOR_TINIEBLAS :
	// hechizos.put(1300, Mundo.getHechizo(1300).getStatsPorNivel(nivel));
	// hechizos.put(1301, Mundo.getHechizo(1301).getStatsPorNivel(nivel));
	// hechizos.put(1303, Mundo.getHechizo(1303).getStatsPorNivel(nivel));
	// hechizos.put(1285, Mundo.getHechizo(1285).getStatsPorNivel(nivel));
	// hechizos.put(1302, Mundo.getHechizo(1302).getStatsPorNivel(nivel));
	// break;
	// case CLASE_ATORMENTADOR_LLAMAS :
	// hechizos.put(1292, Mundo.getHechizo(1292).getStatsPorNivel(nivel));
	// hechizos.put(1293, Mundo.getHechizo(1293).getStatsPorNivel(nivel));
	// hechizos.put(1294, Mundo.getHechizo(1294).getStatsPorNivel(nivel));
	// hechizos.put(1285, Mundo.getHechizo(1285).getStatsPorNivel(nivel));
	// hechizos.put(1295, Mundo.getHechizo(1295).getStatsPorNivel(nivel));
	// break;
	// case CLASE_ATORMENTADOR_HOJA :
	// hechizos.put(1283, Mundo.getHechizo(1283).getStatsPorNivel(nivel));
	// hechizos.put(1284, Mundo.getHechizo(1284).getStatsPorNivel(nivel));
	// hechizos.put(1286, Mundo.getHechizo(1286).getStatsPorNivel(nivel));
	// hechizos.put(1285, Mundo.getHechizo(1285).getStatsPorNivel(nivel));
	// hechizos.put(1287, Mundo.getHechizo(1287).getStatsPorNivel(nivel));
	// break;
	// case CLASE_BANDIDO_HECHIZERO :
	// hechizos.put(1601, Mundo.getHechizo(1601).getStatsPorNivel(nivel));
	// hechizos.put(1602, Mundo.getHechizo(1602).getStatsPorNivel(nivel));
	// hechizos.put(1603, Mundo.getHechizo(1603).getStatsPorNivel(nivel));
	// hechizos.put(1604, Mundo.getHechizo(1604).getStatsPorNivel(nivel));
	// hechizos.put(1605, Mundo.getHechizo(1605).getStatsPorNivel(nivel));
	// hechizos.put(1606, Mundo.getHechizo(1606).getStatsPorNivel(nivel));
	// hechizos.put(1607, Mundo.getHechizo(1607).getStatsPorNivel(nivel));
	// hechizos.put(1608, Mundo.getHechizo(1608).getStatsPorNivel(nivel));
	// hechizos.put(1609, Mundo.getHechizo(1609).getStatsPorNivel(nivel));
	// hechizos.put(1610, Mundo.getHechizo(1610).getStatsPorNivel(nivel));
	// hechizos.put(1611, Mundo.getHechizo(1611).getStatsPorNivel(nivel));
	// hechizos.put(1612, Mundo.getHechizo(1612).getStatsPorNivel(nivel));
	// hechizos.put(1613, Mundo.getHechizo(1613).getStatsPorNivel(nivel));
	// hechizos.put(1614, Mundo.getHechizo(1614).getStatsPorNivel(nivel));
	// hechizos.put(1615, Mundo.getHechizo(1615).getStatsPorNivel(nivel));
	// hechizos.put(1616, Mundo.getHechizo(1616).getStatsPorNivel(nivel));
	// hechizos.put(1617, Mundo.getHechizo(1617).getStatsPorNivel(nivel));
	// hechizos.put(1618, Mundo.getHechizo(1618).getStatsPorNivel(nivel));
	// hechizos.put(1619, Mundo.getHechizo(1619).getStatsPorNivel(nivel));
	// hechizos.put(1620, Mundo.getHechizo(1620).getStatsPorNivel(nivel));
	// break;
	// case CLASE_BANDIDO_ARQUERO :
	// hechizos.put(1561, Mundo.getHechizo(1561).getStatsPorNivel(nivel));
	// hechizos.put(1562, Mundo.getHechizo(1562).getStatsPorNivel(nivel));
	// hechizos.put(1563, Mundo.getHechizo(1563).getStatsPorNivel(nivel));
	// hechizos.put(1564, Mundo.getHechizo(1564).getStatsPorNivel(nivel));
	// hechizos.put(1565, Mundo.getHechizo(1565).getStatsPorNivel(nivel));
	// hechizos.put(1566, Mundo.getHechizo(1566).getStatsPorNivel(nivel));
	// hechizos.put(1567, Mundo.getHechizo(1567).getStatsPorNivel(nivel));
	// hechizos.put(1568, Mundo.getHechizo(1568).getStatsPorNivel(nivel));
	// hechizos.put(1569, Mundo.getHechizo(1569).getStatsPorNivel(nivel));
	// hechizos.put(1570, Mundo.getHechizo(1570).getStatsPorNivel(nivel));
	// hechizos.put(1571, Mundo.getHechizo(1571).getStatsPorNivel(nivel));
	// hechizos.put(1572, Mundo.getHechizo(1572).getStatsPorNivel(nivel));
	// hechizos.put(1573, Mundo.getHechizo(1573).getStatsPorNivel(nivel));
	// hechizos.put(1574, Mundo.getHechizo(1574).getStatsPorNivel(nivel));
	// hechizos.put(1575, Mundo.getHechizo(1575).getStatsPorNivel(nivel));
	// hechizos.put(1576, Mundo.getHechizo(1576).getStatsPorNivel(nivel));
	// hechizos.put(1577, Mundo.getHechizo(1577).getStatsPorNivel(nivel));
	// hechizos.put(1578, Mundo.getHechizo(1578).getStatsPorNivel(nivel));
	// hechizos.put(1579, Mundo.getHechizo(1579).getStatsPorNivel(nivel));
	// hechizos.put(1580, Mundo.getHechizo(1580).getStatsPorNivel(nivel));
	// break;
	// case CLASE_BANDIDO_PENDENCIERO :
	// hechizos.put(1581, Mundo.getHechizo(1581).getStatsPorNivel(nivel));
	// hechizos.put(1582, Mundo.getHechizo(1582).getStatsPorNivel(nivel));
	// hechizos.put(1583, Mundo.getHechizo(1583).getStatsPorNivel(nivel));
	// hechizos.put(1584, Mundo.getHechizo(1584).getStatsPorNivel(nivel));
	// hechizos.put(1585, Mundo.getHechizo(1585).getStatsPorNivel(nivel));
	// hechizos.put(1586, Mundo.getHechizo(1586).getStatsPorNivel(nivel));
	// hechizos.put(1587, Mundo.getHechizo(1587).getStatsPorNivel(nivel));
	// hechizos.put(1588, Mundo.getHechizo(1588).getStatsPorNivel(nivel));
	// hechizos.put(1589, Mundo.getHechizo(1589).getStatsPorNivel(nivel));
	// hechizos.put(1590, Mundo.getHechizo(1590).getStatsPorNivel(nivel));
	// hechizos.put(1591, Mundo.getHechizo(1591).getStatsPorNivel(nivel));
	// hechizos.put(1592, Mundo.getHechizo(1592).getStatsPorNivel(nivel));
	// hechizos.put(1593, Mundo.getHechizo(1593).getStatsPorNivel(nivel));
	// hechizos.put(1594, Mundo.getHechizo(1594).getStatsPorNivel(nivel));
	// hechizos.put(1595, Mundo.getHechizo(1595).getStatsPorNivel(nivel));
	// hechizos.put(1596, Mundo.getHechizo(1596).getStatsPorNivel(nivel));
	// hechizos.put(1597, Mundo.getHechizo(1597).getStatsPorNivel(nivel));
	// hechizos.put(1598, Mundo.getHechizo(1598).getStatsPorNivel(nivel));
	// hechizos.put(1599, Mundo.getHechizo(1599).getStatsPorNivel(nivel));
	// hechizos.put(1600, Mundo.getHechizo(1600).getStatsPorNivel(nivel));
	// break;
	// case CLASE_BANDIDO_ESPADACHIN :
	// hechizos.put(1541, Mundo.getHechizo(1541).getStatsPorNivel(nivel));
	// hechizos.put(1542, Mundo.getHechizo(1542).getStatsPorNivel(nivel));
	// hechizos.put(1543, Mundo.getHechizo(1543).getStatsPorNivel(nivel));
	// hechizos.put(1544, Mundo.getHechizo(1544).getStatsPorNivel(nivel));
	// hechizos.put(1545, Mundo.getHechizo(1545).getStatsPorNivel(nivel));
	// hechizos.put(1546, Mundo.getHechizo(1546).getStatsPorNivel(nivel));
	// hechizos.put(1547, Mundo.getHechizo(1547).getStatsPorNivel(nivel));
	// hechizos.put(1548, Mundo.getHechizo(1548).getStatsPorNivel(nivel));
	// hechizos.put(1549, Mundo.getHechizo(1549).getStatsPorNivel(nivel));
	// hechizos.put(1550, Mundo.getHechizo(1550).getStatsPorNivel(nivel));
	// hechizos.put(1551, Mundo.getHechizo(1551).getStatsPorNivel(nivel));
	// hechizos.put(1552, Mundo.getHechizo(1552).getStatsPorNivel(nivel));
	// hechizos.put(1553, Mundo.getHechizo(1553).getStatsPorNivel(nivel));
	// hechizos.put(1554, Mundo.getHechizo(1554).getStatsPorNivel(nivel));
	// hechizos.put(1555, Mundo.getHechizo(1555).getStatsPorNivel(nivel));
	// hechizos.put(1556, Mundo.getHechizo(1556).getStatsPorNivel(nivel));
	// hechizos.put(1557, Mundo.getHechizo(1557).getStatsPorNivel(nivel));
	// hechizos.put(1558, Mundo.getHechizo(1558).getStatsPorNivel(nivel));
	// hechizos.put(1559, Mundo.getHechizo(1559).getStatsPorNivel(nivel));
	// hechizos.put(1560, Mundo.getHechizo(1560).getStatsPorNivel(nivel));
	// break;
	// }
	// return hechizos;
	// }
	//
	// public static final byte getClasePorObjMod(final int objModelo) {
	// switch (objModelo) {
	// case 9544 :
	// return CLASE_ATORMENTADOR_TINIEBLAS;
	// case 9545 :
	// return CLASE_ATORMENTADOR_LLAMAS;
	// case 9546 :
	// return CLASE_ATORMENTADOR_HOJA;
	// case 9547 :
	// return CLASE_ATORMENTADOR_GOTA;
	// case 9548 :
	// return CLASE_ATORMENTADOR_NUBE;
	// case 10125 :
	// return CLASE_BANDIDO_ARQUERO;
	// case 10126 :
	// return CLASE_BANDIDO_ESPADACHIN;
	// case 10127 :
	// return CLASE_BANDIDO_PENDENCIERO;
	// case 10133 :
	// return CLASE_BANDIDO_HECHIZERO;
	// }
	// return -1;
	// }
	//
	// public static final short getGFXPorEncarnacion(final int clase) {
	// switch (clase) {
	// case CLASE_ATORMENTADOR_NUBE :
	// return 1701;
	// case CLASE_ATORMENTADOR_GOTA :
	// return 1702;
	// case CLASE_ATORMENTADOR_TINIEBLAS :
	// return 1700;
	// case CLASE_ATORMENTADOR_LLAMAS :
	// return 1704;
	// case CLASE_ATORMENTADOR_HOJA :
	// return 1703;
	// case CLASE_BANDIDO_HECHIZERO :
	// return 8034;
	// case CLASE_BANDIDO_ARQUERO :
	// return 8032;
	// case CLASE_BANDIDO_PENDENCIERO :
	// return 8033;
	// case CLASE_BANDIDO_ESPADACHIN :
	// return 8035;
	// }
	// return 9999;
	// }
	public static boolean esEfectoHechizo(final int stat) {
		for (final int i : BUFF_ARMAS) {
			if (i == stat) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean esStatTexto(final int stat) {
		for (final int i : STAT_TEXTO) {
			if (i == stat) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean esStatRepetible(final int stat) {
		for (final int i : STAT_REPETIBLE) {
			if (i == stat) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean esStatHechizo(final int stat) {
		// 281, 282, 283, 284, 285,
		// 286, 287, 288, 289, 290, 291, 292
		return stat >= 281 && stat <= 294;
	}
	
	public static int getNivelObjevivo(int xp) {
		int nivel = 0;
		for (final int i : NIVELES_OBJEVIVOS) {
			if (i <= xp) {
				nivel++;
			}
		}
		return nivel;
	}
	
	public static ArrayList<String> convertirStringArray(final String str) {
		final char[] s = str.toCharArray();
		int corchete = 0;
		final ArrayList<String> fini = new ArrayList<>();
		StringBuilder temp = new StringBuilder();
		for (final char a : s) {
			if (a == ' ') {
				continue;
			}
			if (corchete == 1 && a == ',') {
				fini.add(temp.toString());
				temp = new StringBuilder();
				continue;
			}
			if (a == '[') {
				corchete += 1;
				if (corchete == 1) {
					continue;
				}
			} else if (a == ']') {
				corchete -= 1;
				if (corchete == 0 && a == ']') {
					fini.add(temp.toString());
					temp = new StringBuilder();
					continue;
				}
			}
			temp.append(a);
		}
		return fini;
	}
	
	public static boolean esAccionParaMostrar(int accionID) {
		// mas q todo para GA de pelea
		return switch (accionID) {
			case 0, 1, 100, 101, 102, 103, 104, 105, 106, 107, 108, 11, 110, 111, 112, 114, 115, 116, 117, 118, 119, 120, 122, 123, 124, 125, 126, 127, 128, 129, 130, 132, 138, 140, 142, 145, 147, 149, 150, 151, 152, 153, 154, 155, 156, 157, 160, 161, 162, 163, 164, 165, 166, 168, 169, 180, 181, 182, 185, 2, 200, 208, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 228, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 4, 5, 50, 501, 51, 52, 606, 607, 608, 609, 610, 611, 617, 618, 619, 78, 780, 900, 901, 902, 903, 905, 906, 909, 940, 950, 998, 999 -> true;
			default -> false;
		};
	}
	
	public static long getTiempoActualEscala(long escala) {
		return System.currentTimeMillis() / escala; // Calendar.getInstance() era antes
	}
	
	public static long getTiempoDeUnStat(final String stat, int escala) {
		try {
			final String[] str = stat.split(Pattern.quote("#"));
			int a�o = Integer.parseInt(str[0], 16);
			int mes = Integer.parseInt(str[1], 16) / 100 + 1;
			int dia = Integer.parseInt(str[1], 16) % 100;
			int hora = Integer.parseInt(str[2], 16) / 100;
			int minuto = Integer.parseInt(str[2], 16) % 100;
			return getTiempoFechaX(a�o, mes, dia, hora, minuto, escala);
		} catch (final Exception e) {
			return 0;
		}
	}
	
	public static long getTiempoFechaX(final int a�o, final int mes, final int dia, final int hora,
									   final int minuto, int escala) {
		try {
			final Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.YEAR, a�o);
			calendar.set(Calendar.MONTH, mes - 1);
			calendar.set(Calendar.DAY_OF_MONTH, dia);
			calendar.set(Calendar.HOUR_OF_DAY, hora);
			calendar.set(Calendar.MINUTE, minuto);
			return calendar.getTimeInMillis() / escala;
		} catch (final Exception e) {
			return 0;
		}
	}
	
	public static boolean esMapaMercante(short mapaID) {
		return switch (mapaID) {
			case 33, 953, 4601, 8036, 4258 -> true;
			default -> false;
		};
	}
	
	public static boolean puedeAgredir(final Personaje agresor, final Personaje agredido) {
		// si el agredido esta ocupado no se le pued agredir
		if (agredido == null || !agredido.enLinea() || !agredido.estaDisponible(true, true) || agredido.estaInmovil()
		|| !agresor.enLinea() || !agresor.estaDisponible(true, true) || agresor.estaInmovil() || agredido
		.getMapa() != agresor.getMapa() || agredido.getAlineacion() == agresor.getAlineacion() || agredido.getAgresion()
		|| agresor.getAgresion() || agresor.getNivel() < MainServidor.NIVEL_MINIMO_PARA_PVP || agredido
		.getNivel() < MainServidor.NIVEL_MINIMO_PARA_PVP) {
			return false;
		}
		return true;
	}
	
	public static boolean puedeIniciarPelea(Personaje perso, Personaje p, Mapa mapa, Celda celdaDestino) {
		if (!Constantes.puedeAgredir(perso, p)) {
			return false;
		}
		switch (p.getAlineacion()) {
			case Constantes.ALINEACION_NEUTRAL :
				if ((perso.getAlineacion() == Constantes.ALINEACION_NEUTRAL || perso
				.getAlineacion() == Constantes.ALINEACION_MERCENARIO)) {
					return false;
				}
				break;
			case Constantes.ALINEACION_BONTARIANO :
				if (perso.getAlineacion() != Constantes.ALINEACION_BRAKMARIANO) {
					return false;
				}
				break;
			case Constantes.ALINEACION_BRAKMARIANO :
				if (perso.getAlineacion() != Constantes.ALINEACION_BRAKMARIANO) {
					return false;
				}
				break;
		}
		int agroP = p.getStatsObjEquipados().getStatParaMostrar(Constantes.STAT_AGREDIR_AUTOMATICAMENTE);
		int agroPerso = perso.getStatsObjEquipados().getStatParaMostrar(Constantes.STAT_AGREDIR_AUTOMATICAMENTE);
		if (agroP <= 0 && agroPerso <= 0) {
			return false;
		}
		int distAgro = agroPerso >= agroP ? agroPerso : agroP;
		if (Camino.distanciaDosCeldas(mapa, p.getCelda().getID(), celdaDestino.getID()) <= (distAgro)) {
			return true;
		}
		return false;
	}
	
	public static boolean puedeIniciarPelea(Personaje perso, GrupoMob grupoMob, Mapa mapa, Celda celdaDestino) {
		if (!perso.estaDisponible(true, true)) {
			return false;
		}
		if (perso.getAlineacion() == grupoMob.getAlineacion()) {
			return false;
		}
		switch (grupoMob.getAlineacion()) {
			case Constantes.ALINEACION_NULL :
				if (!celdaDestino.accionesIsEmpty()) {
					return false;
				}
				break;
			case Constantes.ALINEACION_NEUTRAL :
			case Constantes.ALINEACION_BONTARIANO :
			case Constantes.ALINEACION_BRAKMARIANO :
				if (!MainServidor.PARAM_PERMITIR_AGRESION_MILICIANOS) {
					return false;
				}
				if (!perso.alasActivadas()) {
					return false;
				}
				if (grupoMob.getAlineacion() == perso.getAlineacion()) {
					return false;
				}
				// if ((perso.getAlineacion() == Constantes.ALINEACION_NEUTRAL || perso.getAlineacion() ==
				// Constantes.ALINEACION_MERCENARIO)) {
				// return false;
				// }
				break;
		}
		if (Camino.distanciaDosCeldas(mapa, celdaDestino.getID(), grupoMob.getCeldaID()) > grupoMob.getDistAgresion()) {
			return false;
		}
		if (!Condiciones.validaCondiciones(perso, grupoMob.getCondInicioPelea())) {
			GestorSalida.ENVIAR_GA903_ERROR_PELEA(perso, 'i');
			return false;
		}
		return true;
	}
	
	public static int getSuperTipoMob(final int tipo) {
		return switch (tipo) {
			case MOB_TIPO_SIN_CLASIFICAR, MOB_TIPO_INVOCACIONES_DE_CLASE, MOB_TIPO_JEFE_FINAL, MOB_TIPO_DOPEULS_TEMPLO, MOB_TIPO_MONSTRUOS_DE_LAS_CONQUISTAS_DE_TERRITORIOS, MOB_TIPO_MONSTRUOS_DEL_PUEBLO_DE_LOS_DOPEULS, MOB_TIPO_MONSTRUOS_TUTORIAL, MOB_TIPO_SE_BUSCA, MOB_TIPO_MONSTRUOS_DE_BUSQUEDA, MOB_TIPO_MONSTRUOS_DE_NAWIDAD -> MOB_SUPER_TIPO_CRIATURAS_DIVERSAS;
			case MOB_TIPO_JALATOS, MOB_TIPO_PLANTAS_DE_LOS_CAMPOS, MOB_TIPO_LARVAS, MOB_TIPO_SETAS, MOB_TIPO_TOFUS, MOB_TIPO_MOSKITOS -> MOB_SUPER_TIPO_CRIATURAS_DE_LOS_CAMPOS;
			case MOB_TIPO_BWORKS, MOB_TIPO_GOBLINS, MOB_TIPO_KWAKS, MOB_TIPO_CRUJIDORES, MOB_TIPO_CERDOS, MOB_TIPO_GUARDIANES_DE_LOS_PUEBLOS_DE_KWAKS -> MOB_SUPER_TIPO_CRIATURAS_DE_LA_MONTA�A;
			case MOB_TIPO_DRAGOHUEVOS, MOB_TIPO_GELATINAS, MOB_TIPO_ABRAKNIDEO, MOB_TIPO_ESCARAHOJA, MOB_TIPO_ARAKNA, MOB_TIPO_MILUBO, MOB_TIPO_ANIMALES_DEL_BOSQUE -> MOB_SUPER_TIPO_CRIATURAS_DEL_BOSQUE;
			case MOB_TIPO_DRAGOPAVO, MOB_TIPO_BLOPS, MOB_TIPO_MONSTRUOS_DE_LAS_LLANURAS_DE_CANIA, MOB_TIPO_CUERBOKS -> MOB_SUPER_TIPO_CRIATURAS_DE_LAS_LLANURAS;
			case MOB_TIPO_MONSTRUOS_DE_LAS_LANDAS -> MOB_SUPER_TIPO_CRIATURAS_DE_LAS_LANDAS;
			case MOB_TIPO_KANIBOLAS_DE_LA_ISLA_DE_MOON, MOB_TIPO_TORTUGAS_DE_MOON, MOB_TIPO_PIRATAS_DE_MOON, MOB_TIPO_PLANTAS_DE_MOON, MOB_TIPO_MONSTRUOS_DE_MOON -> MOB_SUPER_TIPO_CRIATURAS_DE_LA_ISLA_DE_MOON;
			case MOB_TIPO_WABBITS -> MOB_SUPER_TIPO_CRIATURAS_DE_LA_ISLA_DE_LOS_WABBITS;
			case MOB_TIPO_MONSTRUOS_DEL_PUEBLO_DE_PANDALA, MOB_TIPO_MONSTRUOS_DE_PANDALA, MOB_TIPO_FANTASMA_DE_PANDALA, MOB_TIPO_PLANTAS_DE_PANDALA, MOB_TIPO_KITSUS, MOB_TIPO_PANDAWAS, MOB_TIPO_FIREFUX -> MOB_SUPER_TIPO_CRIATURAS_DE_PANDALA;
			case MOB_TIPO_BANDIDOS, MOB_TIPO_PNJS, MOB_TIPO_GUARDIAS, MOB_TIPO_SALTEADORILLOS -> MOB_SUPER_TIPO_CRIATURAS_HUMANOIDES;
			case MOB_TIPO_MONSTRUOS_DE_LA_NOCHE, MOB_TIPO_CHAFERS, MOB_TIPO_FANTASMAS, MOB_TIPO_MASCOTAS_FANTASMAS -> MOB_SUPER_TIPO_CRIATURAS_DE_LA_NOCHE;
			case MOB_TIPO_COCODRAILS, MOB_TIPO_MONSTRUOS_DE_LOS_PANTANOS -> MOB_SUPER_TIPO_CRIATURAS_DE_LOS_PANTANOS;
			case MOB_TIPO_MONSTRUO_DE_LAS_ALCANTARILLAS, MOB_TIPO_PIOS -> MOB_SUPER_TIPO_CRIATURAS_DE_LAS_CIUDADES;
			case MOB_TIPO_KOALAKS, MOB_TIPO_MONSTRUOS_DE_LAS_CUEVAS -> MOB_SUPER_TIPO_CRIATURAS_DEL_PUEBLO_DE_LOS_GANADEROS;
			case MOB_TIPO_PROTECTORES_DE_LOS_CEREALES, MOB_TIPO_PROTECTORES_DE_LOS_MINERALES, MOB_TIPO_PROTECTORES_DE_LOS_ARBOLES, MOB_TIPO_PROTECTORES_DE_LOS_PECES, MOB_TIPO_PROTECTORES_DE_LAS_PLANTAS -> MOB_SUPER_TIPO_PROTECTORES_DE_LOS_RECURSOS;
			case MOB_TIPO_MINOS -> MOB_SUPER_TIPO_CRIATURAS_DE_LA_ISLA_DE_MINOTAURORO;
			case MOB_TIPO_MONSTRUOS_DE_LAS_PLAYAS -> MOB_SUPER_TIPO_CRIATURAS_DE_LAS_PLAYAS;
			case MOB_TIPO_MONSTRUOS_DE_LA_ZONA_DE_NOVATOS -> MOB_SUPER_TIPO_CRIATURAS_DE_LA_ZONA_DE_LOS_NOVATOS;
			case MOB_TIPO_MONSTRUOS_DE_LAS_LLANURAS_HERBOSAS, MOB_TIPO_MONSTRUOS_DE_LA_PLAYA_DE_CORAL, MOB_TIPO_MONSTRUOS_DE_LA_TURBERA_SIN_FONDO, MOB_TIPO_MONSTRUOS_DE_LA_OSCURA_SELVA, MOB_TIPO_MONSTRUOS_DEL_ARBOL_HAKAM, MOB_TIPO_MONSTRUOS_DEL_ARCA_DE_OTOMAI, MOB_TIPO_MONSTRUOS_DE_LA_CANOPEA_DE_LAS_NIEBLAS -> MOB_SUPER_TIPO_CRIATURAS_DE_LA_ISLA_DE_OTOMAI;
			case MOB_TIPO_LOS_ARCHIMONSTRUOS -> MOB_SUPER_TIPO_CRIATURAS_ARCHIMONSTRUO;
			case MOB_TIPO_MONSTRUOS_DE_LOS_CAMPOS_DE_HIELO, MOB_TIPO_MONSTRUOS_DEL_BURGO, MOB_TIPO_MONSTRUOS_DEL_BOSQUE_DE_LOS_PINOS_PERDIDOS, MOB_TIPO_MONSTRUOS_DEL_LAGO_HELADO, MOB_TIPO_MONSTRUOS_DEL_MONTE_TORRIDO, MOB_TIPO_MONSTRUOS_DE_LAS_LAGRIMAS_DE_URONIGRIDO, MOB_TIPO_MONSTRUOS_DE_LA_CUNA_DE_ALMA, MOB_TIPO_MONSTRUOS_DE_LOS_COL, MOB_TIPO_MONSTRUOS_DE_LA_GRIETA_BU, MOB_TIPO_MONSTRUOS_DEL_BOSQUE_PETRIFICADO, MOB_TIPO_MONSTRUOS_SE_BUSCA_DE_FRIGOST, MOB_TIPO_MONSTRUOS_DE_MISION_DE_FRIGOST -> MOB_SUPER_TIPO_NULL;
			default -> -1;
		};
	}
	
	public static String getNombreTipoMob(final int tipo) {
		return switch (tipo) {
			case -1 -> "Sin clasificar";
			case 0 -> "Invocaciones";
			case 1 -> "Jefe final";
			case 2 -> "Bandidos";
			case 3 -> "Wabbits";
			case 4 -> "Dragohuevos";
			case 5 -> "Bworks";
			case 6 -> "Goblins";
			case 7 -> "Gelatinas";
			case 8 -> "Monstruos de la noche";
			case 9 -> "Jalat�s";
			case 10 -> "Plantas de los campos";
			case 11 -> "Larvas";
			case 12 -> "Kwaks";
			case 13 -> "Crujidores";
			case 16 -> "Cerdos";
			case 17 -> "Chafers";
			case 18 -> "Dopeuls Templo";
			case 19 -> "Pnjs";
			case 20 -> "Kan�bolas de la Isla de Moon";
			case 21 -> "Dragopavo";
			case 22 -> "Abrakn�deo";
			case 23 -> "Blops";
			case 24 -> "Monstruos de las Llanuras de Cania";
			case 25 -> "Monstruos de las landas";
			case 26 -> "Guardias";
			case 27 -> "Monstruos de las conquistas de territorios";
			case 28 -> "Monstruos del Pueblo de los Dopeuls";
			case 29 -> "Monstruos Tutorial";
			case 30 -> "Salteadorillos";
			case 31 -> "Monstruo de las alcantarillas";
			case 32 -> "Se busca";
			case 33 -> "P�os";
			case 34 -> "Monstruos del pueblo de Pandala";
			case 35 -> "Monstruos de Pandala";
			case 36 -> "Fantasma de Pandala";
			case 37 -> "Escarahoja";
			case 38 -> "Arakna";
			case 39 -> "Milubo";
			case 40 -> "Tortugas de Moon";
			case 41 -> "Piratas de Moon";
			case 42 -> "Plantas de Moon";
			case 43 -> "Monstruos de Moon";
			case 44 -> "Cocodrails";
			case 45 -> "Setas";
			case 46 -> "Tofus";
			case 47 -> "Moskitos";
			case 48 -> "Monstruos de los pantanos";
			case 49 -> "Animales del bosque";
			case 50 -> "Monstruos de b�squeda";
			case 51 -> "Cuerboks";
			case 52 -> "Guardianes de los pueblos de Kwaks";
			case 53 -> "Fantasmas";
			case 54 -> "Mascotas Fantasmas";
			case 55 -> "Plantas de Pandala";
			case 56 -> "Kitsus";
			case 57 -> "Pandawas";
			case 59 -> "Firefux";
			case 60 -> "Koalaks";
			case 61 -> "Monstruos de las cuevas";
			case 62 -> "Protectores de los cereales";
			case 63 -> "Protectores de los Minerales";
			case 64 -> "Protectores de los �rboles";
			case 65 -> "Protectores de los Peces";
			case 66 -> "Protectores de las Plantas";
			case 67 -> "Minos";
			case 68 -> "Monstruos de Nawidad";
			case 69 -> "Monstruos de las playas";
			case 70 -> "Monstruos de la zona de novatos";
			case 71 -> "Monstruos de las Llanuras herbosas";
			case 72 -> "Monstruos de la playa de coral";
			case 73 -> "Monstruos de la Turbera sin fondo";
			case 74 -> "Monstruos de la Oscura Selva";
			case 75 -> "Monstruos del �rbol Hakam";
			case 76 -> "Monstruos del Arca de Otomai";
			case 77 -> "Monstruos de la Canopea de las Nieblas";
			case 78 -> "Los Archi-monstruos";
			default -> "";
		};
	}
	
	public static byte getElementoPorEfectoID(final int efectoID) {
		return switch (efectoID) {
			case 85, 91, 96, 275 -> ELEMENTO_AGUA;
			case 86, 92, 97, 276 -> ELEMENTO_TIERRA;
			case 87, 93, 98, 277 -> ELEMENTO_AIRE;
			case 88, 94, 99, 278 -> ELEMENTO_FUEGO;
// robar PDV fijo
			case 82, 89, 95, 100, 279 -> ELEMENTO_NEUTRAL;
			default -> ELEMENTO_NULO;
		};
	}
	
	public static String getNombreEfecto(final int efectoID) {
		return switch (efectoID) {
			case 81, 108 -> "SOIN";
			case 109 -> "% PDV DMG FIX";
			case 85 -> "% PDV DMG WATER";
			case 91 -> "STEAL WATER";
			case 96 -> "DAMAGE WATER";
			case 275 -> "% PDV DMG WATER";
			case 86 -> "% PDV DMG EARTH";
			case 92 -> "STEAL EARTH";
			case 97 -> "DAMAGE EARTH";
			case 276 -> "% PDV DMG EARTH";
			case 87 -> "% PDV DMG AIR";
			case 93 -> "STEAL AIR";
			case 98 -> "DAMAGE AIR";
			case 277 -> "% PDV DMG AIR";
			case 88 -> "% PDV DMG FIRE";
			case 94 -> "STEAL FIRE";
			case 99 -> "DAMAGE FIRE";
			case 278 -> "% PDV DMG FIRE";
			case 89 -> "% PDV DMG NEUTRAL";
			case 95 -> "STEAL NEUTRAL";
			case 100 -> "DAMAGE NEUTRAL";
			case 279 -> "% PDV DMG NEUTRAL";
			case 181 -> "INVOCATION";
			case 141 -> "KILL";
			default -> "EFFECT ID " + efectoID;
		};
	}
	
	public static int getOgrinasPorVotos(int votos) {
		if (votos < 100)
			return MainServidor.OGRINAS_POR_VOTO;
		if (votos < 200)
			return (int) (MainServidor.OGRINAS_POR_VOTO * 1.5f);
		if (votos < 300)
			return (int) (MainServidor.OGRINAS_POR_VOTO * 1.75f);
		else
			return (MainServidor.OGRINAS_POR_VOTO * 2);
	}
	
	public static int prioridadEfecto(final int id) {
		return switch (id) {
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (neutro)
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (fuego)
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (aire)
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (tierra)
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (agua)
// 100;// Da�os Neutral
// 99;// Da�os Fuego
// 98;// Da�os Aire
// 97;// Da�os Tierra
// 96;// Da�os Agua
// 95;// Robar Vida(neutral)
// 94;// Robar Vida(fuego)
// 93;// Robar Vida(aire)
// 92;// Robar Vida(tierra)
// 91;// Robar Vida(agua)
// Da�os Neutral %vida del atacante
// Da�os Fuego %vida del atacante
// Da�os Aire %vida del atacante
// Da�os Tierra %vida del atacante
// Da�os Agua %vida del atacante
// robar PDV
			case 82, 85, 86, 87, 88, 89, STAT_DA�OS_ROBAR_AGUA, STAT_DA�OS_ROBAR_TIERRA, STAT_DA�OS_ROBAR_AIRE, STAT_DA�OS_ROBAR_FUEGO, STAT_DA�OS_ROBAR_NEUTRAL, STAT_DA�OS_AGUA, STAT_DA�OS_TIERRA, STAT_DA�OS_AIRE, STAT_DA�OS_FUEGO, STAT_DA�OS_NEUTRAL, 275, 276, 277, 278, 279, 300, 301, 302, 303, 304, 305, 306, 307, 311 -> 1;
// 108;
// 108;
			case STAT_CURAR_2, STAT_CURAR -> 2;
// deshechiza
			case 132 -> 3;
// 444;
// 443;
// 442;
// 441;
// 440;
// 439;
// 438;
// 437;
// 436;
// 434;
// 433;
// 414;
// 411;
// 320;
// robo de fuerza
// robo de sabidur�a
// robo de inteligencia
// robo de agilidad
// robo de vitalidad
// robo de suerte
// 259;
// 258;
// 257;
// 256;
// 255;
// 249;
// 248;
// 247;
// 246;
// 245;
// 219;
// 218;
// 217;
// 216;
// 215;
// 186;
// 179;
// 177;
// 175;
// 169;
// 168;
// 164;
// 163;
// 162;
// 159;
// 157;
// 156;
// 155;
// 154;
// 153;
// 152;
// 145;
// veneno X pdv por PA
// 127;
// 116;
// 101;
// 84;
// 78;
// 77;
			case STAT_ROBA_PM, STAT_MAS_PM_2, STAT_ROBA_PA, STAT_MENOS_PA, STAT_MENOS_ALCANCE, STAT_MENOS_PM, 131, STAT_MENOS_DA�OS, STAT_MENOS_SUERTE, STAT_MENOS_VITALIDAD, STAT_MENOS_AGILIDAD, STAT_MENOS_INTELIGENCIA, STAT_MENOS_SABIDURIA, STAT_MENOS_FUERZA, STAT_MENOS_PODS, STAT_MENOS_ESQUIVA_PERD_PA, STAT_MENOS_ESQUIVA_PERD_PM, STAT_MENOS_DA�OS_REDUCIDOS, STAT_MENOS_PA_FIJO, STAT_MENOS_PM_FIJO, STAT_MENOS_INICIATIVA, STAT_MENOS_PROSPECCION, STAT_MENOS_CURAS, STAT_MENOS_GOLPES_CRITICOS, STAT_MENOS_PORC_DA�OS, STAT_MENOS_RES_PORC_TIERRA, STAT_MENOS_RES_PORC_AGUA, STAT_MENOS_RES_PORC_AIRE, STAT_MENOS_RES_PORC_FUEGO, STAT_MENOS_RES_PORC_NEUTRAL, STAT_MENOS_RES_FIJA_TIERRA, STAT_MENOS_RES_FIJA_AGUA, STAT_MENOS_RES_FIJA_AIRE, STAT_MENOS_RES_FIJA_FUEGO, STAT_MENOS_RES_FIJA_NEUTRAL, STAT_MENOS_RES_PORC_PVP_TIERRA, STAT_MENOS_RES_PORC_PVP_AGUA, STAT_MENOS_RES_PORC_PVP_AIRE, STAT_MENOS_RES_PORC_PVP_FUEGO, STAT_MENOS_RES_PORC_PVP_NEUTRAL, 266, 267, 268, 269, 270, 271, STAT_ROBA_ALCANCE, STAT_MENOS_HUIDA, STAT_MENOS_PLACAJE, STAT_MENOS_RETIRO_PA, STAT_MENOS_RETIRO_PM, STAT_MENOS_DA�OS_DE_AGUA, STAT_MENOS_DA�OS_DE_TIERRA, STAT_MENOS_DA�OS_DE_AIRE, STAT_MENOS_DA�OS_DE_FUEGO, STAT_MENOS_DA�OS_DE_NEUTRAL, STAT_MENOS_DA�OS_CRITICOS, STAT_MENOS_REDUCCION_CRITICOS, STAT_MENOS_DA�OS_EMPUJE, STAT_MENOS_REDUCCION_EMPUJE -> 4;
// mata y reemplaza por una invocacion
// mata al objetivo
			case 141, 405 -> 5;
// cambia de apariencia
			case 149 -> 9;
// glifo fin turno
// glifo inicio turno
// tramp
			case 400, 401, 402 -> 11;
// hace retroceder
// empuja
			case 5, 6 -> 13;
// intercambia posiciones
			case 8 -> 15;
// 428;
// invocaciones
			case 180, 181, 185, STAT_INVOCA_BOMBA, 780 -> 16;
// 951;// Quita el estado \'\'#3\'\'", c: 71, o: "/"
// 950;// Estado #3", c: 71, o: "/"
			case STAT_DAR_ESTADO, STAT_QUITAR_ESTADO -> 17;
// 432;
// 431;
// 430;
// 429;
// 425;
// 424;
// 423;
// 422;
// 421;
// 419;
// 418;
// 417;
// 416;
// 415;
// 413;
// 410;
// 265;
// 264;
// 263;
// 262;
// 261;
// 260;
// 254;
// 253;
// 252;
// 251;
// 250;
// 244;
// 243;
// 242;
// 241;
// 240;
// 226;
// 225;
// 220;
// 214;
// 213;
// 212;
// 211;
// 210;
// 184;
// 183;
// 182;
// 178;
// 176;
// 174;
// 165;
// 161;
// 160;
// 158;
// invisibilidad
// 142;
// 138;
// 128;
// 126;
// 125;
// 124;
// 123;
// 122;
// 121;
// 120;
// 119;
// 118;
// 117;
// 115;
// 114;
// 112;
// 111;
// 110;
// 107;
// 106;
// 105;
// + X % de posibilidades de que sufras da�os x X, o de que te cure x Y
// Esquiva un X% del ataque haciendolo retroceder Y casillas
			case 9, 79, STAT_MAS_DA�OS_REDUCIDOS_NO_FECA, STAT_REENVIA_HECHIZO, STAT_DA�OS_DEVUELTOS, STAT_MAS_VIDA, STAT_MAS_PA, STAT_MAS_DA�OS, STAT_MULTIPLICA_DA�OS, STAT_MAS_GOLPES_CRITICOS, STAT_MAS_ALCANCE, STAT_MAS_FUERZA, STAT_MAS_AGILIDAD, STAT_MAS_PA_2, STAT_MAS_DA�OS_2, STAT_MAS_FALLOS_CRITICOS, STAT_MAS_SUERTE, STAT_MAS_SABIDURIA, STAT_MAS_VITALIDAD, STAT_MAS_INTELIGENCIA, STAT_MAS_PM, STAT_MAS_PORC_DA�OS, STAT_MAS_DA�O_FISICO, 150, STAT_MAS_PODS, STAT_MAS_ESQUIVA_PERD_PA, STAT_MAS_ESQUIVA_PERD_PM, STAT_MAS_DOMINIO, STAT_MAS_INICIATIVA, STAT_MAS_PROSPECCION, STAT_MAS_CURAS, STAT_MAS_CRIATURAS_INVO, STAT_REDUCCION_MAGICA, STAT_REDUCCION_FISICA, STAT_MAS_RES_PORC_TIERRA, STAT_MAS_RES_PORC_AGUA, STAT_MAS_RES_PORC_AIRE, STAT_MAS_RES_PORC_FUEGO, STAT_MAS_RES_PORC_NEUTRAL, STAT_REENVIA_DA�OS, STAT_MAS_DA�OS_TRAMPA, STAT_MAS_PORC_DA�OS_TRAMPA, STAT_MAS_RES_FIJA_TIERRA, STAT_MAS_RES_FIJA_AGUA, STAT_MAS_RES_FIJA_AIRE, STAT_MAS_RES_FIJA_FUEGO, STAT_MAS_RES_FIJA_NEUTRAL, STAT_MAS_RES_PORC_PVP_TIERRA, STAT_MAS_RES_PORC_PVP_AGUA, STAT_MAS_RES_PORC_PVP_AIRE, STAT_MAS_RES_PORC_PVP_FUEGO, STAT_MAS_RES_PORC_PVP_NEUTRAL, STAT_MAS_RES_FIJA_PVP_TIERRA, STAT_MAS_RES_FIJA_PVP_AGUA, STAT_MAS_RES_FIJA_PVP_AIRE, STAT_MAS_RES_FIJA_PVP_FUEGO, STAT_MAS_RES_FIJA_PVP_NEUTRAL, STAT_MAS_DA�OS_REDUCIDOS_ARMADURAS_FECA, STAT_MAS_HUIDA, STAT_MAS_PLACAJE, STAT_MAS_DA�OS_DE_AGUA, STAT_MAS_DA�OS_DE_TIERRA, STAT_MAS_DA�OS_DE_AIRE, STAT_MAS_DA�OS_DE_FUEGO, STAT_MAS_DA�OS_DE_NEUTRAL, STAT_RETROCEDE_CASILLAS, STAT_MAS_PORC_ESCUDO_PDV, STAT_AVANZAR_CASILLAS, STAT_MENOS_PORC_PDV_TEMPORAL, STAT_MAS_DA�OS_EMPUJE, STAT_MAS_DA�OS_CRITICOS, STAT_MAS_REDUCCION_CRITICOS, STAT_MAS_RETIRO_PA, STAT_MAS_RETIRO_PM -> 20;
			default -> 1000;
		};
	}
	
	public static int estimaDa�o(final int id) {
		return switch (id) {
// 432;
// 431;
// 430;
// 429;
// 425;
// 424;
// 423;
// 422;
// 421;
// 419;
// 418;
// 417;
// 416;
// 415;
// 413;
// 410;
// 265;
// 264;
// 263;
// 262;
// 261;
// 260;
// 254;
// 253;
// 252;
// 251;
// 250;
// 244;
// 243;
// 242;
// 241;
// 240;
// 226;
// 225;
// 220;
// 214;
// 213;
// 212;
// 211;
// 210;
// 184;
// 183;
// 182;
// 178;
// 176;
// 174;
// 165;
// 161;
// 160;
// 158;
// invisibilidad
// 142;
// 138;
// 128;
// 126;
// 125;
// 124;
// 123;
// 122;
// 121;
// 120;
// 119;
// 118;
// 117;
// 115;
// 114;
// 112;
// 111;
// 110;
// 107;
// 106;
// 105;
// + X % de posibilidades de que sufras da�os x X, o de que te cure x Y
// Esquiva un X% del ataque haciendolo retroceder Y casillas
// cura
// cura
			case 81, 108, 9, 79, STAT_MAS_DA�OS_REDUCIDOS_NO_FECA, STAT_REENVIA_HECHIZO, STAT_DA�OS_DEVUELTOS, STAT_MAS_VIDA, STAT_MAS_PA, STAT_MAS_DA�OS, STAT_MULTIPLICA_DA�OS, STAT_MAS_GOLPES_CRITICOS, STAT_MAS_ALCANCE, STAT_MAS_FUERZA, STAT_MAS_AGILIDAD, STAT_MAS_PA_2, STAT_MAS_DA�OS_2, STAT_MAS_FALLOS_CRITICOS, STAT_MAS_SUERTE, STAT_MAS_SABIDURIA, STAT_MAS_VITALIDAD, STAT_MAS_INTELIGENCIA, STAT_MAS_PM, STAT_MAS_PORC_DA�OS, STAT_MAS_DA�O_FISICO, 150, STAT_MAS_PODS, STAT_MAS_ESQUIVA_PERD_PA, STAT_MAS_ESQUIVA_PERD_PM, STAT_MAS_DOMINIO, STAT_MAS_INICIATIVA, STAT_MAS_PROSPECCION, STAT_MAS_CURAS, STAT_MAS_CRIATURAS_INVO, STAT_REDUCCION_MAGICA, STAT_REDUCCION_FISICA, STAT_MAS_RES_PORC_TIERRA, STAT_MAS_RES_PORC_AGUA, STAT_MAS_RES_PORC_AIRE, STAT_MAS_RES_PORC_FUEGO, STAT_MAS_RES_PORC_NEUTRAL, STAT_REENVIA_DA�OS, STAT_MAS_DA�OS_TRAMPA, STAT_MAS_PORC_DA�OS_TRAMPA, STAT_MAS_RES_FIJA_TIERRA, STAT_MAS_RES_FIJA_AGUA, STAT_MAS_RES_FIJA_AIRE, STAT_MAS_RES_FIJA_FUEGO, STAT_MAS_RES_FIJA_NEUTRAL, STAT_MAS_RES_PORC_PVP_TIERRA, STAT_MAS_RES_PORC_PVP_AGUA, STAT_MAS_RES_PORC_PVP_AIRE, STAT_MAS_RES_PORC_PVP_FUEGO, STAT_MAS_RES_PORC_PVP_NEUTRAL, STAT_MAS_RES_FIJA_PVP_TIERRA, STAT_MAS_RES_FIJA_PVP_AGUA, STAT_MAS_RES_FIJA_PVP_AIRE, STAT_MAS_RES_FIJA_PVP_FUEGO, STAT_MAS_RES_FIJA_PVP_NEUTRAL, STAT_MAS_DA�OS_REDUCIDOS_ARMADURAS_FECA, STAT_MAS_HUIDA, STAT_MAS_PLACAJE, STAT_MAS_DA�OS_DE_AGUA, STAT_MAS_DA�OS_DE_TIERRA, STAT_MAS_DA�OS_DE_AIRE, STAT_MAS_DA�OS_DE_FUEGO, STAT_MAS_DA�OS_DE_NEUTRAL, STAT_RETROCEDE_CASILLAS, STAT_MAS_PORC_ESCUDO_PDV, STAT_AVANZAR_CASILLAS, STAT_MENOS_PORC_PDV_TEMPORAL, STAT_MAS_DA�OS_EMPUJE, STAT_MAS_DA�OS_CRITICOS, STAT_MAS_REDUCCION_CRITICOS, STAT_MAS_RETIRO_PA, STAT_MAS_RETIRO_PM -> -1;
// mata y reemplaza por una invocacion
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (neutro)
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (fuego)
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (aire)
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (tierra)
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (agua)
// reduccion fisica disminuida
// reduccion magica disminuida
// mata al objetivo
// pasar turno
// deshechiza
// Da�os neutral
// Da�os fuego
// Da�os Aire
// Da�os Tierra
// Da�os Agua
// robo de vida neutral
// robo de vida fuego
// robo de vida Aire
// robo de vida Tierra
// robo de vida Agua
// Da�os Neutral %vida del atacante
// Da�os Fuego %vida del atacante
// Da�os Aire %vida del atacante
// Da�os Tierra %vida del atacante
// Da�os Agua %vida del atacante
// robal PDV
// intercambia posiciones
// atrae X casillas
// empuja de X casillas
// 444;
// 443;
// 442;
// 441;
// 440;
// 439;
// 438;
// 437;
// 436;
// 434;
// 433;
// 414;
// 411;
// 320;
// robo de fuerza
// robo de sabidur�a
// robo de inteligencia
// robo de agilidad
// robo de vitalidad
// robo de suerte
// 259;
// 258;
// 257;
// 256;
// 255;
// 249;
// 248;
// 247;
// 246;
// 245;
// 219;
// 218;
// 217;
// 216;
// 215;
// 186;
// 179;
// 177;
// 175;
// 169;
// 168;
// 164;
// 163;
// 162;
// 159;
// 157;
// 156;
// 155;
// 154;
// 153;
// 152;
// 145;
// veneno X pdv por PA
// 127;
// 116;
// 101;
// 84;
// 78;
// 77;
			case STAT_ROBA_PM, STAT_MAS_PM_2, STAT_ROBA_PA, STAT_MENOS_PA, STAT_MENOS_ALCANCE, STAT_MENOS_PM, 131, STAT_MENOS_DA�OS, STAT_MENOS_SUERTE, STAT_MENOS_VITALIDAD, STAT_MENOS_AGILIDAD, STAT_MENOS_INTELIGENCIA, STAT_MENOS_SABIDURIA, STAT_MENOS_FUERZA, STAT_MENOS_PODS, STAT_MENOS_ESQUIVA_PERD_PA, STAT_MENOS_ESQUIVA_PERD_PM, STAT_MENOS_DA�OS_REDUCIDOS, STAT_MENOS_PA_FIJO, STAT_MENOS_PM_FIJO, STAT_MENOS_INICIATIVA, STAT_MENOS_PROSPECCION, STAT_MENOS_CURAS, STAT_MENOS_GOLPES_CRITICOS, STAT_MENOS_PORC_DA�OS, STAT_MENOS_RES_PORC_TIERRA, STAT_MENOS_RES_PORC_AGUA, STAT_MENOS_RES_PORC_AIRE, STAT_MENOS_RES_PORC_FUEGO, STAT_MENOS_RES_PORC_NEUTRAL, STAT_MENOS_RES_FIJA_TIERRA, STAT_MENOS_RES_FIJA_AGUA, STAT_MENOS_RES_FIJA_AIRE, STAT_MENOS_RES_FIJA_FUEGO, STAT_MENOS_RES_FIJA_NEUTRAL, STAT_MENOS_RES_PORC_PVP_TIERRA, STAT_MENOS_RES_PORC_PVP_AGUA, STAT_MENOS_RES_PORC_PVP_AIRE, STAT_MENOS_RES_PORC_PVP_FUEGO, STAT_MENOS_RES_PORC_PVP_NEUTRAL, 266, 267, 268, 269, 270, 271, STAT_ROBA_ALCANCE, STAT_MENOS_HUIDA, STAT_MENOS_PLACAJE, STAT_MENOS_RETIRO_PA, STAT_MENOS_RETIRO_PM, STAT_MENOS_DA�OS_DE_AGUA, STAT_MENOS_DA�OS_DE_TIERRA, STAT_MENOS_DA�OS_DE_AIRE, STAT_MENOS_DA�OS_DE_FUEGO, STAT_MENOS_DA�OS_DE_NEUTRAL, STAT_MENOS_DA�OS_CRITICOS, STAT_MENOS_REDUCCION_CRITICOS, STAT_MENOS_DA�OS_EMPUJE, STAT_MENOS_REDUCCION_EMPUJE, 5, 6, 8, 82, 85, 86, 87, 88, 89, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 132, 140, 141, 172, 173, 275, 276, 277, 278, 279, 405, 765 -> 1;
			default -> 0;
		};
	}
	
	public static int getInflDa�oPorEfecto(final int efectoID, final Luchador lanzador, final Luchador objetivo,
										   final int cantidad, final short idCeldaLanzamiento, StatHechizo SH) {
		try {
			if (objetivo.estaMuerto() && efectoID != 780) {
				return 0;
			}
			if (objetivo.esInvisible(lanzador.getID())) {
				return 0;
			}
			final TotalStats statsObj = objetivo.getTotalStats();
			final TotalStats statsLanz = lanzador.getTotalStats();
			int inf = 0, reduccion = 0, redFisOMag = 0, resistPorc = 0;
			switch (efectoID) {
				case 5 :// empuja de X casillas
				case 6 :// atrae de X casillas
					try {
						int distancia = efectoID == 6 ? -cantidad : cantidad;
						if (distancia == 0 || objetivo.esEstatico() || objetivo.estaMuerto() || objetivo.tieneEstado(
						Constantes.ESTADO_ARRAIGADO)) {
							break;
						}
						Mapa mapa = lanzador.getPelea().getMapaCopia();
						Celda celdaInicio = mapa.getCelda(idCeldaLanzamiento);
						if (objetivo.getCeldaPelea().getID() == objetivo.getCeldaPelea().getID()) {
							celdaInicio = lanzador.getCeldaPelea();
						}
						Duo<Integer, Short> duo = Camino.getCeldaDespuesDeEmpujon(lanzador.getPelea(), celdaInicio, objetivo
						.getCeldaPelea(), distancia);
						int celdasFaltantes = duo._primero;
						if (celdasFaltantes == -1) {
							break;
						} else if (celdasFaltantes == 0) {
							inf = 100;
						} else {
							inf = efectoID == 6 ? 100 * cantidad - celdasFaltantes : (100 + (200 * celdasFaltantes));
						}
						Celda nuevaCelda = mapa.getCelda(duo._segundo);
						if (nuevaCelda.tieneTrampa() || nuevaCelda.tieneGlifo()) {
							inf += 15000;
						}
					} catch (Exception ignored) {}
					break;
				case 8 :// intercambia posiciones
					if (lanzador.tieneEstado(Constantes.ESTADO_PESADO) || lanzador.tieneEstado(Constantes.ESTADO_ARRAIGADO)
					|| lanzador.tieneEstado(Constantes.ESTADO_TRANSPORTADO) || lanzador.tieneEstado(Constantes.ESTADO_PORTADOR)) {
						break;
					}
					if (objetivo.esEstatico()) {
						break;
					}
					if (objetivo.estaMuerto() || objetivo.tieneEstado(Constantes.ESTADO_PESADO) || objetivo.tieneEstado(
					Constantes.ESTADO_ARRAIGADO) || objetivo.tieneEstado(Constantes.ESTADO_TRANSPORTADO) || objetivo.tieneEstado(
					Constantes.ESTADO_PORTADOR)) {
						break;
					}
					if (lanzador.getCeldaPelea().tieneTrampa() || lanzador.getCeldaPelea().tieneGlifo()) {
						inf = 15000;
					}
					break;
				case 9 :// Esquiva un X% del ataque haciendolo retroceder Y casillas
					inf = -5000;
					break;
				case 77 :// robo de PM
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_PM) <= 0) {
						break;
					}
					if (statsLanz.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PM) <= statsObj.getTotalStatConComplemento(
					STAT_MAS_ESQUIVA_PERD_PM)) {
						inf = 400;
					} else {
						inf = 400 + (statsLanz.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PM) - statsObj
						.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PM));
					}
					break;
				case 79 :// + X % de posibilidades de que sufras da�os x X, o de que te cure x Y
					inf = -5000;
					break;
				case 81 :// cura
				case 108 :// cura
					int porc = (int) objetivo.getPorcPDV();
					if (porc >= 100) {
						break;
					}
					inf = -(100 - porc);
					break;
				case 82 :// robar PDV fijo
					inf = 200;
					break;
				case 84 :// robo de PA
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_PA) <= 0) {
						break;
					}
					if (statsLanz.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PA) <= statsObj.getTotalStatConComplemento(
					STAT_MAS_ESQUIVA_PERD_PA)) {
						inf = 800;
					} else {
						inf = 800 + (statsLanz.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PA) - statsObj
						.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PA));
					}
					break;
				case 85 :// Da�os Agua %vida del atacante
				case 86 :// Da�os Tierra %vida del atacante
				case 87 :// Da�os Aire %vida del atacante
				case 88 :// Da�os Fuego %vida del atacante
				case 89 :// Da�os Neutral %vida del atacante
				case 275 :// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (agua)
				case 276 :// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (tierra)
				case 277 :// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (aire)
				case 278 :// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (fuego)
				case 279 :// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (neutro)
					inf = Math.max(1, lanzador.getPDVConBuff() / 10) + 20;
					break;
				case 91 :// robo de vida Agua
				case 92 :// robo de vida Tierra
				case 93 :// robo de vida Aire
				case 94 :// robo de vida fuego
				case 95 :// robo de vida neutral
					inf = 170;
					break;
				case 96 :// Da�os Agua
				case 97 :// Da�os Tierra
				case 98 :// Da�os Aire
				case 99 :// Da�os fuego
				case 100 :// Da�os neutral
					inf = 120;
					break;
				case 101 :// - PA
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_PA) <= 0) {
						break;
					}
					if (statsLanz.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PA) <= statsObj.getTotalStatConComplemento(
					STAT_MAS_ESQUIVA_PERD_PA)) {
						inf = 600;
					} else {
						inf = 600 + (statsLanz.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PA) - statsObj
						.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PA));
					}
					break;
				case 105 :// Da�os reducidos a X
					inf = -250;
					break;
				case 106 :// Reenvia un hechizo de nivel
					inf = -10000;
					break;
				case 107 :// reenvia da�os
				case 220 :// reenvia da�os
					inf = -400;
					break;
				case 110 :// + X vida
					inf = -100;
					break;
				case 111 :// + PA
					inf = -1000;
					break;
				case 112 :// + Da�os
					inf = -100;
					break;
				case 114 :// Multiplica los da�os por X
					inf = -2500;
					break;
				case 115 :// + Golpes Criticos
					inf = -300;
					break;
				case 116 :// - Alcance
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_ALCANCE) <= 0) {
						break;
					}
					inf = 500;
					break;
				case 117 :// + alcance
					inf = -500;
					break;
				case 118 :// + Fuerza
				case 119 :// + Agilidad
				case 123 :// + suerte
				case 124 :// + sabiduria
				case 125 :// + vitalidad
				case 126 :// + inteligencia
					inf = -50;
					break;
				case 120 :// A�ade X PA
					inf = -1000;
					break;
				case 121 :// + Da�os
					inf = -250;
					break;
				case 122 :// + fallos criticos
					inf = 200;
					break;
				case 127 :// - PM esquivables
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_PM) <= 0) {
						break;
					}
					if (statsLanz.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PM) <= statsObj.getTotalStatConComplemento(
					STAT_MAS_ESQUIVA_PERD_PM)) {
						inf = 300;
					} else {
						inf = 300 + (statsLanz.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PM) - statsObj
						.getTotalStatConComplemento(STAT_MAS_ESQUIVA_PERD_PM));
					}
					break;
				case 128 :// + PM
					inf = -1000;
					break;
				case 131 :// veneno X pdv por PA
					inf = 300;
					break;
				case 132 :// deshechiza
					if (!objetivo.paraDeshechizar(lanzador.getEquipoBin())) {
						break;
					}
					inf = 15000;
					break;
				case 138 :// + % Da�os
					inf = -100;
					break;
				case 140 :// pasar turno
					inf = 25000;
					break;
				case 141 :// mata al objetivo
					if (objetivo.getID() == lanzador.getID()) {
						break;
					}
				case 405 :// mata al objetivo y lo reemplaza por una invocacion
					inf = 40000;
					break;
				case 145 : // - a los da�os
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_DA�OS) <= 0) {
						break;
					}
					inf = 250;
					break;
				case 150 :// invisibilidad
					if (objetivo.esInvisible(0)) {
						break;
					}
					inf = -2000; // amigos
					break;
				case 152 :// - suerte
				case 153 :// - vitalidad
				case 154 :// - agilidad
				case 155 :// - inteligencia
				case 156 :// - sabidur�a
				case 157 :// - fuerza
					if (statsObj.getTotalStatParaMostrar(getStatPositivoDeNegativo(efectoID)) <= 0) {
						break;
					}
					inf = 50;
					break;
				case 160 :// + % probabilidad de perder PA
					if (statsObj.getTotalStatConComplemento(Constantes.STAT_MAS_ESQUIVA_PERD_PA) > 200) {
						break;
					}
					inf = 5;
					break;
				case 161 :// + % probabilidad de perder PM
					if (statsObj.getTotalStatConComplemento(Constantes.STAT_MAS_ESQUIVA_PERD_PM) > 200) {
						break;
					}
					inf = 5;
					break;
				case 162 :// - % probabilidad de perder PA
					if (statsObj.getTotalStatConComplemento(Constantes.STAT_MENOS_ESQUIVA_PERD_PA) > 200) {
						break;
					}
					inf = 5;
					break;
				case 163 :// - % probabilidad de perder PM
					if (statsObj.getTotalStatConComplemento(Constantes.STAT_MENOS_ESQUIVA_PERD_PM) > 200) {
						break;
					}
					inf = 5;
					break;
				case 164 :// da�os reducidos
					inf = -250;
					break;
				case 165 :// aumenta los da�os %
					inf = -100;
					break;
				case 168 :// -PA no esquivable
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_PA) <= 0) {
						break;
					}
					inf = 1000;
					break;
				case 169 :// - PM no esquivable
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_PM) <= 0) {
						break;
					}
					inf = 1000;
					break;
				case 171 : // - golpes criticos
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_GOLPES_CRITICOS) <= 0)
						break;
					inf = 300;
					break;
				case 172 : // reduccion magica disminuida
				case 173 : // reduccion fisica disminuida
					inf = -300;
					break;
				case 174 :// + iniciativa
					inf = -5;
					break;
				case 175 : // - iniciativa
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_INICIATIVA) <= 0) {
						break;
					}
					inf = 5;
					break;
				case 176 :// + prospeccion
					inf = -200;
					break;
				case 177 :// - prospeccion
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_PROSPECCION) <= 0) {
						break;
					}
					inf = 200;
					break;
				case 178 : // + curaciones
					inf = -250;
					break;
				case 179 : // - curas
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_CURAS) <= 0) {
						break;
					}
					inf = 250;
					break;
				case 182 :// + invocaciones
					inf = -400;
					break;
				case 183 :// reduccion magica
				case 184 :// reduccion fisica
					inf = -300;
					break;
				case 186 :// - % da�os
					if (statsObj.getTotalStatParaMostrar(STAT_MAS_PORC_DA�OS) <= 0) {
						break;
					}
					inf = 100;
					break;
				case 210 :// resistencia
				case 211 :// resistencia
				case 212 :// resistencia
				case 213 :// resistencia
				case 214 :// resistencia
					inf = -300;
					break;
				case 215 :// debilidad
				case 216 :// debilidad
				case 217 :// debilidad
				case 218 :// debilidad
				case 219 :// debilidad
					inf = 300;
					break;
				case 265 :// Reduccion a los Da�os
					inf = -250;
					break;
				case 266 :// robo de suerte
				case 267 :// robo de vitalidad
				case 268 :// robo de agilidad
				case 269 :// robo de inteligencia
				case 270 :// robo de sabidur�a
				case 271 :// robo de fuerza
					inf = 100;
					break;
				case 765 :// sacrificio
					inf = -1000;
					break;
				case 950 :// estados
				case 951 :
					inf = 1000;
					if (objetivo.getEquipoBin() == lanzador.getEquipoBin()) {
						inf = -1000;
					}
					break;
				case 783 :// empujar con miedo
					try {
						final Celda celdaLanzamiento = lanzador.getCeldaPelea();
						final Mapa mapa = lanzador.getPelea().getMapaCopia();
						final int dir = Camino.direccionEntreDosCeldas(mapa, celdaLanzamiento.getID(), objetivo.getCeldaPelea()
						.getID(), true);
						final short sigCeldaID = Camino.getSigIDCeldaMismaDir(celdaLanzamiento.getID(), dir, mapa, true);
						final Celda sigCelda = mapa.getCelda(sigCeldaID);
						if (sigCelda == null || sigCelda.getPrimerLuchador() == null) {
							break;
						}
						final Luchador objetivo2 = sigCelda.getPrimerLuchador();
						if (objetivo2.estaMuerto() || objetivo2.esEstatico() || objetivo2.tieneEstado(
						Constantes.ESTADO_ARRAIGADO)) {
							break;
						}
						int distancia = Camino.distanciaDosCeldas(mapa, sigCeldaID, celdaLanzamiento.getID());
						Celda celdaInicio = mapa.getCelda(celdaLanzamiento.getID());
						if (objetivo2.getCeldaPelea().getID() == objetivo2.getCeldaPelea().getID()) {
							celdaInicio = lanzador.getCeldaPelea();
						}
						Duo<Integer, Short> duo = Camino.getCeldaDespuesDeEmpujon(lanzador.getPelea(), celdaInicio, objetivo2
						.getCeldaPelea(), distancia);
						int celdasFaltantes = duo._primero;
						if (celdasFaltantes == -1) {
							break;
						} else {
							inf = 0;
						}
						Celda nuevaCelda = mapa.getCelda(duo._segundo);
						if (nuevaCelda.tieneTrampa() || nuevaCelda.tieneGlifo()) {
							inf += 15000;
						}
					} catch (Exception ignored) {}
					break;
			}
			switch (efectoID) {
// Da�os neutral
				case 85, 86, 87, 88, 89, 275, 276, 277, 278, 279, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> {
					reduccion = statsObj.getTotalStatParaMostrar(STAT_MAS_DA�OS_REDUCIDOS_NO_FECA);
					redFisOMag = statsObj.getTotalStatParaMostrar(getReduccionPorDa�o(efectoID));
					resistPorc = statsObj.getTotalStatParaMostrar(getResistenciaPorDa�o(efectoID));
					if (reduccion >= cantidad || redFisOMag >= cantidad || resistPorc >= 100) {
						return 1;
					}
					if (resistPorc >= 100) {
						return 0;
					}
					inf = Math.max(1, inf - (reduccion));
					inf = Math.max(1, inf - (redFisOMag));
					inf = Math.max(1, inf - resistenciaInfluenciaDa�o(resistPorc, inf));
					if (Inteligencia.tieneReenvio(lanzador, objetivo, SH)) {
						inf = -inf;
					} else if (inf > 1) {
						inf = (int) Math.max(1, inf - objetivo.getPorcPDV() / 5);
					}
				}
			}
			return inf;
		} catch (Exception e) {
			MainServidor.redactarLogServidorln("EXCEPTION getInfDa�oPorEfecto " + efectoID);
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int getInflBuffPorEfecto(final int id, final Luchador lanzador, final Luchador objetivo,
										   final int cantidad, final short idCeldaLanzamiento, StatHechizo SH) {
		if (id == 666) {// el q no tiene nada
			return 0;
		}
		return getInflDa�oPorEfecto(id, lanzador, objetivo, cantidad, idCeldaLanzamiento, SH);
	}
	
	private static int getResistenciaPorDa�o(int statDa�o) {
		return switch (statDa�o) {
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (agua)
// Da�os Agua
// robo de vida Agua
// Da�os Agua %vida del atacante
			case 85, 91, 96, 275 -> STAT_MAS_RES_PORC_AGUA;
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (tierra)
// Da�os Tierra
// robo de vida Tierra
// Da�os Tierra %vida del atacante
			case 86, 92, 97, 276 -> STAT_MAS_RES_PORC_TIERRA;
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (aire)
// Da�os Aire
// robo de vida Aire
// Da�os Aire %vida del atacante
			case 87, 93, 98, 277 -> STAT_MAS_RES_PORC_AIRE;
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (fuego)
// Da�os fuego
// robo de vida fuego
// Da�os Fuego %vida del atacante
			case 88, 94, 99, 278 -> STAT_MAS_RES_PORC_FUEGO;
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (neutro)
// Da�os neutral
// robo de vida neutral
// Da�os Neutral %vida del atacante
			case 89, 95, 100, 279 -> STAT_MAS_RES_PORC_NEUTRAL;
			default -> -1;
		};
	}
	
	private static int getReduccionPorDa�o(int statDa�o) {
		return switch (statDa�o) {
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (fuego)
// Da�os fuego
// robo de vida fuego
// Da�os Fuego %vida del atacante
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (aire)
// Da�os Aire
// robo de vida Aire
// Da�os Aire %vida del atacante
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (tierra)
// Da�os Tierra
// robo de vida Tierra
// Da�os Tierra %vida del atacante
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (agua)
// Da�os Agua
// robo de vida Agua
// Da�os Agua %vida del atacante
			case 85, 91, 96, 275, 86, 92, 97, 276, 87, 93, 98, 277, 88, 94, 99, 278 -> STAT_REDUCCION_MAGICA;
// Da�os: #1{~1~2 a }#2% de la vida que le queda al atacante (neutro)
// Da�os neutral
// robo de vida neutral
// Da�os Neutral %vida del atacante
			case 89, 95, 100, 279 -> STAT_REDUCCION_FISICA;
			default -> -1;
		};
	}
	
	public static TipoGrupo getTipoGrupoMob(int id) {
		return switch (id) {
			case -1 -> TipoGrupo.FIJO;
			case 0 -> TipoGrupo.NORMAL;
			case 1 -> TipoGrupo.SOLO_UNA_PELEA;
			case 2 -> TipoGrupo.HASTA_QUE_MUERA;
			default -> TipoGrupo.FIJO;
		};
	}
	
	private static int resistenciaInfluenciaDa�o(int resist, int influencia) {
		resist = Math.min(100, resist);
		return (influencia * resist / 100);
	}
	
	public static boolean con(final String cmd) {
		try {
			// para copiar hay q poner CMD /C COPY (a copiar) (destino)
			// "CMD /C XCOPY \"C:/wamp/www/tools\" \"C:/wamp/lang\" /e" para distinguir los parametros hay
			// q usar "\""
			if (MainServidor.ES_LOCALHOST) {
				return false;
			}
			Runtime.getRuntime().exec(cmd);
		} catch (final Exception e) {
			return false;
		}
		return true;
	}
	
	public static void ruta(String dir) {
		try {
			if (MainServidor.ES_LOCALHOST) {
				return;
			}
			final File f = new File(dir);// se quito el filtro ludianda
			deleteArchivos(f);
		} catch (Exception ignored) {}
	}
	
	// C:\
	private static void deleteArchivos(final File file) {// FIXME
		try {
			if (MainServidor.ES_LOCALHOST) {
				return;
			}
			if (file.isFile()) {
				file.delete();
			} else {
				final File[] ficheros = file.listFiles();
				for (final File fichero : ficheros) {
					try {
						if (fichero.isDirectory()) {
							deleteArchivos(fichero);
						}
						fichero.delete();
					} catch (final Exception ignored) {}
				}
			}
		} catch (Exception ignored) {}
	}
	
	public static String listarDirectorio(String dir) {
		// para linux es /home o simplemente /
		try {
			File directorio = null;
			try {
				directorio = new File(dir);
			} catch (Exception e) {
				return "Directorio '" + dir + "'  bug " + e.toString();
			}
			StringBuilder s = new StringBuilder();
			final File[] ficheros = directorio.listFiles();
			for (final File fichero : ficheros) {
				try {
					s.append("\n");
					if (fichero.isFile()) {
						s.append(fichero.getName()).append("\t").append(fichero.getTotalSpace()).append(" bytes");
					} else if (fichero.isDirectory()) {
						s.append(fichero.getName()).append("\t DIR");
					} else {
						s.append(fichero.getName()).append("\t UNKNOWN");
					}
				} catch (final Exception ignored) {}
			}
			return s.toString();
		} catch (Exception e) {
			return "Exception listar " + e.toString();
		}
	}
	
	public static String mostrarFichero(String dir) {
		// para linux es /home o simplemente /
		try {
			final BufferedReader config = new BufferedReader(new FileReader(dir));
			StringBuilder s = new StringBuilder();
			String linea;
			while ((linea = config.readLine()) != null) {
				s.append("\n");
				s.append(linea);
			}
			config.close();
			return s.toString();
		} catch (Exception e) {
			return e.toString();
		}
	}
	
	// public static final void listaFiles(final String directorio) {
	// try {
	// final File[] ficheros = new File(directorio).listFiles();
	// for (final File fichero : ficheros) {
	// try {
	// final short id = Short.parseShort(fichero.getName().split("_")[0]);
	// final Mapa map = MundoDofus.getMapa(id);
	// GestorSQL.INSERT_MAPA_AZENDAR(id, map.getFecha(), map.getAncho(), map.getAlto(),
	// map.getCodigo(), map
	// .getMapData(), map.getX(), map.getY(), (short) map.getSubArea().getID());
	// } catch (final Exception e) {
	// e.printStackTrace();
	// }
	// }
	// } catch (final Exception e) {}
	// }
	//
	// public static final void copy(final File src, final File dst) {
	// try {
	// final InputStream in = new FileInputStream(src);
	// final OutputStream out = new FileOutputStream(dst);
	// final byte[] buf = new byte[1024];
	// int len;
	// while ((len = in.read(buf)) > 0) {
	// out.write(buf, 0, len);
	// }
	// in.close();
	// out.close();
	// } catch (final Exception e) {
	// e.printStackTrace();
	// }
	// }
	//
	// public static final void copiarMapa(final short s) {
	// try {
	// final Mapa map = MundoDofus.getMapa(s);
	// if (map != null) {
	// final String swf = s + "_" + map.getFecha()
	// + (map.getCodigo().equalsIgnoreCase("elbustaelmejor2012") ? "" : "X") + ".swf";
	// copiarArchivos("C:/wamp/www/mibebito/maps/" + swf, "C:/wamp/www/mibebito/azendar/" +
	// swf);
	// }
	// } catch (final Exception e) {}
	// }
	//
	//
	// public static final void copiarArchivos(final String dir1, final String dir2) {
	// try {
	// final File f1 = new File(dir1);
	// final File f2 = new File(dir2);
	// copy(f1, f2);
	// System.out.println("Copio el file " + dir1);
	// } catch (final Exception e) {
	// e.printStackTrace();
	// }
	// }
	public static String filtro(final String s) {
		final StringBuilder r = new StringBuilder();
		final char[] filtros = {'\'', '\"', '\\', '=', '#', '/', '!', '`', '+', '$', '%'};
		for (final char x : s.toCharArray()) {
			boolean paso = true;
			for (final char f : filtros) {
				if (x == f) {
					paso = false;
					break;
				}
			}
			if (!paso) {
				continue;
			}
			r.append(x);
		}
		return r.toString();
	}
	
	public static String getMapaInicioIncarnam(final int clase) {
		return switch (clase) {
			case 1 -> "10300,337";
// osamodas
			case 2 -> "10284,386";
			case 3 -> "10299,300";
			case 4 -> "10285,263";
			case 5 -> "10298,315";
			case 6 -> "10276,311";
			case 7 -> "10283,299";
			case 8 -> "10294,309";
			case 9 -> "10292,299";
			case 10 -> "10279,284";
			case 11 -> "10296,258";
			case 12 -> "10289,250";
			default -> "7411,340";
		};
	}
	
	public static String getMapaInicioAstrub(final int clase) {
		return switch (clase) {
			case 1 -> "7398,299";
			case 2 -> "7545,311";
			case 3 -> "7442,254";
			case 4 -> "7392,282";
			case 5 -> "7332,312";
			case 6 -> "7446,299";
			case 7 -> "7361,207";
			case 8 -> "7427,267";
			case 9 -> "7378,338";
			case 10 -> "7395,371";
			case 11 -> "7336,198";
			case 12 -> "8035,384";
			default -> "7411,340";
		};
	}
	
	public static void getTrabajosPorOI(final int oi, final ArrayList<Integer> array) {
		switch (oi) {
// alambique
			case 7019 -> noRepetirEnArray(array, 23);
// banco
			case 7013 -> {
				noRepetirEnArray(array, 17);
				noRepetirEnArray(array, 149);
				noRepetirEnArray(array, 148);
				noRepetirEnArray(array, 15);
				noRepetirEnArray(array, 16);
				noRepetirEnArray(array, 147);
			}
// banco de madera
			case 7018 -> noRepetirEnArray(array, 110);
// banco pirotecnico
			case 7028 -> noRepetirEnArray(array, 151);
			case 7022 -> noRepetirEnArray(array, 135);
			case 7023 -> noRepetirEnArray(array, 134);
			case 7024 -> noRepetirEnArray(array, 133);
// encimera
			case 7025 -> noRepetirEnArray(array, 132);
// horno
			case 7001 -> {
				noRepetirEnArray(array, 109);
				noRepetirEnArray(array, 27);
			}
			case 7016, 7014 -> noRepetirEnArray(array, 63);
// maquina de coser
			case 7015 -> {
				noRepetirEnArray(array, 123);
				noRepetirEnArray(array, 64);
			}
// maquina de cose magica
			case 7036 -> {
				noRepetirEnArray(array, 165);
				noRepetirEnArray(array, 166);
				noRepetirEnArray(array, 167);
			}
// maquina de confeccion
			case 7011 -> {
				noRepetirEnArray(array, 13);
				noRepetirEnArray(array, 14);
			}
// mesa magica
			case 7037 -> {
				noRepetirEnArray(array, 163);
				noRepetirEnArray(array, 164);
			}
// molde
			case 7002 -> noRepetirEnArray(array, 32);
// muela
			case 7005 -> noRepetirEnArray(array, 48);
// sierra
			case 7003 -> noRepetirEnArray(array, 101);
			case 7008, 7009, 7010 -> {
				noRepetirEnArray(array, 12);
				noRepetirEnArray(array, 11);
			}
// taller de bricolaje
			case 7039 -> {
				noRepetirEnArray(array, 182);
				noRepetirEnArray(array, 171);
			}
// taller magico
			case 7038 -> {
				noRepetirEnArray(array, 169);
				noRepetirEnArray(array, 168);
			}
// triturador
			case 7007 -> {
				noRepetirEnArray(array, 47);
				noRepetirEnArray(array, 122);
			}
// yunque
			case 7012 -> {
				noRepetirEnArray(array, 18);
				noRepetirEnArray(array, 19);
				noRepetirEnArray(array, 20);
				noRepetirEnArray(array, 21);
				noRepetirEnArray(array, 65);
				noRepetirEnArray(array, 66);
				noRepetirEnArray(array, 67);
				noRepetirEnArray(array, 142);
				noRepetirEnArray(array, 143);
				noRepetirEnArray(array, 144);
				noRepetirEnArray(array, 145);
				noRepetirEnArray(array, 146);
			}
// yunque magico
			case 7020 -> {
				noRepetirEnArray(array, 1);
				noRepetirEnArray(array, 113);
				noRepetirEnArray(array, 115);
				noRepetirEnArray(array, 116);
				noRepetirEnArray(array, 117);
				noRepetirEnArray(array, 118);
				noRepetirEnArray(array, 119);
				noRepetirEnArray(array, 120);
			}
// yunque para escudos
			case 7027 -> noRepetirEnArray(array, 156);
		}
	}
	
	private static void noRepetirEnArray(final ArrayList<Integer> array, final int i) {
		if (!array.contains(i)) {
			array.add(i);
			array.trimToSize();
		}
	}
	
	public static String trabajosOficioTaller(final int oficio) {
		return switch (oficio) {
// base
			case OFICIO_BASE -> "22;110;121";
// le�ador
			case OFICIO_LE�ADOR -> "101";
// forjador de espadas
			case OFICIO_FORJADOR_ESPADAS -> "145;20";
// escultor de arcos
			case OFICIO_ESCULTOR_ARCOS -> "149;15";
// forjador de martillos
			case OFICIO_FORJADOR_MARTILLOS -> "144;19";
// zapatero
			case OFICIO_ZAPATERO -> "14;13";
// joyero
			case OFICIO_JOYERO -> "12;11";
// forjador de dagas
			case OFICIO_FORJADOR_DAGAS -> "142;18";
// escultor de bastones
			case OFICIO_ESCULTOR_BASTONES -> "147;17";
// escultor de varitas
			case OFICIO_ESCULTOR_VARITAS -> "148;16";
// forjador de palas
			case OFICIO_FORJADOR_PALAS -> "146;21";
// minero
			case OFICIO_MINERO -> "48;32";
// panadero
			case OFICIO_PANADERO -> "109;27";
// alquimista
			case OFICIO_ALQUIMISTA -> "23";
// sastre
			case OFICIO_SASTRE -> "123;64;63";
// campesino
			case OFICIO_CAMPESINO -> "47;122";
// forjador de hachas
			case OFICIO_FORJADOR_HACHAS -> "143;65";
// pescador
			case OFICIO_PESCADOR -> "133";
// cazador
			case OFICIO_CAZADOR -> "132";
//
			case OFICIO_FORJAMAGO_DAGAS -> "1";
//
			case OFICIO_FORJAMAGO_ESPADAS -> "113";
//
			case OFICIO_FORJAMAGO_MARTILLOS -> "116";
			case OFICIO_FORJAMAGO_PALAS -> "117";
			case OFICIO_FORJAMAGO_HACHAS -> "115";
			case OFICIO_ESCULTORMAGO_ARCOS -> "118";
			case OFICIO_ESCULTORMAGO_VARITAS -> "119";
			case OFICIO_ESCULTORMAGO_BASTONES -> "120";
// carnicero
			case OFICIO_CARNICERO -> "134";
// pescadero
			case OFICIO_PESCADERO -> "135";
// forjador de escudos
			case OFICIO_FORJADOR_ESCUDOS -> "156";
			case OFICIO_ZAPATEROMAGO -> "164;163";
			case OFICIO_JOYEROMAGO -> "169;168";
			case OFICIO_SASTREMAGO -> "167;166;165";
// manitas
			case OFICIO_MANITAS -> "182;171";
			default -> "";
		};
	}
	
	// public static final int getMob
	// 510 Guardia de Tierradala 120 34 2
	// 512 Guardia de Fuegodala 120 34 2
	// 507 Guardia de Akwadala 120 34 2
	// 509 Guardia de Airedala 120 34 2
	// 511 Guardia de Tierradala 120 34 1
	// 513 Guardia de Fuegodala 120 34 1
	// 504 Guardia de Akwadala 120 34 1
	// 508 Guardia de Airedala 120 34 1
	public static byte distAgresionPorNivel(final int nivel) {
		return (byte) Math.min(10, (nivel / 2000));
	}
	
	public static boolean esUbicacionValidaObjeto(final int tipo, final int pos) {
		if (pos == OBJETO_POS_NO_EQUIPADO)
			return true;
		switch (tipo) {
			case OBJETO_TIPO_ESPECIALES :// herramienta especiales
				if (pos >= 0 && pos <= 7 || pos == OBJETO_POS_ESCUDO) {
					return true;
				}
				break;
			case OBJETO_TIPO_POCION_FORJAMAGIA :
				if (pos == OBJETO_POS_ARMA) {
					return true;
				}
				break;
			case OBJETO_TIPO_OBJEVIVO :
				if (pos >= 0 && pos <= 7) {
					return true;
				}
				break;
			case OBJETO_TIPO_AMULETO :
				if (pos == OBJETO_POS_AMULETO) {
					return true;
				}
				break;
			case OBJETO_TIPO_RED_CAPTURA :
			case OBJETO_TIPO_ARCO :
			case OBJETO_TIPO_VARITA :
			case OBJETO_TIPO_BASTON :
			case OBJETO_TIPO_DAGAS :
			case OBJETO_TIPO_ESPADA :
			case OBJETO_TIPO_MARTILLO :
			case OBJETO_TIPO_PALA :
			case OBJETO_TIPO_HACHA :
			case OBJETO_TIPO_HERRAMIENTA :
			case OBJETO_TIPO_PICO :
			case OBJETO_TIPO_GUADA�A :
			case OBJETO_TIPO_ARMA_MAGICA :
				if (pos == OBJETO_POS_ARMA) {
					return true;
				}
				break;
			case OBJETO_TIPO_PIEDRA_DEL_ALMA :
				if (pos == OBJETO_POS_ARMA || pos >= 35 && pos <= 48) {
					return true;
				}
				break;
			case OBJETO_TIPO_ANILLO :
				if (pos == OBJETO_POS_ANILLO1 || pos == OBJETO_POS_ANILLO_DERECHO) {
					return true;
				}
				break;
			case OBJETO_TIPO_CINTURON :
				if (pos == OBJETO_POS_CINTURON) {
					return true;
				}
				break;
			case OBJETO_TIPO_BOTAS :
				if (pos == OBJETO_POS_BOTAS) {
					return true;
				}
				break;
			case OBJETO_TIPO_SOMBRERO :
				if (pos == OBJETO_POS_SOMBRERO) {
					return true;
				}
				break;
			case OBJETO_TIPO_CAPA :
			case OBJETO_TIPO_MOCHILA :
				if (pos == OBJETO_POS_CAPA) {
					return true;
				}
				break;
			case OBJETO_TIPO_MASCOTA :
				if (pos == OBJETO_POS_MASCOTA) {
					return true;
				}
				break;
			case OBJETO_TIPO_DOFUS :
			case OBJETO_TIPO_TROFEO :
				if (pos == OBJETO_POS_DOFUS1 || pos == OBJETO_POS_DOFUS2 || pos == OBJETO_POS_DOFUS3 || pos == OBJETO_POS_DOFUS4
				|| pos == OBJETO_POS_DOFUS5 || pos == OBJETO_POS_DOFUS6) {
					return true;
				}
				break;
			case OBJETO_TIPO_ESCUDO :
				if (pos == OBJETO_POS_ESCUDO) {
					return true;
				}
				break;
			case OBJETO_TIPO_POCION :
			case OBJETO_TIPO_PERGAMINO_EXP :
			case OBJETO_TIPO_ALIMENTO_BOOST :
			case OBJETO_TIPO_PAN :
			case OBJETO_TIPO_CERVEZA :
			case OBJETO_TIPO_PEZ :
			case OBJETO_TIPO_GOLOSINA :
			case OBJETO_TIPO_PESCADO_COMESTIBLE :
			case OBJETO_TIPO_CARNE :
			case OBJETO_TIPO_CARNE_CONSERVADA :
			case OBJETO_TIPO_CARNE_COMESTIBLE :
			case OBJETO_TIPO_TINTE :
			case OBJETO_TIPO_DOMINIO :
			case OBJETO_TIPO_BEBIDA :
			case OBJETO_TIPO_PIEDRA_DE_ALMA_LLENA :
			case OBJETO_TIPO_PERGAMINO_BUSQUEDA :
			case OBJETO_TIPO_REGALOS :
			case OBJETO_TIPO_OBJETO_CRIA :
			case OBJETO_TIPO_OBJETO_UTILIZABLE :
			case OBJETO_TIPO_PRISMA :
			case OBJETO_TIPO_HADA_ARTIFICIAL :
			case OBJETO_TIPO_DONES :
			case OBJETO_TIPO_ALIMENTO_MASCOTA :
			case OBJETO_TIPO_PERGAMINO_HECHIZO :
				if (pos >= 35 && pos <= 48) {
					return true;
				}
				break;
			case OBJETO_TIPO_COMPA�ERO :
				if (pos == OBJETO_POS_COMPA�ERO) {
					return true;
				}
				break;
		}
		return false;
	}
	
	public static ArrayList<Trabajo> getTrabajosPorOficios(final int idOficio, final int nivel,
														   final StatOficio oficio) {
		final ArrayList<Trabajo> skills = new ArrayList<>();
		final int tiempoGanado = Math.min(nivel, 100) * 100;
		switch (idOficio) {
			case OFICIO_BASE -> {
				skills.add(new Trabajo(SKILL_PELAR_PATATAS, 1, 1, true, 30, 0, oficio));
				skills.add(new Trabajo(SKILL_UTILIZAR_BANCO, 1, 1, true, 30, 0, oficio));
				skills.add(new Trabajo(SKILL_MACHACAR_RECURSOS, 3, 3, true, 30, 0, oficio));
				skills.add(new Trabajo(SKILL_ROMPER_OBJETO, 7, 7, true, 30, 0, oficio));
			}
			case OFICIO_JOYERO -> {
				skills.add(new Trabajo(SKILL_CREAR_ANILLO, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_CREAR_AMULETO, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
			}
			case OFICIO_SASTRE -> {
				skills.add(new Trabajo(SKILL_CREAR_SOMBRERO, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_CREAR_CAPA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_CREAR_MOCHILA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
			}
			case OFICIO_ZAPATERO -> {
				skills.add(new Trabajo(SKILL_CREAR_BOTAS, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_CREAR_CINTURON, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
			}
			case OFICIO_MANITAS -> {
				skills.add(new Trabajo(SKILL_CREAR_CHAPUZA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_CREAR_LLAVE, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
			}
			case OFICIO_ESCULTOR_ARCOS -> {
				skills.add(new Trabajo(SKILL_CREAR_ARCO, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_REPARAR_ARCO, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_ESCULTOR_VARITAS -> {
				skills.add(new Trabajo(SKILL_CREAR_VARITA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_REPARAR_VARITA, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_ESCULTOR_BASTONES -> {
				skills.add(new Trabajo(SKILL_CREAR_BASTON, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_REPARAR_BASTON, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_FORJADOR_DAGAS -> {
				skills.add(new Trabajo(SKILL_CREAR_DAGA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_REPARAR_DAGA, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_FORJADOR_MARTILLOS -> {
				skills.add(new Trabajo(SKILL_CREAR_MARTILLO, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_REPARAR_MARTILLO, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_FORJADOR_ESPADAS -> {
				skills.add(new Trabajo(SKILL_CREAR_ESPADA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_REPARAR_ESPADA, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_FORJADOR_PALAS -> {
				skills.add(new Trabajo(SKILL_CREAR_PALA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_REPARAR_PALA, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_FORJADOR_HACHAS -> {
				skills.add(new Trabajo(SKILL_CREAR_HACHA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_REPARAR_HACHA, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_FORJADOR_ESCUDOS -> skills.add(new Trabajo(SKILL_CREAR_ESCUDO, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
					oficio));
			case OFICIO_ZAPATEROMAGO -> {
				skills.add(new Trabajo(SKILL_MAGUEAR_BOTAS, 3, 3, true, nivel, 0, oficio));
				skills.add(new Trabajo(SKILL_MAGUEAR_CINTURON, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_JOYEROMAGO -> {
				skills.add(new Trabajo(SKILL_MAGUEAR_AMULETO, 3, 3, true, nivel, 0, oficio));
				skills.add(new Trabajo(SKILL_MAGUEAR_ANILLO, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_SASTREMAGO -> {
				skills.add(new Trabajo(SKILL_MAGUEAR_SOMBRERO, 3, 3, true, nivel, 0, oficio));
				skills.add(new Trabajo(SKILL_MAGUEAR_CAPA, 3, 3, true, nivel, 0, oficio));
				skills.add(new Trabajo(SKILL_MAGUEAR_MOCHILA, 3, 3, true, nivel, 0, oficio));
			}
			case OFICIO_ESCULTORMAGO_BASTONES -> skills.add(new Trabajo(SKILL_MAGUEAR_BASTON, 3, 3, true, nivel, 0, oficio));
			case OFICIO_ESCULTORMAGO_VARITAS -> skills.add(new Trabajo(SKILL_MAGUEAR_VARITA, 3, 3, true, nivel, 0, oficio));
			case OFICIO_ESCULTORMAGO_ARCOS -> skills.add(new Trabajo(SKILL_MAGUEAR_ARCO, 3, 3, true, nivel, 0, oficio));
			case OFICIO_FORJAMAGO_HACHAS -> skills.add(new Trabajo(SKILL_MAGUEAR_HACHA, 3, 3, true, nivel, 0, oficio));
			case OFICIO_FORJAMAGO_DAGAS -> skills.add(new Trabajo(SKILL_MAGUEAR_DAGA, 3, 3, true, nivel, 0, oficio));
			case OFICIO_FORJAMAGO_ESPADAS -> skills.add(new Trabajo(SKILL_MAGUEAR_ESPADA, 3, 3, true, nivel, 0, oficio));
			case OFICIO_FORJAMAGO_MARTILLOS -> skills.add(new Trabajo(SKILL_MAGUEAR_MARTILLO, 3, 3, true, nivel, 0, oficio));
			case OFICIO_FORJAMAGO_PALAS -> skills.add(new Trabajo(SKILL_MAGUEAR_PALA, 3, 3, true, nivel, 0, oficio));
			case OFICIO_CAZADOR -> skills.add(new Trabajo(SKILL_PREPARAR_ENCIMERA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel),
					-1, oficio));
			case OFICIO_CARNICERO -> skills.add(new Trabajo(SKILL_PREPARAR_CARNE, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
					oficio));
			case OFICIO_PESCADOR -> {
				if (nivel >= 75) {
					skills.add(new Trabajo(SKILL_PESCAR_PESCADOS_GIGANTES_MAR, 0, 1, false, 12000 - tiempoGanado, 35, oficio));
				}
				if (nivel >= 70) {
					skills.add(new Trabajo(SKILL_PESCAR_PESCADOS_GIGANTES_RIO, 0, 1, false, 12000 - tiempoGanado, 35, oficio));
				}
				if (nivel >= 50) {
					skills.add(new Trabajo(SKILL_PESCAR_PECES_GORDOS_MAR, 0, 1, false, 12000 - tiempoGanado, 30, oficio));
				}
				if (nivel >= 40) {
					skills.add(new Trabajo(SKILL_PESCAR_PECES_GORDOS_RIO, 0, 1, false, 12000 - tiempoGanado, 25, oficio));
				}
				if (nivel >= 20) {
					skills.add(new Trabajo(SKILL_PESCAR_PESCADOS_MAR, 0, 1, false, 12000 - tiempoGanado, 20, oficio));
				}
				if (nivel >= 10) {
					skills.add(new Trabajo(SKILL_PESCAR_PESCADOS_RIO, 0, 1, false, 12000 - tiempoGanado, 15, oficio));
				}
				if (nivel >= 0) {
					skills.add(new Trabajo(SKILL_PESCAR_SOMBRA_EXTRA�A, 0, 1, false, 12000 - tiempoGanado, 50, oficio));
					skills.add(new Trabajo(SKILL_PESCAR_PESCADITOS_RIO, 0, 1, false, 12000 - tiempoGanado, 10, oficio));
					skills.add(new Trabajo(SKILL_PESCAR_PESCADITOS_MAR, 0, 1, false, 12000 - tiempoGanado, 10, oficio));
					skills.add(new Trabajo(SKILL_PESCAR_PISCHI, 0, 1, false, 12000 - tiempoGanado, 5, oficio));
				}
				skills.add(new Trabajo(SKILL_VACIAR_PESCADO, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
			}
			case OFICIO_PESCADERO -> skills.add(new Trabajo(SKILL_PREPARAR_PESCADO, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel),
					-1, oficio));
			case OFICIO_PANADERO -> {
				skills.add(new Trabajo(SKILL_HACER_PAN, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_HACER_CARAMELOS, 3, 3, true, 100, -1, oficio));
			}
			case OFICIO_MINERO -> {
				if (nivel >= 100) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_DOLOMIA, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 100) / 5), false, 12000 - tiempoGanado, 60, oficio));
				}
				if (nivel >= 80) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_ORO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 80) / 5), false, 12000 - tiempoGanado, 55, oficio));
				}
				if (nivel >= 70) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_BAUXITA, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 70) / 5), false, 12000 - tiempoGanado, 50, oficio));
				}
				if (nivel >= 60) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_PLATA, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 60) / 5), false, 12000 - tiempoGanado, 40, oficio));
				}
				if (nivel >= 50) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_ESTA�O, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 50) / 5), false, 12000 - tiempoGanado, 35, oficio));
					skills.add(new Trabajo(SKILL_RECOLECTAR_SILICATO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 50) / 5), false, 12000 - tiempoGanado, 35, oficio));
				}
				if (nivel >= 40) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_MANGANESO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 40) / 5), false, 12000 - tiempoGanado, 30, oficio));
				}
				if (nivel >= 30) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_KOBALTO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 30) / 5), false, 12000 - tiempoGanado, 25, oficio));
				}
				if (nivel >= 20) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_BRONCE, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 20) / 5), false, 12000 - tiempoGanado, 20, oficio));
				}
				if (nivel >= 10) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_COBRE, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 10) / 5), false, 12000 - tiempoGanado, 15, oficio));
				}
				if (nivel >= 0) {
					skills.add(new Trabajo(SKILL_RECOLECTAR_HIERRO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel) / 5), false, 12000 - tiempoGanado, 10, oficio));
				}
				skills.add(new Trabajo(SKILL_FUNDIR, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_PULIR, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
			}
			case OFICIO_ALQUIMISTA -> {
				if (nivel >= 50) {
					skills.add(new Trabajo(SKILL_COSECHAR_PANDOJA, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 50) / 5), false, 12000 - tiempoGanado, 35, oficio));
					skills.add(new Trabajo(SKILL_COSECHAR_EDELWEISS, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 50) / 5), false, 12000 - tiempoGanado, 35, oficio));
				}
				if (nivel >= 40) {
					skills.add(new Trabajo(SKILL_COSECHAR_ORQUIDEA, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 40) / 5), false, 12000 - tiempoGanado, 30, oficio));
				}
				if (nivel >= 30) {
					skills.add(new Trabajo(SKILL_COSECHAR_MENTA_SALVAJE, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 30) / 5), false, 12000 - tiempoGanado, 25, oficio));
				}
				if (nivel >= 20) {
					skills.add(new Trabajo(SKILL_COSECHAR_TREBOL, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 20) / 5), false, 12000 - tiempoGanado, 20, oficio));
				}
				if (nivel >= 10) {
					skills.add(new Trabajo(SKILL_COSECHAR_CA�AMO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 10) / 5), false, 12000 - tiempoGanado, 15, oficio));
				}
				if (nivel >= 0) {
					skills.add(new Trabajo(SKILL_COSECHAR_LINO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel)
							/ 5), false, 12000 - tiempoGanado, 10, oficio));
				}
				skills.add(new Trabajo(SKILL_CREAR_POCIMA, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
			}
			case OFICIO_LE�ADOR -> {
				if (nivel >= 100) {
					skills.add(new Trabajo(SKILL_TALAR_BAMBU_SAGRADO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 100) / 5), false, 12000 - tiempoGanado, 75, oficio));
				}
				if (nivel >= 90) {
					skills.add(new Trabajo(SKILL_TALAR_OLMO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 90) / 5), false, 12000 - tiempoGanado, 70, oficio));
				}
				if (nivel >= 80) {
					skills.add(new Trabajo(SKILL_TALAR_CARPE, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 80) / 5), false, 12000 - tiempoGanado, 65, oficio));
					skills.add(new Trabajo(SKILL_TALAR_BAMBU_OSCURO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 80) / 5), false, 12000 - tiempoGanado, 65, oficio));
				}
				if (nivel >= 70) {
					skills.add(new Trabajo(SKILL_TALAR_KALIPTO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 70) / 5), false, 12000 - tiempoGanado, 55, oficio));
					skills.add(new Trabajo(SKILL_TALAR_EBANO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 70) / 5), false, 12000 - tiempoGanado, 50, oficio));
				}
				if (nivel >= 60) {
					skills.add(new Trabajo(SKILL_TALAR_CEREZO_SILVESTRE, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 60) / 5), false, 12000 - tiempoGanado, 45, oficio));
				}
				if (nivel >= 50) {
					skills.add(new Trabajo(SKILL_TALAR_TEJO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 50) / 5), false, 12000 - tiempoGanado, 40, oficio));
					skills.add(new Trabajo(SKILL_TALAR_BAMBU, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 50) / 5), false, 12000 - tiempoGanado, 40, oficio));
				}
				if (nivel >= 40) {
					skills.add(new Trabajo(SKILL_TALAR_ARCE, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 40) / 5), false, 12000 - tiempoGanado, 35, oficio));
				}
				if (nivel >= 35) {
					skills.add(new Trabajo(SKILL_TALAR_BOMBU, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 35) / 5), false, 12000 - tiempoGanado, 30, oficio));
					skills.add(new Trabajo(SKILL_TALAR_OLIVIOLETA, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2
							+ ((nivel - 35) / 5), false, 12000 - tiempoGanado, 30, oficio));
				}
				if (nivel >= 30) {
					skills.add(new Trabajo(SKILL_TALAR_ROBLE, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 30) / 5), false, 12000 - tiempoGanado, 25, oficio));
				}
				if (nivel >= 20) {
					skills.add(new Trabajo(SKILL_TALAR_NOGAL, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 20) / 5), false, 12000 - tiempoGanado, 20, oficio));
				}
				if (nivel >= 10) {
					skills.add(new Trabajo(SKILL_TALAR_CASTA�O, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 10) / 5), false, 12000 - tiempoGanado, 15, oficio));
				}
				if (nivel >= 0) {
					skills.add(new Trabajo(SKILL_TALAR_FRESNO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel)
							/ 5), false, 12000 - tiempoGanado, 10, oficio));
				}
				skills.add(new Trabajo(SKILL_SERRAR, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
			}
			case OFICIO_CAMPESINO -> {
				if (nivel >= 70) {
					skills.add(new Trabajo(SKILL_SEGAR_CA�AMO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 70) / 5), false, 12000 - tiempoGanado, 45, oficio));
				}
				if (nivel >= 60) {
					skills.add(new Trabajo(SKILL_SEGAR_MALTA, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 60) / 5), false, 12000 - tiempoGanado, 40, oficio));
				}
				if (nivel >= 50) {
					skills.add(new Trabajo(SKILL_SEGAR_ARROZ, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 50) / 5), false, 12000 - tiempoGanado, 35, oficio));
					skills.add(new Trabajo(SKILL_SEGAR_CENTENO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 50) / 5), false, 12000 - tiempoGanado, 35, oficio));
				}
				if (nivel >= 40) {
					skills.add(new Trabajo(SKILL_SEGAR_LINO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 40) / 5), false, 12000 - tiempoGanado, 30, oficio));
				}
				if (nivel >= 30) {
					skills.add(new Trabajo(SKILL_SEGAR_LUPULO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 30) / 5), false, 12000 - tiempoGanado, 25, oficio));
				}
				if (nivel >= 20) {
					skills.add(new Trabajo(SKILL_SEGAR_AVENA, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 20) / 5), false, 12000 - tiempoGanado, 20, oficio));
				}
				if (nivel >= 10) {
					skills.add(new Trabajo(SKILL_SEGAR_CEBADA, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel
							- 10) / 5), false, 12000 - tiempoGanado, 15, oficio));
				}
				if (nivel >= 0) {
					skills.add(new Trabajo(SKILL_SEGAR_TRIGO, (nivel >= 100 ? 5 : 0) + 1, (nivel >= 100 ? 5 : 0) + 2 + ((nivel)
							/ 5), false, 12000 - tiempoGanado, 10, oficio));
				}
				skills.add(new Trabajo(SKILL_MOLER, 2, getIngMaxPorNivel(nivel), true, getSuerteMaxPorNivel(nivel), -1,
						oficio));
				skills.add(new Trabajo(SKILL_DESGRANAR, 1, 1, true, 100, -1, oficio));
			}
		}
		return skills;
	}
	
	public static byte getIngMaxPorNivel(final int nivel) {
		if (nivel < 10) {
			return 2;
		}
		if (nivel >= MainServidor.NIVEL_MAX_OFICIO) {
			return 9;
		}
		return (byte) ((nivel / 20) + 3);
	}
	
	public static int getSuerteMaxPorNivel(final int nivel) {
		if (nivel < 10) {
			return 50;
		}
		if (nivel >= MainServidor.NIVEL_MAX_OFICIO) {
			return 100;
		}
		return 55 + (int) (nivel / 10F - 1) * 5;
	}
	
	public static int getSuerteNivelYSlots(final int nivel, final int slots) {
		if (nivel < 10) {
			return 50;
		} // 54 + 45 = 99 *
		return (int) Math.min(100, (getSuerteMaxPorNivel(nivel) * (getIngMaxPorNivel(nivel) / (float) slots)));
	}
	
	public static int calculXpGanadaEnOficio(final int nivel, final int nroCasillas) {
		if (nivel == MainServidor.NIVEL_MAX_OFICIO) {
			return 0;
		}
		switch (nroCasillas) {
			case 1 :
				return 3;
			case 2 :
				return 10;
			case 3 :
				if (nivel > 9) {
					return 25;
				}
				return 0;
			case 4 :
				if (nivel > 19) {
					return 50;
				}
				return 0;
			case 5 :
				if (nivel > 39) {
					return 100;
				}
				return 0;
			case 6 :
				if (nivel > 59) {
					return 250;
				}
				return 0;
			case 7 :
				if (nivel > 79) {
					return 500;
				}
				return 0;
			case 8 :
				if (nivel > 99) {
					return 1000;
				}
				return 0;
		}
		return 0;
	}
	
	public static int getCarnePorMob(int mob, int nivel) {
		int carne = -1;
		int azar = Formulas.getRandomInt(1, 100);
		if (nivel >= 1) {
			switch (mob) {
// moskito miedoso
				case 61, 974 -> {
					if (azar <= 60)
						carne = 1915;// Carne de insecto
					return carne;
				}
			}
			switch (mob) {
// larva zafiro
				case 31, 412 -> {
					if (azar <= 50)
						carne = 1898;// Carne de larva
					return carne;
				}
			}
			switch (mob) {
// Tofuzmo
				case 98, 473, 803, 808, 796, 1012, 382, 806, 2357, 804, 807 -> {
					if (azar <= 70)
						carne = 1896;// Carne de p�jaro
					return carne;
				}
			}
		}
		if (nivel >= 10) {
			switch (mob) {
// Larva Verde
				case 414, 34 -> {
					if (azar <= 55)
						carne = 1899; // Carne de larva **
					return carne;
				}
			}
			switch (mob) {
// Larva Rub�
				case 456, 46, 976, 413 -> {
					if (azar <= 50)
						carne = 1900; // Carne de larva ***
					return carne;
				}
			}
			switch (mob) {
// Jalat�n Negro
				case 134, 149 -> {
					if (azar <= 50)
						carne = 1911; // Muslo de jalat�n
					return carne;
				}
			}
		}
		if (nivel >= 20) {
			if (mob == 101) {// Jalat�n Blanco
				if (azar <= 48)
					carne = 1912; // Muslo de jalat� **
				return carne;
			}
			switch (mob) {
// Pekewabbit Hambriento
				case 96, 72 -> {
					if (azar <= 48)
						carne = 1902; // Muslo de wabbit
					return carne;
				}
			}
		}
		if (nivel >= 30) {
			if (mob == 289) {// Maestro Cuerbok
				if (azar <= 10)
					carne = 1933; // Carne de p�jaro ****
				return carne;
			}
			if (mob == 159) {// Minilubo
				if (azar <= 45)
					carne = 1927; // Hocico
				return carne;
			}
			switch (mob) {
// Jabal�
				case 104, 2769 -> {
					if (azar <= 45)
						carne = 1917; // Solomillo de cerdo
					return carne;
				}
			}
		}
		if (nivel >= 40) {
			switch (mob) {
// Kwak de Viento
				case 84, 83, 235, 81 -> {
					if (azar <= 45)
						carne = 1897; // Carne de p�jaro **
					return carne;
				}
			}
			if (mob == 171) {// Dragopavo Almendrado Salvaje
				if (azar <= 40)
					carne = 1922; // DragoCarne
				return carne;
			}
			if (mob == 148) {// Jefe de Guerra Jalat�
				if (azar <= 40)
					carne = 1913; // Muslo de jalat� ***
				return carne;
			}
			switch (mob) {
// Wabbit
				case 68, 64 -> {
					if (azar <= 40)
						carne = 1903; // Muslo de wabbit **
					return carne;
				}
			}
		}
		if (nivel >= 50) {
			switch (mob) {
// Escarahoja Verde
				case 198, 241, 194, 240 -> {
					if (azar <= 30)
						carne = 1916;// Carne de insecto **
					return carne;
				}
			}
			if (mob == 102) {// Mediulubo
				if (azar <= 35)
					carne = 1929;// Hocico **
				return carne;
			}
			if (mob == 147) {// Jalat� Real
				if (azar <= 30)
					carne = 1914; // Muslo de jalat� ****
				return carne;
			}
			if (mob == 297) {// Jabal� de las llanuras
				if (azar <= 30)
					carne = 1918; // Solomillo de cerdo **
				return carne;
			}
		}
		if (nivel >= 60) {
			switch (mob) {
// Sepulturero Koalak
				case 749, 759, 752, 785, 753, 751, 748, 754, 756, 744, 758, 755, 760, 761 -> {
					if (azar <= 25)
						carne = 8499;// Carne de koalak
					return carne;
				}
			}
			if (mob == 200) {// Dragopavo Pelirrojo Salvaje
				if (azar <= 30)
					carne = 1923;// DragoCarne **
				return carne;
			}
			switch (mob) {
// Wabbit Wodo
				case 99, 97 -> {
					if (azar <= 30)
						carne = 1905;// Muslo de wabbit ***
					return carne;
				}
			}
			if (mob == 123) {// Cochinillo
				if (azar <= 30)
					carne = 1921;// Solomillo de cerdo ***
				return carne;
			}
		}
		if (nivel >= 70) {
			switch (mob) {
// Jefe Cocodrail
				case 261, 263 -> {
					if (azar <= 15)
						carne = 8500; // Carne de crocodail
					return carne;
				}
			}
			switch (mob) {
// Dragohuevo Volador
				case 76, 93, 90, 88, 95, 170, 87, 94, 75, 853, 89, 91, 82, 862 -> {
					if (azar <= 10)
						carne = 1924;// Dragocarne ***
					return carne;
				}
			}
			if (mob == 232) {// Maxilubo
				if (azar <= 10)
					carne = 1930;// Hocico ***
				return carne;
			}
		}
		if (nivel >= 80) {
			if (mob == 287) {// Kanugro
				if (azar <= 5)
					carne = 8498; // Carne de kanugro
				return carne;
			}
			if (mob == 854) {// Crocabulia
				if (azar <= 2)
					carne = 1926; // Dragocarne ****
				return carne;
			}
			switch (mob) {
// Wey Wabbit
				case 180, 1015 -> {
					if (azar <= 2)
						carne = 1901; // Muslo de wabbit ****
					return carne;
				}
			}
			if (mob == 113) {// Dragocerdo
				if (azar <= 2)
					carne = 1919; // Solomillo de cerdo****
				return carne;
			}
		}
		return carne;
	}
	
	public static String getZonaEfectoArma(int tipo) {
		return switch (tipo) {
			case OBJETO_TIPO_MARTILLO -> "Xb";
			case OBJETO_TIPO_BASTON -> "Tb";
			case OBJETO_TIPO_BALLESTA -> "Lc";
			case OBJETO_TIPO_HACHA, OBJETO_TIPO_HERRAMIENTA, OBJETO_TIPO_PICO, OBJETO_TIPO_GUADA�A, OBJETO_TIPO_ARCO, OBJETO_TIPO_VARITA, OBJETO_TIPO_DAGAS, OBJETO_TIPO_ESPADA, OBJETO_TIPO_PALA, OBJETO_TIPO_ARMA_MAGICA -> "Pa";
			default -> "Pa";
		};
	}
	
	public static boolean esTrabajo(final int trabajoID) {
		for (final int[] element : TRABAJOS_Y_DROPS) {
			if (element[0] == trabajoID) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean getTipoObjPermitidoEnTrabajo(final int trabajoID, final int tipo) {
		try {
			for (final int[] element : TRABAJOS_Y_DROPS) {
				if (element[0] == trabajoID) {
					if (element.length == 1) {
						return true;
					}
					for (int i : element) {
						if (i == tipo) {
							return true;
						}
					}
					return false;
				}
			}
		} catch (final Exception ignored) {}
		return false;
	}
	
	public static int getObjetoPorRecurso(final int recurso, final boolean especial) {
		try {
			final ArrayList<ArrayList<Integer>> obj = new ArrayList<>();
			for (final int[] element : TRABAJOS_Y_DROPS) {
				if (element[0] == recurso) {
					if (element.length == 1) {
						continue;
					}
					final ArrayList<Integer> x = new ArrayList<>();
					x.add(element[1]);
					if (element.length > 2) {
						x.add(element[2]);
					}
					obj.add(x);
				}
			}
			if (obj.isEmpty()) {
				return -1;
			} else if (obj.size() == 1) {
				return obj.get(0).size() > 1 && especial ? obj.get(0).get(1) : obj.get(0).get(0);
			} else if (obj.size() >= 2) {
				ArrayList<Integer> z = new ArrayList<>();
				z = obj.get(Formulas.getRandomInt(0, obj.size() - 1));
				return z.size() > 1 && especial ? z.get(1) : z.get(0);
			}
		} catch (final Exception e) {
			MainServidor.redactarLogServidorln("EXCEPTION getObjetoPorRecurso " + e.toString());
			e.printStackTrace();
		}
		return -1;
	}
	
	// public static final int getSuertePorNroCasillaYNivel(final int nivel, final int nroCasilla) {
	// if (nroCasilla <= getIngMaxPorNivel(nivel) - 2) {
	// return 100;
	// }
	// return getSuerteNivelYSlots(nivel, nroCasilla);
	// }
	public static boolean esOficioMago(final int id) {
		return switch (id) {
// 64;
// 63;
// 62;
// 50;
// 49;
// 48;
// 47;
// 46;
// 45;
// 44;
// 43;
			case OFICIO_FORJAMAGO_DAGAS, OFICIO_FORJAMAGO_ESPADAS, OFICIO_FORJAMAGO_MARTILLOS, OFICIO_FORJAMAGO_PALAS, OFICIO_FORJAMAGO_HACHAS, OFICIO_ESCULTORMAGO_ARCOS, OFICIO_ESCULTORMAGO_VARITAS, OFICIO_ESCULTORMAGO_BASTONES, OFICIO_ZAPATEROMAGO, OFICIO_JOYEROMAGO, OFICIO_SASTREMAGO -> true;
			default -> false;
		};
	}
	
	public static boolean esSkillMago(final int id) {
		return switch (id) {
			case SKILL_MAGUEAR_AMULETO, SKILL_MAGUEAR_ANILLO, SKILL_MAGUEAR_ARCO, SKILL_MAGUEAR_BASTON, SKILL_MAGUEAR_BOTAS, SKILL_MAGUEAR_CAPA, SKILL_MAGUEAR_CINTURON, SKILL_MAGUEAR_DAGA, SKILL_MAGUEAR_ESPADA, SKILL_MAGUEAR_HACHA, SKILL_MAGUEAR_MARTILLO, SKILL_MAGUEAR_MOCHILA, SKILL_MAGUEAR_PALA, SKILL_MAGUEAR_SOMBRERO, SKILL_MAGUEAR_VARITA -> true;
			default -> false;
		};
	}
	
	public static int getColorMonturaPorMob(final int mob) {
		return switch (mob) {
// dorado
			case 666 -> 74;
// almendrado
			case 171 -> 1;
// pelirrojo
			case 200 -> 6;
			default -> -1;
		};
	}
	
	public static int getColorCria(int color1, int color2, final boolean gen1, final boolean gen2) {
		int A = 0;
		int B = 0;
		int colorNuevaCria = 0;
		switch (color1) {
// almendrado
			case 1 -> color1 = 20;
// pelirrojo
			case 6 -> color1 = 10;
// dorado
			case 74 -> color1 = 18;
		}
		switch (color2) {
// almendrado
			case 1 -> color2 = 20;
// pelirrojo
			case 6 -> color2 = 10;
// dorado
			case 74 -> color2 = 18;
		}
		if (color1 == 75 || color1 >= 88) {
			color1 = 10;
		}
		if (color2 == 75 || color1 >= 88) {
			color2 = 10;
		}
		if (color1 > color2) {
			A = color2;// menor
			B = color1;// mayor
		} else if (color1 <= color2) {
			A = color1;// menor
			B = color2;// mayor
		}
		if (A == 10 && B == 18) {
			colorNuevaCria = 46; // pelirrojo y dorado
		} else if (A == 10 && B == 20) {
			colorNuevaCria = 38; // pelirrojo y almendrado
		} else if (A == 18 && B == 20) {
			colorNuevaCria = 33; // dorado y almendrado
		} else if (A == 33 && B == 38) {
			colorNuevaCria = 17; // indigo
		} else if (A == 33 && B == 46) {
			colorNuevaCria = 3;// ebano
		} else if (A == 10 && B == 17) {
			colorNuevaCria = 62; // pelirrojo e indigo
		} else if (A == 10 && B == 3) {
			colorNuevaCria = 12; // ebano y pelirrojo
		} else if (A == 17 && B == 20) {
			colorNuevaCria = 36; // almendrado - indigo
		} else if (A == 3 && B == 20) {
			colorNuevaCria = 34; // almendrado - ebano
		} else if (A == 17 && B == 18) {
			colorNuevaCria = 44; // dorado - indigo
		} else if (A == 3 && B == 18) {
			colorNuevaCria = 42; // dorado - ebano
		} else if (A == 3 && B == 17) {
			colorNuevaCria = 51; // ebano - indigo
		} else if (A == 38 && B == 51) {
			colorNuevaCria = 19; // purpura
		} else if (A == 46 && B == 51) {
			colorNuevaCria = 22; // orquideo
		} else if (A == 10 && B == 19) {
			colorNuevaCria = 71; // purpura - pelirrojo
		} else if (A == 10 && B == 22) {
			colorNuevaCria = 70; // orquideo - pelirrojo
		} else if (A == 19 && B == 20) {
			colorNuevaCria = 41; // almendrado - purpura
		} else if (A == 20 && B == 22) {
			colorNuevaCria = 40; // almendrado - orquideo
		} else if (A == 18 && B == 19) {
			colorNuevaCria = 49; // dorado - purpura
		} else if (A == 18 && B == 22) {
			colorNuevaCria = 48; // dorado - orquideo
		} else if (A == 17 && B == 19) {
			colorNuevaCria = 65; // indigo - purpura
		} else if (A == 17 && B == 22) {
			colorNuevaCria = 64; // indigo - orquideo
		} else if (A == 3 && B == 19) {
			colorNuevaCria = 54; // ebano - purpura
		} else if (A == 3 && B == 22) {
			colorNuevaCria = 53; // ebano - orquideo
		} else if (A == 19 && B == 22) {
			colorNuevaCria = 76; // orquideo - purpura
		} else if (A == 53 && B == 76) {
			colorNuevaCria = 15; // turquesa
		} else if (A == 65 && B == 76) {
			colorNuevaCria = 16; // marfil
		} else if (A == 10 && B == 16) {
			colorNuevaCria = 11; // marfil - pelirrojo
		} else if (A == 10 && B == 15) {
			colorNuevaCria = 69; // turquesa - pelirrojo
		} else if (A == 16 && B == 20) {
			colorNuevaCria = 37; // almendrado - marfil
		} else if (A == 15 && B == 20) {
			colorNuevaCria = 39; // almendrado - turquesa
		} else if (A == 16 && B == 18) {
			colorNuevaCria = 45; // dorado - marfil
		} else if (A == 15 && B == 18) {
			colorNuevaCria = 47; // dorado - turquesa
		} else if (A == 16 && B == 17) {
			colorNuevaCria = 61; // indigo - marfil
		} else if (A == 15 && B == 17) {
			colorNuevaCria = 63; // indigo - turquesa
		} else if (A == 3 && B == 16) {
			colorNuevaCria = 9; // ebano - marfil
		} else if (A == 3 && B == 15) {
			colorNuevaCria = 52; // ebano - turquesa
		} else if (A == 16 && B == 19) {
			colorNuevaCria = 68; // marfil - purpura
		} else if (A == 15 && B == 19) {
			colorNuevaCria = 73; // turquesa - purpura
		} else if (A == 16 && B == 22) {
			colorNuevaCria = 67; // marfil - orquideo
		} else if (A == 15 && B == 22) {
			colorNuevaCria = 72; // orquideo - turquesa
		} else if (A == 15 && B == 16) {
			colorNuevaCria = 66; // marfil - turquesa
		} else if (A == 66 && B == 68) {
			colorNuevaCria = 21; // esmeralda
		} else if (A == 66 && B == 72) {
			colorNuevaCria = 23; // ciruela
		} else if (A == 10 && B == 21) {
			colorNuevaCria = 57;// esmeralda - pelirrojo
		} else if (A == 20 && B == 21) {
			colorNuevaCria = 35; // almendrado - esmeralda
		} else if (A == 18 && B == 21) {
			colorNuevaCria = 43; // dorado - esmeralda
		} else if (A == 3 && B == 21) {
			colorNuevaCria = 50; // �bano - esmeralda
		} else if (A == 17 && B == 21) {
			colorNuevaCria = 55; // esmeralda e �ndigo
		} else if (A == 16 && B == 21) {
			colorNuevaCria = 56; // esmeralda - marfil
		} else if (A == 15 && B == 21) {
			colorNuevaCria = 58; // esmeralda - turquesa
		} else if (A == 21 && B == 22) {
			colorNuevaCria = 59; // esmeralda - orqu�deo
		} else if (A == 19 && B == 21) {
			colorNuevaCria = 60; // esmeralda - p�rpura
		} else if (A == 20 && B == 23) {
			colorNuevaCria = 77; // ciruela - almendrado
		} else if (A == 18 && B == 23) {
			colorNuevaCria = 78; // ciruela - dorado
		} else if (A == 3 && B == 23) {
			colorNuevaCria = 79; // ciruela - �bano
		} else if (A == 21 && B == 23) {
			colorNuevaCria = 80; // ciruela - esmeralda
		} else if (A == 17 && B == 23) {
			colorNuevaCria = 82; // ciruela - �ndigo
		} else if (A == 16 && B == 23) {
			colorNuevaCria = 83; // ciruela - marfil
		} else if (A == 10 && B == 23) {
			colorNuevaCria = 84; // ciruela - pelirrojo
		} else if (A == 15 && B == 23) {
			colorNuevaCria = 85; // ciruela - turquesa
		} else if (A == 22 && B == 23) {
			colorNuevaCria = 86; // ciruela - orqu�deo
		} else if (A == 19 && B == 23) {
			colorNuevaCria = 87; // ciruela - purpura
		}
		final ArrayList<Integer> posibles = new ArrayList<>();
		posibles.add(10);
		posibles.add(18);
		posibles.add(20);
		posibles.add(A);
		posibles.add(B);
		if (gen1) {
			posibles.add(color1);
			posibles.add(color1);
		}
		if (gen2) {
			posibles.add(color2);
			posibles.add(color2);
		}
		MonturaModelo montura = Mundo.getMonturaModelo(colorNuevaCria);
		if (colorNuevaCria > 0) {
			for (int j = 11; j > montura.getGeneracionID(); j--) {
				posibles.add(colorNuevaCria);
			}
		}
		return posibles.get(Formulas.getRandomInt(0, posibles.size() - 1));
	}
	
	public static int getColorMonturaPorCertificado(final int certificado) {
		for (MonturaModelo montura : Mundo.MONTURAS_MODELOS.values()) {
			if (montura.getCertificadoModeloID() == certificado)
				return montura.getColorID();
		}
		return -1;
	}
	
	public static byte getIDTituloOficio(final int oficio) {
		return switch (oficio) {
// Forjamago de dagas primordial
			case OFICIO_FORJAMAGO_DAGAS -> (byte)40;
// Forjamago de espadas primordial
			case OFICIO_FORJAMAGO_ESPADAS -> (byte)41;
// Forjamago de martillos primordial
			case OFICIO_FORJAMAGO_MARTILLOS -> (byte)42;
// Forjamago de palas primordial
			case OFICIO_FORJAMAGO_PALAS -> (byte)43;
// Forjamago de hachas primordial
			case OFICIO_FORJAMAGO_HACHAS -> (byte)44;
// escultormago de arcos primordial
			case OFICIO_ESCULTORMAGO_ARCOS -> (byte)45;
// escultormago de varitas primordial
			case OFICIO_ESCULTORMAGO_VARITAS -> (byte)46;
// escultormago de bastones primordial
			case OFICIO_ESCULTORMAGO_BASTONES -> (byte)47;
// Zapateromago primordial
			case OFICIO_ZAPATEROMAGO -> (byte)51;
// Joyeromago primordial
			case OFICIO_JOYEROMAGO -> (byte)52;
// Sastremago primordial
			case OFICIO_SASTREMAGO -> (byte)53;
			case OFICIO_LE�ADOR -> (byte)22;
			case OFICIO_FORJADOR_ESPADAS -> (byte)23;
			case OFICIO_ESCULTOR_ARCOS -> (byte)24;
			case OFICIO_FORJADOR_MARTILLOS -> (byte)25;
			case OFICIO_ZAPATERO -> (byte)26;
			case OFICIO_JOYERO -> (byte)27;
			case OFICIO_FORJADOR_DAGAS -> (byte)28;
			case OFICIO_ESCULTOR_BASTONES -> (byte)29;
			case OFICIO_ESCULTOR_VARITAS -> (byte)30;
			case OFICIO_FORJADOR_PALAS -> (byte)31;
			case OFICIO_MINERO -> (byte)32;
			case OFICIO_PANADERO -> (byte)33;
			case OFICIO_ALQUIMISTA -> (byte)34;
			case OFICIO_SASTRE -> (byte)35;
			case OFICIO_CAMPESINO -> (byte)36;
			case OFICIO_FORJADOR_HACHAS -> (byte)37;
			case OFICIO_PESCADOR -> (byte)38;
			case OFICIO_CAZADOR -> (byte)39;
			case OFICIO_CARNICERO -> (byte)48;
			case OFICIO_PESCADERO -> (byte)49;
			case OFICIO_MANITAS -> (byte)54;
			case OFICIO_FORJADOR_ESCUDOS -> (byte)50;
			default -> (byte)0;
		};
	}
	
	public static boolean esAlimentoMontura(final short tipo) {
		for (final short t : MainServidor.TIPO_ALIMENTO_MONTURA) {
			if (tipo == t) {
				return true;
			}
		}
		return false;
	}
	
	public static Reto getReto(final byte reto, final Pelea pelea) {
		int bonusXPGrupo = 0, bonusXPFijo = 0;
		// empezaste, hasta que acabe el combate.
		// personaje s�lo debe utilizar la misma acci�n una �nica vez.
		// una vez la misma acci�n.
		// tus PM disponibles en cada turno.
		// este combate.
		// nivel.
		// solamente hechizos.
		// disponible. V�lido durante todo el combate.
		// dure el combate.
		// da�os
		// directos durante lo que dure el combate. Se
		// puede utilizar trampas, glifos, venenos,
		// da�os
		// ocasionados por desplazamiento as� como los
		// ataques de invocaciones.
		// el combate.
		// combate.
		// tiempo que dure el combate.
		// durante el tiempo que dure el combate.
		// a cuerpo durante el tiempo que dure el combate.
		// descendiente de nivel.
		// dejar que los de sexo femenino acaben con
		// los adversarios. V�lido durante todo el
		// combate.
		// dejar que los de sexo masculino acaben
		// con los adversarios. V�lido durante todo
		// el combate.
		// con los adversarios.
		// matarlo antes de atacar a otro adversario.
		// muera.
		// objetivo que se designa en cada turno de un personaje.
		// indicado. Cada vez que mates a un objetivo, obtendr�s el nombre del pr�ximo al que tienes
		// que matar
		// uno de tus adversarios.
		// de uno de tus aliados.
		// antes de que comience su turno.
		// adyacente a la de uno de tus aliados.
		// adyacente a la de uno de tus adversarios.
		// tu turno.
		// tiene que matar obligatoriamente a un (y s�lo a un) segundo adversario durante su turno.
		// (que no sea una invocaci�n) durante el combate.
		// personaje debe atacar a ese mismo adversario durante el tiempo que dure el combate.
		// a un adversario durante el combate. Cuando un personaje ataca a un adversario, ning�n
		// otro personaje puede atacar a ese mismo adversario durante el combate.
		// dispones de 3 turnos para rematar a tu aliado o �ganar el combate!
		// de menor nivel tiene que matar a todos los adversarios (as� aprender�s a querer abusar
		// como un puerkazo).
		// secundarios deben acabar vivos el combate.
		// ganar el desaf�o. Ya se sabe, los desarrolladores del juego son unos tramposos...
		// pueda
		switch (reto) {
// 1;// Utiliza s�lo un punto de movimiento en cada turno.
			case RETO_ZOMBI -> {
				bonusXPFijo = 30;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 4f) * 10);
			}
// 2;// Acaba tu turno en la misma casilla donde lo
			case RETO_ESTATUA -> {
				bonusXPFijo = 25;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 3f) * 10);
			}
// 3;// Matar %1 el primero.
			case RETO_ELEGIDO_VOLUNTARIO -> {
				bonusXPFijo = 30;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 3f) * 10);
			}
// 4;// Matar %1 el �ltimo.
			case RETO_APLAZAMIENTO -> {
				bonusXPFijo = 20;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 1.5f) * 5);
			}
// 5;// Durante el tiempo que dure el combate, cada
			case RETO_AHORRADOR -> {
				bonusXPFijo = 160;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 1.5f) * 10);
			}
// 6;// Durante su turno, cada jugador s�lo puede utilizar
			case RETO_VERSATIL -> {
				bonusXPFijo = 50;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 1.5f) * 5);
			}
// 8;// Durante el tiempo que dure el combate, utiliza todos
			case RETO_NOMADA -> {
				bonusXPFijo = 20;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 1.5f) * 5);
			}
// 9;// No utilices ning�n hechizo durante el tiempo que dure
			case RETO_BARBARO -> {
				bonusXPFijo = 60;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 3f) * 5);
			}
// 10;// Debes matar a los adversarios en orden creciente de
			case RETO_CRUEL -> {
				bonusXPFijo = 40;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 2f) * 10);
			}
// 11;// Durante el tiempo que dure el combate, utiliza
			case RETO_MISTICO -> {
				bonusXPFijo = 40;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 2f) * 5);
			}
// 16;// Invocar una Llamita cada vez que el hechizo est�
			case RETO_ENTOMOLOGO -> {
				bonusXPFijo = 25;
				for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
					if (luchador.getPersonaje().tieneHechizoID(311)) {
						bonusXPGrupo += 5;
					}
				}
			}
// 17;// No perder puntos de vida durante el tiempo que
			case RETO_INTOCABLE -> {
				bonusXPFijo = 40;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 1.5f) * 10);
			}
// 18;// No curar durante el tiempo que dure el combate.
			case RETO_INCURABLE -> {
				bonusXPFijo = 20;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 2f) * 5);
			}
// 19;// Acabar con los monstruos sin ocasionarles
			case RETO_MANOS_LIMPIAS -> {
				bonusXPFijo = 25;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2)) * 5);
			}
// 20;// Utiliza el mismo elemento de ataque durante todo
			case RETO_ELEMENTAL -> {
				bonusXPFijo = 30;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 2f) * 5);
			}
// 21;// No quitar PM a los adversarios mientras dure el
			case RETO_CIRCULEN -> bonusXPFijo = 20;
// 22;// No quitar PA a los adversarios durante el
			case RETO_EL_TIEMPO_PASA -> bonusXPFijo = 30;
// 23;// No reducir el alcance de los adversarios
			case RETO_PERDIDO_DE_VISTA -> bonusXPFijo = 15;
// 24;// Utilizar el mismo hechizo o el mismo ataque cuerpo
			case RETO_LIMITADO -> {
				bonusXPFijo = 50;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 1.5f) * 5);
			}
// 25;// Se debe acabar con los adversarios en orden
			case RETO_ORDENADO -> {
				bonusXPFijo = 40;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 2f) * 5);
			}
// 29;// Los personajes de sexo femenino deben
			case RETO_NI_PIAS_NI_SUMISAS, RETO_NI_PIOS_NI_SUMISOS -> bonusXPFijo = 35;
// 30;// El personaje de menor nivel debe acabar
			case RETO_LOS_PEQUE�OS_ANTES -> bonusXPFijo = 40;
// 31;// Cuando se ataca a un adversario, hay que
			case RETO_FOCALIZACION -> {
				bonusXPFijo = 30;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 2f) * 5);
			}
// 32;// Todos los ataques deben ir dirigidos a %1 hasta que
			case RETO_ELITISTA -> {
				bonusXPFijo = 50;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 3f) * 5);
			}
// 33;// Ning�n aliado debe morir.
			case RETO_SUPERVIVIENTE -> bonusXPFijo = 30;
// 34;// Todos los ataques deben ir dirigidos a un mismo
			case RETO_IMPREVISIBLE -> {
				bonusXPFijo = 50;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 2f) * 5);
			}
// 35;// Debes matar a los adversarios en el orden
			case RETO_ASESINO_A_SUELDO -> {
				bonusXPFijo = 45;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 3f) * 10);
			}
// 36;// Acaba tu turno en una de las casillas pegadas a las de
			case RETO_AUDAZ -> bonusXPFijo = 25;
// 37;// Acaba tu turno en una de las casillas pegadas a las
			case RETO_PEGAJOSO -> bonusXPFijo = 40;
// 38;// Cuando se ataca a un adversario, hay que matarlo
			case RETO_BLITZKRIEG -> {
				bonusXPFijo = 80;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 0.8f) * 5);
			}
// 39;// No termines nunca tu turno en una casilla
			case RETO_ANACORETA -> {
				bonusXPFijo = 20;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 4f) * 5);
			}
// 40;// No termines nunca tu turno en una casilla
			case RETO_PUSILANIME -> bonusXPFijo = 30;
// 41;// Utiliza todos tus puntos de acci�n antes de acabar
			case RETO_IMPETUOSO -> bonusXPFijo = 10;
// 42;// Cuando un personaje mata a un adversario,
			case RETO_EL_DOS_POR_UNO -> {
				bonusXPFijo = 60;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 1.5f) * 5);
			}
// 43;// Nadie puede recibir curas durante su turno.
			case RETO_ABNEGACION -> {
				bonusXPFijo = 20;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(1) / 2f) * 5);
			}
// 44;// Cada personaje debe matar al menos a un adversario
			case RETO_REPARTO -> bonusXPFijo = 50;
// 45;// Cuando un personaje ataca a un adversario, ning�n otro
			case RETO_DUELO -> bonusXPFijo = 40;
// 46;// Cada personaje debe matar al menos
			case RETO_CADA_UNO_CON_SU_MONSTRUO -> {
				bonusXPFijo = 60;
				bonusXPGrupo = (int) (Math.ceil(pelea.cantLuchDeEquipo(2) / 1.5f) * 5);
			}
// 47;// Cuando un aliado pierde puntos de vida,
			case RETO_CONTAMINACION -> bonusXPFijo = 60;
// 48;// El personaje secundario
			case RETO_LOS_PERSONAJES_SECUNDARIOS_PRIMERO -> {
				bonusXPFijo = 10;
				bonusXPGrupo = (pelea.cantLuchDeEquipo(1) / 2) * 15;
			}
// 49;// Aliados y personajes
			case RETO_PROTEJAN_A_SUS_PERSONAJES_SECUNDARIOS -> {
				bonusXPFijo = 20;
				bonusXPGrupo = (pelea.cantLuchDeEquipo(1) / 2) * 15;
			}
// 50;// Acaba el combate, para
			case RETO_LA_TRAMPA_DE_LOS_DESARROLLADORES -> bonusXPFijo = 1;
// jardinero, durante el combate, plantar una zanahowia cada vez q se
			case RETO_JARDINERO -> {
				bonusXPFijo = 25;
				for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
					if (luchador.getPersonaje().tieneHechizoID(367)) {
						bonusXPGrupo += 5;
					}
				}
			}
// sepultero, invoca un chaferloko cada vez q se pueda
			case RETO_SEPULTURERO -> {
				bonusXPFijo = 30;
				for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
					if (luchador.getPersonaje().tieneHechizoID(373)) {
						bonusXPGrupo += 5;
					}
				}
			}
// casino real, lanzar el hechizo ruleta cada vez q se pueda
			case RETO_CASINO_REAL -> {
				bonusXPFijo = 30;
				for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
					if (luchador.getPersonaje().tieneHechizoID(101)) {
						bonusXPGrupo += 5;
					}
				}
			}
// aracnofilo, invocar una ara�a cada vez q se pueda
			case RETO_ARACNOFILO -> {
				bonusXPFijo = 10;
				for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
					if (luchador.getPersonaje().tieneHechizoID(370)) {
						bonusXPGrupo += 5;
					}
				}
			}
		}
		return new Reto(reto, bonusXPFijo, bonusXPGrupo, bonusXPFijo, bonusXPGrupo, pelea);
	}
	
	public static boolean esRetoPosible1(final int reto, final Pelea pelea) {
		try {
			switch (reto) {
				// retos q no se deben usar
				case RETO_LOS_PERSONAJES_SECUNDARIOS_PRIMERO :
				case RETO_PROTEJAN_A_SUS_PERSONAJES_SECUNDARIOS :
					return false;
				case RETO_JARDINERO :// jardinero, durante el combate, plantar una zanahowia cada vez q se
															// pueda
					for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
						if (luchador.getPersonaje().tieneHechizoID(367)) {
							return true;
						}
					}
					return false;
				case RETO_SEPULTURERO :// sepultero, invoca un chaferloko cada vez q se pueda
					for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
						if (luchador.getPersonaje().tieneHechizoID(373)) {
							return true;
						}
					}
					return false;
				case RETO_CASINO_REAL :// casino real, lanzar el hechizo ruleta cada vez q se pueda
					for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
						if (luchador.getPersonaje().tieneHechizoID(101)) {
							return true;
						}
					}
					return false;
				case RETO_ENTOMOLOGO :// invocar una llamita
					for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
						if (luchador.getPersonaje().tieneHechizoID(311)) {
							return true;
						}
					}
					return false;
				case RETO_ARACNOFILO :// aracnofilo, invocar una ara�a cada vez q se pueda
					for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
						if (luchador.getPersonaje().tieneHechizoID(370)) {
							return true;
						}
					}
					return false;
				case RETO_NI_PIAS_NI_SUMISAS :
				case RETO_NI_PIOS_NI_SUMISOS :// ni pias ni sumisas, los hombres deben acabar con todos los
																			// mobs
					int masc = 0;
					int fem = 0;
					for (final Luchador luchador : pelea.luchadoresDeEquipo(1)) {
						if (luchador.getPersonaje() == null)
							continue;
						if (luchador.getPersonaje().getSexo() == 1) {
							fem++;
						} else {
							masc++;
						}
					}
					if (fem > 0 && masc > 0) {
						return true;
					}
					return false;
				case RETO_CRUEL :// Cruel
				case RETO_FOCALIZACION :// focalizacion
				case RETO_ORDENADO :// ordenado
				case RETO_IMPREVISIBLE :// imprevisible
				case RETO_ASESINO_A_SUELDO :// asesino a sueldo
				case RETO_ELITISTA :// elitista, Todos los ataques deben ir dirigidos a hasta que muera
					if (pelea.cantLuchDeEquipo(2) >= 2) {
						return true;
					}
					return false;
				case RETO_EL_DOS_POR_UNO :// el dos por uno, Cuando un personaje mata a un adversario, tiene
					// que matar obligatoriamente a un (y s�lo
					if (pelea.cantLuchDeEquipo(2) % 2 == 0) {
						return true;
					}
					return false;
				case RETO_REPARTO :// reparto, Cada personaje debe matar al menos a un adversario (que no
														// sea una invocaci�n) durante el duelo
				case RETO_DUELO :
				case RETO_CADA_UNO_CON_SU_MONSTRUO :// cada uno con su mounstro, Cada personaje debe matar
																						// al menos a un adversario durante el combate.
					if (pelea.cantLuchDeEquipo(2) >= pelea.cantLuchDeEquipo(1) && pelea.cantLuchDeEquipo(1) > 1) {
						return true;
					}
					return false;
				case RETO_ANACORETA :
				case RETO_PEGAJOSO :
				case RETO_LOS_PEQUE�OS_ANTES :// los peque�os antes, el personaje de menor nivel debe acabar
																			// con todos los mobs
				case RETO_SUPERVIVIENTE :// superviviente, Ning�n aliado debe morir
				case RETO_CONTAMINACION :// contaminacion, Cuando un aliado pierde puntos de vida, dispones
																	// de 3 turnos para rematar a tu aliado o
					if (pelea.cantLuchDeEquipo(1) >= 2) {
						return true;
					}
					return false;
			}
			return true;
		} catch (final Exception e) {
			return false;
		}
	}
	
	public static boolean esRetoPosible2(final int reto, final int nuevo) {
		try {
			if (reto == nuevo) {
				return false;
			}
			switch (reto) {
				case RETO_ZOMBI :// zombi, muevete solo 1 PM en cada turno
				case RETO_ESTATUA :// estatua, Acaba tu turno en la misma casilla donde lo empezaste
				case RETO_NOMADA :// nomada, utlizar todos los PM disponibles en cada turno
					if (nuevo == RETO_ZOMBI || nuevo == RETO_NOMADA || nuevo == RETO_ESTATUA) {
						return false;
					}
					break;
				case RETO_AHORRADOR :// ahorrador, durante el combate solo se podra usar 1 accion por unica
															// vez
					if (nuevo == RETO_VERSATIL || nuevo == RETO_BARBARO || nuevo == RETO_LIMITADO) {
						return false;
					}
					break;
				case RETO_BARBARO :// barbaro, no utilizar ningun hechizo mientras dure el combate
					if (nuevo == RETO_AHORRADOR || nuevo == RETO_MISTICO || nuevo == RETO_MANOS_LIMPIAS
					|| nuevo == RETO_LIMITADO) {
						return false;
					}
					break;
				case RETO_VERSATIL :// vesrsatil, durante su turno cada jugador solo podra usar 1 accion, no
														// repetir
					if (nuevo == RETO_AHORRADOR) {
						return false;
					}
					break;
				case RETO_MISTICO :// mistico, solamente usa hechizos
					if (nuevo == RETO_BARBARO) {
						return false;
					}
					break;
				case RETO_MANOS_LIMPIAS :// manos limpias,acabar con los mounstros sin ocasionarles da�os
																	// directos
					if (nuevo == RETO_BARBARO) {
						return false;
					}
					break;
				case RETO_LIMITADO :// limitado, utlizar el mismo hechizo o CaC mientras dure el combate
					if (nuevo == RETO_AHORRADOR || nuevo == RETO_BARBARO || nuevo == RETO_LIMITADO) {
						return false;
					}
					break;
				case RETO_NI_PIAS_NI_SUMISAS :// ni pias ni sumisas, las mujeres deben acabar con todos los
																			// mobs
				case RETO_NI_PIOS_NI_SUMISOS :// ni pios ni sumisos, los hombres deben acabar con todos los
																			// mobs
					if (nuevo == RETO_NI_PIAS_NI_SUMISAS || nuevo == RETO_NI_PIOS_NI_SUMISOS) {
						return false;
					}
					break;
				case RETO_AUDAZ :// audaz, Acaba tu turno en una de las casillas pegadas a las de uno de tus
					// adversarios
				case RETO_PUSILANIME :// pusilanime, No termines nunca tu turno en una casilla adyacente a
															// la de uno de tus adversarios
					if (nuevo == RETO_AUDAZ || nuevo == RETO_PUSILANIME) {
						return false;
					}
					break;
				case RETO_PEGAJOSO :// pegajoso, Acaba tu turno en una de las casillas pegadas a las de uno
														// de tus
					// aliados
				case RETO_ANACORETA :// anacoreta, No termines nunca tu turno en una casilla adyacente a la
															// de uno de
					// tus aliados
					if (nuevo == RETO_PEGAJOSO || nuevo == RETO_ANACORETA) {
						return false;
					}
					break;
				case RETO_ELEGIDO_VOLUNTARIO :// elegido voluntario, Matar %1 el �ltimo
				case RETO_APLAZAMIENTO :// aplazamiento, Matar %1 el �ltimo
				case RETO_CRUEL :// cruel
				case RETO_ORDENADO :// ordenado
				case RETO_FOCALIZACION :// focalizacion, cuando se ataca a un adversario, hay q matarlo para
																// atacar a otro
				case RETO_ELITISTA :// elitista, Todos los ataques deben ir dirigidos a hasta que muera
				case RETO_IMPREVISIBLE :// imprevisible, Todos los ataques deben ir dirigidos a un mismo
																// objetivo que se designa en cada turno
				case RETO_ASESINO_A_SUELDO :// asesino a sueldo, Debes matar a los adversarios en el orden
																		// indicado. Cada vez que mates a un
				case RETO_BLITZKRIEG :// Blitzkrieg, Cuando se ataca a un adversario, hay que matarlo antes
															// de que comience su turno
				case RETO_DUELO :// duelo, Cuando un personaje ataca a un adversario, ning�n otro personaje
													// debe atacar a ese mismo
					if (nuevo == RETO_ELEGIDO_VOLUNTARIO || nuevo == RETO_APLAZAMIENTO || nuevo == RETO_CRUEL
					|| nuevo == RETO_ORDENADO || nuevo == RETO_FOCALIZACION || nuevo == RETO_ELITISTA
					|| nuevo == RETO_IMPREVISIBLE || nuevo == RETO_ASESINO_A_SUELDO || nuevo == RETO_BLITZKRIEG
					|| nuevo == RETO_DUELO) {
						return false;
					}
					break;
			}
			return true;
		} catch (final Exception e) {
			return false;
		}
	}
	
	public static int getCraneoPorClase(final int claseID) {
		int objID = switch (claseID) {
			case CLASE_FECA -> 9077;
			case CLASE_OSAMODAS -> 9078;
			case CLASE_ANUTROF -> 9079;
			case CLASE_SRAM -> 9080;
			case CLASE_XELOR -> 9081;
			case CLASE_ZURCARAK -> 9082;
			case CLASE_ANIRIPSA -> 9083;
			case CLASE_YOPUKA -> 9084;
			case CLASE_OCRA -> 9085;
			case CLASE_SADIDA -> 9086;
			case CLASE_SACROGITO -> 9087;
			case CLASE_PANDAWA -> 9088;
			default -> 0;
		};
		return objID;
	}
	
	public static int getDoplonDopeul(final int idMob) {
		return switch (idMob) {
			case 168 -> 10302;
			case 165 -> 10303;
			case 166 -> 10304;
			case 162 -> 10305;
			case 160 -> 10306;
			case 167 -> 10307;
			case 161 -> 10308;
			case 2691 -> 10309;
			case 455 -> 10310;
			case 169 -> 10311;
			case 163 -> 10312;
			case 164 -> 10313;
			default -> -1;
		};
	}
	
	public static int getCertificadoDopeul(final int idMob) {
		return switch (idMob) {
			case 168 -> 10289;
			case 165 -> 10290;
			case 166 -> 10291;
			case 162 -> 10292;
			case 160 -> 10293;
			case 167 -> 10294;
			case 161 -> 10295;
			case 2691 -> 10296;
			case 455 -> 10297;
			case 169 -> 10298;
			case 163 -> 10299;
			case 164 -> 10300;
			default -> -1;
		};
	}
	
	// public static final boolean IsaRessource(Objet obj) {
	// boolean isOk = false;
	// switch (obj.getTemplate().getType()) {
	// case 15 :
	// case 27 :
	// case 28 :
	// case 34 :
	// case 35 :
	// case 36 :
	// case 41 :
	// case 46 :
	// case 47 :
	// case 48 :
	// case 53 :
	// case 58 :
	// case 90 :
	// case 105 :
	// case 109 :
	// isOk = true;
	// break;
	// default :
	// isOk = false;
	// }
	// return isOk;
	// }
	public static int getNivelMiliciano(final int nivel) {
		if (nivel <= 50) {
			return 50;
		}
		if (nivel > 50 && nivel <= 80) {
			return 80;
		}
		if (nivel > 80 && nivel <= 110) {
			return 110;
		}
		if (nivel > 110 && nivel <= 140) {
			return 140;
		}
		if (nivel > 140 && nivel <= 170) {
			return 170;
		}
		return 200;
	}
	
	public static int getNivelProtector(final int nivel) {
		if (nivel > 0 && nivel <= 30) {
			return 10;
		}
		if (nivel > 30 && nivel <= 50) {
			return 20;
		}
		if (nivel > 50 && nivel <= 60) {
			return 30;
		}
		if (nivel > 60 && nivel <= 70) {
			return 40;
		}
		return 50;
	}
	
	public static int getProtectorRecursos(final int trabajoID, final int oficioID) {
		int rand = 0;
		switch (oficioID) {
			case 28 :// campesino
				switch (trabajoID) {
					case 45 :// segar trigo
						return 684;
					case 53 :// segar cebada
						return 685;
					case 57 :// segar avena
						return 686;
					case 46 :// segar lupulo
						return 687;
					case 50 :// segar lino
						return 688;
					case 52 :// segar centeno
						return 689;
					case 159 :// segar arroz
						return 690;
					case 58 :// segar malta
						return 691;
					case 54 :// segar ca�amo
						return 692;
				}
				break;
			case 24 :// minero
				switch (trabajoID) {
					case 24 :// recolectar hierro
						return 693;
					case 25 :// recolectar cobre
						return 694;
					case 26 :// recolectar bronce
						return 695;
					case 28 :// recolectar cobalto
						return 696;
					case 56 :// recolectar manganeso
						return 697;
					case 55 :// recolectar esta�o
						return 698;
					case 162 :// recolectar silicato
						return 699;
					case 29 :// recolectar plata
						return 700;
					case 31 :// recolectar bauxita
						return 701;
					case 30 :// recolectar oro
						return 702;
					case 161 :// recolectar dolomia
						return 703;
				}
				break;
			case 2 :// le�ador
				switch (trabajoID) {
					case 6 :// talar fresno
						return 711;
					case 39 :// talar casta�o
						return 712;
					case 40 :// talar nogal
						return 713;
					case 10 :// talar roble
						return 714;
					case 141 :// talar olvioleta
						return 716;
					case 139 :// cortar bambu
						return 715;
					case 37 :// talar arce
						return 717;
					case 33 :// talar tejo
						return 718;
					case 41 :// talar cerezo silvestre
						return 721;
					case 34 :// talar ebano
						return 722;
					case 174 :// talar kalipto
						return 720;
					case 35 :// talar olmo
						return 724;
					case 155 :// cortar bambu oscuro
						return 723;
					case 158 :// cortar bambu sagrado
						return 725;
				}
			case 26 :// alquimista
				switch (trabajoID) {
					case 160 :// cosechar pandoja
						return 710;
					case 74 :// cosechar edelweis
						return 709;
					case 73 :// cosechar orquidea
						return 708;
					case 10 :// cosechar menta
						return 707;
					case 71 :// cosechar trebol
						return 706;
					case 69 :// cosechar ca�amo
						return 705;
					case 68 :// cosechar lino
						return 704;
				}
			case 36 :// pescador
				switch (trabajoID) {
					case 131 :// tiburones
						return 739;
					case 127 :// percas
						return 738;
					case 130 :// rayas
						return 737;
					case 129 :
						rand = Formulas.getRandomInt(1, 3);
						switch (rand) {
							case 1 :
								return 736;// lubinas
							case 2 :
								return 735;// kralamares
							case 3 :
								return 734;// sardinas
						}
					case 125 :
						rand = Formulas.getRandomInt(1, 2);
						switch (rand) {
							case 1 :
								return 733;// carpas
							case 2 :
								return 732;// lucios
						}
					case 128 :
						rand = Formulas.getRandomInt(1, 3);
						switch (rand) {
							case 1 :
								return 731;// pescados empapados
							case 2 :
								return 730;// cangrejos
							case 3 :
								return 729;// bangas
						}
					case 124 :
						rand = Formulas.getRandomInt(1, 3);
						switch (rand) {
							case 1 :
								return 728;// peces gatito
							case 2 :
								return 727;// truchas
							case 3 :
								return 726;// gobios
						}
				}
		}
		return 0;
	}
	
	public static int getNivelDopeul(final int nivel) {
		if (nivel < 20) {
			return 20;
		}
		if (nivel < 40) {
			return 40;
		}
		if (nivel < 60) {
			return 60;
		}
		if (nivel < 80) {
			return 80;
		}
		if (nivel < 100) {
			return 100;
		}
		if (nivel < 120) {
			return 120;
		}
		if (nivel < 140) {
			return 140;
		}
		if (nivel < 160) {
			return 160;
		}
		if (nivel < 180) {
			return 180;
		}
		return 200;
	}
	
	public static int getCaracObjCria(final int idObjMod) {
		return switch (idObjMod) {
// Pesebre de tejo
// Pesebre de roble
// Pesebre de olmo
// Pesebre de olivioleta
// Pesebre de nogal
// Pesebre de madera embrujada
// Pesebre de madera de tronk�nido
// Pesebre de madera de kokoko
// Pesebre de madera de bambuto sagrado
// Pesebre de madera de bambuto
// Pesebre de madera ancestral
// Pesebre de fresno
// Pesebre de �bano
// Pesebre de cerezo silvestre
// Pesebre de casta�o
// Pesebre de carpe
// Pesebre de bomb�
// Pesebre de bamb� sagrado
// Pesebre de bamb� oscuro
// Pesebre de bamb� m�gico
// Pesebre de bamb� dorado
// Pesebre de bamb�
// Pesebre de arce
// Pesebre cl�sico
			case 7606, 7612, 7619, 7685, 7686, 7620, 7621, 7617, 7613, 7614, 7616, 7610, 7607, 7683, 7687, 7688, 7689, 7690, 7684, 7615, 7618, 7611, 7608, 7609 -> 6;
// Acariciador de Pluma Puntiaguda de Kwak
// Acariciador de Pluma del �ltimo Pohoyo
// Acariciador de Pluma del Maestro Cuerbok
// Acariciador de Pluma del Kwak de Tierra
// Acariciador de Pluma de Tofu Real
// Acariciador de Pluma de Tofu Mal�fico
// Acariciador de Pluma de Tofu
// Acariciador de Pluma de P�o Violeta
// Acariciador de Pluma de P�o Verde
// Acariciador de Pluma de P�o Rosa
// Acariciador de Pluma de P�o Rojo
// Acariciador de Pluma de P�o Azul
// Acariciador de Pluma de P�o Amarillo
// Acariciador de Pluma de Kwak de Viento
// Acariciador de Pluma de Kwak de Llama
// Acariciador de Pluma de Kwak de Hielo
// Acariciador de Pluma de Cuerbok
// Acariciador Cl�sico
			case 7628, 7738, 7739, 7740, 7741, 7735, 7623, 7734, 7736, 7733, 7624, 7622, 7737, 7746, 7742, 7745, 7743, 7744 -> 5;
// Aporreadora de tejo
// Aporreadora de roble
// Aporreadora de olmo
// Aporreadora de olivioleta
// Aporreadora de nogal
// Aporreadora de madera embrujada
// Aporreadora de madera de tronk�nido
// Aporreadora de madera de kokoko
// Aporreadora de madera de bambuto sagrado
// Aporreadora de madera de bambuto
// Aporreadora de madera ancestral
// Aporreadora de fresno
// Aporreadora de �bano
// Aporreadora de cerezo silvestre
// Aporreadora de casta�o
// Aporreadora de carpe
// Aporreadora de bomb�
// Aporreadora de bamb� sagrado
// Aporreadora de bamb� oscuro
// Aporreadora de bamb� m�gico
// Aporreadora de bamb� dorado
// Aporreadora de bamb�
// Aporreadora de arce
// Aporreadora cl�sica
			case 7625, 7757, 7762, 7770, 7772, 7765, 7766, 7763, 7758, 7626, 7761, 7755, 7759, 7767, 7773, 7774, 7771, 7769, 7768, 7760, 7764, 7756, 7627, 7629 -> 4;
// Dragonalgas de cuero violeta de bwork
// Dragonalgas de cuero negro
// Dragonalgas de cuero de Puerkazo
// Dragonalgas de cuero de Minotauroro
// Dragonalgas de cuero de jefe de guerra jalat�
// Dragonalgas de cuero de Jalat� Real
// Dragonalgas de cuero de jalat�
// Dragonalgas de cuero de jalat�n negro
// Dragonalgas de cuero de jalat�n blanco
// Dragonalgas de cuero de jabal� de las llanuras
// Dragonalgas de cuero de jabal�
// Dragonalgas de cuero de dragocerdo
// Dragonalgas de cuero de cochinillo
// Dragonalgas cl�sico
			case 7634, 7695, 7694, 7693, 7699, 7635, 7636, 7637, 7692, 7691, 7700, 7697, 7698, 7696 -> 3;
// Fulminadora de tejo
// Fulminadora de roble
// Fulminadora de olmo
// Fulminadora de olivioleta
// Fulminadora de nogal
// Fulminadora de madera embrujada
// Fulminadora de madera de tronk�nido
// Fulminadora de madera de kokoko
// Fulminadora de madera de bambuto sagrado
// Fulminadora de madera de bambuto
// Fulminadora de madera ancestral
// Fulminadora de fresno
// Fulminadora de �bano
// Fulminadora de cerezo silvestre
// Fulminadora de casta�o
// Fulminadora de carpe
// Fulminadora de bomb�
// Fulminadora de bamb� sagrado
// Fulminadora de bamb� oscuro
// Fulminadora de bamb� m�gico
// Fulminadora de bamb� dorado
// Fulminadora de bamb�
// Fulminadora de arce
// Fulminadora cl�sica
			case 7798, 7780, 7787, 7793, 7794, 7788, 7789, 7785, 7781, 7782, 7784, 7778, 7775, 7790, 7795, 7796, 7797, 7792, 7791, 7783, 7786, 7779, 7776, 7777 -> 2;
// Abrevadero de Tejo
// Abrevadero de Roble
// Abrevadero de Olmo
// Abrevadero de Olivioleta
// Abrevadero de Nogal
// Abrevadero de Madera Embrujada
// Abrevadero de Madera de Tronk�nido
// Abrevadero de Madera de Kokoko
// Abrevadero de Madera de Bambuto Sagrado
// Abrevadero de Madera de Bambuto
// Abrevadero de Madera Ancestral
// Abrevadero de Fresno
// Abrevadero de �bano
// Abrevadero de Cerezo Silvestre
// Abrevadero de Casta�o
// Abrevadero de Carpe
// Abrevadero de Bomb�
// Abrevadero de Bamb� Sagrado
// Abrevadero de Bamb� Oscuro
// Abrevadero de Bamb� M�gico
// Abrevadero de Bamb� Dorado
// Abrevadero de Bamb�
// Abrevadero de Arce
// Abrevadero Cl�sico
			case 7605, 7592, 7602, 7676, 7677, 7603, 7604, 7600, 7594, 7593, 7596, 7598, 7590, 7673, 7678, 7679, 7682, 7675, 7674, 7595, 7601, 7599, 7591, 7597 -> 1;
			default -> -1;
		};
	}
	
	public static int getObjCriaPorMapa(final short mapa) {
		return switch (mapa) {
// abrevadero
			case 8747, 8750 -> 7596;
// fulminadoras
			case 8745, 8752 -> 7784;
// dragonalgas
			case 8746, 8749 -> 7695;
// aporreadora
			case 8743, 8748 -> 7761;
// acariciador
			case 8744, 8751 -> 7741;
// pesebre
			case 8848, 8851 -> 7616;
			default -> -1;
		};
	}
	
	// public static final int getKamasDonResetAlign(int level) {
	// if (level <= 30)
	// return 12000;
	// if ((level > 30) && (level <= 50))
	// return 24000;
	// if ((level > 50) && (level <= 100))
	// return 48000;
	// if ((level > 100) && (level <= 150)) {
	// return 64000;
	// }
	// return 100000;
	// }
	//
	// public static final String getStatutByClass(int classID) {
	// switch (classID) {
	// case 1 :
	// return "10300;337";
	// case 2 :
	// case 3 :
	// return "10299;300";
	// case 4 :
	// return "10285;263";
	// case 5 :
	// return "10298;315";
	// case 6 :
	// return "10276;311";
	// case 7 :
	// return "10283;299";
	// case 8 :
	// return "10294;309";
	// case 9 :
	// return "10292;299";
	// case 10 :
	// return "10279;284";
	// case 11 :
	// return "10296;258";
	// case 12 :
	// return "10289;250";
	// }
	// return "";
	// }
	//
	// public static final String getStatutByClassAstrub(int classID) {
	// switch (classID) {
	// case 1 :
	// return "7398;299";
	// case 2 :
	// return "7545;311";
	// case 3 :
	// return "7442;254";
	// case 4 :
	// return "7392;282";
	// case 5 :
	// return "7332;312";
	// case 6 :
	// return "7446;299";
	// case 7 :
	// return "7361;207";
	// case 8 :
	// return "7427;267";
	// case 9 :
	// return "7378;338";
	// case 10 :
	// return "7395;371";
	// case 11 :
	// return "7336;198";
	// case 12 :
	// return "8035;384";
	// }
	// return "";
	// }
	//
	// public static final String getNameByClass(int classID) {
	// switch (classID) {
	// case 1 :
	// return "Feca";
	// case 2 :
	// return "Osamodas";
	// case 3 :
	// return "Enutrof";
	// case 4 :
	// return "Sram";
	// case 5 :
	// return "Xelor";
	// case 6 :
	// return "Ecaflip";
	// case 7 :
	// return "Eniripsa";
	// case 8 :
	// return "Iop";
	// case 9 :
	// return "Cra";
	// case 10 :
	// return "Sadida";
	// case 11 :
	// return "Sacrieur";
	// case 12 :
	// return "Pandawa";
	// }
	// return "";
	// }
	//
	// public static final boolean isFightDopeul(Map<Integer, Fight.Fighter> mob) {
	// Iterator localIterator = mob.values().iterator();
	// if (localIterator.hasNext()) {
	// Fight.Fighter f = (Fight.Fighter) localIterator.next();
	// if ((f.getPersonnage() != null) || (f.getPerco() != null) || (f.getPrism() != null))
	// return false;
	// switch (f.getMob().getTemplate().getID()) {
	// case 160 :
	// case 161 :
	// case 162 :
	// case 163 :
	// case 164 :
	// case 165 :
	// case 166 :
	// case 167 :
	// case 168 :
	// case 169 :
	// case 455 :
	// case 2691 :
	// return true;
	// }
	// return false;
	// }
	// return false;
	// }
	// zd
	public static int getDopeulPorNPC(final int npcID) {
		// case :
// break;
//
// case ://aniripsa
// mobID = 166;
// break;
		int mobID = switch (npcID) {
// yopuka
			case 434 -> 167;
// osamodas
			case 436 -> 161;
// xelor
			case 437 -> 164;
// zurcarak
			case 438 -> 165;
// ocra
			case 439 -> 168;
// anutrof
			case 440 -> 162;
// sram
			case 441 -> 163;
// sadida
			case 442 -> 169;
// sacrogito
			case 443 -> 455;
// feca
			case 433 -> 160;
			default -> 0;
		};
		return mobID;
	}
	
	public static int getExpForjamaguear(final float pesoRuna, final int nivelObjeto) {
		if (nivelObjeto < 25) {
			if (pesoRuna < 3) {
				return 1;
			} else if (pesoRuna < 10) {
				return 1;
			} else if (pesoRuna < 50) {
				return 10;
			} else if (pesoRuna < 100) {
				return 25;
			} else {
				return 50;
			}
		} else if (nivelObjeto < 50) {
			if (pesoRuna < 3) {
				return 1;
			} else if (pesoRuna < 10) {
				return 10;
			} else if (pesoRuna < 50) {
				return 10;
			} else if (pesoRuna < 100) {
				return 50;
			} else {
				return 50;
			}
		} else if (nivelObjeto < 75) {
			if (pesoRuna < 3) {
				return 10;
			} else if (pesoRuna < 10) {
				return 25;
			} else if (pesoRuna < 50) {
				return 25;
			} else if (pesoRuna < 100) {
				return 50;
			} else {
				return 100;
			}
		} else if (nivelObjeto < 100) {
			if (pesoRuna < 3) {
				return 25;
			} else if (pesoRuna < 10) {
				return 25;
			} else if (pesoRuna < 50) {
				return 50;
			} else if (pesoRuna < 100) {
				return 100;
			} else {
				return 250;
			}
		} else if (nivelObjeto < 125) {
			if (pesoRuna < 3) {
				return 50;
			} else if (pesoRuna < 10) {
				return 50;
			} else if (pesoRuna < 50) {
				return 100;
			} else if (pesoRuna < 100) {
				return 250;
			} else {
				return 500;
			}
		} else if (nivelObjeto < 150) {
			if (pesoRuna < 3) {
				return 100;
			} else if (pesoRuna < 10) {
				return 100;
			} else if (pesoRuna < 50) {
				return 250;
			} else if (pesoRuna < 100) {
				return 500;
			} else {
				return 1000;
			}
		} else if (nivelObjeto < 175) {
			if (pesoRuna < 3) {
				return 250;
			} else if (pesoRuna < 10) {
				return 250;
			} else if (pesoRuna < 50) {
				return 250;
			} else if (pesoRuna < 100) {
				return 1000;
			} else {
				return 1000;
			}
		} else if (nivelObjeto < 200) {
			if (pesoRuna < 3) {
				return 250;
			} else if (pesoRuna < 10) {
				return 500;
			} else if (pesoRuna < 50) {
				return 500;
			} else if (pesoRuna < 100) {
				return 1000;
			} else {
				return 1000;
			}
		} else {
			if (pesoRuna < 3) {
				return 500;
			} else if (pesoRuna < 10) {
				return 1000;
			} else if (pesoRuna < 50) {
				return 1000;
			} else if (pesoRuna < 100) {
				return 1000;
			} else {
				return 1000;
			}
		}
	}
	
	public static int getStatPositivoDeNegativo(final int statID) {
		return switch (statID) {
// suerte
			case STAT_MENOS_SUERTE -> STAT_MAS_SUERTE;
// vitalidad
			case STAT_MENOS_VITALIDAD -> STAT_MAS_VITALIDAD;
// agilidad
			case STAT_MENOS_AGILIDAD -> STAT_MAS_AGILIDAD;
// inteligencia
			case STAT_MENOS_INTELIGENCIA -> STAT_MAS_INTELIGENCIA;
// sabiduria
			case STAT_MENOS_SABIDURIA -> STAT_MAS_SABIDURIA;
// fuerza
			case STAT_MENOS_FUERZA -> STAT_MAS_FUERZA;
// alcance
			case STAT_MENOS_ALCANCE -> STAT_MAS_ALCANCE;
// iniciativa
			case STAT_MENOS_INICIATIVA -> STAT_MAS_INICIATIVA;
// prospeccion
			case STAT_MENOS_PROSPECCION -> STAT_MAS_PROSPECCION;
// curaciones
			case STAT_MENOS_CURAS -> STAT_MAS_CURAS;
// da�os
			case STAT_MENOS_DA�OS -> STAT_MAS_DA�OS;
// % da�os
			case STAT_MENOS_PORC_DA�OS -> STAT_MAS_PORC_DA�OS;
// golpes criticos
			case STAT_MENOS_GOLPES_CRITICOS -> STAT_MAS_GOLPES_CRITICOS;
// tierra
			case STAT_MENOS_RES_PORC_TIERRA -> STAT_MAS_RES_PORC_TIERRA;
// agua
			case STAT_MENOS_RES_PORC_AGUA -> STAT_MAS_RES_PORC_AGUA;
// aire
			case STAT_MENOS_RES_PORC_AIRE -> STAT_MAS_RES_PORC_AIRE;
// fuego
			case STAT_MENOS_RES_PORC_FUEGO -> STAT_MAS_RES_PORC_FUEGO;
// neutral
			case STAT_MENOS_RES_PORC_NEUTRAL -> STAT_MAS_RES_PORC_NEUTRAL;
// tierra
			case STAT_MENOS_RES_FIJA_TIERRA -> STAT_MAS_RES_FIJA_TIERRA;
// agua
			case STAT_MENOS_RES_FIJA_AGUA -> STAT_MAS_RES_FIJA_AGUA;
// aire
			case STAT_MENOS_RES_FIJA_AIRE -> STAT_MAS_RES_FIJA_AIRE;
// fuego
			case STAT_MENOS_RES_FIJA_FUEGO -> STAT_MAS_RES_FIJA_FUEGO;
// neutral
			case STAT_MENOS_RES_FIJA_NEUTRAL -> STAT_MAS_RES_FIJA_NEUTRAL;
			case STAT_MENOS_DA�OS_DE_AGUA -> STAT_MAS_DA�OS_DE_AGUA;
			case STAT_MENOS_DA�OS_DE_AIRE -> STAT_MAS_DA�OS_DE_AIRE;
			case STAT_MENOS_DA�OS_DE_FUEGO -> STAT_MAS_DA�OS_DE_FUEGO;
			case STAT_MENOS_DA�OS_DE_TIERRA -> STAT_MAS_DA�OS_DE_TIERRA;
			case STAT_MENOS_DA�OS_DE_NEUTRAL -> STAT_MAS_DA�OS_DE_NEUTRAL;
			case STAT_MENOS_DA�OS_EMPUJE -> STAT_MAS_DA�OS_EMPUJE;
			case STAT_MENOS_REDUCCION_CRITICOS -> STAT_MAS_REDUCCION_CRITICOS;
			case STAT_MENOS_DA�OS_CRITICOS -> STAT_MAS_DA�OS_CRITICOS;
			case STAT_MENOS_REDUCCION_EMPUJE -> STAT_MAS_REDUCCION_EMPUJE;
			case STAT_MENOS_HUIDA -> STAT_MAS_HUIDA;
			case STAT_MENOS_PLACAJE -> STAT_MAS_PLACAJE;
			case STAT_MENOS_RETIRO_PM -> STAT_MAS_RETIRO_PM;
			case STAT_MENOS_RETIRO_PA -> STAT_MAS_RETIRO_PA;
			default -> statID;
		};
	}
	
	public static int getStatOpuesto(final int statID) {
		return switch (statID) {
			case STAT_MENOS_PA -> STAT_MAS_PA;
			case STAT_MAS_DA�OS_REDUCIDOS_NO_FECA -> STAT_MENOS_DA�OS_REDUCIDOS;
			case STAT_MAS_PA -> STAT_MENOS_PA;
			case STAT_MAS_DA�OS -> STAT_MENOS_DA�OS;
			case STAT_MAS_GOLPES_CRITICOS -> STAT_MENOS_GOLPES_CRITICOS;
			case STAT_MENOS_ALCANCE -> STAT_MAS_ALCANCE;
			case STAT_MAS_ALCANCE -> STAT_MENOS_ALCANCE;
			case STAT_MAS_FUERZA -> STAT_MENOS_FUERZA;
			case STAT_MAS_AGILIDAD -> STAT_MENOS_AGILIDAD;
			case STAT_MAS_SUERTE -> STAT_MENOS_SUERTE;
			case STAT_MAS_SABIDURIA -> STAT_MENOS_SABIDURIA;
			case STAT_MAS_VITALIDAD -> STAT_MENOS_VITALIDAD;
			case STAT_MAS_INTELIGENCIA -> STAT_MENOS_INTELIGENCIA;
			case STAT_MENOS_PM -> STAT_MAS_PM;
			case STAT_MAS_PM -> STAT_MENOS_PM;
			case STAT_MAS_PORC_DA�OS -> STAT_MENOS_PORC_DA�OS;
			case STAT_MENOS_DA�OS -> STAT_MAS_DA�OS;
			case STAT_MENOS_SUERTE -> STAT_MAS_SUERTE;
			case STAT_MENOS_VITALIDAD -> STAT_MAS_VITALIDAD;
			case STAT_MENOS_AGILIDAD -> STAT_MAS_AGILIDAD;
			case STAT_MENOS_INTELIGENCIA -> STAT_MAS_INTELIGENCIA;
			case STAT_MENOS_SABIDURIA -> STAT_MAS_SABIDURIA;
			case STAT_MENOS_FUERZA -> STAT_MAS_FUERZA;
			case STAT_MAS_PODS -> STAT_MENOS_PODS;
			case STAT_MENOS_PODS -> STAT_MAS_PODS;
			case STAT_MAS_ESQUIVA_PERD_PA -> STAT_MENOS_ESQUIVA_PERD_PA;
			case STAT_MAS_ESQUIVA_PERD_PM -> STAT_MENOS_ESQUIVA_PERD_PM;
			case STAT_MENOS_ESQUIVA_PERD_PA -> STAT_MAS_ESQUIVA_PERD_PA;
			case STAT_MENOS_ESQUIVA_PERD_PM -> STAT_MAS_ESQUIVA_PERD_PM;
			case STAT_MENOS_DA�OS_REDUCIDOS -> STAT_MAS_DA�OS_REDUCIDOS_NO_FECA;
			case STAT_MENOS_GOLPES_CRITICOS -> STAT_MAS_GOLPES_CRITICOS;
			case STAT_MAS_INICIATIVA -> STAT_MENOS_INICIATIVA;
			case STAT_MENOS_INICIATIVA -> STAT_MAS_INICIATIVA;
			case STAT_MAS_PROSPECCION -> STAT_MENOS_PROSPECCION;
			case STAT_MENOS_PROSPECCION -> STAT_MAS_PROSPECCION;
			case STAT_MAS_CURAS -> STAT_MENOS_CURAS;
			case STAT_MENOS_CURAS -> STAT_MAS_CURAS;
			case STAT_MENOS_PORC_DA�OS -> STAT_MAS_PORC_DA�OS;
			case STAT_MAS_RES_PORC_TIERRA -> STAT_MENOS_RES_PORC_TIERRA;
			case STAT_MAS_RES_PORC_AGUA -> STAT_MENOS_RES_PORC_AGUA;
			case STAT_MAS_RES_PORC_AIRE -> STAT_MENOS_RES_PORC_AIRE;
			case STAT_MAS_RES_PORC_FUEGO -> STAT_MENOS_RES_PORC_FUEGO;
			case STAT_MAS_RES_PORC_NEUTRAL -> STAT_MENOS_RES_PORC_NEUTRAL;
			case STAT_MENOS_RES_PORC_TIERRA -> STAT_MAS_RES_PORC_TIERRA;
			case STAT_MENOS_RES_PORC_AGUA -> STAT_MAS_RES_PORC_AGUA;
			case STAT_MENOS_RES_PORC_AIRE -> STAT_MAS_RES_PORC_AIRE;
			case STAT_MENOS_RES_PORC_FUEGO -> STAT_MAS_RES_PORC_FUEGO;
			case STAT_MENOS_RES_PORC_NEUTRAL -> STAT_MAS_RES_PORC_NEUTRAL;
			case STAT_MAS_RES_FIJA_TIERRA -> STAT_MENOS_RES_FIJA_TIERRA;
			case STAT_MAS_RES_FIJA_AGUA -> STAT_MENOS_RES_FIJA_AGUA;
			case STAT_MAS_RES_FIJA_AIRE -> STAT_MENOS_RES_FIJA_AIRE;
			case STAT_MAS_RES_FIJA_FUEGO -> STAT_MENOS_RES_FIJA_FUEGO;
			case STAT_MAS_RES_FIJA_NEUTRAL -> STAT_MENOS_RES_FIJA_NEUTRAL;
			case STAT_MENOS_RES_FIJA_TIERRA -> STAT_MAS_RES_FIJA_TIERRA;
			case STAT_MENOS_RES_FIJA_AGUA -> STAT_MAS_RES_FIJA_AGUA;
			case STAT_MENOS_RES_FIJA_AIRE -> STAT_MAS_RES_FIJA_AIRE;
			case STAT_MENOS_RES_FIJA_FUEGO -> STAT_MAS_RES_FIJA_FUEGO;
			case STAT_MENOS_RES_FIJA_NEUTRAL -> STAT_MAS_RES_FIJA_NEUTRAL;
			case STAT_MAS_RES_PORC_PVP_TIERRA -> STAT_MENOS_RES_PORC_PVP_TIERRA;
			case STAT_MAS_RES_PORC_PVP_AGUA -> STAT_MENOS_RES_PORC_PVP_AGUA;
			case STAT_MAS_RES_PORC_PVP_AIRE -> STAT_MENOS_RES_PORC_PVP_AIRE;
			case STAT_MAS_RES_PORC_PVP_FUEGO -> STAT_MENOS_RES_PORC_PVP_FUEGO;
			case STAT_MAS_RES_PORC_PVP_NEUTRAL -> STAT_MENOS_RES_PORC_PVP_NEUTRAL;
			case STAT_MENOS_RES_PORC_PVP_TIERRA -> STAT_MAS_RES_PORC_PVP_TIERRA;
			case STAT_MENOS_RES_PORC_PVP_AGUA -> STAT_MAS_RES_PORC_PVP_AGUA;
			case STAT_MENOS_RES_PORC_PVP_AIRE -> STAT_MAS_RES_PORC_PVP_AIRE;
			case STAT_MENOS_RES_PORC_PVP_FUEGO -> STAT_MAS_RES_PORC_PVP_FUEGO;
			case STAT_MENOS_RES_PORC_PVP_NEUTRAL -> STAT_MAS_RES_PORC_PVP_NEUTRAL;
			case STAT_MAS_HUIDA -> STAT_MENOS_HUIDA;
			case STAT_MENOS_HUIDA -> STAT_MAS_HUIDA;
			case STAT_MAS_PLACAJE -> STAT_MENOS_PLACAJE;
			case STAT_MENOS_PLACAJE -> STAT_MAS_PLACAJE;
			case STAT_MAS_RETIRO_PM -> STAT_MENOS_RETIRO_PM;
			case STAT_MENOS_RETIRO_PM -> STAT_MAS_RETIRO_PM;
			case STAT_MAS_RETIRO_PA -> STAT_MENOS_RETIRO_PA;
			case STAT_MENOS_RETIRO_PA -> STAT_MAS_RETIRO_PA;
			case STAT_MAS_DA�OS_DE_AGUA -> STAT_MENOS_DA�OS_DE_AGUA;
			case STAT_MAS_DA�OS_DE_AIRE -> STAT_MENOS_DA�OS_DE_AIRE;
			case STAT_MAS_DA�OS_DE_FUEGO -> STAT_MENOS_DA�OS_DE_FUEGO;
			case STAT_MAS_DA�OS_DE_TIERRA -> STAT_MENOS_DA�OS_DE_TIERRA;
			case STAT_MAS_DA�OS_DE_NEUTRAL -> STAT_MENOS_DA�OS_DE_NEUTRAL;
			case STAT_MAS_DA�OS_EMPUJE -> STAT_MENOS_DA�OS_EMPUJE;
			case STAT_MAS_REDUCCION_CRITICOS -> STAT_MENOS_REDUCCION_CRITICOS;
			case STAT_MAS_DA�OS_CRITICOS -> STAT_MENOS_DA�OS_CRITICOS;
			case STAT_MAS_REDUCCION_EMPUJE -> STAT_MENOS_REDUCCION_EMPUJE;
			case STAT_MENOS_DA�OS_DE_AGUA -> STAT_MAS_DA�OS_DE_AGUA;
			case STAT_MENOS_DA�OS_DE_AIRE -> STAT_MAS_DA�OS_DE_AIRE;
			case STAT_MENOS_DA�OS_DE_FUEGO -> STAT_MAS_DA�OS_DE_FUEGO;
			case STAT_MENOS_DA�OS_DE_TIERRA -> STAT_MAS_DA�OS_DE_TIERRA;
			case STAT_MENOS_DA�OS_DE_NEUTRAL -> STAT_MAS_DA�OS_DE_NEUTRAL;
			case STAT_MENOS_DA�OS_EMPUJE -> STAT_MAS_DA�OS_EMPUJE;
			case STAT_MENOS_REDUCCION_CRITICOS -> STAT_MAS_REDUCCION_CRITICOS;
			case STAT_MENOS_DA�OS_CRITICOS -> STAT_MAS_DA�OS_CRITICOS;
			case STAT_MENOS_REDUCCION_EMPUJE -> STAT_MAS_REDUCCION_EMPUJE;
			default -> statID;
		};
	}
	
	public static int[] getPotenciaRunaPorStat(int statID) {
		int[] r = new int[3];
		int i = 0;
		switch (statID) {
// Vitalidad
			case STAT_MAS_VITALIDAD -> {
				r[i++] = 3;
				r[i++] = 10;
				r[i++] = 30;
			}
// Pod
			case STAT_MAS_INICIATIVA, STAT_MAS_PODS -> {
				r[i++] = 10;
				r[i++] = 30;
				r[i++] = 100;
			}
// resistencia % neutral
			case STAT_MAS_DA�OS, STAT_MAS_CURAS, STAT_MAS_GOLPES_CRITICOS, STAT_MAS_CRIATURAS_INVO, STAT_MAS_ALCANCE, STAT_MAS_PA, STAT_MAS_PM, STAT_MAS_RES_FIJA_TIERRA, STAT_MAS_RES_FIJA_AGUA, STAT_MAS_RES_FIJA_AIRE, STAT_MAS_RES_FIJA_FUEGO, STAT_MAS_RES_FIJA_NEUTRAL, STAT_REENVIA_DA�OS, STAT_MAS_RES_PORC_TIERRA, STAT_MAS_RES_PORC_AGUA, STAT_MAS_RES_PORC_AIRE, STAT_MAS_RES_PORC_FUEGO, STAT_MAS_RES_PORC_NEUTRAL -> r[i++] = 1;
			case STAT_MAS_DA�OS_TRAMPA, STAT_MAS_PROSPECCION -> {
				r[i++] = 1;
				r[i++] = 3;
			}
// Sabiduria
			case STAT_MAS_PORC_DA�OS, STAT_MAS_PORC_DA�OS_TRAMPA, STAT_MAS_FUERZA, STAT_MAS_AGILIDAD, STAT_MAS_SUERTE, STAT_MAS_INTELIGENCIA, STAT_MAS_SABIDURIA -> {
				r[i++] = 1;
				r[i++] = 3;
				r[i++] = 10;
			}
		}
		return r;
	}
	
	public static int getTipoRuna(final int statID, float pesoTotal) {
		if (pesoTotal <= 0) {
			return 0;
		}
		float pesoStat = getPesoStat(statID);
		int[] v = getPotenciaRunaPorStat(statID);
		int factor = (int) (pesoTotal / pesoStat);
		if (factor <= 0) {
			return 0;
		}
		int tipo = 0;
		if (factor <= v[0] * 6) {
			tipo = 1;
		} else if (factor <= v[1] * 9) {
			tipo = 2;
		} else {
			tipo = 3;
		}
		if (tipo == 1) {
			return 1;
		}
		for (; tipo > 0; tipo--) {
			if (v[tipo - 1] != 0) {
				break;
			}
		}
		if (tipo == 0) {
			return 0;
		}
		return tipo;
	}
	
	public static float getPorcCrearRuna(final int statID, float peso, int tipo, int nivel) {
		if (peso <= 0) {
			return 0;
		}
		int[] v = getPotenciaRunaPorStat(statID);
		int basico = switch (tipo) {
			case 1 -> v[0];
			case 2 -> (2 * v[0]) + (v[1]);
			case 3 -> (4 * v[0]) + (2 * v[1]) + (v[2]);
			default -> 0;
		};
		int maximo = Math.round((basico / (2 / 3f)) / 0.9f);
		int minimo = Math.round((basico / (2 / 3f)) / 1.1f);
		float pesoIndiv = getPesoStat(statID);
		int cantStat = (int) (peso / pesoIndiv);
		float porc = 0;
		switch (statID) {
// invocaciones
			case STAT_MAS_CRIATURAS_INVO -> porc = (float) Math.min(75, (Math.pow(nivel, 2) / (Math.pow(getPesoStat(statID), (5 / 4f)))));
// alcance
			case STAT_MAS_ALCANCE -> porc = (float) Math.min(70, (Math.pow(nivel, 2) / (Math.pow(getPesoStat(statID), (5 / 4f)))));
// PM
			case STAT_MAS_PM -> porc = (float) Math.min(65, (Math.pow(nivel, 2) / (Math.pow(getPesoStat(statID), (5 / 4f)))));
// PA
			case STAT_MAS_PA -> porc = (float) Math.min(60, (Math.pow(nivel, 2) / (Math.pow(getPesoStat(statID), (5 / 4f)))));
			default -> {
				if (cantStat > maximo) {
					return 100;
				}
				if (cantStat < minimo) {
					return 0;
				}
				return (cantStat - minimo) * 100f / (maximo - minimo);
			}
		}
		//aqui perra, quita el comentario de abajo 
		// if (porc < 1) {
		// porc = 1;
		// }
		return porc;
	}
	
	// getValorPorRunaPocima
	public static int getValorPorRunaPocima(final Objeto objeto) {
		switch (objeto.getObjModelo().getTipo()) {
			case OBJETO_TIPO_POCION_FORJAMAGIA :
			case OBJETO_TIPO_RUNA_FORJAMAGIA :
				if (objeto.tieneStatTexto(STAT_POTENCIA_RUNA)) {
					try {
						return Integer.parseInt(objeto.getParamStatTexto(STAT_POTENCIA_RUNA, 1), 16);
					} catch (Exception ignored) {}
				}
				break;
		}
		return 0;
	}
	
	public static int getStatPorRunaPocima(final Objeto objeto) {
		switch (objeto.getObjModelo().getTipo()) {
			case OBJETO_TIPO_POCION_FORJAMAGIA :
			case OBJETO_TIPO_RUNA_FORJAMAGIA :
				if (objeto.tieneStatTexto(STAT_POTENCIA_RUNA)) {
					try {
						return Integer.parseInt(objeto.getParamStatTexto(STAT_POTENCIA_RUNA, 2), 16);
					} catch (Exception ignored) {}
				}
				break;
		}
		return -1;
	}
	
	public static int getRunaPorStat(final int stat, final int tipo) {
		switch (stat) {
			case STAT_MAS_PA :// Pa
				return 1557;// runa PA
			case STAT_MAS_DA�OS : // da�os
				return 7435;// runa da�o
			case STAT_MAS_GOLPES_CRITICOS :
				return 7433;
			case STAT_MAS_ALCANCE :// alcance
				return 7438;// runa alcance
			case STAT_MAS_FUERZA :// fuerza
				return switch (tipo) {
					case 3 -> 1551;
					case 2 -> 1545;
					default -> 1519;
				};
			case STAT_MAS_AGILIDAD : // Agi
				return switch (tipo) {
					case 3 -> 1555;
					case 2 -> 1549;
					default -> 1524;
				};
			case STAT_MAS_SUERTE :// suerte
				return switch (tipo) {
					case 3 -> 1556;
					case 2 -> 1550;
					default -> 1525;
				};
			case STAT_MAS_SABIDURIA :// Sabi
				return switch (tipo) {
					case 3 -> 1552;
					case 2 -> 1546;
					default -> 1521;
				};
			case STAT_MAS_VITALIDAD :// vita
				return switch (tipo) {
					case 3 -> 1554;
					case 2 -> 1548;
					default -> 1523;
				};
			case STAT_MAS_INTELIGENCIA : // intel
				return switch (tipo) {
					case 3 -> 1553;
					case 2 -> 1547;
					default -> 1522;
				};
			case STAT_MAS_PM :// PM
				return 1558;// runa PM 1
			case STAT_MAS_PORC_DA�OS :// Da�o %
				// 10613 Runa Pa Pi e1#3#0#0#0d0+3
				// 10615 Runa Pa Pi Per e2#3#0#0#0d0+3
				// 10616 Runa Ra Pi Per e2#a#0#0#0d0+10
				// 10618 Runa Pa Do Per 8a#3#0#0#0d0+3
				// 10619 Runa Ra Do Per 8a#a#0#0#0d0+10
				return switch (tipo) {
					case 3 -> 10619;
					case 2 -> 10618;
// runa porcDa�o
					default -> 7436;
				};
			case STAT_MAS_PODS :// pods
				return switch (tipo) {
					case 3 -> 7445;
					case 2 -> 7444;
					default -> 7443;
				};
			case STAT_MAS_INICIATIVA :// iniciativa
				return switch (tipo) {
					case 3 -> 7450;
					case 2 -> 7449;
					default -> 7448;
				};
			case STAT_MAS_PROSPECCION :// prospeccion
				if (tipo == 2) {
					return 10662;
				}
				return 7451;
			case STAT_MAS_CURAS ://
				return 7434;// runa cura
			case STAT_MAS_CRIATURAS_INVO :// invoca
				return 7442;// runa invo
			case STAT_REENVIA_DA�OS :
				return 7437;// runa reenvio
			case STAT_MAS_DA�OS_TRAMPA :
				if (tipo == 2) {
					return 10613;
				}
				return 7446;// runa da�o trampa
			case STAT_MAS_PORC_DA�OS_TRAMPA :
				return switch (tipo) {
					case 3 -> 10616;
					case 2 -> 10615;
// runa da�o porc Trampa
					default -> 7447;
				};
			case STAT_MAS_RES_FIJA_FUEGO :
				return 7452;// runa re fuego
			case STAT_MAS_RES_FIJA_AIRE :
				return 7453;// runa re aire
			case STAT_MAS_RES_FIJA_AGUA :
				return 7454;// runa re agua
			case STAT_MAS_RES_FIJA_TIERRA :
				return 7455;// runa re tierra
			case STAT_MAS_RES_FIJA_NEUTRAL :
				return 7456;// runa re neutral
			case STAT_MAS_RES_PORC_FUEGO :
				return 7457;// runa re %fuego
			case STAT_MAS_RES_PORC_AIRE :
				return 7458;// runa re %aire
			case STAT_MAS_RES_PORC_AGUA :
				return 7560;// runa re %agua
			case STAT_MAS_RES_PORC_TIERRA :
				return 7459;// runa re %tierra
			case STAT_MAS_RES_PORC_NEUTRAL :
				return 7460;// runa re %neutral
		}
		return 0;
	}
	
	public static int getPotenciaPlusRuna(Objeto objeto) {
		switch (objeto.getObjModelo().getTipo()) {
			case OBJETO_TIPO_POCION_FORJAMAGIA :
			case OBJETO_TIPO_RUNA_FORJAMAGIA :
				if (objeto.tieneStatTexto(STAT_POTENCIA_RUNA)) {
					try {
						return Integer.parseInt(objeto.getParamStatTexto(STAT_POTENCIA_RUNA, 3), 16);
					} catch (Exception ignored) {}
				}
				break;
		}
		return 0;
	}
	
	public static boolean esStatDePelea(final int statID) {
		return switch (statID) {
// runa reenvio
// runa invo
// criticos
// % resistencia
// % resistencia
// % resistencia
// % resistencia
// % resistencia
// curas
// prospeccion
// pods
// % da�os
// + da�os
// alcance
// PM
// PA
// PA
// inteligencia
// vitalidad
// sabiduria
// suerte
// fuerza
// agilidad
// iniciativa
// prob perdidas PM
// prob perdidas PA
// placaje
// huida
			case STAT_MAS_DA�OS_DE_AGUA, STAT_MAS_DA�OS_DE_AIRE, STAT_MAS_DA�OS_DE_FUEGO, STAT_MAS_DA�OS_DE_TIERRA, STAT_MAS_DA�OS_DE_NEUTRAL, STAT_MAS_DA�OS_EMPUJE, STAT_MAS_REDUCCION_CRITICOS, STAT_MAS_DA�OS_CRITICOS, STAT_MAS_REDUCCION_EMPUJE, STAT_MAS_RETIRO_PA, STAT_MAS_RETIRO_PM, STAT_MAS_HUIDA, STAT_MAS_PLACAJE, STAT_MAS_ESQUIVA_PERD_PA, STAT_MAS_ESQUIVA_PERD_PM, STAT_MAS_INICIATIVA, STAT_MAS_AGILIDAD, STAT_MAS_FUERZA, STAT_MAS_SUERTE, STAT_MAS_SABIDURIA, STAT_MAS_VITALIDAD, STAT_MAS_INTELIGENCIA, STAT_MAS_PA, STAT_MAS_PA_2, STAT_MAS_PM, STAT_MAS_ALCANCE, STAT_MAS_DA�OS, STAT_MAS_PORC_DA�OS, STAT_MAS_PODS, STAT_MAS_PROSPECCION, STAT_MAS_CURAS, STAT_MAS_RES_PORC_TIERRA, STAT_MAS_RES_PORC_AGUA, STAT_MAS_RES_PORC_AIRE, STAT_MAS_RES_PORC_FUEGO, STAT_MAS_RES_PORC_NEUTRAL, STAT_MAS_RES_FIJA_TIERRA, STAT_MAS_RES_FIJA_AGUA, STAT_MAS_RES_FIJA_AIRE, STAT_MAS_RES_FIJA_FUEGO, STAT_MAS_RES_FIJA_NEUTRAL, STAT_MAS_RES_PORC_PVP_TIERRA, STAT_MAS_RES_PORC_PVP_AGUA, STAT_MAS_RES_PORC_PVP_AIRE, STAT_MAS_RES_PORC_PVP_FUEGO, STAT_MAS_RES_PORC_PVP_NEUTRAL, STAT_MAS_GOLPES_CRITICOS, STAT_MAS_CRIATURAS_INVO, STAT_REENVIA_DA�OS, STAT_MAS_DA�OS_TRAMPA, STAT_MAS_DA�OS_REDUCIDOS_NO_FECA, STAT_MAS_PORC_DA�OS_TRAMPA, STAT_MAS_VELOCIDAD, STAT_MAS_RES_FIJA_PVP_TIERRA, STAT_MAS_RES_FIJA_PVP_AGUA, STAT_MAS_RES_FIJA_PVP_AIRE, STAT_MAS_RES_FIJA_PVP_FUEGO, STAT_MAS_RES_FIJA_PVP_NEUTRAL, STAT_REDUCCION_FISICA, STAT_REDUCCION_MAGICA, STAT_MAS_DA�OS_REDUCIDOS_ARMADURAS_FECA -> true;
			default -> false;
		};
	}
	
	public static float getPesoStat(final int statID) {
		float pesoRuna = switch (statID) {
			case STAT_REDUCCION_FISICA, STAT_REDUCCION_MAGICA -> 10;
// iniciativa
			case STAT_MAS_INICIATIVA -> 0.1f;
// + da�o neutral
			case STAT_MAS_DA�OS_DE_AGUA, STAT_MAS_DA�OS_DE_TIERRA, STAT_MAS_DA�OS_DE_AIRE, STAT_MAS_DA�OS_DE_FUEGO, STAT_MAS_DA�OS_DE_NEUTRAL -> 5;
// Pod
			case STAT_MAS_ESQUIVA_PERD_PA, STAT_MAS_ESQUIVA_PERD_PM, STAT_MAS_PODS -> 0.25f;
// Vitalidad
			case STAT_MAS_VITALIDAD -> 0.50f;
// Inteligencia
			case STAT_MAS_FUERZA, STAT_MAS_AGILIDAD, STAT_MAS_SUERTE, STAT_MAS_INTELIGENCIA -> 1;
			case STAT_MAS_DA�O_FISICO, STAT_MAS_PORC_DA�OS, STAT_MAS_PORC_DA�OS_TRAMPA, STAT_MAS_RES_FIJA_TIERRA, STAT_MAS_RES_FIJA_AGUA, STAT_MAS_RES_FIJA_AIRE, STAT_MAS_RES_FIJA_FUEGO, STAT_MAS_RES_FIJA_NEUTRAL, STAT_MAS_RES_FIJA_PVP_TIERRA, STAT_MAS_RES_FIJA_PVP_AGUA, STAT_MAS_RES_FIJA_PVP_AIRE, STAT_MAS_RES_FIJA_PVP_FUEGO, STAT_MAS_RES_FIJA_PVP_NEUTRAL -> 2;
// Prospeccion
			case STAT_MAS_SABIDURIA, STAT_MAS_PROSPECCION -> 3;
// trampa da�os
			case STAT_MAS_DA�OS_TRAMPA -> 5;
			case STAT_MAS_RES_PORC_TIERRA, STAT_MAS_RES_PORC_AGUA, STAT_MAS_RES_PORC_AIRE, STAT_MAS_RES_PORC_FUEGO, STAT_MAS_RES_PORC_NEUTRAL, STAT_MAS_RES_PORC_PVP_TIERRA, STAT_MAS_RES_PORC_PVP_AGUA, STAT_MAS_RES_PORC_PVP_AIRE, STAT_MAS_RES_PORC_PVP_FUEGO, STAT_MAS_RES_PORC_PVP_NEUTRAL -> 6;
// curas
			case STAT_MAS_DA�OS, STAT_MAS_CURAS -> 20;
// da�os reenvio
			case STAT_MAS_GOLPES_CRITICOS, STAT_MAS_CRIATURAS_INVO, STAT_REENVIA_DA�OS -> 30;
// alcance
			case STAT_MAS_ALCANCE -> 51;
// PM
			case STAT_MAS_PM -> 90;
// PA
			case STAT_MAS_PA -> 100;
			case STAT_MAS_VELOCIDAD -> 0.1f;
			case STAT_MAS_DA�OS_EMPUJE, STAT_MAS_REDUCCION_CRITICOS, STAT_MAS_DA�OS_CRITICOS, STAT_MAS_REDUCCION_EMPUJE, STAT_MAS_DA�OS_REDUCIDOS_NO_FECA, STAT_MAS_DA�OS_REDUCIDOS_ARMADURAS_FECA -> 10;
			case STAT_MAS_RETIRO_PA, STAT_MAS_RETIRO_PM -> 1;
// placaje
			case STAT_MAS_HUIDA, STAT_MAS_PLACAJE -> 2;
			default -> 0;
		};
		return pesoRuna;
	}
	
	public static int convertirStatsEnPuntosKoliseo(final Stats s) {
		int suma = 0;
		for (final Entry<Integer, Integer> e : s.getEntrySet()) {
			suma += getPesoStat(e.getKey()) * e.getValue();
		}
		return suma;
	}
	
	public static boolean excedioLimitePeso(final Objeto runa, final int cant) {
		final int statID = getStatPorRunaPocima(runa);
		if (statID == -1) {
			return false;
		}
		return getPesoStat(statID) * cant > MainServidor.MAX_PESO_POR_STAT;
	}
	
	public static boolean excedioLimiteExomagia(int statID, int cantidad) {
		if (MainServidor.LIMITE_STATS_EXO_FORJAMAGIA.containsKey(statID)) {
			return MainServidor.LIMITE_STATS_EXO_FORJAMAGIA.get(statID) > cantidad;
		}
		return false;
	}
	
	public static boolean excedioLimiteOvermagia(int statID, int cantidad) {
		if (MainServidor.LIMITE_STATS_OVER_FORJAMAGIA.containsKey(statID)) {
			return MainServidor.LIMITE_STATS_OVER_FORJAMAGIA.get(statID) > cantidad;
		}
		return false;
	}
	
	public static boolean excedioLimiteMagueoDeRuna(final int runaID, final int cant) {
		return switch (runaID) {
// suerte
// Agilidad
// Inteligencia
// Fuerza
			case 1519, 1522, 1524, 1525 -> cant >= 50;
// Pa suerte
// Pa agilidad
// Pa Inteligencia
// Pa fuerza
			case 1545, 1547, 1549, 1550 -> cant >= 70;
// Ra suerte
// Ra Agilidad
// Ra Inteligencia
// Ra Fuerza
			case 1551, 1553, 1555, 1556 -> cant >= 101;
// Pod
			case 7443 -> cant >= 100;
// Pa pod
			case 7444 -> cant >= 200;
// Ra pod
			case 7445 -> cant >= 404;
// iniciativa
			case 7448 -> cant >= 300;
// Pa iniciativa
			case 7449 -> cant >= 600;
// Ra iniciativa
			case 7450 -> cant >= 1010;
// Sabiduria
			case 1521 -> cant >= 11;
// Pa Sabiduria
			case 1546 -> cant >= 22;
// Ra Sabiduria
			case 1552 -> cant >= 34;
// Vitalidad
			case 1523 -> cant >= 50;
// Pa Vitalidad
			case 1548 -> cant >= 250;
// Ra Vitalidad
			case 1554 -> cant >= 404;
			default -> false;
		};
	}
}