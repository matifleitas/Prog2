package documentos;

import java.util.ArrayList;

public class Buscador {
	private ArrayList<Documento>documentos;
	private String nombre;
	
	public Buscador(String nombre) {
		this.nombre = nombre;
		documentos = new ArrayList<>();
	}
	
	public ArrayList<Documento> buscarDocs(Condicion con){
		ArrayList<Documento> docsQueCumplen = new ArrayList<>();
		for(int i=0; i<this.documentos.size(); i++) {
			Documento doc = documentos.get(i);
			if(con.siCumple(doc)) {
				docsQueCumplen.add(doc);
			}
		} return docsQueCumplen;
	}
	
	public void addDocumento(Documento doc) {
		documentos.add(doc);
	}
	
	public ArrayList<Documento> getLista(){
		return new ArrayList<>(documentos);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

