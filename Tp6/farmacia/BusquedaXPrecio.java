package farmacia;

public class BusquedaXPrecio extends Condicion{
	
	private double precioAcompar;

	public BusquedaXPrecio(double precioAcompar) {

		this.precioAcompar = precioAcompar;
	}

	@Override
	public boolean cumple(Medicamento medicamento) {
		return medicamento.getPrecio()<this.precioAcompar;
	}
	
	
}
