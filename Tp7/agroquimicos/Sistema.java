package agroquimicos;

import java.util.ArrayList;

public class Sistema {
	private String nombre;
	private ArrayList<Agronomico> agronomicos;
	
	public Sistema(String nombre) {
		this.nombre = nombre;
		agronomicos = new ArrayList<>();
	}
	
	public ArrayList<Agronomico> buscarAgronomicosParaEnfermedad(TipoElemento agro){
		ArrayList<Agronomico> agronomicosParaLaEnfermedad = new ArrayList<>();
		for(int i=0; i<this.agronomicos.size(); i++) {
			Agronomico agronomico = agronomicos.get(i);
			if(agro.puedeSerTratado(agronomico)) {
				agronomicosParaLaEnfermedad.add(agronomico);
			}if(agronomicosParaLaEnfermedad.isEmpty()) {
				System.out.println(" \n VACIO");
			}
		}return agronomicosParaLaEnfermedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Agronomico> getLista(){
		return new ArrayList<>(agronomicos);
	}
	
}
