package aseguradora;

public class SeguroVida extends Elemento{

	private double porcentaje;
	
//	double resultado = (porcentaje / 100.0) * valor;
	public SeguroVida(String nombre, double montoAsegurado, int numPoliza, String descripcion, int dni, double porcentaje) {
		super(nombre, montoAsegurado, numPoliza, descripcion, dni);
		this.porcentaje = porcentaje;
	}

	@Override
	public double calcularCostoPoliza() {
		return (this.getPorcentaje() / 100) * this.getMontoAsegurado();
	}

	public double getPorcentaje() {
		return porcentaje;
	}
}
