package fact_empleados;

public class ExtraMauro extends ExtraTipoVenta {

	private int minimoVentas;
	private int bono;
	private double montoFinal;
	
	public ExtraMauro() {
		this.minimoVentas = 100;
		this.bono = 3000;
		this.montoFinal = 0;
	}

	@Override
	public double adicionalSueldo(Empleado empleado) {
		if(esMauro(empleado)&&empleado.getCantVentas() >= this.minimoVentas) {
			montoFinal = empleado.getSueldo() + this.bono;
		} else {
			return empleado.getSueldo();
		}
		return montoFinal;
	}
	
	public boolean esMauro(Empleado emp) {
		if(emp.getNombre() == "Mauro") {
			return true;
		} 
		return false;
	}
}
