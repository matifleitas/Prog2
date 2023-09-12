package videoclub;

import java.time.LocalDate;

public class Pelicula extends ItemAlquilable{
	
	private String nombre;
	private int cantCopias;
	
	private LocalDate fechaEstreno;
	private String descripcion;
	
	public Pelicula(String nombre, int cantidadDisponible, int cantCopias, LocalDate fechaEstreno, String descripcion) {
		super(nombre, cantidadDisponible);
		this.nombre = nombre;
		this.cantCopias = cantCopias;
		this.fechaEstreno = fechaEstreno;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantCopias() {
		return cantCopias;
	}

	public void setCantCopias(int cantCopias) {
		this.cantCopias = cantCopias;
	}

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
