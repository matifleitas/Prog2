package sombrero;

public class Cualidad {
	
	private String poder;
	private double porcentaje_fuerza;
	private boolean puede_volar;
	
	public Cualidad(String poder, double porcentaje_fuerza, boolean puede_volar) {
		//super();
		this.poder = poder;
		this.porcentaje_fuerza = porcentaje_fuerza;
		this.puede_volar = puede_volar;
	}
	
	

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public double getPorcentaje_fuerza() {
		return porcentaje_fuerza;
	}

	public void setPorcentaje_fuerza(double porcentaje_fuerza) {
		this.porcentaje_fuerza = porcentaje_fuerza;
	}

	public boolean isPuede_volar() {
		return puede_volar;
	}

	public void setPuede_volar(boolean puede_volar) {
		this.puede_volar = puede_volar;
	}
	
	
	
}
