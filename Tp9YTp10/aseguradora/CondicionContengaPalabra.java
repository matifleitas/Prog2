package aseguradora;

public class CondicionContengaPalabra implements Condicion{

	private String palabra;
	
	public CondicionContengaPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean siCumple(Elemento e) {
		return e.getNombre().toLowerCase().contains(palabra.toLowerCase());
	}
}
