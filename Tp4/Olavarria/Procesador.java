package Olavarria;

import java.util.ArrayList;

public abstract class Procesador {

	protected ArrayList<Tarea> tareas;
	
	public Procesador() {
		this.tareas = new ArrayList<>();
	}
	
	//EJECTURA UNA SOLA TAREA
	public void ejecutar() {
		if(this.tareas.size() > 0) {
			Tarea t = this.tareas.remove(0);
			t.ejecutar();
		}
	}
	
	public abstract void addTarea(Tarea t);
}
