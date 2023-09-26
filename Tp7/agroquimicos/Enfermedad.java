package agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
	private String nombre;
	private ArrayList<EstadoPatologico> estadosPatologicos;
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
		estadosPatologicos = new ArrayList<>();
	}
	
}
