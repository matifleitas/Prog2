package documentos;

import java.util.ArrayList;

public class Documento {
	private ArrayList<Autor> autores;
	private ArrayList<String> palabrasClaves;
	private String titulo;
	private String descripcion;
	
	public Documento(String titulo, String descripcion) {
		autores = new ArrayList<>();
		palabrasClaves = new ArrayList<>();
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	public void addAutor(Autor autor) {
		autores.add(autor);
	}
	
	public void addPalabraClave(String palabra) {
		palabrasClaves.add(palabra);
	}

	@Override
	public String toString() {
		return "Documento [nombre=" + titulo + ", descripcion=" + descripcion + "]";
	}

	public ArrayList<Autor> getAutores(){
		return new ArrayList<>(this.autores);
	}
	
	public ArrayList<String> getPalabrasClaves(){
		return new ArrayList<>(this.palabrasClaves);
	}
	
	public String getTitulo() {
		return titulo;
		
	}

	public void setNombre(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
