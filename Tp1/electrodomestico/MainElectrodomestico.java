package electrodomestico;

public class MainElectrodomestico {
	public static void main(String[] args) {
		Electrodomestico elect1 = new Electrodomestico(); 
		Electrodomestico elect2 = new Electrodomestico(); 
		elect1.setNombre("Televisor");
		elect2.setNombre("Heladera");
		elect1.setConsumoEnergetico(40);
		elect2.setConsumoEnergetico(48);
		
		elect1.getBajoConsumo();
		elect2.getBajoConsumo();
		
		System.out.println(elect1.getNombre());
		System.out.println(elect2.getNombre());
		elect1.calcularBalance();
	}
}
