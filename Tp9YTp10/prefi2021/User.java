package prefi2021;

public class User implements Comparable<User>{
	private String nombre;
	private String email;
	private int anio;
	
	public User(String nombre, String email, int anio) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.anio = anio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public int compareTo(User o) {
		int result = this.nombre.compareTo(o.getNombre());
		if(result == 0)
			return this.email.compareTo(o.getEmail());
		return result;
	}
	
	
	
}
