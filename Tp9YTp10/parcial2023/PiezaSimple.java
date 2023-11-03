package parcial2023;

import java.util.ArrayList;

public class PiezaSimple extends ElementoPieza{
	private int pla;
	private String color;
	private int tiempo;
	
	public PiezaSimple(String nombre, String descripcion, int pla, String color, int tiempo) {
		super(nombre, descripcion);
		this.pla = pla;
		this.color = color;
		this.tiempo = tiempo;
	}

	public int getPla() {
		return pla;
	}

	public void setPla(int pla) {
		this.pla = pla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public int getCantidadSimples() {
		return 1;
	}

	@Override
	public ArrayList<String> getColores() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(this.color);//debo crear un array porque color es un string;
		return result;
	}

	@Override
	public ArrayList<PiezaSimple> buscar(Condicion pp) {
		ArrayList<PiezaSimple> result = new ArrayList<PiezaSimple>();
		if(pp.siCumple(this)) {
			result.add(this);
		}
		return result;
	}
	
}
