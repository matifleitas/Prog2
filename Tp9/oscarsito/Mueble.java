package oscarsito;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mueble {
	
	private ArrayList<String> caract;
	private String material;
	private double costoFabricacion;
	private double precioVenta;
	private LocalDate fechaEntrega;
	
	public Mueble(String material, double costoFabricacion, double precioVenta,
			LocalDate fechaEntrega) {
		this.caract = new ArrayList<>();
		this.material = material;
		this.costoFabricacion = costoFabricacion;
		this.precioVenta = precioVenta;
		this.fechaEntrega = fechaEntrega;
	}

	public ArrayList<String> getCaract() {
		return new ArrayList<>(this.caract);
	}
	
	public void addCaract(String caract) {
		this.caract.add(caract);
	}

	public String getMaterial() {
		return material;
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}
	
	public double getGanancia() {
		return this.precioVenta - this.costoFabricacion;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	
	public boolean contieneCaract(String caract) {
		return this.caract.contains(caract);
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	@Override
	public String toString() {
		return "Mueble: caract = " + caract 
				+ ", material = " + material 
				+ ", costoFabricacion = " + costoFabricacion
				+ ", precioVenta = " + precioVenta 
				+ ", fechaEntrega = " + fechaEntrega
				+ ", ganancia = " + (precioVenta - costoFabricacion)
				+ "]";
	}
	
}
