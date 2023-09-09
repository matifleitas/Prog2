package registro_empresa;

public class Empleado extends Persona {
	
	private int num_leg;
	private int sueldo;
	
	public Empleado(String cargo_laboral, String nombre, String apellido, int num_legajo, int edad, int num_leg, int sueldo) {
		super(nombre, apellido, edad);
		this.num_leg = num_leg;
		this.sueldo = sueldo;
		if(super.verificarEsEmpleado(cargo_laboral))
			super.setCargo_laboral(cargo_laboral);
	}
	
	public int getNum_leg() {
		return num_leg;
	}

	public int getSueldo() {
		return sueldo;
	}
	
}
