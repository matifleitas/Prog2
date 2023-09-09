package sombrero;

import java.util.ArrayList;

public class Casa {
	
	private final int MAXCANTALUM = 100;
	ArrayList<Alumno> listaAlummnos;
	protected Cualidad cualidadCasa;
	protected Comportamiento comportamientos;
	protected String nombre_casa;
	
	public Casa(String nombre_casa, Comportamiento comportamiento) {
		this.nombre_casa = nombre_casa;
		this.comportamientos = comportamiento;
		listaAlummnos = new ArrayList<Alumno>();
	}
	
	public void addAlumno(Alumno alumnoN) {
		if(hayLugar() && !alumnoN.isPerteneceACasa() && comportamientos.Requerimientos(alumnoN, this)) {
			listaAlummnos.add(alumnoN);
			alumnoN.setPerteneceACasa(true);
		} else {
			System.out.println("La casa esta llena o el alumno ya esta en la casa o no cumple los requerimientos de la casa");
		}
	}
	
	public void removeAlumno(Alumno alumnoAeliminar) {
		for (Alumno alumno : listaAlummnos) {
			if(alumno.equals(alumnoAeliminar) && alumno.getNombre() == alumnoAeliminar.getNombre()) {
				listaAlummnos.remove(alumno);
			}
		}
	}
	
	public boolean hayLugar() {
		if(listaAlummnos.size() <= MAXCANTALUM) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean equals(Object o1) {
		try {
			 Casa nuevaCasa = (Casa)o1;
			 if(this.getNombre_casa() == nuevaCasa.getNombre_casa()) {//si las casas tienen el mismo nombre son equals
				 return true;
			 } else { 
				 return false;
			 }		 
		} catch (Exception e) {
			return false;
		}
	}
	
	public ArrayList<Alumno> getArrayAlumnos() {
		ArrayList<Alumno> copiaArrayList = new ArrayList<>(listaAlummnos);
		return copiaArrayList;
	}


	public String getNombre_casa() {
		return nombre_casa;
	}

	public void setNombre_casa(String nombre_casa) {
		this.nombre_casa = nombre_casa;
	}

	public int getCant_max() {
		return MAXCANTALUM;
	}

	public Cualidad getCualidadCasa() {
		return cualidadCasa;
	}

	public void setCualidadCasa(Cualidad cualidadCasa) {
		this.cualidadCasa = cualidadCasa;
	}

	public Comportamiento getComportamientos() {
		return comportamientos;
	}

	public void setComportamientos(Comportamiento comportamientos) {
		this.comportamientos = comportamientos;
	}
	
}
