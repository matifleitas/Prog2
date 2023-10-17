package arbol;

import java.util.ArrayList;
import java.util.Collections;

public class Arbol{
	private Nodo raiz;
	private ArrayList<Nodo> nodosOrdenados;
	
	public Arbol() {
		this.raiz = new Nodo();
		nodosOrdenados = new ArrayList<>();
	}
	
	public void add(int i) {
		this.raiz.addValor(i);
	}
	
	public void addArray(Nodo n) {
		this.nodosOrdenados.add(n);
	}
	
	public void ordenado() {
		Collections.sort(nodosOrdenados);
	}
	
	public void print() {
		this.raiz.print();
	}
	
	public ArrayList<Nodo> getArray(){
		return new ArrayList<>(nodosOrdenados);
	}
}
