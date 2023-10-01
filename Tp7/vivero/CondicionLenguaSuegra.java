package vivero;

public class CondicionLenguaSuegra extends CondicionVivero{
	private String nombre;

	public CondicionLenguaSuegra() {
		this.nombre = "Lengua de suegra";
	}

	@Override
	public boolean siCumple(Planta p) {
		return p.getNombresVulgares().contains(this.nombre.toLowerCase());
		
	}
}
