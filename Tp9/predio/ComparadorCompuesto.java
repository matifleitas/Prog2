package predio;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio>{
	private Comparator<Socio> c1;
	private Comparator<Socio> c2;
	
	public ComparadorCompuesto(Comparator<Socio> c1, Comparator<Socio> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Socio s1, Socio s2) {
		int c = c1.compare(s1, s2);
		if(c == 0) {
			c = c2.compare(s1, s2);
		} return c;
	}
}
