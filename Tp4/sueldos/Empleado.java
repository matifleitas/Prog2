package sueldos;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Empleado {
	private String nombre;
	private int edad;
	private int DNI;
	private double salario;
	private int cantHs;
    private LocalDateTime ahora = LocalDateTime.now(); // obtiene hora de ahora
    private  LocalDateTime unaHoraDespues = ahora.plus(1, ChronoUnit.HOURS); //obtiene una hora desp de localDate now
	
	public Empleado(String nombre, int edad, int DNI, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.salario = salario;
		cantHs = 9;
	}
	
	public void incrementarHs() {
		if(ahora.equals(unaHoraDespues)) {
			cantHs += cantHs++;
		}
	}
		
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public int getDNI() {
		return DNI;
	}

	public double getSalario() {
		return salario;
	}

	public int getCantHs() {
		return cantHs;
	}
	
	 @Override
	    public String toString() {
	        return "Empresa {" +
	                "Nombre =" + this.getNombre() + 
	                ", edad =" + this.getEdad() +
	                ", salario =" + this.getSalario() + 
	                ", DNI =" + this.getDNI() +
	                ", cantHS =" + this.getCantHs() +
	                '}' + "\n"; 
	    }
	
}
