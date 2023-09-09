package alarma;

public class ManejadorAlarma {
	public static void main(String[] args) {
		
		Alarma a1 = new Alarma();
		
		AlarmaLuminosa al1 = new AlarmaLuminosa();
		
		a1.comprobar();
		al1.comprobar();
	}
}
