package cooperativa;

import java.util.ArrayList;

public class Lote {
	
	private String nombre;
	private ArrayList<String> minerales;
	private double tama�o;
	public Lote(String nombre, double tama�o) {
		super();
		this.nombre = nombre;
		this.tama�o = tama�o;
		this.minerales = new ArrayList<String>();
	}
	
	public boolean sePuedeSembrar(Cereal cereal) {
		
		return cereal.sePuedeSembrarEn(this);
				//this.minerales.containsAll(cereal.getMinerales()); // No delega la responsabilidad
		
		
	}
	
	public boolean tieneMineral(String mineral) {
		return this.minerales.contains(mineral);
	}
	
	public void addMineral(String mineral) {
		this.minerales.add(mineral);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTama�o() {
		return tama�o;
	}
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	
	
	
	

}
