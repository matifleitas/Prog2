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

	@Override
	public String toString() {
		return "[Nodo] -> valor:" + valor + ", izquierda:" + izquierda + ", derecha:" + derecha + "\n";
	}
	
	public void recorrerArbol(AccionEjecutable accion) {
		boolean terminoRamaIzquierda = false;
		
		if(this.getIzquierda() != null && !terminoRamaIzquierda) {
			this.getIzquierda().recorrerArbol(accion);//apunta al objeto de la izquierda del objeto actual
		} else {
			terminoRamaIzquierda = true;
		}
		
		
		if(this.getDerecha() != null && terminoRamaIzquierda) {
			this.getDerecha().recorrerArbol(accion);
		}
		
		accion.ejecutarNodo(this);
	}
	
}
