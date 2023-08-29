package figuras;

public class MedioCirculo extends Circulo {
	
	//hereda los atributos del circulo padre
	
	public MedioCirculo(String nombre, double radio) {
		super(nombre, radio);
	
	}
	
	public double getArea() {
		return (super.getArea() / 2); //su Area es la mitad del circulo normal
	}
	
	public double getPerimetro() {
		return super.getPerimetro()/2+this.getDiametro();
	}
	
}
