package agenda_personal;

import java.util.ArrayList;
import java.util.List;

import series.Temporada;

public class Agenda {
	private Usuario user1;
	private Usuario user2;
	private String lugar;
	private String tema;
	private Horario[] horarios;
	private double duracion;
	private double hora;
	
	private final int LAPSO_MAX_HORARIO = 23;

	
	public Agenda(String lugar, String tema, double horario) {
		this.lugar = lugar;
		this.tema = tema;
		this.duracion = 0.0;
		this.horarios = new Horario[LAPSO_MAX_HORARIO];
		this.hora = agregarHorario(horario);
	}
	
	public double agregarHorario(double horario) {
		for(int i = 0; i < horarios.length; i++) {
			if(this.horarios[i] != horario) {
				
			}
		}
		
	}
	
	
	 public String getDatosReunion() {
		return "Lugar: " + this.getLugar() +
				" Tema: " + this.getTema() + 
				" Horario: " + this.getHorario();
	}
	

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public double getHorario() {
		return horario;
	}

	public double setHorario(double horario) {
		if(horario > 0 && horario < 24) {
			if(horario != this.horario) {
				this.horario = horario;
			}
		}
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	public static void main(String[] args) {
		Agenda agend1 = new Agenda("Tandil", "Economia", 11);
		
		
	}
}
