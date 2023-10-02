package Parcialito4;

public class Peliculas2015Menor95 implements Buscador{

	private int anio, minutoMax;
	
	public Peliculas2015Menor95() {
		this.anio = 2015;
		this.minutoMax = 95;
	}

	@Override
	public boolean siCumple(Pelicula p) {
		return (p.getAnio_estreno() < this.anio && p.getMinutos() < this.minutoMax);
	}

	public int getAnio() {
		return anio;
	}

	public int getMinutoMax() {
		return minutoMax;
	}

}
