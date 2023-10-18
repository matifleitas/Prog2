package aseguradora;

import java.util.Comparator;

public class ComparableXNumPoliza implements Comparator<Elemento>{

	@Override
	public int compare(Elemento o1, Elemento o2) {
		if(o1.getNumPoliza() > o2.getDni()) {
			return -1;
		} else if(o1.getDni() < o2.getDni()) {
			return 1;
		} else {
			return 0;
		}
	}
}
