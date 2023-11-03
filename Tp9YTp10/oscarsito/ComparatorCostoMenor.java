package oscarsito;
import java.util.Comparator;

public class ComparatorCostoMenor implements Comparator<Mueble>{

	@Override
	public int compare(Mueble o1, Mueble o2) {
		if(o1.getCostoFabricacion() > o2.getCostoFabricacion()) {
			return 1;
		} else if(o1.getCostoFabricacion() < o2.getCostoFabricacion()) {
			return -1;
		} else {
			return 0;			
		}
	}

}
