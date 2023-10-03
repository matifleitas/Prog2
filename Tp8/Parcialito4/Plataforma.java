package Parcialito4;

import java.util.ArrayList;

public class Plataforma {
	
	private String nombre;
	private ArrayList<Pelicula> peliculas;
	
	public Plataforma(String nombre) {
		this.nombre = nombre;
		peliculas = new ArrayList<>();
	}

	public ArrayList<Pelicula> buscarPelis(Buscador busc){
		ArrayList<Pelicula> pelisQueCumplan = new ArrayList<>();
		
		for(int i=0; i<this.peliculas.size(); i++) {
			Pelicula peliculaPos = this.peliculas.get(i);
			if(busc.siCumple(peliculaPos)) {
				pelisQueCumplan.add(peliculaPos);
			}
		}return pelisQueCumplan;
	}
	
	public ArrayList<Pelicula> buscarPelisRentables(Rentabilidad r){
		ArrayList<Pelicula> pelisRentables = new ArrayList<>();
		
		for(int i=0; i<this.peliculas.size(); i++) {
			Pelicula peliculaPos = this.peliculas.get(i);
			if(r.esRentable(peliculaPos)) {
				pelisRentables.add(peliculaPos);
				System.out.println("Las siguientes peliculas son rentables: "+"\n");
			} 
		}return pelisRentables;
	}

	
	public void addPelicula(Pelicula p) {
		this.peliculas.add(p);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
