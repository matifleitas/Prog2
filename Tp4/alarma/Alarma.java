package alarma;

public class Alarma {
	private Timbre timbre;
	private boolean sensor_vidrio;
	private boolean sensor_puerta;
	private boolean sensor_movimiento;

	public Alarma() {
		sensor_vidrio=false;
		sensor_puerta=false;
		sensor_movimiento=false;
		timbre = new Timbre();
	}
	
	public void comprobar() {
		if(this.sensor_movimiento || this.sensor_puerta || this.sensor_vidrio) {
			this.timbre.hacerSonar();
		} else {
			this.timbre.todoEnOrden();
		}
	}
	
	public void hacerSonar() {
		this.timbre.hacerSonar();
	}
	
	public void todoEnOrden() {
		this.timbre.todoEnOrden();
	}
	
	public void seRompioVidrio() {
		this.sensor_vidrio = true;
	}
	
	public void seAbrioPuerta() {
		this.sensor_puerta = true;
	}
	
	public boolean isSensor_vidrio() {
		return sensor_vidrio;
	}

	public void setSensor_vidrio(boolean sensor_vidrio) {
		this.sensor_vidrio = sensor_vidrio;
	}

	public boolean isSensor_puerta() {
		return sensor_puerta;
	}

	public void setSensor_puerta(boolean sensor_puerta) {
		this.sensor_puerta = sensor_puerta;
	}

	public boolean isSensor_movimiento() {
		return sensor_movimiento;
	}

	public void setSensor_movimiento(boolean sensor_movimiento) {
		this.sensor_movimiento = sensor_movimiento;
	}
	
	
}