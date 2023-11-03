package oscarsito;


import java.time.LocalDate;


public class CondicionFechaMaxima extends Condicion{
	
	private LocalDate fecha;
	
	public CondicionFechaMaxima() {
		setFecha();
	}
	@Override
	public boolean cumple(Mueble m) {
		return m.getFechaEntrega().compareTo(fecha) < 0;
	}
	
	public void setFecha() {
		
		LocalDate fechaActual = LocalDate.now();
		
		int year = fechaActual.getYear();
		int month = fechaActual.getMonthValue();
		int day = fechaActual.getDayOfMonth();
		
		if(month == 12) {
			month = 1;
			year++;
		} else {
			month++;
		}
		
		this.fecha = LocalDate.of(year, month, day);
	}
}
