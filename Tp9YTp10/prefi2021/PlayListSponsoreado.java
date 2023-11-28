package prefi2021;

import java.util.ArrayList;

//pide que cuando se obtenga un listado de videos, siempre agregan al principio del resultado un 
//video especifico, aunque no cumpla con la condicion
public class PlayListSponsoreado extends PlayList {
	
	private Video video;

	public PlayListSponsoreado(String titulo, int extraDuracion, Video video) {
		super(titulo, extraDuracion);
		this.video = video;
	}
	
	@Override
	public ArrayList<Video> buscar(Condicion c) {
		ArrayList<Video> result = super.buscar(c);
		result.add(0, video);
		return result;
		
	}
	
	public Video getPago() {
		return video;
	}

	public void setPago(Video video) {
		this.video = video;
	}

}
