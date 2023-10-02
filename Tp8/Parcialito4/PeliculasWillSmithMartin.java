package Parcialito4;

public class PeliculasWillSmithMartin implements Buscador{
	
	private String will;
	private String martin;
	
	public PeliculasWillSmithMartin() {
		this.will = "Will Smith";
		this.martin = "Martin Scorsese";
	}
	
	@Override
	public boolean siCumple(Pelicula p) {
		for(int i=0; i<p.getActores().size(); i++) {
			String actorPos = p.getActores().get(i);
			if(actorPos.equals(this.will) && p.getDirector() != this.martin) {
				return true;
			}
		}return false;
	}
	
	

}
