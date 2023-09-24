package documentos;

public class CondicionTituloTengaFrase extends Condicion {

	private String palabOFrase;
	
	public CondicionTituloTengaFrase(String palabOFrase) {
		this.palabOFrase = palabOFrase;
	}

	@Override
	public boolean siCumple(Documento doc) {
		return doc.getTitulo().toLowerCase().contains(palabOFrase.toLowerCase());
	}

}
