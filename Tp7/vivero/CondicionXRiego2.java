package vivero;

public class CondicionXRiego2 extends CondicionVivero {

	private final int SOL = 4, RIEGO = 4;
	
	@Override
	public boolean siCumple(Planta p) {
	
		return p.getLuminosidad() < SOL && p.getCantAgua() > RIEGO;
	}

}
