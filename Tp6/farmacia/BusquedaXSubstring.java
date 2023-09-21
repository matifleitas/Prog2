package farmacia;

public class BusquedaXSubstring extends Condicion{
	
	private String subString;

	public BusquedaXSubstring(String subString) {
		this.subString = subString;
	}

	@Override
	public boolean cumple(Medicamento medicamento) {
		return medicamento.getNombre().toLowerCase().contains(subString.toLowerCase());
	}
}
