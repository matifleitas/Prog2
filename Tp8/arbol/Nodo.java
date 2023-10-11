package arbol;

public class Nodo {
	private Integer valor;
	private Nodo nodoIzq;
	private Nodo nodoDer;
	private ImprimirPantalla impPant;
	
	public Nodo() {
		this.impPant = new ImprimirPantalla();
	}
	
	public void add(int integer) {
		if(valor == null) {
			this.valor = integer;
		} 
		else if(integer < valor) {	
			if(this.nodoIzq != null) {
				this.nodoIzq.add(integer);
			} else {
				this.nodoIzq = new Nodo();
				this.nodoIzq.add(integer);
			}
		}
		else if(integer > valor) {
			if(this.nodoDer != null) {
				this.nodoDer.add(integer);
			} else {
				this.nodoDer = new Nodo();
				this.nodoDer.add(integer);
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
	
	
}
