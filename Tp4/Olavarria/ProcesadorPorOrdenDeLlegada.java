package Olavarria;

public class ProcesadorPorOrdenDeLlegada extends Procesador {

	@Override
	public void addTarea(Tarea t) {
		//inserta ultimo
		this.tareas.add(t);
	}
}
