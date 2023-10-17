package predio;

public class FiltroCancha implements Filtro{
	private int idABuscar;
	
	public FiltroCancha(int idABuscar) {
		this.idABuscar = idABuscar;
	}

	public int getIdABuscar() {
		return idABuscar;
	}

	public void setIdABuscar(int idABuscar) {
		this.idABuscar = idABuscar;
	}

	@Override
	public boolean siCumple(Socio s) {
		for(int i=0; i<s.getArrayCanchasAlquiladas().size(); i++) {
			Cancha posCancha = s.getArrayCanchasAlquiladas().get(i);
			if(posCancha.getId()==getIdABuscar()) {
				return true;
			}
		} return false;
	}

}
