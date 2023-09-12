package videoclub;

import java.time.LocalDate;

public class Alquiler {
	private Cliente cliente;
	private ItemAlquilable itemAlquilado;
    private LocalDate fechaDevolucion;

    
	public Alquiler(Cliente cliente, ItemAlquilable itemAlquilado, LocalDate fechaDevolucion) {
		this.cliente = cliente;
		this.itemAlquilado = itemAlquilado;
		this.fechaDevolucion = fechaDevolucion;
		itemAlquilado.alquilar();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public ItemAlquilable getItemAlquilado() {
		return itemAlquilado;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
    
    

}
