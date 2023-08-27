package electrodomestico;

public class Electrodomestico {
	//String elect1; //electrodomestico
	String nombre;
	float precio_base;
	String color;
	int consumo_energetico;
	float peso;
	int limite_consumo;
	float balance;
	
	public Electrodomestico() {
		this.nombre = "N";
		this.consumo_energetico = 10;
		this.precio_base = 4;
		this.peso = 2;
		this.limite_consumo = 45;
		this.balance = 0;
	}
	
	public float getPrecioBase() {
		return this.precio_base;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getColor() {
		return this.color;
	}
	public int getConsumoEnergetico() {
		return this.consumo_energetico;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setConsumoEnergetico(int consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void setPrecio(float precio) {
		this.precio_base = precio;
	}
	
	public void getBajoConsumo() {
		if(consumo_energetico < this.limite_consumo) {
			System.out.println("El electrodomestico es de bajo consunmo " + this.consumo_energetico);
		} else {
			System.out.println("El electrodomestico es de alto consumo " + this.consumo_energetico);
		}
	}
	
	public void calcularBalance() {
		this.balance = this.precio_base / this.peso;
		System.out.println(this.balance);
		if(this.balance > 3) {
			System.out.println("Producto de alta gama");
		} else
			System.out.println("Producto de gama baja");
	}
	
}
