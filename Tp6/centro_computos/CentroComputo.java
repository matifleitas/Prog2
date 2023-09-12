package centro_computos;


public class CentroComputo { 
	private ColaEspera computadoras;
	private ColaEspera procesos;

	public CentroComputo() {
		this.computadoras = new ColaEspera();
		this.procesos = new ColaEspera();
	}
	
	public void addComputadora(Computadora compu) {
		if(compu==null)return;//control previo que no envien objeto null
		
		if(procesos.hayElementos()) {
			Proceso proceso = (Proceso) procesos.getSiguiente();
			compu.asignarProceso(proceso);
		}else {
			computadoras.addElemetno(compu);
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
