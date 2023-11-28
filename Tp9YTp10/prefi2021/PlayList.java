package prefi2021;

import java.util.ArrayList;
import java.util.Collections;

public class PlayList extends ElementoVideo {
	
	private ArrayList<ElementoVideo> elementos;
	private int extraDuracion;
	
	public PlayList(String titulo, int extraDuracion) {
		super(titulo);
		this.extraDuracion = extraDuracion;
		elementos = new ArrayList<ElementoVideo>();
	}
	
	public void addElemento(ElementoVideo e) {
		elementos.add(e);
	}
	
	public int getExtraDuracion() {
		return extraDuracion;
	}

	public void setExtraDuracion(int extraDuracion) {
		this.extraDuracion = extraDuracion;
	}

	@Override
	public ArrayList<Video> buscar(Condicion c) {
		ArrayList<Video> result = new ArrayList<>();
		
		for(int i=0;i<elementos.size();i++) {
			result.addAll(elementos.get(i).buscar(c));
		} 
		Collections.sort(result);
		return result;
	}

	@Override
	public ArrayList<String> getPClaves() {
		ArrayList<String> result = new ArrayList<>();
		
		for(int i=0;i<elementos.size();i++) {
			ArrayList<String> resultAux = elementos.get(i).getPClaves();
			for(int j=0;j<resultAux.size();j++) {
				if(!result.contains(resultAux.get(j))) {
					result.add(resultAux.get(j));
				}
			}
		} return result;
	}

	@Override
	public int cantVideos() {
		int suma=0;
		for(int i=0;i<elementos.size();i++) {
			suma += elementos.get(i).cantVideos();
		}return suma;
	}

	@Override
	public int duracionVideo() {
		int sum=0;
		for(int i=0;i<elementos.size();i++) {
			sum+=elementos.get(i).duracionVideo();
		}return sum + this.extraDuracion;
	}	
}
