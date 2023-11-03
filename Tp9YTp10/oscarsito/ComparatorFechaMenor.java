package oscarsito;

import java.util.Comparator;

public class ComparatorFechaMenor implements Comparator<Mueble> {

	@Override
	public int compare(Mueble o1, Mueble o2) {
		return o2.getFechaEntrega().compareTo(o1.getFechaEntrega());
	}

}
