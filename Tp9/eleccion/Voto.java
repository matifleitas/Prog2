package eleccion;

import java.time.LocalDate;

public class Voto {
	private Candidato candidatoVotado;
	private LocalDate fechaVoto;
	private boolean blanco;
	
	public Voto(Candidato candidatoVotado, LocalDate fechaVoto) {
		this.candidatoVotado = candidatoVotado;
		this.fechaVoto = fechaVoto;
		this.blanco = verificarVoto(candidatoVotado);
	}
	
	public boolean verificarVoto(Candidato candidatoVotado) {
		return candidatoVotado == null;
	}

	public boolean isBlanco() {
		return blanco;
	}

	public Candidato getCandidatoVotado() {
		return candidatoVotado;
	}
	
	public String nombreCandidatoVotado() {
		return candidatoVotado.getNombre();
	}

	public LocalDate getFechaVoto() {
		return fechaVoto;
	}
}
