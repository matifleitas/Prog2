package aseguradora;

import java.util.ArrayList;

public class SeguroIntegrador extends Elemento {

	private ArrayList<Elemento> seguros;
	
	public SeguroIntegrador(String nombre, double montoAsegurado, int numPoliza, String descripcion, int dni) {
		super(nombre, montoAsegurado, numPoliza, descripcion, dni);
		seguros = new ArrayList<>();
	}

	@Override
	public double calcularCostoPoliza() {
		double montoTotal = 0;
		ArrayList<Elemento> copia = this.getSeguros();
		for(int i=0; i<copia.size(); i++) {
			Elemento seguro = copia.get(i);
			montoTotal += seguro.calcularCostoPoliza();
		} return montoTotal;
	}
	
	public ArrayList<Elemento> getSeguros(){
		return new ArrayList<>(seguros);
	}
	
	public void addElemento(Elemento e) {
		if(e != null)
			this.seguros.add(e);
	}

}
