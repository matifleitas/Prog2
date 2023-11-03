package parcial2023;

import java.util.ArrayList;

public class PiezaExclusiva extends PiezaSimple {

	private int costoExclusividad;
	
	public PiezaExclusiva(String nombre, String descripcion, int pla, String color, int tiempo, int costoExclusividad) {
		super(nombre, descripcion, pla, color, tiempo);
		this.costoExclusividad = costoExclusividad;
	}

	public int getCosto() {
		return super.getCosto() + this.costoExclusividad;
	}
	
	public ArrayList<PiezaSimple> buscar(Condicion c){
		return new ArrayList<PiezaSimple>();
	}

	public int getCostoExclusividad() {
		return costoExclusividad;
	}

	public void setCostoExclusividad(int costoExclusividad) {
		this.costoExclusividad = costoExclusividad;
	}
	
}
