package Parcialito4;

import java.util.ArrayList;
//import java.util.Iterator;

public class PeliculasXGenero implements Buscador{
	
	private String generoBuscado;

	public PeliculasXGenero(String genero) {
		this.generoBuscado = genero;
	}
	
	@Override
	public boolean siCumple(Pelicula p) {
		ArrayList<String> generos = p.getGeneros();
		
		for(int i=0; i<generos.size(); i++) {
			String generoPos = generos.get(i);
			if(generoPos.toLowerCase().equals(getGeneroBuscado().toLowerCase())) {
				return true;
			}
		} return false;
	}
	
	public String getGeneroBuscado() {
		return generoBuscado;
	}
	
}
