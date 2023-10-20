package oscarsito;

import java.util.Comparator;


public class ComparatorGanancia implements Comparator<Mueble>{

	@Override
	public int compare(Mueble o1, Mueble o2) {
		if(o1.getGanancia() > o2.getGanancia()) {
			return -1;
		} else if(o1.getGanancia() < o2.getGanancia()) {
			return 1;
		} else {
			return 0;
		}
	}
}
