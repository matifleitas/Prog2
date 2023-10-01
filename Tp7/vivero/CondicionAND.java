package vivero;

public class CondicionAND extends CondicionVivero {

	private CondicionVivero c1, c2, c3, c4, c6; 
	
	public CondicionAND(CondicionVivero c1, CondicionVivero c2, CondicionVivero c3, CondicionVivero c4, CondicionVivero c6) {
		this.c1 = c1; // seteo todas las condiciones que me enviaron.
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		//this.c5 = c5;
		this.c6 = c6;
	}

	@Override
	public boolean siCumple(Planta p) {
		return this.c1.siCumple(p) && this.c2.siCumple(p) && this.c3.siCumple(p) && this.c4.siCumple(p) && this.c6.siCumple(p);
	}

}
