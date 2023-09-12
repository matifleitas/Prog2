package videoclub;

import java.util.ArrayList;


public class Cliente {

	private String nombre;
	private String apellido;
	
	
	public Cliente(String nombre, String apellido) {
		//listaALquileres = new ArrayList<Alquiler>();
		this.nombre = nombre;
		this.apellido = apellido;
	
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

	
	@Override
	public boolean equals(Object o1) {
		try {
			Cliente clienteNuevo = (Cliente)o1;
			
			if(this.getApellido() == clienteNuevo.getApellido()) {
				return true;
			} 
		} catch (Exception e) {
			return false;
		}
		return false;
	}
}
