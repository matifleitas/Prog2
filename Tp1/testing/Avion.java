package testing;

public class Avion {
	int capacidad;
	String color;
	String estado;
	
	public Avion() {
		capacidad = 100;
		color = "rojo";
		estado = "en tierra";
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String nuevoColor) {
		color = nuevoColor;
	}
}
