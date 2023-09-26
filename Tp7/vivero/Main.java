package vivero;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Planta potus = new Planta("EpipremnumAuereum", "Epipremnum ", "Araceae", "Monocotyledoneae", 2, 7);
		Planta filodendros = new Planta("Philodendron ", "Alismatales ", "Araceae", "Liliopsida", 3, 2);
		Planta cactus = new Planta("Cactaceae", "Magnoliophyta ", "Cactaceae", "Eudicotyledoneae", 1, 5);
		Planta echinopsis = new Planta("Echinopsis Zucc", "Trichocereeae ", "Cactaceae", "Plantae", 10, 6);
		Planta dracaena  = new Planta("EpiprAuereum", "Magnoliophyta ", "Asparagaceae", "Liliopsida", 9, 5);
		
		potus.addNombreVulgar("Orejona");
		potus.addNombreVulgar("Damian");
		potus.addNombreVulgar("Gitana");
		filodendros.addNombreVulgar("Rojita");
		filodendros.addNombreVulgar("filips");
		dracaena.addNombreVulgar("Claudio");
		
		Vivero viveroBuscador = new Vivero("Vivero Makelele");
		
		viveroBuscador.addPlanta(potus);
		viveroBuscador.addPlanta(filodendros);
		viveroBuscador.addPlanta(cactus);
		viveroBuscador.addPlanta(echinopsis);
		viveroBuscador.addPlanta(dracaena);
		
		System.out.println("\n Las plantas que contengan Auereum en su nombre: ");
		ArrayList<Planta> plantasAuereum = viveroBuscador.buscarPlantas(new CondicionXAuereum());
		System.out.println(plantasAuereum);
		System.out.println(plantasAuereum.size());
	}

}
