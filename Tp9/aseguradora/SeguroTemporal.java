package aseguradora;

import java.time.LocalDate;

public class SeguroTemporal {

	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private Elemento seguroQueLoContiene;
	
	public SeguroTemporal(LocalDate fechaIni, LocalDate fechaFin, Elemento seguroQueLoContiene) {
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.seguroQueLoContiene = seguroQueLoContiene;
	}

	public double calcularCostoSeguroTemporal() {
		LocalDate fechaActual = LocalDate.now();
		if(fechaActual.isAfter(this.fechaIni) && fechaActual.isBefore(fechaFin)) {
			return seguroQueLoContiene.calcularCostoPoliza();
		} else {
			return 0.0;
		}
	}
}
