package cadenaHoteles;

import java.util.ArrayList;

public class ComplejoHotelero extends ElementoHoteleria{

	ArrayList<ElementoHoteleria> hoteles;
	
	public ComplejoHotelero(String nombre) {
		super(nombre);
		hoteles = new ArrayList<>();
	}

	@Override
	public int cantHabitacionesCondicion(Condicion c1) {
		int cant=0;
		for(int i=0;i<hoteles.size();i++) {
			ElementoHoteleria hotel = hoteles.get(i);
			cant += hotel.cantHabitacionesCondicion(c1);
		} return cant;
	}
}
