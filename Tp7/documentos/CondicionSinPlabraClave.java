package documentos;

public class CondicionSinPlabraClave extends Condicion {
	
	@Override
	public boolean siCumple(Documento doc) {
		return doc.getPalabrasClaves().isEmpty();
	}
}
