package arbolBinario;

public class ArbolBinario {
	
	private Nodo raiz;

	public ArbolBinario() {
		this.raiz = null; //nodo sin instanciar
	}
	
	public void agregarValor(int valorUser) {
		raiz = addNodo(raiz, valorUser);
	}

	public Nodo addNodo(Nodo nodoInstanciado, int valor) {
		if(nodoInstanciado == null) { // Si el nodo actual es nulo, creo un nuevo nodo con el valor y lo retornamos.
			Nodo nuevoNodo = new Nodo(valor);
			return nuevoNodo;
		}
		
		if(valor < nodoInstanciado.getValor()) { 
			nodoInstanciado.setIzquierda(addNodo(nodoInstanciado.getIzquierda(), valor)); 
//			nodoInstanciado.getIzquierda() <- obtiene el hijo izquierdo del nodo actual y 
//			si no esta instanciado lo crea instantaneamente con el valor que se paso
		} else {
			nodoInstanciado.setDerecha(addNodo(nodoInstanciado.getDerecha(), valor));
		}
		return nodoInstanciado;
	}
	
	public void imprimirEnOrden() {
        imprimirEnOrdenRec(raiz);
    }

    public void imprimirEnOrdenRec(Nodo nodo) {
        if (nodo != null) {
            imprimirEnOrdenRec(nodo.getIzquierda());
            System.out.print(nodo.getValor() + "-");
            imprimirEnOrdenRec(nodo.getDerecha());
        }
    }
	

}
