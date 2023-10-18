package aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import fyleSystemComarator.Elemento;
import predio.Filtro;
import predio.Socio;

public class Aseguradora{
	private String nombre;
	private ArrayList<Elemento> listaDeSeguros;
	
	public Aseguradora(String nombre) {
		this.nombre = nombre;
		this.listaDeSeguros = new ArrayList<>();
	}
	
	public ArrayList<Elemento> getSeguros(Comparator c, Condicion con){
		ArrayList<Elemento> losQueCumplen = new ArrayList<>();
		for(int i=0; i<getSegurosTotales().size(); i++) {
			Elemento seguro = getSegurosTotales().get(i);
			if(con.siCumple(seguro)) {
				losQueCumplen.add(seguro);
			}
		}
		Collections.sort(losQueCumplen);
		return losQueCumplen;
	}
	
	public void addSeguro(Elemento e) {
		this.listaDeSeguros.add(e);
	}

	public ArrayList<Elemento> getSegurosTotales(){
		return new ArrayList<>(listaDeSeguros);
	}

}
