package vivero;

import java.util.ArrayList;

public class Vivero {
	private String nombre;
	private ArrayList<Planta> plantas;
	
	public Vivero(String nombre) {
		this.nombre = nombre;
		plantas = new ArrayList<>();
	}
	
	public ArrayList<Planta> buscarPlantas(CondicionVivero c){
		ArrayList<Planta> plantasQCumplen = new ArrayList<>();
		
		for(int i=0; i<this.plantas.size(); i++) {
			Planta plantaPos = plantas.get(i);
			if(c.siCumple(plantaPos)){
				plantasQCumplen.add(plantaPos);
			}
		} return plantasQCumplen;
	}
	
	public void addPlanta(Planta p) {
		plantas.add(p);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
