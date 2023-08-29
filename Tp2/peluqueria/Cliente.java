package peluqueria;

public class Cliente {
	private String nombre;
	private Peluquero peluquero_elegido;
	private int tel;
	
	public Cliente(String nombre, int tel, Peluquero peluquero) {
		this.nombre = nombre;
		this.tel = tel;
		this.peluquero_elegido = peluquero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
}
