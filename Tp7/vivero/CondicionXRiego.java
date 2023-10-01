package vivero;

public class CondicionXRiego extends CondicionVivero {

	private final int SOL = 5, RIEGO = 3;
	
	@Override
	public boolean siCumple(Planta p) {
		return(p.getLuminosidad() > SOL && p.getCantAgua() < RIEGO);
	}

}
