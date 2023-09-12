package fact_empleados;

public class ExtraPablo extends ExtraTipoVenta {
	private final double porcentaje = 0.05;
	
	@Override
	public double adicionalSueldo(Empleado empleado) {
		if(esPablo(empleado)) {
			double extraVentas = empleado.getCantVentas() * porcentaje;
			return empleado.getSueldo() + extraVentas;
		} return empleado.getSueldo();
	} 
	

	
	public boolean esPablo(Empleado emp) {
		if(emp.getNombre() == "Pablo") {
			return true;
		} 
		return false;
	}
}