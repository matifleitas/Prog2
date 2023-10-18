package aseguradora;

public class CondicionOR implements Condicion{
	private Condicion c1, c2;
	
	public CondicionOR(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean siCumple(Elemento s) {
		return this.c1.siCumple(s)||this.c2.siCumple(s);
	}
}
