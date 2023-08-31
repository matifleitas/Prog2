package sueldos;

public class Empleado extends Empresa {
	private String nombre;
	private boolean contradado;
	private int edad;
	private int cant_horas_x_semana;
	private int cant_ventas_realizadas;
	private double monto_semanal;
	
	
	public Empleado(String sucursal, int cant_empleados, String nombre, boolean contradado, int edad, int cant_horas_x_semana, int cant_ventas_realizadas) {
		super(sucursal, cant_empleados, cant_ventas_realizadas);
		this.contradado = false;
		this.nombre = nombre;
		this.edad = edad;
		this.cant_horas_x_semana = cant_horas_x_semana;
		this.cant_ventas_realizadas = cant_ventas_realizadas;
		this.monto_semanal = 0;
	}


	public String getNombre() {
		return nombre;
	}


	public boolean isContradado() {
		return contradado;
	}


	public int getEdad() {
		return edad;
	}


	public int getCant_horas_x_semana() {
		return cant_horas_x_semana;
	}

	public int getCant_ventas_realizadas() {
		return cant_ventas_realizadas;
	}

	public double getMontoSemanal() {
		return monto_semanal;
	}
	
	public void setMontoSemanal(double montoSemanal) {
		this.monto_semanal = montoSemanal;
	}
	
}
