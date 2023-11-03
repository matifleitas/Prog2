package aseguradora;

public class CondicionAND implements Condicion{

	private Condicion cond1;
	private Condicion cond2;
	
	public CondicionAND(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}

	@Override
	public boolean siCumple(Elemento e) {
		return cond1.siCumple(e) && cond2.siCumple(e);
	}

}
