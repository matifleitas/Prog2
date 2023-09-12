package centro_computos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		CentroComputo centro = new CentroComputo();
		
		Computadora c1 = new Computadora("lab1", 2344.5);
		Computadora c2 = new Computadora("lab2", 1244.5);
		Computadora c3 = new Computadora("lab3", 3244.5);
		Computadora c4 = new Computadora("lab4", 5644.5);

		centro.addComputadora(c1);
		centro.addComputadora(c2);
		centro.addComputadora(c3);
		centro.addComputadora(c4);
		

		
		
		
	}

}
