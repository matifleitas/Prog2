package centro_computos;

import java.util.ArrayList;

public class ColaEspera { //esta clase mantiene cosas ordenadas
	private ArrayList<TipoElementoCola> elementos;
	
	public ColaEspera() {
		this.elementos = new ArrayList<>();
	}
	
	public TipoElementoCola getSiguiente() {
		if(this.hayElementos()) {
			return elementos.remove(0);
		}else {
			return null;
		}
	}
	
	public boolean hayElementos() {
		return !elementos.isEmpty();
	}
	
	public void addElemetno(TipoElementoCola elemento) {/*recibe un elemento para poder 
														comparar sin que obj sea*/
		boolean inserto = false;
		int i=0;
		while(!inserto && i<elementos.size()) {
			if(elemento.esMayor(elementos.get(i))) {//elemento es mayor que la pos del array?
				elementos.add(i, elemento);
				inserto=true;
			} else {
				i++;
			}
		}
		if(!inserto) {
			elementos.add(elemento);
		}
	}
}
