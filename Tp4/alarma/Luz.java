package alarma;

public class Luz extends AlarmaLuminosa {

	public Luz(int codigo_alarma, boolean se_rompio_vidrio, boolean se_abrio_puerta, boolean se_abrio_ventana,boolean se_detecto_mov) {
		super(codigo_alarma, se_rompio_vidrio, se_abrio_puerta, se_abrio_ventana, se_detecto_mov);
	}
	
	public void encender() {
		System.out.println("SE PRENDIO LA LUZ");
	}
}
