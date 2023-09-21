package empleadosV2;

public class Empleado{
	private String nombre;
	private String apellido;
	private FormaPago formaPago;
	
	public Empleado(String nombre, String apellido, FormaPago formaPago) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.formaPago = formaPago;
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

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}
	
	
}
