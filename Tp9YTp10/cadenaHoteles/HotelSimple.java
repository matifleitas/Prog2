package cadenaHoteles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HotelSimple extends ElementoHoteleria{

	ArrayList<Habitacion> habitaciones;
	ArrayList<Turista> turistas;
	ArrayList<Condicion> condicionesDelHotel;
	
	public HotelSimple(String nombre) {
		super(nombre);
		habitaciones = new ArrayList<>();
		turistas = new ArrayList<>();
		condicionesDelHotel = new ArrayList<>();
	}
	
	public ArrayList<Habitacion> getHabitaciones(){
		return new ArrayList<>(this.habitaciones);
	}
	public ArrayList<Turista> getTuristas(){
		return new ArrayList<>(this.turistas);
	}
	public ArrayList<Condicion> getCondiciones(){
		return new ArrayList<>(this.condicionesDelHotel);
	}
	public void addHabitacion(Habitacion h) {
		if(h != null) {
			this.habitaciones.add(h);
		}
	}
	public void addTuristas (Turista t) {
		if(t != null) {
			this.turistas.add(t);
		}
	}
	
	public ArrayList<Habitacion> contactar(Comparator<Habitacion> c){
		ArrayList<Habitacion> lasQueCumplen = new ArrayList<>();
		int i=0, j=0;
		while(i < habitaciones.size()) {
			Habitacion habitacion = habitaciones.get(i);
			while(j < condicionesDelHotel.size()) {
				Condicion cond = condicionesDelHotel.get(i);
				if(cond.siCumple(habitacion)) {
					j++;
					if(j == condicionesDelHotel.size()) {
						lasQueCumplen.add(habitacion);
					}
				}
				else {
					i++;
				}
			}
		}Collections.sort(lasQueCumplen, c); 
		return lasQueCumplen;
	}
	
	public ArrayList<Habitacion> informar(Condicion c){
		ArrayList<Habitacion> lasQueCumplen = new ArrayList<>();
		for(int i=0;i<habitaciones.size();i++) {
			Habitacion habitacion = habitaciones.get(i);
			if(c.siCumple(habitacion)) {
				lasQueCumplen.add(habitacion);
			}
		} return lasQueCumplen;
	}

	@Override
	public int cantHabitacionesCondicion(Condicion c1) {
		int contador = 0;
		for(int i=0; i<habitaciones.size();i++) {
			Habitacion habitacion = habitaciones.get(i);
			if(c1.siCumple(habitacion)) {
				contador += habitacion.cant();
			}
		}return contador;
	}

}
