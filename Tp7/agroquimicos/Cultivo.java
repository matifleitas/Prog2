package agroquimicos;

import java.util.ArrayList;

public class Cultivo {
	private String nombre;
	private String morfologia;
	private ArrayList<Enfermedad> enfermedades;
	
	public Cultivo(String nombre, String morfologia) {
		this.nombre = nombre;
		this.morfologia = morfologia;
		enfermedades = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMorfologia() {
		return morfologia;
	}

	public void setMorfologia(String morfologia) {
		this.morfologia = morfologia;
	}
	
	
	
	
}
