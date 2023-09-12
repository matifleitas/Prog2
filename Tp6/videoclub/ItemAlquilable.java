package videoclub;

import java.time.LocalDate;

public class ItemAlquilable {
	private String tipo;
	private int cantidadDisponible;
	private final int minStock=0;
	private LocalDate fechaEntrega;
//	private Auto auto;
//	private Pelicula peli;

    public ItemAlquilable(String nombre, int cantidadDisponible) {
  
        this.tipo = nombre;
        this.cantidadDisponible = cantidadDisponible;

    }
    
    public boolean quedanStock() {
		if(this.cantidadDisponible <= minStock) {
			return true;
		} else {
			return false;
		}
	}
    
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void alquilar() {
        if (cantidadDisponible > 0) {
            cantidadDisponible--;
        }
    }

    public void devolver() {
        cantidadDisponible++;
    }

    public String getNombre() {
        return tipo;
    }

}

