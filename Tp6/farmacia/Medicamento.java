package farmacia;

public class Medicamento {
	private String nombre;
	private String laboratorio;
	private double precio;
	
	public Medicamento(String nombre, String laboratorio, double precio) {
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", laboratorio=" + laboratorio + " $ " +", precio=" + precio + "]";
	}
	
	
}
