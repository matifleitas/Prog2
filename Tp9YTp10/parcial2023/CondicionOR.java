package parcial2023;

public class CondicionOR extends Condicion{
	private Condicion c1, c2;

	public CondicionOR(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean siCumple(ElementoPieza elemento) {
		return c1.siCumple(elemento) || c2.siCumple(elemento);
	}
}
