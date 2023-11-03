package aseguradora;

public class SeguroHogar extends Elemento{

	private double montoFijo, porcentaje;
	
	public SeguroHogar(String nombre, double montoAsegurado, int numPoliza, String descripcion, int dni, double porcentaje, double montoFijo) {
		super(nombre, montoAsegurado, numPoliza, descripcion, dni);
		this.montoFijo = montoFijo;
		this.porcentaje = porcentaje;
	}

	@Override
	public double calcularCostoPoliza() {
		return this.getMontoFijo() + this.getPorcentajeValorAsegurado();
	}
	
	public double getPorcentajeValorAsegurado() {
		return (this.getPorcentaje() / 100) * this.getMontoAsegurado();
	}

	public double getMontoFijo() {
		return montoFijo;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

}
