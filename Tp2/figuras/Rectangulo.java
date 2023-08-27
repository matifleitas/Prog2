package figuras;

public class Rectangulo extends Figura{
	
	private double lado1, lado2;
	
	public Rectangulo (String nombre, double lado1, double lado2) {
		super(nombre);
		this.lado1 = lado1;
		this.lado2 = lado2;
		//System.out.println(lado1 + " " + lado2);
	}
	
	@Override
	public double getArea() {
		return this.lado1 * this.lado2;
	}
	
	@Override
	public double getPerimetro() {
		return this.lado1*2 + this.lado2*2;
	}
	public double getLado1() {
		return this.lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return this.lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
}
