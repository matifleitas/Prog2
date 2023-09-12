package cooperativa;

public class Pastura extends Cereal {

	private double tama�oMinimo;
	
	public Pastura(String nombre, double tama�oMinimo) {
		super(nombre);
		this.tama�oMinimo = tama�oMinimo;

	}
	
	@Override
	public boolean sePuedeSembrarEn(Lote lote) {
		if (lote.getTama�o() > this.tama�oMinimo)
			return super.sePuedeSembrarEn(lote);
		else
			return false;
	}
	
	

}
