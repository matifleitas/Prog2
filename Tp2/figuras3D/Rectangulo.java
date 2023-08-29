package figuras3D;

public class Rectangulo extends Figura{
	private int lado1;
	private int lado2;
	
	public Rectangulo(int lado1, int lado2) {
		//super(nombre);
		this.setNombre("Rectangulo");
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public int getLado1() {
		return lado1;
	}
	
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	public double getArea() {
		return lado1*lado2;
	}
	
	public double getPerimetro() {
		return (lado1*2 + lado2*2);
	}

}
