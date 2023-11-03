package eleccion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mesa {
	
	private ArrayList<String> padron;
	private ArrayList<Voto> votosMesa;
	private int cantVotosBlanco;
	private Elemento elem;
	
	public Mesa() {
		cantVotosBlanco=0;
		padron = new ArrayList<>();
		votosMesa = new ArrayList<>();
		elem.addMesa(this);
	}
	
	public double porcentajes(Condicion c) {
		int votosTotales = votosMesa.size();
		int votosXCondicion = 0;
		
		for(int i=0;i<votosTotales;i++) {
			Voto voto=votosMesa.get(i);
			if(c.siCumple(voto)) {
				votosXCondicion++;
			}
		}	return (double)(votosXCondicion / votosTotales) * 100;
	}
	
	public void emitirVoto(String dni, Candidato cand, LocalDate horaEmision) {
		if(this.getPadron().contains(dni)) {
			Voto votoNuevo = new Voto(cand, horaEmision);
			this.votosMesa.add(votoNuevo);
		}
	}
	
	public ArrayList<String> getPadron(){
		return new ArrayList<>(padron);
	}
	
	public void addVotante(String p) {
		padron.add(p);
	}
	
	public ArrayList<Voto> getArrayVotos(){
		return new ArrayList<>(votosMesa);
	}
	
	public void obtVotosBlanco() {
		for(int i=0;i<getArrayVotos().size();i++) {
			Voto v = getArrayVotos().get(i);
			if(v.isBlanco()) {
				this.cantVotosBlanco++;
			}
		}
	}
	
	public int getCantVotosBlanco() {
		return cantVotosBlanco;
	}
}
