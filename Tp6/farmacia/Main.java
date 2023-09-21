package farmacia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {		
		Medicamento rivotril = new Medicamento("Rivotril", "Bago", 1250.0);
		Medicamento clonazepam = new Medicamento("Clonazepam", "Craveri", 1900.0);
		Medicamento apririna = new Medicamento("Aspirina", "Bago", 1250.0);
		Medicamento codeina = new Medicamento("Codeina", "Cassaco", 250.0);
		
		
		Farmacia spinola = new Farmacia("Spinola");
		
		spinola.addMedicamento(rivotril);
		spinola.addMedicamento(clonazepam);
		spinola.addMedicamento(apririna);
		spinola.addMedicamento(codeina);
		
		System.out.println("\n Los de INA: ");
		ArrayList<Medicamento> losDeBago = spinola.buscarMedicamentos(new BusquedaXSubstring("ina"));
		System.out.println("--------------------------");
		System.out.println(losDeBago);
	}

}
