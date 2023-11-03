package aseguradora;

public class SeguroAutomotor extends Elemento {
	
	private static double montoFijo;

	public SeguroAutomotor(String nombre, double montoAsegurado, int numPoliza, String descripcion, int dni) {
		super(nombre, montoAsegurado, numPoliza, descripcion, dni);
		this.montoFijo = 500;
	}

	@Override
	public double calcularCostoPoliza() {
		return getMontoFijo();
	}

	public static double getMontoFijo() {
		return montoFijo;
	}


}
