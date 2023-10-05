package puertoCereales;


public class Puerto {
	private ColaEspera barcos;
	private ColaEspera camiones;
	
	public Puerto(ColaEspera barcos, ColaEspera camiones) {
		this.barcos = new ColaEspera();
		this.camiones = new ColaEspera();
	}
	
	public void addCamion(Camion camion) {
		if(camion==null)return;
		
		if(barcos.tieneElementos() && !camion.isDescargando()) {
			Barco barco = ((Barco)barcos.getSiguienteYEliminaUno());
			camion.asignarBarco(barco); //se le asigno un barco a un camion
			camion.setDescargando(true);
		} else {
			camiones.addElemento(camion);//se agrego un camion a la cola de espera
		}
	}
	
	public void addBarco(Barco barco) {
		if(barco==null);
		
		if(camiones.tieneElementos() && !barco.isCargando()) {
			Camion camion = ((Camion)camiones.getSiguienteYEliminaUno());
			barco.asignarCamion(camion);
			barco.setCargando(true);
		} else {
			barcos.addElemento(barco);
		}
	}
	
	public Camion getSiguienteCamion() {//metodo con el objetivo de castear Camion a getSiguient...
		return (Camion) camiones.getSiguienteYEliminaUno();
	}
	
	public Barco getSiguienteBarco() {//metodo con el objetivo de castear Barco a getSiguient..
		return (Barco) barcos.getSiguienteYEliminaUno();
	}
}
