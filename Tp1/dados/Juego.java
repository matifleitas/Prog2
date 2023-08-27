package dados;

public class Juego {
	
	public static final int MAXRONDAS_PORDEFECTO = 10;

	private Jugador jugador1; //int puntos1;
	private Jugador jugador2; //int puntos2;
	private int rondas;
	private int puntajeMinimo;
	
	private Cubilete cubilete;
	
	public Juego (int puntajeMinimo, Jugador j1, Jugador j2, int cantDados) {
		this(MAXRONDAS_PORDEFECTO, puntajeMinimo, j1, j2, cantDados);
		
	}
	
	public Juego(int rondas, int puntajeMinimo, Jugador j1, Jugador j2, int cantDados) {
		this.jugador1 = j1;
		this.jugador2 = j2;
		
		this.cubilete = new Cubilete(cantDados);
		
		this.setRondas(rondas);
		this.setMinimoPuntaje(puntajeMinimo);
	}
	
	public void setMinimoPuntaje(int minimo) { //setea el minimo puntaje pasado por parametros
		this.puntajeMinimo = minimo;
	}
	
	public void setRondas(int rondas) { //setea el num de rondas pasado por parametros
		if(rondas > 0) {
			this.rondas = rondas;
		} else {
			this.rondas = MAXRONDAS_PORDEFECTO; //SOLO SI HAY ERROR
		}
	}
	
	public void jugar() { 
		jugador1.resetearPuntos(); //formatea el puntaje
		jugador2.resetearPuntos(); //formatea el puntaje
		//mecanica del juego
		for(int i=0; i < this.rondas; i++) {
			
			int resultado1 = jugador1.tomarTurno(this.cubilete);
			int resultado2 = jugador2.tomarTurno(this.cubilete);
			
			if(resultado1 > resultado2 && resultado1 > puntajeMinimo) {
				this.jugador1.incrementarPuntaje();
			} else {
				if(resultado2 > resultado1 && resultado2 > puntajeMinimo) {
					this.jugador2.incrementarPuntaje();
				}
			}
		}
		
		//decidir quien gana
		int puntos1 = jugador1.getPuntaje();
		int puntos2 = jugador2.getPuntaje();
		if(puntos1 > puntos2 ) {
			System.out.println("Gano " + jugador1.getNombre() + " " + puntos1 + " a " + puntos2);
		} else {
			if(puntos2 > puntos1) {
				System.out.println("Gano " + jugador2.getNombre() + " " + puntos2 + " a " + puntos1);
			} else {
				System.out.println("Empate");
			}
		}
	}
	
}








