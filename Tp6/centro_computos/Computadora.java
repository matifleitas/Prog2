package centro_computos;

public class Computadora extends TipoElementoCola{
	private double velocidadCPU;
	private String nombre;
	private Proceso proceso;
	
	public Computadora( String nombre, double velocidadCPU) {
		
		this.velocidadCPU = velocidadCPU;
		this.nombre = nombre;
		this.proceso = null;
	}

	public double getVelocidadCPU() {
		return velocidadCPU;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void asignarProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	@Override
	public String toString() {
		return "Computadora [velocidadCPU=" + velocidadCPU + ", nombre=" + nombre + "]";
	}

	@Override
	public boolean esMayor(TipoElementoCola elementoN) {
		return this.getVelocidadCPU() > ((Computadora)elementoN).getVelocidadCPU();
	}
	
	
	
	
}
