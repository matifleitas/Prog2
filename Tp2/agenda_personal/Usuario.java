package agenda_personal;

public class Usuario {
	private String nombre;
	private String apellido;
	private String e_mail;
	
	public Usuario(String nombre, String apellido, String e_mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.e_mail = e_mail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
}
