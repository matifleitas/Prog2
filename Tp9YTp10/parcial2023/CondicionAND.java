package parcial2023;

public class CondicionAND extends Condicion {

	private Condicion c1;
	private Condicion c2;
	
	public CondicionAND(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean siCumple(ElementoPieza elemento) {
		return c1.siCumple(elemento) && c2.siCumple(elemento);
	}

}
