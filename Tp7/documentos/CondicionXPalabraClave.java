package documentos;

import java.util.ArrayList;

public class CondicionXPalabraClave extends Condicion {
	
	private String fraseOtitulo;
	
	public CondicionXPalabraClave(String fraseOtitulo) {

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

}
