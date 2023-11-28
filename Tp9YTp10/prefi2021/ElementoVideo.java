package prefi2021;

import java.util.ArrayList;

public abstract class ElementoVideo {
	
	private String titulo;
	public abstract ArrayList<Video> buscar(Condicion c);
	public abstract ArrayList<String> getPClaves();
	public abstract int cantVideos();
	public abstract int duracionVideo();
	
//	public ArrayList<Video> ordenar(Condicion c){
//		ArrayList<Video> result = this.buscar(c);
//		Collections.sort(result);
//		return result;
//	}
	
	public ElementoVideo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
