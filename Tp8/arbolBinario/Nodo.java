package arbolBinario;

public class Nodo {
	private int valor;
	private Nodo izquierda;
	private Nodo derecha;
	
	public Nodo(int valor) {
		this.valor = valor;
		izquierda = null;
		derecha = null;
	}

	public int getValor() {
		return valor;
	}
	
	public Nodo getIzquierda() {
		return izquierda;
	}

	public Nodo getDerecha() {
		return derecha;
	}

	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}

	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}
}
