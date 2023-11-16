package recu;

import java.util.ArrayList;

public class Noticia extends ElementoPortal{

	private String contenido;
	private String autor;
	private String titulo;
	private ArrayList<String> palabrasClaves;
	
	public Noticia(String categoria, String contenido, String autor, String titulo) {
		super(categoria);
		this.contenido = contenido;
		this.autor = autor;
		this.titulo = titulo;
		palabrasClaves = new ArrayList<String>();
	}

	@Override
	public ArrayList<String> getPalabrasClaves() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
