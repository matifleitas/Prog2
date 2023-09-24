package documentos;

import java.util.ArrayList;

public class CondicionXAutor extends Condicion {

	private String apellidoAutor;
	
	public CondicionXAutor(String apellidoAutor) {
		this.apellidoAutor = apellidoAutor;
	}

	@Override
	public boolean siCumple(Documento doc) {
		ArrayList<Autor> autores = doc.getAutores();
		for(int i=0; i<autores.size(); i++) {
			if(autores.get(i).getApellido().toLowerCase().equals(this.getApellidoAutor().toLowerCase()))
				return true;
		}return false;
	}

	public String getApellidoAutor() {
		return apellidoAutor;
	}

}
