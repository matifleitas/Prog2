package Parcialito4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Plataforma netflix = new Plataforma("Netflix");
		
		Pelicula luna = new Pelicula("luna", "Buena pelicula y muy buenos actores", "Stephen king", 2004, 140, 15);
		Pelicula crepusculo = new Pelicula("Crepusculo", "Buena pelicula", "Di caprio", 2017, 64, 19);
		Pelicula laMonja = new Pelicula("La Monja luna", "Da mucha miedo y buenos actores", "Andy Muschieti", 2011, 72, 20);
		Pelicula rapidoYFurioso = new Pelicula("Rapidos y Furiosos", "Buena pelicula de accion", "Andy Muschieti", 2010, 72, 20);
		Pelicula elConjuro = new Pelicula("El Conjuro", "Buena pelicula", "Martin Scorsese", 2019, 88, 22);

		
		luna.addGenero("Terror");
		luna.addGenero("Comedia");
		luna.addGenero("Suspenso");
		luna.addGenero("Infantil");
		luna.addGenero("Accion");
		luna.addActores("Silvestre Stallone");
		luna.addActores("Guillermo Stallone");
		
		crepusculo.addActores("Will Smith");
		crepusculo.addActores("Bruce Lee");
		crepusculo.addGenero("Aventura");
		
		laMonja.addGenero("Terror");
		laMonja.addActores("Leonardo Di Caprio");
		
		rapidoYFurioso.addActores("Will Smith");
		
		elConjuro.addActores("Will Smith");
		elConjuro.addGenero("Comedia");

		netflix.addPelicula(luna);
		netflix.addPelicula(crepusculo);
		netflix.addPelicula(laMonja);
		netflix.addPelicula(rapidoYFurioso);
		netflix.addPelicula(elConjuro);
		
//		System.out.println("Las peliculas que contengan luna en su titulo");
//		ArrayList<Pelicula> peliculasContenganTituloLuna = netflix.buscarPelis(new PeliculasTituloContenganLuna());
//		System.out.println(peliculasContenganTituloLuna);
		
//		System.out.println("Las peliculas que tengan genero tal: ");
//		ArrayList<Pelicula> peliculasXGenero = netflix.buscarPelis(new PeliculasXGenero("Terror"));
//		System.out.println(peliculasXGenero);
		
		System.out.println("todas las películas que se hayan grabado antes del 2015 y cuya duración sea\r\n"
				+ "menor a 95 minutos.\r\n"
				+ ": ");
		ArrayList<Pelicula> pelis = netflix.buscarPelis(new Peliculas2015Menor95());
		System.out.println(pelis);
//		
//		System.out.println("Las peliculas que en las que haya actuado Will Smith y cuyo director NO haya\r\n"
//				+ "sido Martin Scorsese.\r\n");
//		ArrayList<Pelicula> peliculasWillYMartin = netflix.buscarPelis(new PeliculasWillSmithMartin());
//		System.out.println(peliculasWillYMartin);
		
		System.out.println("todas las películas que se hayan grabado antes del 2015 y cuya duración sea\r\n"
				+ "menor a 95 minutos.\r\n"
				+ ": ");
		ArrayList<Pelicula> peliculaRentable = netflix.buscarPelisRentables(new PeliculasMenos120GeneroComedia());
		System.out.println(peliculaRentable);

	}

}
