package arbol;

public class Main {

	public static void main(String[] args) {
		
	Arbol arbol = new Arbol();
		
		arbol.add(5);
		arbol.add(7);
		arbol.add(3);
		arbol.add(1);
		arbol.add(14);
		arbol.add(8);
		arbol.add(7);
		arbol.add(6);
		arbol.add(12);
		arbol.add(12);
		arbol.add(12);
		arbol.add(9);
		arbol.print();

		System.out.println(arbol.getArray());

	}

}
