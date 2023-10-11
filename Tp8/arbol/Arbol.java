package arbol;

public class Arbol {
	private Nodo raiz;
	
	public Arbol() {
		this.raiz = new Nodo();
	}
	
	public void add(int i) {
		this.raiz.add(i);
	}
	
	public void print() {
		this.raiz.print();
	}
}
