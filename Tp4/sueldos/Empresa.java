package sueldos;

import java.util.ArrayList;
//Una empresa de informática posee tres tipos de empleados. Los empleados contratados
//reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
//por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
//Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
//cantidad de ventas realizadas.
//Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
//la semana.
public class Empresa {
	private final int cant_hs_min = 8;
	private String sucursal;
	private int cant_empleados;
	private double monto_extra;
	private double sueldo_fijo;
	
	private ArrayList<Empleado> listaSalarioFijo; // tres empleados diferentes
	private ArrayList<Empleado> listaHorasExtras;
	private ArrayList<Empleado> listaXcomision;
	
	
	public Empresa(String sucursal, int cant_empleados, double monto_extra) {
		this.sucursal = sucursal;
		this.cant_empleados = cant_empleados;
		this.monto_extra = 50000;
		this.sueldo_fijo = 250000;
	}
	
	public void esContratado(Empleado empleadoNuevo) {
		if(empleadoNuevo.isContradado()) {
			listaSalarioFijo.add(empleadoNuevo);
			empleadoNuevo.setMontoSemanal(sueldo_fijo);
		}
	}
	
	//SEGUIIIIIRRRR

	public String getSucursal() {
		return sucursal;
	}

	public int getCant_empleados() {
		return cant_empleados;
	}
	

}
