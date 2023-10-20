package oscarsito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Fabrica {
	
	private ArrayList<Mueble> pedidos;
	private Comparator<Mueble> comp;
	private Condicion cond;
	private Mueble enProduccion;
	
	
	public Fabrica(Condicion cond, Comparator<Mueble> comp) {
		this.pedidos = new ArrayList<>();
		this.cond = cond;
		this.comp = comp;
	}
	
	public void addPedido(Mueble m) {
		if(m != null && muebleCumple(m)) {
			this.pedidos.add(m);
			ordenar();			
		}
	}
	
	public boolean muebleCumple(Mueble m) {
		return m != null && cond.cumple(m);
	}
	
	public double getGananciaTotal() {
		double ganancia = 0;
		for(int i = 0; i < this.pedidos.size(); i++) {
			Mueble m = pedidos.get(i);
			ganancia += m.getGanancia();
		}
		return ganancia;
	}
	
	public void fabricar() {
		this.enProduccion = this.pedidos.remove(0);
	}
	
	public Mueble getMuebleEnProduccion() {
		return this.enProduccion;
	}
	
	public void setCondicion(Condicion c) {
		this.cond = c;
	}
	
	public void setComparator(Comparator<Mueble> c) {
		this.comp = c;
		ordenar();
	}
	
	public void ordenar() {
		Collections.sort(pedidos, comp);
	}
	
	public void imprimirMueble() {
		this.pedidos.forEach(System.out::println);
	}
}
