package dados;

public class Dado {
	
	private static final int CARAS_POR_DEFECTO = 6;
	private int caras;
	
	/*public Dado(int caras) { //setea las caras, segun el numero que le hayan pasado x parametro
		this.setCaras(caras);
	}*/
	
	public Dado() { //este metodo setea 6 x defecto
		this.caras = CARAS_POR_DEFECTO;
	}
	
	public int tirar() {
		return (int)(Math.random() * this.caras) + 1;
	}
}
