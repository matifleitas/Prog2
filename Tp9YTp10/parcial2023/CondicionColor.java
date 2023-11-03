package parcial2023;

public class CondicionColor extends Condicion{
	private String color;
	
	public CondicionColor(String color) {
		this.color = color;
	}

	@Override
	public boolean siCumple(ElementoPieza elemento) {
		return elemento.getColores().contains(color);
	}

}
