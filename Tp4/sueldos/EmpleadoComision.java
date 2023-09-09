package sueldos;

public class EmpleadoComision extends Empleado {

	private int cantVentas;
	private final double PORCENTAJE = 0.1;
	
	public EmpleadoComision(String nombre, int edad, int DNI, double salario) {
		super(nombre, edad, DNI, salario);
	}
	
	public void addVenta() {
		this.cantVentas++;
	}

	public int getCantVentas() {
		return cantVentas;
	}
	
	public double calcularSueldo() {
		return (super.getSalario() + (super.getSalario() * (this.cantVentas * this.PORCENTAJE)) / 100);
	}

}
