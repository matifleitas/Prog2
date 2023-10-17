package arbol;

public class Nodo implements Comparable<Nodo>{

	private Integer valor;
	private Nodo nodoIzq;
	private Nodo nodoDer;
	private ImprimirPantalla impPant;
	
	public Nodo() {
		this.impPant = new ImprimirPantalla();
	}
	
	public void addValor(int integer) {
		if(valor == null) {
			this.valor = integer;
		} 
		else if(integer < valor) {	
			if(this.nodoIzq != null) {
				this.nodoIzq.addValor(integer);
			} else {
				this.nodoIzq = new Nodo();
				this.nodoIzq.addValor(integer);
			}
		}
		else if(integer > valor) {
			if(this.nodoDer != null) {
				this.nodoDer.addValor(integer);
			} else {
				this.nodoDer = new Nodo();
				this.nodoDer.addValor(integer);
			}
		}
	}
	
	public void print() {
		if(this.nodoIzq != null) {
			this.nodoIzq.print();
		}
		if(this.valor != null) {
			this.impPant.ejecutarNodo(this);
		}
		if(this.nodoDer != null) {
			this.nodoDer.print();
		}
	}

	@Override
	public String toString() {
		return "valor: " + valor + "";
	}

	@Override
	public int compareTo(Nodo otro) {
        return Integer.compare(this.valor, otro.valor);
	}
}
