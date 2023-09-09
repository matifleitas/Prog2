package sueldos;

public class Main {
	public static void main(String[] args) {
		Empresa e1 = new Empresa();
		
		Empleado emp1 = new Empleado("Victor", 34, 12321, 2323);
		Empleado emp2 = new Empleado("Rama", 34, 12321, 2323);
		e1.addEmpleado(emp1);
		e1.addEmpleado(emp2);
		System.out.println(e1.getListaEmpleado());
		System.out.println(e1.getListaEmpleadoHs());
	}
}
