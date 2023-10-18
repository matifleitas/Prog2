package eleccion;

import java.util.ArrayList;

public abstract class Elemento {
	private String nombre;
	private ArrayList<Mesa> mesas;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
		mesas = new ArrayList<>();
	}
	
	public abstract int getCantVotos();
	
	public ArrayList<Mesa> getMesas(){
		return new ArrayList<>(mesas);
	}
	
	public void addMesa(Mesa m) {
		this.mesas.add(m);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
