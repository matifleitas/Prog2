package vivero;

public class CondicionPocoRiego extends CondicionVivero {

	private final int RIEGO_MAX=3;
	
	@Override
	public boolean siCumple(Planta p) {
		return (p.getCantAgua()<RIEGO_MAX);
	}

}
