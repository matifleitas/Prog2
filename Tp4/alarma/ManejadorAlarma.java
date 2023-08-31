package alarma;

public class ManejadorAlarma {
	public static void main(String[] args) {
		Alarma a1 = new Alarma(324, false, false, false, false);
		//AlarmaLuminosa al1 = new AlarmaLuminosa(324, false, false, false, false);
//		Timbre t1 = new Timbre(324, false, false, false, false);
//		Luz l1 = new Luz(324, false, false, false, false);
		
		a1.comprobar();
		System.out.println("--------------------------");
		
		Alarma a2 = new Alarma(210, true, false, false, false);
		a2.comprobar();
	}
}
