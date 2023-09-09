package sombrero;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Alumno{
	private ArrayList<Alumno> familiares;
	private Cualidad cualidadAlumno;
	private String nombre;
	private String apellido;
	private boolean perteneceACasa;
	
	public Alumno(String nombre, String apellido, Cualidad cualidades) {
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.cualidadAlumno = cualidades;
	    familiares = new ArrayList<Alumno>();
	    perteneceACasa = false;
	}
	
	public void addFamiliar(Alumno aFamiliar) {
		if(aFamiliar != null && !familiares.contains(equals(aFamiliar))) {
			familiares.add(aFamiliar);
		}
	}
	
	//el equals compara por apellido
	public boolean equals(Object o1) {
		try {
			Alumno nuevoAlumno = (Alumno)o1;
			if(this.getApellido() == nuevoAlumno.getApellido()) {
				return true;
			} else {
				return false;
			}
			
		} catch(Exception e) {
			return false;
		}
	}
	
	public ArrayList<Alumno> getFamiliares() {
		ArrayList<Alumno> copia = new ArrayList<Alumno>(familiares);
		return copia;
	}

	public Cualidad getCualidadAlumno() {
		return cualidadAlumno;
	}


	public void setCualidadAlumno(Cualidad cualidadAlumno) {
		this.cualidadAlumno = cualidadAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isPerteneceACasa() {
		return perteneceACasa;
	}

	public void setPerteneceACasa(boolean perteneceACasa) {
		this.perteneceACasa = perteneceACasa;
	}

}
