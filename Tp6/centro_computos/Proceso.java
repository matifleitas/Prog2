package centro_computos;

public class Proceso extends TipoElementoCola{
	private String nombre;
	private double memoriaRequerida;
	
	public Proceso(String nombre, double memoriaRequerida) {
		this.nombre = nombre;
		this.memoriaRequerida = memoriaRequerida;
	}

	public String getNombre() {
		return nombre;
	}

	public double getMemoriaRequerida() {
		return memoriaRequerida;
	}

	@Override
	public boolean esMayor(TipoElementoCola elementoN) {
		return this.getMemoriaRequerida() > ((Proceso) elementoN).getMemoriaRequerida();
											//cast de elemento a Proceso
	}

	@Override
	public boolean equals(Object o1) {
		try {
			Proceso procesoNuevo = (Proceso)o1;
			if(this.getNombre().equals(procesoNuevo.getNombre()) &&
				this.getMemoriaRequerida() == (procesoNuevo.getMemoriaRequerida())){
				return true;
			}
			
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Proceso [nombre=" + nombre + ", memoraRequerida=" + memoriaRequerida + "]";
	}
}
