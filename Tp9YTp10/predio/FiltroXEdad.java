package predio;

public class FiltroXEdad implements Filtro{

	private int edadMin;
	
	public FiltroXEdad () {
		this.edadMin = 18;
	}
	
	@Override
	public boolean siCumple(Socio s) {
		return s.getEdad() > this.edadMin;
	}
}
