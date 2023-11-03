package predio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Predio{
	private String nombre, localidad;
	private ArrayList<Socio> listSocios;
	private ArrayList<Cancha> listCanchas;
	
	public Predio (String nombre, String localidad) {
		this.nombre = nombre;
		this.localidad = localidad;
		listSocios = new ArrayList<>();
		listCanchas = new ArrayList<>();
	}
	
	public ArrayList<Socio> getSocios(Comparator c, Filtro f){
		ArrayList<Socio> losQuCumplen = new ArrayList<>();
		for(int i=0;i<listSocios.size();i++) {
			Socio socI = listSocios.get(i);
			if(f.siCumple(socI)) {
				losQuCumplen.add(socI);
			}
		}
		if(c != null) {
			Collections.sort(losQuCumplen, c);
		}else {
			Collections.sort(losQuCumplen);
		}
		return losQuCumplen;
	}
	
	public ArrayList<Socio> getArraySocios() {
		return new ArrayList<>(this.listSocios);
	}
	
	public ArrayList<Cancha> getArrayCanchas() {
		return new ArrayList<>(this.listCanchas);
	}
	
	public void addCancha(Cancha c) {
		this.listCanchas.add(c);
	}
	
	public void addSocio(Socio s) {
		this.listSocios.add(s);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
