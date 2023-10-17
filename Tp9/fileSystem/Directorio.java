package fileSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends Elemento{

	private ArrayList<Elemento> elementos;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		elementos = new ArrayList<>();
	}
	
	public void addElemento(Elemento e) {
	    //validar que no se duplique un elemento
	    this.elementos.add(e);
	    e.setPadre(this);
	}

	@Override
	public double getTamanio() {
		int cant=0;
		for(int i=0; i<elementos.size(); i++) {
			Elemento elemPos = elementos.get(i);
			cant += elemPos.getTamanio();
		} return cant;
	}

	@Override
	public int cantArchivos() {
		int contArchivos=0;
		for(int i=0; i<elementos.size(); i++) {
			Elemento elemPos = elementos.get(i);
			contArchivos += elemPos.cantArchivos();
		}return contArchivos;
	}
	
	
    @Override
	public String toString() {
		String path = this.getNombre();
		for(int i=0;i<elementos.size();i++) {
			Elemento e = elementos.get(i);
			path += this.getNombre() + "/" + e.getNombre() + "\n";
		}return path;
	}

	public int getCantidadElementos() {
        return this.elementos.size();
    }

	@Override
	public ArrayList<Archivo> getArchivosQueCumplen(Buscador buscador) {
		ArrayList<Archivo> archivosCumplidores = new ArrayList<>();
		for(int i=0;i<elementos.size();i++) {
			Elemento e = elementos.get(i);
			for(int j=0;j<e.getArchivosQueCumplen(buscador).size();j++) {
				Archivo archivo = e.getArchivosQueCumplen(buscador).get(i);
				boolean encontro=false;
				int f=0;
				while(!encontro && f<archivosCumplidores.size()) {
					if(archivo.esMenor(archivosCumplidores.get(i))) {
						encontro = true;
					}else {
						i++;
					}
				}
                if (encontro) {
                    archivosCumplidores.add(i, archivo);
                } else {
                    archivosCumplidores.add(archivo);
                }
			}
		}return archivosCumplidores;
	}

}
