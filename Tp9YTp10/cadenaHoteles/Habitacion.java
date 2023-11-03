package cadenaHoteles;

import java.time.LocalDate;
import java.util.ArrayList;

public class Habitacion{
	private ArrayList<String> comodidades;
	private int cantCamas;
	private double mtsCuadrados;
	private LocalDate fechaOcupacion;
	private boolean aceptaMascotas;
	
	public Habitacion(String nombre,ArrayList<String> comodidades, int cantCamas, double mtsCuadrados, LocalDate fechaOcupacion,
			boolean aceptaMascotas) {
		this.comodidades = comodidades;
		this.cantCamas = cantCamas;
		this.mtsCuadrados = mtsCuadrados;
		this.fechaOcupacion = fechaOcupacion;
		this.aceptaMascotas = aceptaMascotas;
	}
	//array get, set;
	public int getCantCamas() {
		return cantCamas;
	}
	public void setCantCamas(int cantCamas) {
		this.cantCamas = cantCamas;
	}
	public double getMtsCuadrados() {
		return mtsCuadrados;
	}
	public void setMtsCuadrados(double mtsCuadrados) {
		this.mtsCuadrados = mtsCuadrados;
	}
	public LocalDate getFechaOcupacion() {
		return fechaOcupacion;
	}
	public void setFechaOcupacion(LocalDate fechaOcupacion) {
		this.fechaOcupacion = fechaOcupacion;
	}
	public boolean isAceptaMascotas() {
		return aceptaMascotas;
	}
	public void setAceptaMascotas(boolean aceptaMascotas) {
		this.aceptaMascotas = aceptaMascotas;
	}
	public int cant() {
		return 1;
	}
	@Override
	public String toString() {
		return "Habitacion{" +
                "cantCamas=" + cantCamas +
                ", mtsCuadrados=" + mtsCuadrados +
                ", fechaOcupacion=" + fechaOcupacion +
                ", aceptaMascotas=" + aceptaMascotas +
                '}';
	}
	
	
	
}
