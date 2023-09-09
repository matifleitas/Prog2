package libreria;

public class ClienteExigente extends Cliente {

	public ClienteExigente(String nombre, int dni, String direccion, double descuento) {
		super(nombre, dni, direccion, descuento);
	}
	
	@Override
	public boolean leGusta(Articulo articulo) {
		if (super.leGusta(articulo)) {
			for (String generoi: this.generosFav)
				if (articulo.tieneGenero(generoi))//(generos.contains(generoi))
					return true;
		}
		return false;
		
	}

}
