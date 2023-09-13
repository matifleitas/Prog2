package puertoCereales;

import java.time.LocalDate;

public class Camion extends ElementoCola{
	private LocalDate fecha_carga;
	private String nombre;
	private boolean descargando;
	private Barco barcoAsignado;
	
	public Camion(LocalDate fecha_carga, String nombre) {
		this.fecha_carga = fecha_carga;
		this.nombre = nombre;
		this.descargando = false;
		this.barcoAsignado = null;
	}

	@Override
	public boolean esMayor(ElementoCola elementoN)/*elementoN es el del array de colaEspera*/ {
		return (this.getFecha_carga()).isBefore(((Camion)elementoN).getFecha_carga());
	}
	
	public void asignarBarco(Barco barco) {
		this.barcoAsignado = barco;
	}

	public LocalDate getFecha_carga() {
		return fecha_carga;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isDescargando() {
		return descargando;
	}

	public void setDescargando(boolean descargando) {
		this.descargando = descargando;
	}

	@Override
	public String toString() {
		return "Camion [fecha_carga=" + fecha_carga + ", nombre=" + nombre + ", descargando=" + descargando
				+ ", barcoAsignado=" + barcoAsignado + "]";
	}
	
	
	
}
