package centro_computos;


public class CentroComputo { /*se encarga de add pc y procesos(tamb chequear que no esten vacios) 
								y que haya tareas asignadas a las pc*/
	private ColaEspera computadoras;
	private ColaEspera procesos;

	public CentroComputo() {
		this.computadoras = new ColaEspera();
		this.procesos = new ColaEspera();
	}
	
	public void addComputadora(Computadora compu) {
		if(compu==null)return;//control previo que no envien objeto null
		
		if(procesos.hayElementos()) {
			Proceso proceso = (Proceso) procesos.getSiguiente();//elimino un proc q estaba esperando para asignarselo a una pc
			compu.asignarProceso(proceso);
		}else {
			computadoras.addElemetno(compu);//agrego una pc a la espera
		}
	}
	
	public void addProceso(Proceso proceso) {
		if(proceso==null)return;//control previo que no envien objeto null
		
		if(computadoras.hayElementos()) {
			Computadora pcLibre = (Computadora) computadoras.getSiguiente();
			pcLibre.asignarProceso(proceso);
		} else {
			procesos.addElemetno(proceso);
		}
	}
	
	public Computadora getSiguienteComputadora() {
		return (Computadora) computadoras.getSiguiente();
	}
	
	public Proceso getSiguienteProceso() {
		return (Proceso) procesos.getSiguiente();
	}
}
