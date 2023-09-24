package documentos;

public class ContenidoVeintePalabras extends Condicion {

	private final int minimo=20;
	
	@Override
	public boolean siCumple(Documento doc) {
		String contenido=doc.getDescripcion();
		String[] palabras = contenido.split("\\s+");// Utiliza espacios en blanco como separador
		int numeroDePlabras = palabras.length;
		
		if(numeroDePlabras>minimo) {
			return true;
		} else
			return false;
	}

}
