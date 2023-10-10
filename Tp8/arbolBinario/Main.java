package arbolBinario;

public class Main {
	 public static void main(String[] args) {
		 
	        ArbolBinario arbol = new ArbolBinario();

	        arbol.agregarValor(50);
	        Nodo raiz = arbol.getRaiz();
	        arbol.agregarValor(30);
	        arbol.agregarValor(70);
	        arbol.agregarValor(20);
	        arbol.agregarValor(40);
	        arbol.agregarValor(1);
	        arbol.agregarValor(22);
	        arbol.agregarValor(41);
	        arbol.agregarValor(11);

	        AccionEjecutable accion = new ImprimirEnPantalla();
	        
	        raiz.recorrerArbol(accion);

	    }
}
