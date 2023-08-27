package ej1;

public class Persona {
	String nombre;
	int edad;
	String sexo;
	int dni;
	String fecha_nacimiento;
	double peso;
	double altura;
	
	public Persona() {
		nombre = "N";
		edad = ' ';
		sexo = "femenino";
		dni = ' ';
		fecha_nacimiento = "2000/1/1";
		peso = 1;
		altura = 1;
	}
	
	public Persona(int dni) {
		dni = ' ';
	}
	
	public Persona(int dni, String nombre) {
		dni = ' ';
		nombre = "N";
	}
	
	public Persona(int dni, String nombre, String fecha_nacimiento) {
		dni = ' ';
		nombre = "N";
		fecha_nacimiento = "1 enero del 2000";
	}
	
	public Persona(int dni, String nombre, String fecha_nacimiento, double peso) {
		dni = ' ';
		nombre = "N";
		fecha_nacimiento = "1 enero del 2000";
		peso = 1;
	}
	
	public Persona(int dni, String nombre, String fecha_nacimiento, double peso, double altura) {
		dni = ' ';
		nombre = "N";
		fecha_nacimiento = "1 enero del 2000";
		peso = 1;
		altura = 1;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	
	public void setSexo(String nuevoSexo) {
		sexo = nuevoSexo;
	}
	
	public void setFechaNacimineto(String nuevaFechaNacimineto) {
		fecha_nacimiento = nuevaFechaNacimineto;
	}
	
	public void setPeso(double nuevoPeso) {
		peso = nuevoPeso;
	}
	
	public void setAltura(double nuevaAltura) {
		altura = nuevaAltura;
	}
	
	public Double getMasaCorporal() {
		return peso/Math.pow(altura, 2);
	}
	
}
