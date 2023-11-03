package eleccion;

public class CondicionXCandidato implements Condicion{
	private Candidato candidatoBuscado;

	public CondicionXCandidato(Candidato candidatoBuscado) {
		this.candidatoBuscado = candidatoBuscado;
	}
	
	public Candidato getCandidatoBuscado() {
		return candidatoBuscado;
	}

	@Override
	public boolean siCumple(Voto v) {
		return v.getCandidatoVotado().equals(this.getCandidatoBuscado());
	}
	
//	@Override
//	public boolean equals(Object o1) {
//		try {
//			 CondicionXCandidato nuevoCandidato = (CondicionXCandidato)o1;
//			 if(this.getCandidatoBuscado().getNombre() == nuevoCandidato.getCandidatoBuscado().getNombre()) {//si las casas tienen el mismo nombre son equals
//				 return true;
//			 } else { 
//				 return false;
//			 }		 
//		} catch (Exception e) {
//			return false;
//		}
//	}
	
}
