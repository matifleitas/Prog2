package parcialito3;


	public class Alumno {
	    private int cantidadAlumnos;
	    private String nombre;
	    private int legajo;

	    public Alumno(String nombre) {
	        this.nombre = nombre;
	        legajo = cantidadAlumnos;
	        cantidadAlumnos++;
	    }

	    public int getLegajo() {
	        return legajo;
	    }

	    public void setLegajo(int legajo) {
	        this.legajo = legajo;
	    }
	}

