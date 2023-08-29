package peluqueria;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Peluqueria {
	ArrayList<Peluquero> lista_peluqueros;
	ArrayList<Turno> lista_turnos;
	
	private final double DESCUENTO = 0.9;
	private final int DIAS = 30;
	private final int CANT_RESERVAS = 1;
	
	public Peluqueria(ArrayList<Peluquero> lista_peluqueros) {
		lista_turnos = new ArrayList<Turno>();
		this.lista_peluqueros = lista_peluqueros;
	}
	
	public void cargarTurno(Turno turnoNuevo, Cliente clienteNuevo) {
		if(turnoDisponible(turnoNuevo)) {
			lista_turnos.add(turnoNuevo);
			System.out.println("Turno reservado a un precio de: " + turnoNuevo.getCosto_corte());
			if(vieneSeguido(clienteNuevo)) {
				System.out.println("Turno reservado a un precio con descuento de: " + turnoNuevo.getCosto_corte()*DESCUENTO);
			}
		} else {
			System.out.println("No hay turnos disponibles...");
		}
	}
	
	public boolean vieneSeguido(Cliente clienteNuevo) {
		//boolean vieneSeguido = false;
		int cant = 0;
		for (Turno turno : lista_turnos) {
			if(turno.getCliente().equals(clienteNuevo)) {
				Period periodo = Period.between(LocalDate.now(), turno.getFecha());
				if(periodo.getDays() <= DIAS) {
					cant++;
				}
			}
		}
		return cant >= CANT_RESERVAS;
	}
	
	public boolean turnoDisponible(Turno turnoNuevo) {
		boolean estaDisponible=false;
		for (Turno turno:lista_turnos) {
			if(turno.getPeluquero() == turnoNuevo.getPeluquero()) {
				if(turno.getFecha().equals(turnoNuevo.getFecha()) != turno.getHora().equals(turnoNuevo.getHora())) {
					estaDisponible = true;
				}
			} else {
				if(turno.getFecha().equals(turnoNuevo.getFecha()) != turno.getHora().equals(turnoNuevo.getHora())) {
					estaDisponible = true;
				}
			}
		}
		return estaDisponible;
	}
}
