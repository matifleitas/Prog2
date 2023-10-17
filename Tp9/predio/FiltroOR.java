package predio;

public class FiltroOR implements Filtro{
	private Filtro c1, c2;
	
	public FiltroOR(Filtro c1, Filtro c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean siCumple(Socio s) {
		return this.c1.siCumple(s)||this.c2.siCumple(s);
	}

}
