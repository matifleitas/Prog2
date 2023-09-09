package sombrero;

public class ComportamientoCasaEnemiga extends Comportamiento {

	private Casa casaEnemiga; // se crea esta variable ya que debo comparar con otra casa
	
	
	//Constructor
	public ComportamientoCasaEnemiga(Casa casaEnemiga) { 
		this.casaEnemiga = casaEnemiga;	
	}

	
	public Casa getCasaEnemiga() {
		return casaEnemiga;
	}


	@Override
	public boolean Requerimientos(Alumno alumno, Casa casa) {
		if(!casaEnemiga.getCualidadCasa().equals(alumno.getCualidadAlumno()) //el alumno no puede ser aceptado en la otra
				&& casa.getCualidadCasa().equals(alumno.getCualidadAlumno())) {
			return true;
		} else {
			return false;
		}
	}

}
