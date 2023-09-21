package empleadosV2;

public class PagoComisionVentas extends FormaPago {
	
	private double ventas;
	private double comision;
	
	public PagoComisionVentas(double ventas, double comision) {
		this.ventas = ventas;
		this.comision = comision;
	}
	
	@Override
	public double calcularSueldo() {
		return this.comision+this.ventas;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	

}
