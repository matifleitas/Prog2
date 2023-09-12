package fact_empleados;

import java.util.ArrayList;

public class Empleado {
	protected String nombre;
	protected int dni;
	protected double sueldo;
	protected int ventas;
	protected ExtraTipoVenta extraVenta;
	protected Empresa empresa;
	
	public Empleado(String nombre, int dni, double sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
		this.ventas = 0;
	}
	
		
	public void nuevaVenta() {
		this.ventas++;
	}
	
	public int getCantVentas() {
		return this.ventas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public boolean equals(Object o1) {
		try {
			Empleado nuevoEmpleado = (Empleado)o1;
			if(this.getDni() == nuevoEmpleado.getDni()) {
				return true;
			} else {
				return false;
			}
		} catch(Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
			return "Contacto {" +
						"Nombre = " + this.getNombre() +
						", DNI = " + this.getDni() +
						", Sueldo = $" + this.getSueldo() +
					'}';
	}
	
}
