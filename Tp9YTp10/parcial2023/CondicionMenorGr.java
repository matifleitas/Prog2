package parcial2023;

public class CondicionMenorGr extends Condicion {
	private int gramos;
		
	public CondicionMenorGr(int gramos) {
		this.gramos = gramos;
	}

	@Override
	public boolean siCumple(ElementoPieza elemento) {
		return elemento.getPla() < this.gramos;
	}

}
