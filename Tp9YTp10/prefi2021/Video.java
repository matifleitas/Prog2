package prefi2021;

import java.util.ArrayList;
import java.util.Collections;

public class Video extends ElementoVideo implements Comparable<Video>{
	private User autor;
	private int duracion;
	private int views;
	private int meGustas;
	private int noMeGustas;
	private int anio;
	private ArrayList<String> pClaves;
	
	public Video(String titulo, User autor, int duracion, int views, int meGustas, int noMeGustas, int anio) {
		super(titulo);
		this.autor = autor;
		this.duracion = duracion;
		this.views = views;
		this.meGustas = meGustas;
		this.noMeGustas = noMeGustas;
		this.anio = anio;
	}

	public void addPClaves(String s) {
		if(!this.pClaves.contains(s)) {
			pClaves.add(s);
		}
	}
	
	public boolean contienePclave(String s) {
		return this.pClaves.contains(s);
	}

	public User getAutor() {
		return autor;
	}

	public void setAutor(User autor) {
		this.autor = autor;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getMeGustas() {
		return meGustas;
	}

	public void setMeGustas(int meGustas) {
		this.meGustas = meGustas;
	}

	public int getNoMeGustas() {
		return noMeGustas;
	}

	public void setNoMeGustas(int noMeGustas) {
		this.noMeGustas = noMeGustas;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public ArrayList<Video> buscar(Condicion c) {
		ArrayList<Video> result = new ArrayList<>();
		if(c.siCumple(this)) {
			result.add(this);
		} 
		return result;
	}

	@Override
	public int compareTo(Video o) {
		return autor.compareTo(o.getAutor());
	}

	@Override
	public ArrayList<String> getPClaves() {
		return new ArrayList<>(pClaves);
	}

	@Override
	public int cantVideos() {
		return 1;
	}

	@Override
	public int duracionVideo() {
		return this.duracion;
	}
	
}
