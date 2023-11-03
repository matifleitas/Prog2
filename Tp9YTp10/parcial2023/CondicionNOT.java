package parcial2023;

public class CondicionNOT extends Condicion {
	private Condicion c1;
	
	public CondicionNOT(Condicion c1) {
		this.c1 = c1;
	}

	@Override
	public boolean siCumple(ElementoPieza elemento) {
		return !c1.siCumple(elemento);
	}
}
