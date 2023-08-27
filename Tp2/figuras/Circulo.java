package figuras;

public class Circulo extends Figura{

	private double radio;
	
	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio; //invoco a setRadio y le paso el radio q me pasaron x parametro
	}
	
	public double getArea() {
		return (Math.PI * this.getRadio() * this.getRadio());
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getDiametro() {
		return (2 * this.radio);
	}
	
	public void setRadio(double radio) {
		this.radio = Math.abs(radio);
	}
	
	public double getRadio() {
		return this.radio;
	}
	
}
