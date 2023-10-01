package vivero;

public class CondicionXAuereum extends CondicionVivero {

	private String nombre;
	
	public CondicionXAuereum() {
		this.nombre = "auereum";
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public boolean siCumple(Planta p) {
		return p.getNombreCientifico().toLowerCase().contains(this.getNombre().toLowerCase());
	}
	
}
