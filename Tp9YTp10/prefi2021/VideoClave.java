package prefi2021;

public class VideoClave extends Video {

	public VideoClave(String titulo, User autor, int duracion, int views, int meGustas, int noMeGustas, int anio) {
		super(titulo, autor, duracion, views, meGustas, noMeGustas, anio);
	}
	
	public boolean contienePclave(String s) {
		return true;
	}
}
