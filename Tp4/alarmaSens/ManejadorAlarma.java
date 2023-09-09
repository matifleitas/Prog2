package alarmaSens;

public class ManejadorAlarma {
	public static void main(String[] args) {
		
		Alarma a1 = new Alarma();
		
		Sensor s1 = new Sensor("Quincho");
		
		a1.addSensor(s1);
		a1.controlar();
	}
}
