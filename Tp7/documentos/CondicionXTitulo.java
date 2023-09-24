package documentos;

public class CondicionXTitulo extends Condicion {
	private String titulo;
	
	public CondicionXTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean siCumple(Documento doc) {
		return doc.getTitulo().toLowerCase().equals(this.titulo.toLowerCase());
	}

	public String getTitulo() {
		return titulo;
	}
}
