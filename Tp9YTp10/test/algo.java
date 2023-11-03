package test;

public class algo {
	private String nombre;
	private int edad;
	private String apellido;
	private static final String defecto = "tinca mamado";
	
	public algo(String nombre, int edad, String apellido) {
		this.nombre = nombre;
		this.edad = edad;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
