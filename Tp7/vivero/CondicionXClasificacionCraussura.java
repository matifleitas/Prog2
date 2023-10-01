package vivero;

public class CondicionXClasificacionCraussura extends CondicionVivero {

	private String nombre;

	public CondicionXClasificacionCraussura() {
		this.nombre = "Crassula";
	}

	@Override
	public boolean siCumple(Planta p) {
		return p.getClasificacion().toLowerCase().equals(this.nombre.toLowerCase());
	}

}
