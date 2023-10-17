package sist_notificaciones;

public class Usuario {
	private String nombre;
	private String apellido;
	private int edad;
	private String direccionEmail;
	
	public Usuario(String nombre, String apellido, int edad, String direccionEmail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccionEmail = direccionEmail;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public String getDireccionEmail() {
		return direccionEmail;
	}
	
	
	
	
}
