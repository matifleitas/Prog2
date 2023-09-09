package sombrero;

public class ComportamientoCasaExigente extends Comportamiento {

	@Override
	public boolean Requerimientos(Alumno alumno, Casa casa) {
		if(casa.hayLugar() && alumno.getCualidadAlumno().equals(casa.getCualidadCasa())) {
			
			for (Alumno familiar : alumno.getFamiliares()) {
				for (Alumno alumn : casa.getArrayAlumnos()) {
					if(familiar.equals(alumn)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
