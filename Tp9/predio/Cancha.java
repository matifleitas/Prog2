package predio;

import java.time.LocalDate;

public class Cancha {
	private int id;
	private double valorTurno;
	private LocalDate fecha;

	public Cancha(int id, double valorTurno) {
		this.id = id;
		this.valorTurno = valorTurno;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public double getValorTurno() {
		return valorTurno;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
}
