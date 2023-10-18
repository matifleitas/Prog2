package aseguradora;

import java.util.ArrayList;

public abstract class Elemento implements Comparable<Elemento>{
	private String nombre;
	private double montoAsegurado;
	private int numPoliza;
	private String descripcion;
	private int dni;
	
	public Elemento(String nombre, double montoAsegurado, int numPoliza, String descripcion, int dni) {
		this.nombre = nombre;
		this.montoAsegurado = montoAsegurado;
		this.numPoliza = numPoliza;
		this.descripcion = descripcion;
		this.dni = dni;
	}
	
	public abstract double calcularCostoPoliza();
	
    @Override
    public int compareTo(Elemento e) {
        return this.getNombre().compareTo(e.getNombre());
    }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumPoliza() {
		return numPoliza;
	}

	public double getMontoAsegurado() {
		return montoAsegurado;
	}

	public void setMontoAsegurado(double montoAsegurado) {
		this.montoAsegurado = montoAsegurado;
	}

	public void setNumPoliza(int numPoliza) {
		this.numPoliza = numPoliza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
}
