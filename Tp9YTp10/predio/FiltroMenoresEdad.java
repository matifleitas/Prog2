package predio;

public class FiltroMenoresEdad implements Filtro{
	
	private int edad;
	
	public FiltroMenoresEdad() {
		this.edad = 18;
	}

	@Override
	public boolean siCumple(Socio s) {
		return this.edad > s.getEdad();
	}

}
