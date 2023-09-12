package fact_empleados;

public class ExtraTipoJulian extends ExtraTipoVenta {

	private int minimoVentas;
	private int bono;
	private double montoFinal;
	private Empleado emp;
	
	public ExtraTipoJulian(Empleado emp) {
		this.minimoVentas=50;
		this.bono=1000;
		this.montoFinal=0;
		this.emp = emp;
	}
	
	@Override
	public double adicionalSueldo(Empleado empleado) {
		if(esJulian(empleado) && empleado.getCantVentas() >= minimoVentas) {
			montoFinal = empleado.getSueldo() + bono;
			empleado.sueldo = montoFinal;
		} else {
			return empleado.getSueldo();
		}
		return montoFinal;
	}
	
	public boolean esJulian(Empleado emp) {
		if(emp.getNombre() == "Julian") {
			return true;
		} 
		return false;
	}
	

}
