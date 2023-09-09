package sueldos;

public class EmpleadoHs extends Empleado {

	private int cant_hs;	
	private int valor_hora;
	
	public EmpleadoHs(String nombre, int edad, int DNI, double salario, int valor_hora) {
		super(nombre, edad, DNI, salario);
		this.valor_hora = valor_hora;
	}
	
	public void addHora() {
		this.cant_hs++;
	}

	public int getCant_hs() {
		return cant_hs;
	}

	public int getValor_hora() {
		return valor_hora;
	}
	
	public void setValor_hora(int valor_hora) {
		this.valor_hora = valor_hora;
	}
	
	public double calcularSueldo() {
		return (super.getSalario() + (cant_hs * valor_hora));
	}
}
