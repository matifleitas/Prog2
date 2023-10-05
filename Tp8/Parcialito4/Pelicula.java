package Parcialito4;

import java.util.ArrayList;

public class Pelicula {
	//private final int EDAD_MIN = 13;
	private String titulo, sinopsis, director;
	private ArrayList<String> generos, actores;
	private int anio_estreno, minutos, edad;
	
	public Pelicula(String titulo, String sinopsis, String director, int anio_estreno, int minutos, int edad) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.generos = new ArrayList<>();
		this.actores = new ArrayList<>();
		this.anio_estreno = anio_estreno;
		this.minutos = minutos;
		this.edad = edad;
	}
	
	public ArrayList<String> getGeneros(){
		return new ArrayList<>(generos);
	}
	
	public ArrayList<String> getActores(){
		return new ArrayList<>(actores);
	}
	
	public void addActores(String actor) {
		actores.add(actor);
	}
	
	public void addGenero(String genero) {
		generos.add(genero);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnio_estreno() {
		return anio_estreno;
	}

	public void setAnio_estreno(int anio_estreno) {
		this.anio_estreno = anio_estreno;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", sinopsis=" + sinopsis + ", director=" + director + " \n"+", generos="
				+ generos + ", anio_estreno=" + anio_estreno + ", minutos=" + minutos + ", edad=" + edad +"]"+" \n"+
				" ........................................................................................ "+" \n";

	}
	
	
	
}
