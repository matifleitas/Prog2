package registro_empresa;

public class Persona {
	protected final String USUARIO = "Usuario";
	protected final String EMPLEADO = "Empleado";
	protected final String JERARQUICO = "Jerarquico";
	
	private String cargo_laboral;
	private String nombre;
	private String apellido;
	private int edad;
	
		
	public Persona(String nombre, String apellido, int edad) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public boolean verificarEsEmpleado(String cargo) {
		boolean esEmp = false;
		if (cargo == EMPLEADO || cargo== USUARIO || cargo==JERARQUICO){
			esEmp = true;
		}
		return esEmp;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	  public String getCargo_laboral() {
		return cargo_laboral;
	}

	public void setCargo_laboral(String cargo_laboral) {
		this.cargo_laboral = cargo_laboral;
	}

	@Override
	    public String toString() {
	        return "Persona{" +
	                "nombre='" + nombre + '\'' +
	                ", apellido='" + apellido + '\'' +
	                ", edad=" + edad +
	                ", cargo laboral=" + cargo_laboral +
	                '}';
	    }
}
