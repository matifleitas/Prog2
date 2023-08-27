package testing;

public class Main {
	public static void main(String[] args) {
		Avion air329 = new Avion(); //Nueva instancia de Avion
		System.out.println(air329.getColor()); //Mostrara el color rojo que esta seteado
		air329.setColor("azul"); //cambiara la variable 
		System.out.println(air329.getColor()); 
	}
}
