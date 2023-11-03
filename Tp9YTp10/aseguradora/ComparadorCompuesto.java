package aseguradora;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Elemento>{

	private Comparator<Elemento> c1;
	private Comparator<Elemento> c2;
	
	public ComparadorCompuesto(Comparator<Elemento> c1, Comparator<Elemento> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Elemento elem1, Elemento elem2) {
		int c = c1.compare(elem1, elem2);
		if(c == 0) {
			c = c2.compare(elem1, elem2);
		} return c;
	}
}
