package contacto_celular;

import java.time.LocalDate;

public class Contacto {
	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	private int num_tel;
	private String direccion;
	private String direccion_mail;
	
	public Contacto(String nombre, String apellido, LocalDate fecha_nacimiento, int num_tel, String direccion, String direccion_mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.num_tel = num_tel;
		this.direccion = direccion;
		this.direccion_mail = direccion_mail;
	}
	
//	public String mostrarInformacion() {
//        return "Contacto {" +
//                "Nombre =" + this.getNombre() +
//                ", Apellido =" + this.getApellido() +
//                ", Numero_telefono =" + this.getNum_tel() +
//                '}';
//	}
	
	 @Override
	    public String toString() {
	        return "Contacto {" +
	                "Nombre =" + this.getNombre() +
	                ", Apellido =" + this.getApellido() +
	                ", Numero_telefono =" + this.getNum_tel() +
	                '}';
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

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getNum_tel() {
		return num_tel;
	}

	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion_mail() {
		return direccion_mail;
	}

	public void setDireccion_mail(String direccion_mail) {
		this.direccion_mail = direccion_mail;
	}

	
	
}
