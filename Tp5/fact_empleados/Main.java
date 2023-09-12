package fact_empleados;

public class Main {

	public static void main(String[] args) {
		
		Empresa e1 = new Empresa("Globant");
		
		
		Empleado emp1 = new Empleado("Julian", 45430595, 2000.0);
		Empleado emp2 = new Empleado("Damin", 2230595, 15000);
		
		//ExtraTipoVenta extra = new ExtraTipoVenta(emp1);
		
		e1.addEmpleado(emp1);
		
//		emp1.extraVenta.adicionalSueldo(emp1);
		
		System.out.println(emp1);

	}

}
