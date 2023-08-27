package dados;

public class Jugador {
	
	private String nombre;
	private int puntaje;
	
	public Jugador(String nombre) { //constructor que inicializa el objeto Jugador y establecer valores predeterminados.
		this.nombre = nombre;
		this.puntaje = 0;
	}
	public int tomarTurno(Cubilete cubilete) { //recibe por parametro
		return cubilete.tirar();
	}
	
	public void incrementarPuntaje() { //incrementarPuntaje recibe el msj de invocacion de metodo
		this.incrementarPuntaje(1);
	}
	
	public void incrementarPuntaje(int puntaje) { //recibe el msj de incrementarPuntaje pero ahora con parametro, ya que antes no lo tenia
		this.puntaje += puntaje;
	}
	
	public void resetearPuntos() { //resetea a la variable puntaje a 0
		this.puntaje = 0;
	}
	
	public int getPuntaje() { //devuelve el valor que tenga puntaje
		return this.puntaje;
	}
	
	public String getNombre() { //devulve el nombre
		return this.nombre;
	}
	
	

}
