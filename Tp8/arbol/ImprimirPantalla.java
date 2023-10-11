package arbol;

public class ImprimirPantalla implements AccionEjecutable{

	@Override
	public void ejecutarNodo(Nodo n) {
		System.out.println(n.toString());
	}

}
