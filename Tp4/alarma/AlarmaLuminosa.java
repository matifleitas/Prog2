package alarma;

public class AlarmaLuminosa extends Alarma {
	
	private Luz luz;

	public AlarmaLuminosa() {
		super();
		luz = new Luz();
	}
	
	public void comprobar() {
		if(super.isSensor_movimiento() || super.isSensor_puerta() || super.isSensor_vidrio()) {
			super.hacerSonar();
			this.luz.encenderLuz();
		} else {
			super.todoEnOrden();
		}
	}
}