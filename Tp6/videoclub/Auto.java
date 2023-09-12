package videoclub;

public class Auto extends ItemAlquilable{
	private String marca;
	private int cantKM;
	private String patente;
	private TipoCombustible tipoCombustible;
	
	public Auto(String nombre, int cantidadDisponible, String marca, int cantKM, String patente, TipoCombustible tipoCombustible) {
        super(nombre, cantidadDisponible);
		this.marca = marca;
		this.cantKM = cantKM;
		this.patente = patente;
		this.tipoCombustible = tipoCombustible;
	}
	

	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantKM() {
		return cantKM;
	}

	public void setCantKM(int cantKM) {
		this.cantKM = cantKM;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
	
	
}
