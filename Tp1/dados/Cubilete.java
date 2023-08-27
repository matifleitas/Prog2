package dados;

public class Cubilete {

	private Dado[] dados;
	
	public Cubilete(int cantDados) {
		
		this.dados = new Dado[cantDados]; //el arreglo toma como MAX a lo que se paso por parametros
		for (int i = 0; i < cantDados; i++) { //FOR iterando hasta cantDados
			this.dados[i] = new Dado(); //por cada sub indice creo un dado
		}
	}
	
	public int tirar() {
		int total = 0;
		for(int i=0; i < dados.length; i++) { //itero tantas veces como largo del arreglo
			int valor = dados[i].tirar();	//juego por cada sub indice
			total = total + valor;
		}
	return total;
	}
}
