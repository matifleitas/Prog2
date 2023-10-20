package oscarsito;



public class CondicionGananciaMayor extends Condicion{
	
	private double ganancia;
	
	public CondicionGananciaMayor(double ganancia) {
		this.ganancia = ganancia;
	}
	
	@Override
	public boolean cumple(Mueble m) {
		return m.getGanancia() > this.ganancia;
	}

}
