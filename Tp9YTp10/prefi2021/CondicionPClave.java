package prefi2021;

public class CondicionPClave extends Condicion {

	private String palabra;
	
	public CondicionPClave(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean siCumple(Video v) {
		return v.contienePclave(this.palabra);
	}

}
