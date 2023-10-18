package eleccion;

import java.util.ArrayList;

public class Ubicacion extends Elemento{

	private ArrayList<Elemento> ubicaciones;
	
	public Ubicacion(String nombre) {
		super(nombre);
		ubicaciones = new ArrayList<>();
	}

	@Override
	public int getCantVotos() {
		return ubicaciones.size();
	}


}
