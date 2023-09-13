package puertoCereales;

import java.util.ArrayList;

public class ColaEspera {
	private ArrayList<ElementoCola> elementos;

	public ColaEspera() {
		
		this.elementos = new ArrayList<ElementoCola>();
	}
	
	public boolean tieneElementos() {
		return !elementos.isEmpty();
	}
	
	public void addElemento(ElementoCola elemento) {
		boolean inserto=false;
		int i=0;
			while(!inserto && i<elementos.size()) { 
				if(elemento.esMayor(elementos.get(i))) {
					elementos.add(i, elemento);
					inserto=true;
			}else {
				i++;
			}if(!inserto)
			elementos.add(elemento);
		}
	}
	
	public ElementoCola getSiguienteYEliminaUno() {
		if(this.tieneElementos()) {
			return elementos.remove(0);//devuelvo el elemento con uno menos en su array
		}else {
			return null;
		}
	}
}
