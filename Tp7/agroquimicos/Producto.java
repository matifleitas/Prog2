package agroquimicos;

import java.util.ArrayList;

public class Producto {
	private String nombre;
	ArrayList<Cultivo> cultivos;
	ArrayList<EstadoPatologico> estadosPatologicos;
	
	public Producto(String nombre) {
		this.nombre = nombre;
		cultivos = new ArrayList<>();
		estadosPatologicos = new ArrayList<>();
	}
	
	
	
}
