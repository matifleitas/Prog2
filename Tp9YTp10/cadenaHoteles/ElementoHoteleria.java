package cadenaHoteles;

public abstract class ElementoHoteleria {
	private String nombre;
//	protected Condicion c1;
	
	public ElementoHoteleria(String nombre) {
		this.nombre = nombre;
	}

	public abstract int cantHabitacionesCondicion(Condicion c1);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
