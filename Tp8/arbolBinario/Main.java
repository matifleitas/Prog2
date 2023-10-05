package arbolBinario;

public class Main {
	 public static void main(String[] args) {
		 
	        ArbolBinario arbol = new ArbolBinario();
	        
	        arbol.agregarValor(50);
	        arbol.agregarValor(30);
	        arbol.agregarValor(70);
	        arbol.agregarValor(20);
	        arbol.agregarValor(40);
	        arbol.agregarValor(1);

	        System.out.println("Árbol en orden :");
	        arbol.imprimirEnOrden();
	  
	    }
}
