package juego_personajes;

public class Manejador {
	public static void main(String[] args) {
		Personaje batman = new Personaje(TipoPersonaje.VILLANO, "Dark Richard", "Batman", 700, 260, 1.95, 40);
		Personaje superman = new Personaje(TipoPersonaje.HEROE, "Matias Fleitas", "Superman", 290, 860, 1.98, 26);
		Personaje DuendeVerde = new Personaje(TipoPersonaje.VILLANO, "Steve-O", "Duende Verde", 549, 360, 1.90, 40);
		Personaje Spider_man = new Personaje(TipoPersonaje.HEROE, "Cristian", "Spider-man", 290, 860, 1.98, 26);
		
		
		Juego juego1 = new Juego();
		juego1.cargarPersonaje(Spider_man);
		juego1.verQuienGana(DuendeVerde, Spider_man);

		System.out.println(batman.getNombre_real());
		
	}
}
