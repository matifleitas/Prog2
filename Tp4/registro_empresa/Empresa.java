package registro_empresa;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Persona> listaPersona;
	
	
	
	public Empresa() {
		listaPersona = new ArrayList<Persona>();
	}

	public ArrayList<Persona> getListaPersona() {
		return listaPersona;
	}
	
	
}
