package empleadosV2;

public class PagoFijo extends FormaPago {

	private double sueldo;
	
	public PagoFijo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public double calcularSueldo() {
		return this.sueldo;
	}
}
