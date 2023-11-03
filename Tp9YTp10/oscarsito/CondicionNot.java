package oscarsito;



public class CondicionNot extends Condicion{
	
	private Condicion c;
	
	@Override
	public boolean cumple(Mueble m) {
		return !c.cumple(m);
	}
}
