package sueldos;

import java.util.ArrayList;

public class Empresa {
	
	private final int HS_MINIMA = 8;
	
	private ArrayList<Empleado> listaEmpleado;
	private ArrayList<EmpleadoHs> listaEmpleadoHs;
	
	public Empresa() {
		listaEmpleado = new ArrayList<Empleado>();
		listaEmpleadoHs = new ArrayList<EmpleadoHs>();
	}
	
	public void verificarEmpHsExtra(ArrayList<Empleado> listaEmpleado) {
		for (Empleado emp : listaEmpleado) {
			if(emp.getCantHs() > HS_MINIMA) {
				listaEmpleadoHs.add((EmpleadoHs) emp);
			}
		}
	}
	
	public void addEmpleado(Empleado emp) {
		listaEmpleado.add(emp);
		//verificarEmpHsExtra(listaEmpleado); VERRRR
	}

	public ArrayList<Empleado> getListaEmpleado() {
		return listaEmpleado;
	}

	public ArrayList<EmpleadoHs> getListaEmpleadoHs() {
		return listaEmpleadoHs;
	}
	
}
