package fileSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends Elemento {
	
	private double tamanio;
	
	public Archivo(String nombre, LocalDate fechaCreacion, double tamanio) {
		super(nombre, fechaCreacion);
		this.tamanio = tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public double getTamanio() {
		return this.getTamanio();
	}

	@Override
	public int cantArchivos() {
		return 1;
	}

	@Override
	public ArrayList<Archivo> getArchivosQueCumplen(Buscador buscador) {
		ArrayList<Archivo> archivos = new ArrayList<>();
		if(buscador.siCumple(this)) {
			archivos.add(this);
		}return archivos;
	}
	
    @Override
    public String toString() {
        return this.getNombre();
    }
    
    public boolean contienePalabra(String p) {
    	return this.getNombre().contains(p);
    }
	
}
