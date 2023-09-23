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
	
//	@Override
//	public boolean equals(Object obj) {
//		try {
//			CondicionXTitulo condicion = (CondicionXTitulo)obj;
//			if(this.getTitulo() == condicion.getTitulo()) {
//				return true;
//			}else {
//				return false;
//			}
//		} catch(Exception e) {
//			return false;
//		}
//	}

	public String getTitulo() {
		return titulo;
	}
}
