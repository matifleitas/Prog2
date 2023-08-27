package figuras;

public class MedioCirculo extends Circulo {
	
	//hereda los atributos del circulo padre
	
	public MedioCirculo(String nombre, double radio) {
		
		super(nombre, radio);
	
	}
	
	public double getArea() {
		return (super.getArea() / 2);
	}
	
}
