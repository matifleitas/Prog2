package oscarsito;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;


public class Main {
	
	public static void main(String[] args) {
		
		Comparator<Mueble> costo = new ComparatorCostoMenor();
		Comparator<Mueble> fecha = new ComparatorFechaMenor();
		Comparator<Mueble> ganancia = new ComparatorGanancia();
		
		Condicion costoCond = new CondicionCostoFabricacion(2000);
		Condicion gananciaCond = new CondicionGananciaMayor(3000);
		Condicion materialCond = new CondicionMaterial("Oscarcito");
		Condicion caractCond = new CondicionCaracteristicas("duro");
		Condicion andCond = new CondicionAnd(materialCond, caractCond);
		
		Mueble m1 = new Mueble("Pino", 2500, 6000, LocalDate.of(2023, 11, 14));
		Mueble m2 = new Mueble("Algarrobo", 3500, 8000, LocalDate.of(2023, 12, 30));
		Mueble m3 = new Mueble("Melamina", 2000, 3000, LocalDate.of(2023, 10, 28));
		Mueble m4 = new Mueble("Oscarcito", 5500, 14000, LocalDate.of(2023, 12, 20));
		m4.addCaract("duro");
		Mueble m5 = new Mueble("Roble", 4500, 8000, LocalDate.of(2023, 11, 28));
		Mueble m6 = new Mueble("Fibrofacil", 1500, 2000, LocalDate.of(2023, 10, 24));
		
		Fabrica fab = new Fabrica(costoCond, costo);
		
		fab.addPedido(m1);
		fab.addPedido(m2);
		fab.addPedido(m3);
		fab.addPedido(m4);
		fab.addPedido(m5);
		fab.addPedido(m6);
		
		fab.imprimirMueble();
		
		fab.setComparator(ganancia);
		System.out.println("");
		fab.imprimirMueble();
		
		fab.setComparator(fecha);
		System.out.println("");
		fab.imprimirMueble();
		
		System.out.println("\n" + fab.getGananciaTotal());
	}
}
