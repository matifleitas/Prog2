package oscarsito;


public class CondicionCaracteristicas extends Condicion{
	
	private String caract;
	
	public CondicionCaracteristicas(String caract) {
		this.caract = caract;
	}
	
	@Override
	public boolean cumple(Mueble m) {
		return m.contieneCaract(caract);
	}

}
