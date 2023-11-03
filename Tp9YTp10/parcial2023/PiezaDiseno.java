package parcial2023;

public class PiezaDiseno extends PiezaCompuesta{

	private Condicion c1;
	
	public PiezaDiseno(String nombre, String descripcion, int extraPla, int extraTiempo, Condicion c) {
		super(nombre, descripcion, extraPla, extraTiempo);
		this.c1 = c;
	}
	
	@Override
	public void addElemento(ElementoPieza e) {
		if(c1.siCumple(e)) {
			super.addElemento(e);
		}
	}
}
