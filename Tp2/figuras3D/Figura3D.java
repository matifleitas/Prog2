package figuras3D;

public class Figura3D {
	private String nombre;
	private Figura base;
	private double altura;
	
	public Figura3D (String nombre, Figura base, double altura) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public Figura getBase() {
		return base;
	}
	
	public double getVolumen() {
		return base.getArea() * this.getAltura();
	}
	
	public double superficieBase() {
		return base.getArea();
	}
	
	public double getSuperficie() {
		return base.getPerimetro() * this.getAltura();
	}
}
