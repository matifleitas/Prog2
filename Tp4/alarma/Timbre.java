package alarma;

public class Timbre extends AlarmaLuminosa {

	public Timbre(int codigo_alarma, boolean se_rompio_vidrio, boolean se_abrio_puerta, boolean se_abrio_ventana,boolean se_detecto_mov) {
		super(codigo_alarma, se_rompio_vidrio, se_abrio_puerta, se_abrio_ventana, se_detecto_mov);
	}
	
	public void hacerSonar() {
		System.out.println("SONO EL TIMBRE");
	}
	
}
