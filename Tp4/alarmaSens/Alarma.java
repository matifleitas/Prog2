package alarmaSens;

import java.util.ArrayList;

import alarma.Luz;

public class Alarma {
	
	private Timbre timbre;
	private Luz luz;
	private ArrayList<Sensor> listaSensores;
	
	
	public Alarma() {
		//luz = new Luz();
		timbre = new Timbre();
		listaSensores = new ArrayList<Sensor>();
	}
	
	public void addSensor(Sensor sensor) {
		listaSensores.add(sensor);
	}
	
	public void controlar() {
		for (Sensor sensor : listaSensores) {
	
			if(sensor.isActivado()) {
				timbre.hacerSonar();
				sensor.toString();
				luz.encenderLuz();
			} else {
				System.out.println("NO SE DETECTO NADA");
				System.out.println(sensor.toString());
			}
		}
	}
	
	
	
	
	
	
}