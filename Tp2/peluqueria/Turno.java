package peluqueria;
import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
	private Peluquero peluquero;
	private Cliente cliente;
	private LocalDate fecha;
	private LocalTime hora;
	private int costo_corte;
	
	public Turno(Peluquero peluquero, Cliente cliente, LocalDate fecha, LocalTime hora) {
		this.peluquero = peluquero;
		this.cliente = cliente;
		this.fecha = fecha;
		this.hora = hora;
		costo_corte = 2000;
	}
	
	public int getCosto_corte() {
		return costo_corte;
	}

	public Peluquero getPeluquero() {
		return peluquero;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	
	@Override
    public String toString() {
        return "Turno{" +
                "Peluquero=" + peluquero.getNombre() +
                ", persona=" + cliente.getNombre() +
                ", fecha=" + fecha.getDayOfMonth() +
                ", hora=" + hora.getHour() +
                '}';
    }
}






