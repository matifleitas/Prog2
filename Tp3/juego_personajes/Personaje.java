package juego_personajes;

public class Personaje {
	private TipoPersonaje heroe_villano;
	private String nombre_real;
	private String nombre_super_heroe;
	private boolean vision_nocturna;
	private int velocidad;
	private int fuerza;
	private double altura;
	private int edad;
	
	public Personaje(TipoPersonaje heroe_villano, String nombre_real, String nombre_super_heroe, int velocidad, int fuerza, double altura, int edad) {
		this.heroe_villano = heroe_villano;
		this.nombre_real = nombre_real;
		this.nombre_super_heroe = nombre_super_heroe;
		this.vision_nocturna = false;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.altura = altura;
		this.edad = edad;
	}

	public TipoPersonaje getHeroe_villano() {
		return heroe_villano;
	}

	public String getNombre_real() {
		return nombre_real;
	}

	public void setNombre_real(String nombre_real) {
		this.nombre_real = nombre_real;
	}

	public String getNombre_super_heroe() {
		return nombre_super_heroe;
	}

	public void setNombre_super_heroe(String nombre_super_heroe) {
		this.nombre_super_heroe = nombre_super_heroe;
	}

	public boolean isVision_nocturna() {
		return vision_nocturna;
	}

	public void setVision_nocturna(boolean vision_nocturna) {
		this.vision_nocturna = vision_nocturna;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
