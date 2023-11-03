package parcial2023;

public class CondicionMayorTiempo extends Condicion {

	private int tiempo;
	
	public CondicionMayorTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public boolean siCumple(ElementoPieza elemento) {
		return elemento.getTiempo() > this.tiempo;
	}

}
