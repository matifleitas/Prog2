package Parcialito4;

public class PeliculasTituloContenganLuna implements Buscador{

	private String tituloLuna;
	
	public PeliculasTituloContenganLuna() {
		this.tituloLuna = "luna";
	}

	@Override
	public boolean siCumple(Pelicula p) {
		return p.getTitulo().toLowerCase().contains(tituloLuna.toLowerCase());
	}

}
