package puertoCereales;

public class Barco extends ElementoCola{
	private String nombre;
	private int capacidad;
	private boolean cargando;
	private Camion camionAsignado;
	
	public Barco(String nombre, int capacidad) {
		
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.cargando = false;
		this.camionAsignado = null;
	}
	
	@Override
	public boolean esMayor(ElementoCola elementoN) {
		return this.getCapacidad() > ((Barco) elementoN).getCapacidad();
	}
	
	public void asignarCamion(Camion camion) {
		this.camionAsignado = camion;
	}

	
	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public boolean isCargando() {
		return cargando;
	}

	public void setCargando(boolean cargando) {
		this.cargando = cargando;
	}

	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", capacidad=" + capacidad + ", cargando=" + cargando + ", camionAsignado="
				+ camionAsignado + "]";
	}
	
	
}
