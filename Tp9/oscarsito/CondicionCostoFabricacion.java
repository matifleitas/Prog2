package oscarsito;



public class CondicionCostoFabricacion extends Condicion{
	
	private double costo;
	
	public CondicionCostoFabricacion(double costo) {
		this.costo = costo;
	}
	
	@Override
	public boolean cumple(Mueble m) {
		return m.getCostoFabricacion() > this.costo;
	}
}
