package predio;

import java.util.ArrayList;

public class Socio implements Comparable<Socio> {
	private String nombre, apellido;
	private int edad;
	private boolean pagoUltCuota;
	private ArrayList<Cancha> canchasAlquiladas;
	
	public Socio (String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		canchasAlquiladas = new ArrayList<>();
	}
	
	public ArrayList<Cancha> getArrayCanchasAlquiladas() {
		return new ArrayList<>(this.canchasAlquiladas);
	}
	
	public void addCanchaAlq (Cancha c) {
		this.canchasAlquiladas.add(c);
	}
	
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	public Socio socioCopia() {
		Socio socCopia = new Socio(this.nombre, this.apellido, this.edad);
		return socCopia;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isPagoUltCuota() {
		return pagoUltCuota;
	}

	public void setPagoUltCuota(boolean pagoUltCuota) {
		this.pagoUltCuota = pagoUltCuota;
	}

	@Override
	public int compareTo(Socio otro) {
		 // Comparar personas por edad
        if (this.getEdad() < otro.getEdad()) {
            return -1; // Si this es menor que otraPersona
        } else if (this.getEdad() > otro.getEdad()) {
            return 1; // Si this es mayor que otraPersona
        } else {
            return 0; // Si this es igual a otraPersona
        }	
	}
}
