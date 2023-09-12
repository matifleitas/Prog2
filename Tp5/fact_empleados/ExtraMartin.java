package fact_empleados;

public class ExtraMartin extends ExtraTipoVenta {
	private final double porcentaje = 0.10;
	
	@Override
	public double adicionalSueldo(Empleado empleado) {
		if(esMartin(empleado)) {
			double extraVentas = empleado.getCantVentas() * porcentaje;
			return empleado.getSueldo() + extraVentas;
		}return empleado.getSueldo();
	} 
	
	public boolean esMartin(Empleado emp) {
		if(emp.getNombre() == "Pablo") {
			return true;
		} 
		return false;
	}
}
