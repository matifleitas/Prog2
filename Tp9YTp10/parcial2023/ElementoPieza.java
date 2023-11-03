package parcial2023;

import java.util.ArrayList;

public abstract class ElementoPieza {
	private String nombre;
	private String descripcion;
	
    private static int precioGramo=12;
    private static int costoSegundo=45;
    
	public ElementoPieza(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
    
	public abstract int getPla();
	public abstract int getCantidadSimples();
	public abstract int getTiempo();
	public abstract ArrayList<String> getColores() ;
	public abstract ArrayList<PiezaSimple> buscar(Condicion pp);

	public int getCosto() {
		//pla necesario por el precio del gr pla mas la cantidad de segundos de impresion por un costo de segundo
		return this.getPla()*ElementoPieza.getPrecioGramo() + this.getTiempo()*ElementoPieza.getCostoSegundo();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static int getPrecioGramo() {
		return precioGramo;
	}

	public static void setPrecioGramo(int precioGramo) {
		ElementoPieza.precioGramo = precioGramo;
	}

	public static int getCostoSegundo() {
		return costoSegundo;
	}

	public static void setCostoSegundo(int costoSegundo) {
		ElementoPieza.costoSegundo = costoSegundo;
	}
}



