package farmacia;

import java.util.ArrayList;


public class Farmacia{
	private String nombre;
	private ArrayList<Medicamento> medicamentos;

	public Farmacia(String nombre) {
		this.nombre = nombre;
		medicamentos = new ArrayList<>();
	}
	
	public ArrayList<Medicamento> buscarMedicamentos(Condicion c){
		ArrayList<Medicamento> listaQueCumplan = new ArrayList<>();
		for(int i=0;i<this.medicamentos.size();i++) { //itera pos a pos del array
			Medicamento medicamento = this.medicamentos.get(i); //get(i) es un medicamento
			if(c.cumple(medicamento)) {
				listaQueCumplan.add(medicamento);//agrego al array el medicamento q cumpla
			}
		}return listaQueCumplan;
	}
	
	public void addMedicamento(Medicamento medicamento) {
		medicamentos.add(medicamento);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Medicamento> getLista() {
        return new ArrayList<>(medicamentos);
    }
}
