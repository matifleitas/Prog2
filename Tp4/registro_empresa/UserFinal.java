package registro_empresa;

public class UserFinal extends Persona {

	private String nombre_user;
	private String password;
	
	public UserFinal(String cargo_laboral, String nombre, String apellido, int edad, String nombre_user, String password) {
		super(nombre, apellido, edad);
		this.nombre_user = nombre_user;
		this.password = password;
		if(super.verificarEsEmpleado(cargo_laboral))
			super.setCargo_laboral(cargo_laboral);
	}

	public String getNombre_user() {
		return nombre_user;
	}

	public void setNombre_user(String nombre_user) {
		this.nombre_user = nombre_user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
