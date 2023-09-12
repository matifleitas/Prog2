package fact_empleados;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> listaEmpleados;
	private ArrayList<Double> listaSueldos;
	private String nombre_empresa;
	private double sumaTotalSueldos;
	private ExtraTipoVenta extra;
//	private Empleado empleado;
	
	public Empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
		listaEmpleados = new ArrayList<Empleado>();
		listaSueldos = new ArrayList<Double>();
		sumaTotalSueldos=0;
	}
	
	//public void bono10porciento()
	
	public void addEmpleado(Empleado empleado) {
		if(!listaEmpleados.contains(empleado)) { //uso el contains pq ya implemente el equals en Empleado de <Empleado>
			listaEmpleados.add(empleado);
			this.sumaTotalSueldos += empleado.getSueldo();
		}else {
			System.out.println("Ya se encuentra, el empleado registrado en la empresa");
		}
	}
	
	public ArrayList<Double> getListaSueldo() {
		ArrayList<Double> copia = new ArrayList<>(listaSueldos);
		return copia;
	}
	
	public ArrayList<Empleado> getListaEmpleados() {
		ArrayList<Empleado> copia = new ArrayList<>(listaEmpleados);
		return copia;
	}
	
	@Override
	public boolean equals(Object o1) {
		try {
			Empresa nuevaEmpresa = (Empresa)o1;
			if(this.getNombre_empresa() == nuevaEmpresa.getNombre_empresa()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public String getNombre_empresa() {
		return nombre_empresa;
	}

	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}


	public double getSumaTotalSueldos() {
		return sumaTotalSueldos;
	}
	
	
	
}
