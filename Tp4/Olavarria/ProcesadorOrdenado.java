package Olavarria;

public abstract class ProcesadorOrdenado extends Procesador {
	
	//insertar ordenado
	public void addTarea(Tarea t) {
		int i = 0;
		while(i < this.tareas.size() && this.esMenor(this.tareas.get(i), t)) {
			i++;
		}
		if(i < this.tareas.size()) {
			this.tareas.add(i, t);
		} else {
			this.tareas.add(t);
		}
	}
	
	public abstract boolean esMenor(Tarea t1, Tarea t2);
}
