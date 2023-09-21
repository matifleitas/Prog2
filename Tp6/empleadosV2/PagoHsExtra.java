package empleadosV2;

public class PagoHsExtra extends FormaPago {

	private int cantHs;
	private double pagoXHora;
	
	public PagoHsExtra(int cantHs, double pagoXHora) {
		this.cantHs = cantHs;
		this.pagoXHora = pagoXHora;
	}

	public int getCantHs() {
		return cantHs;
	}

	public void setCantHs(int cantHs) {
		this.cantHs = cantHs;
	}

	public double getPagoXHora() {
		return pagoXHora;
	}

	public void setPagoXHora(double pagoXHora) {
		this.pagoXHora = pagoXHora;
	}

	@Override
	public double calcularSueldo() {
		return this.pagoXHora*this.cantHs;
	}

}
