package alarma;

public class Alarma {
	private int codigo_alarma;
	private boolean se_rompio_vidrio;
	private boolean se_abrio_puerta;
	private boolean se_abrio_ventana;
	private boolean se_detecto_mov;

	
	public Alarma(int codigo_alarma, boolean se_rompio_vidrio, boolean se_abrio_puerta, boolean se_abrio_ventana, boolean se_detecto_mov) {
		this.codigo_alarma = codigo_alarma;
		this.se_rompio_vidrio = se_rompio_vidrio;
		this.se_abrio_puerta = se_abrio_puerta;
		this.se_abrio_ventana = se_abrio_ventana;
	}
	
	public void comprobar() {
		if(seActivoAlguna()) {
			this.activarSeñalSonora();
			this.activarLuz();
		}
	}
	
	public boolean seActivoAlguna() {
		if((this.se_rompio_vidrio  || this.se_abrio_puerta ||  this.se_abrio_ventana || this.se_detecto_mov) == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public void activarSeñalSonora() {
		//System.out.println(" - ");
		
	}
	
	public void activarLuz() {
		//System.out.println(" - ");
		
	}


	public int getCodigo_alarma() {
		return codigo_alarma;
	}


	public boolean isSe_rompio_vidrio() {
		return se_rompio_vidrio;
	}


	public boolean isSe_abrio_puerta() {
		return se_abrio_puerta;
	}


	public boolean isSe_abrio_ventana() {
		return se_abrio_ventana;
	}


	public boolean isSe_detecto_mov() {
		return se_detecto_mov;
	}
	
	
}
