package series;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean flag;
	private int calificacion;
	
	final static int MAX_CALIFICACION = 5;
	final static int MIN_CALIFICACION = 1;

	public Episodio(String titulo) { //valores por defecto
		this.titulo = "N";
		this.descripcion = "No se tiene descripcion aun";
		this.flag = false;
		this.calificacion = 0;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public boolean getFlag() {
		return this.flag;
	}
	
    public void marcarComoVisto() {
        this.flag = true;
    }
	
	public int getCalificacion() {
		return this.calificacion;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setCalificacion(int calificacion) {
		if(calificacion >= MIN_CALIFICACION && calificacion <= MAX_CALIFICACION) {
			this.calificacion = calificacion;
		} else {
			System.out.println("Calificacion ingresada no valida");
		}
	}
}