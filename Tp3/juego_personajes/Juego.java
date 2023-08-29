package juego_personajes;

import java.util.ArrayList;

public class Juego {
	private ArrayList<Personaje> listaPersonaje;
	//private int puntaje;
	
	public Juego() {
		this.listaPersonaje = new ArrayList<Personaje>();
		//this.puntaje = puntaje;
	}
	
	public ArrayList<Personaje> getListaPersonaje() {
		return listaPersonaje;
	}
	
	public void cargarPersonaje(Personaje personajeNuevo) {
		//for (Personaje personaje : listaPersonaje) {
			//if(personaje.getNombre_super_heroe() != personajeNuevo.getNombre_super_heroe()) {
				listaPersonaje.add(personajeNuevo);
			//}
		//}
	}
	
	public void verQuienGana(Personaje pj1, Personaje pj2) {
		//gana quien tenga mas fuerza y velocidad juntos
		int fuerzaTotalPj1 = pj1.getFuerza() + pj1.getVelocidad();
		int fuerzaTotalPj2 = pj2.getFuerza() + pj2.getVelocidad();
		
		
		if(fuerzaTotalPj1 > fuerzaTotalPj2) {
			System.out.println("El ganador es el jugador 1: " + pj1.getNombre_super_heroe() + " con un total de: "+fuerzaTotalPj1 + " puntos a " + fuerzaTotalPj2);
		} else if(fuerzaTotalPj2 > fuerzaTotalPj1){
			System.out.println("El ganador es el jugador 2: " + pj2.getNombre_super_heroe() + " nombre real: " + pj2.getNombre_real() + " con un total de: "+fuerzaTotalPj2 + " puntos a " + fuerzaTotalPj1);
		} else {
			System.out.println("Empate");
		}
	}
	
}
