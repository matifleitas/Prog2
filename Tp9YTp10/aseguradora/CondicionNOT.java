package aseguradora;

public class CondicionNOT implements Condicion{
	private Condicion cond1;
	
	public CondicionNOT (Condicion cond1) {
		this.cond1 = cond1;
	}

	@Override
	public boolean siCumple(Elemento e) {
		return !this.cond1.siCumple(e);
	}
}
