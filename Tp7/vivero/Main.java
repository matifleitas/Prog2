package vivero;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Planta potus = new Planta("EpipremnumAuereum", "Crassula", "Araceae", "Monocotyledoneae", 6, 2);
		Planta filodendros = new Planta("Philodendron ", "Alismatales ", "Araceae", "Liliopsida", 3, 2);
		Planta cactus = new Planta("Cactaceae", "Magnoliophyta ", "Cactaceae", "Eudicotyledoneae", 1, 5);
		Planta echinopsis = new Planta("Echinopsis Zucc", "Trichocereeae ", "Cactaceae", "Plantae", 10, 6);
		Planta dracaena  = new Planta("EpiprAuereum", "Magnoliophyta ", "Asparagaceae", "Liliopsida", 9, 5);
		Planta make  = new Planta("EpiprAuereum", "Crassula ", "Asparagaceae", "Liliopsida", 9, 2);
		
		potus.addNombreVulgar("Orejona");
		potus.addNombreVulgar("Damian");
		potus.addNombreVulgar("Gitana");
		filodendros.addNombreVulgar("Rojita");
		filodendros.addNombreVulgar("filips");
		dracaena.addNombreVulgar("Claudio");
		dracaena.addNombreVulgar("lengua de suegra");
		make.addNombreVulgar("lengua de suegra");
		
		Vivero viveroBuscador = new Vivero("Vivero Makelele");
		
		viveroBuscador.addPlanta(potus);
		viveroBuscador.addPlanta(filodendros);
		viveroBuscador.addPlanta(cactus);
		viveroBuscador.addPlanta(echinopsis);
		viveroBuscador.addPlanta(dracaena);
		viveroBuscador.addPlanta(make);
		
		
		System.out.println("\n Las plantas que tengan la clase Crassula: \n");
		ArrayList<Planta> plantasCrassula = viveroBuscador.buscarPlantas(new CondicionXClasificacionCraussura());
		System.out.println(plantasCrassula);
		System.out.println("\n Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3:  \n");
		ArrayList<Planta> plantasSolYRiego = viveroBuscador.buscarPlantas(new CondicionXRiego());
		System.out.println(plantasSolYRiego);
		System.out.println("\n Todas las plantas de interior que necesiten poco riego (inferior a 3): \n");
		ArrayList<Planta> plantasPocoRiego = viveroBuscador.buscarPlantas(new CondicionPocoRiego());
		System.out.println(plantasPocoRiego);
		
		CondicionVivero con1 = new CondicionLenguaSuegra();
		CondicionVivero con2 = new CondicionPocoRiego();
		CondicionVivero con3 = new CondicionXAuereum();
		CondicionVivero con4 = new CondicionXRiego();
		//CondicionVivero con5 = new CondicionXRiego2();
		CondicionVivero con6 = new CondicionXClasificacionCraussura();
		
		System.out.println("\n Los que cumplan todo: ");
		ArrayList<Planta> condicionTODO = viveroBuscador.buscarPlantas(new CondicionAND(con1, con2, con3, con4, con6));
		System.out.println(condicionTODO);
	}

}
