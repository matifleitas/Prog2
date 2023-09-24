package documentos;

public class CondicionXContenidoTengaFrase extends Condicion {

	private String palabraOFrase;
	
	public CondicionXContenidoTengaFrase(String palabraOFrase) {
		this.palabraOFrase = palabraOFrase;
	}

	@Override
	public boolean siCumple(Documento doc) {
		return doc.getDescripcion().toLowerCase().contains(palabraOFrase.toLowerCase());
	}

}
