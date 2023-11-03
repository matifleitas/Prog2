package predio;

public class FiltroNOT implements Filtro{
	private Filtro condicion;

	public FiltroNOT(Filtro condicion) {
		this.condicion = condicion;
	}

	@Override
	public boolean siCumple(Socio s) {
		return !this.condicion.siCumple(s);
	}
}
