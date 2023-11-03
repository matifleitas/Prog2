package parcial2023;

import java.util.ArrayList;

public class PiezaCompuesta extends ElementoPieza{
	
	private ArrayList<ElementoPieza> elementos;
	
	private int extraPla, extraTiempo;
	
	public PiezaCompuesta(String nombre, String descripcion, int extraPla, int extraTiempo) {
		super(nombre, descripcion);
		this.extraPla = extraPla;
		this.extraTiempo = extraTiempo;
		elementos = new ArrayList<ElementoPieza>();
	}

	@Override
	public int getPla() {
		int suma=0;
		for(int i=0;i<this.elementos.size();i++) {
			suma += elementos.get(i).getPla();
			
		}return suma + getExtraPla() * this.getCantidadSimples();
		//suma del pla necesario mas 1 gramo por cada pieza simple que la compone
	}

	@Override
	public int getCantidadSimples() {
		int result = 0;
		for(int i=0;i<elementos.size();i++) {
			result += elementos.get(i).getCantidadSimples();
		}return result;
	}

	@Override
	public int getTiempo() {
		int result=0;
		for(int i=0;i<elementos.size();i++) {
			result += elementos.get(i).getTiempo();
		} return result + this.getExtraTiempo();
	}

	@Override
	public ArrayList<String> getColores() {
		ArrayList<String> result = new ArrayList<String>();
		for(int i=0;i<elementos.size();i++) {
			ArrayList<String> coloresI = elementos.get(i).getColores();
			for(int j=0;j<coloresI.size();j++) {
				if(!result.contains(coloresI.get(j))) {
					result.add(coloresI.get(j));
				}
			}
		} return result;
	}

	@Override
	public ArrayList<PiezaSimple> buscar(Condicion pp) {
		ArrayList<PiezaSimple> result = new ArrayList<PiezaSimple>();
		for(int i=0;i<elementos.size();i++) {
			result.addAll(elementos.get(i).buscar(pp));
		} return result;
	}

	public void addElemento(ElementoPieza e) {
		elementos.add(e);
	}
	
	public int getExtraPla() {
		return extraPla;
	}

	public void setExtraPla(int extraPla) {
		this.extraPla = extraPla;
	}

	public int getExtraTiempo() {
		return extraTiempo;
	}

	public void setExtraTiempo(int extraTiempo) {
		this.extraTiempo = extraTiempo;
	}
	
	
}
