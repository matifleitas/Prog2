package Parcialito4;

import java.util.ArrayList;

public class PeliculasMenos120GeneroComedia implements Rentabilidad{

	private int minutosMax;
	private String generoBuscado;
	
	public PeliculasMenos120GeneroComedia() {
		this.minutosMax = 120;
		this.generoBuscado = "Comedia";
	}

	@Override
	public boolean esRentable(Pelicula p) {
		ArrayList<String> generosDeLaPeli = p.getGeneros();
		
		if(p.getMinutos() < this.minutosMax) {
			for(int i=0; i < generosDeLaPeli.size(); i++) {
				String generoPos = generosDeLaPeli.get(i);
				if(generoPos.equals(this.generoBuscado)) {
					return true;
				}
			}
		}return false;
	}
}
