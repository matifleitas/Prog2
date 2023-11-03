package oscarsito;



public class CondicionMaterial extends Condicion{
	
	private String material;
	
	public CondicionMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public boolean cumple(Mueble m) {
		return m.getMaterial().equals(this.material.toLowerCase());
	}
}
