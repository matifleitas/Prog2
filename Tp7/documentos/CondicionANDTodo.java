package documentos;

public class CondicionANDTodo extends Condicion {

	private Condicion cond1, cond2, cond3, cond4, cond5, cond6;
	
	public CondicionANDTodo(Condicion c1, Condicion c2, Condicion c3, Condicion c4, Condicion c5, Condicion c6) {
		this.cond1 = c1;
		this.cond2 = c2;
		this.cond3 = c3;
		this.cond4 = c4;
		this.cond5 = c5;
		this.cond6 = c6;
	}

	@Override
	public boolean siCumple(Documento doc) {
		return this.cond1.siCumple(doc) && this.cond2.siCumple(doc) && this.cond3.siCumple(doc) &&
			   this.cond4.siCumple(doc) && this.cond5.siCumple(doc) && this.cond6.siCumple(doc);
	}

}
