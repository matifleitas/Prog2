package Parcialito4;

import java.util.ArrayList;

public class Peliculas2017 implements Rentabilidad{
	private String infantil, documental;
	private int anioMin;
	
	public Peliculas2017() {
		this.infantil = "infantil";
		this.documental = "documental";
		this.anioMin = 2017;
	}

	@Override
	public boolean esRentable(Pelicula p) {
		return(p.getAnio_estreno() > anioMin && !tieneGenerosNoDeseados(p));	
	}
			
	public boolean tieneGenerosNoDeseados(Pelicula p) {		
		ArrayList<String> generos = p.getGeneros();
		for(int i=0; i<generos.size(); i++) {
			String generoPos = generos.get(i);
			if(generoPos.toLowerCase().equals(infantil.toLowerCase()) || generoPos.toLowerCase().equals(documental.toLowerCase())) {
				return true;
			}																				
		} return false;
	}
	
}
