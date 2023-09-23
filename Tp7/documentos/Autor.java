package documentos;

public class Autor {
	private String nombre;
	private String apellido;
	private String pais;
	
	public Autor(String nombre, String apellido, String pais) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getPais() {
		return pais;
	}
	
}
