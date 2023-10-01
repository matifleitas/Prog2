package vivero;

import java.util.ArrayList;

public class Planta {
	private String nombreCientifico, clasificacion, flia, clase;
	private ArrayList<String> nombreVulgar;
	private int luminosidad;
	private int cantAgua;
	private final int MIN_SOL = 1, MAX_SOL = 10;
	
	public Planta(String nombreCientifico, String clasificacion, String flia, String clase, int luminosidad, int cantAgua) {
		nombreVulgar = new ArrayList<>();
		this.nombreCientifico = nombreCientifico;
		this.clasificacion = clasificacion;
		this.flia = flia;
		this.clase = clase;
		this.luminosidad = verificarValores(luminosidad);
		this.cantAgua = verificarValores(cantAgua);
	}
	
	public ArrayList<String> getNombresVulgares(){
		return new ArrayList<>(nombreVulgar);
	}
	
	public void addNombreVulgar(String n) {
		this.nombreVulgar.add(n);
	}
	
	public int verificarValores(int valor) {
		if(valor > MAX_SOL || valor < MIN_SOL) {
			return -1;
		} else {
			return valor;
		}
	}
	
	public void addClasificacion(String c) {
		this.nombreVulgar.add(c);
	}
	
	public void addFlia(String f) {
		this.nombreVulgar.add(f);
	}
	
	public void addClase(String clase) {
		this.nombreVulgar.add(clase);
	}
	
	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getFlia() {
		return flia;
	}

	public void setFlia(String flia) {
		this.flia = flia;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getLuminosidad() {
		return luminosidad;
	}

	public int getCantAgua() {
		return cantAgua;
	}

	@Override
	public String toString() {
		return
				"Nombre Científico: " + this.getNombreCientifico() + "\t\tClase: " + this.getClase() + "\n"+
	        	"Nombres vulgares: " + this.getNombresVulgares() /*+ "\t\t" + this.getPlantaInterior*/ + "\n"+
	        	"Clasificación superior: " + this.clasificacion + "\t\tRiego: " + this.getCantAgua() + "\n"+
	        	"Familia: " + this.getFlia() + "\t\t\t\tSol: " + this.getLuminosidad() + "\n"+
	        	"------------------------------------------------------------------" + "\n";
	}
//	@Override
//	public String toString() {
//		  String resultado = "";
//	        resultado += "Nombre Científico: " + this.getNombreCientifico() + "\t\tClase: " + this.getClase() + "\n";
//	        resultado += "Nombres vulgares: " + this.getNombresVulgares() /*+ "\t\t" + this.getPlantaInterior*/ + "\n";
//	        resultado += "Clasificación superior: " + this.clasificacion + "\t\tRiego: " + this.getCantAgua() + "\n";
//	        resultado += "Familia: " + this.getFlia() + "\t\tSol: " + this.getLuminosidad() + "\n";
//	        return resultado ;
//	}
	
}
