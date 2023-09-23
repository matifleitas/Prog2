package documentos;

import java.util.ArrayList;

public class CondicionXPalabraClave extends Condicion {

	private Buscador arrayDocs;
	private String fraseOtitulo;
	
	public CondicionXPalabraClave(String fraseOtitulo) {
//		arrayDocs = arrayDocs;
		this.fraseOtitulo = fraseOtitulo;
	}

	@Override
	public boolean siCumple(Documento doc) {
		for(int i=0; i<doc.getPalabrasClaves().size(); i++) {
			String palabra = doc.getPalabrasClaves().get(i);
			if(palabra.toLowerCase().equals(fraseOtitulo.toLowerCase())) {
				return true;
			} 
		} return false;
	}
	
//	public boolean contienePlabraClave(Documento d) {
//		for(int i=0; i<d.getPalabrasClaves().size(); i++) {
//			if(d.)
//		}
//	}

}
