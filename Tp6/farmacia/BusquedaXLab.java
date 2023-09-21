package farmacia;

public class BusquedaXLab extends Condicion {

	private String lab;
	
	public BusquedaXLab(String lab) {
		this.lab = lab;
	}
	
	@Override
	public boolean cumple(Medicamento medicamento) {
		return medicamento.getLaboratorio().toLowerCase().equals(lab.toLowerCase());
	}

}
