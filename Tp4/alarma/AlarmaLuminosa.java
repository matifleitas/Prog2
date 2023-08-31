package alarma;

public class AlarmaLuminosa extends Alarma {
	
	private Timbre timbre;
	private Luz luz;
	
	public AlarmaLuminosa(int codigo_alarma, boolean se_rompio_vidrio, boolean se_abrio_puerta, boolean se_abrio_ventana, boolean se_detecto_mov) {
		super(codigo_alarma, se_rompio_vidrio, se_abrio_puerta, se_abrio_ventana, se_detecto_mov);
		this.timbre = timbre;
		this.luz = luz;
	}
	
	@Override
	public void activarSeñalSonora() {
		timbre.hacerSonar();
	}
	@Override
	public void activarLuz() {
		luz.encender();
	}

}
