package fileSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Link extends Elemento{

	private final static double TAMANIO=1;
	private static String nomPorDefecto = "Acceso directo a ";
	private Elemento elemLinkeado;
	
	public Link(LocalDate fechaCreacion, Elemento elementoLinkeado) {
		super(nomPorDefecto + elementoLinkeado.getNombre(), fechaCreacion);
		this.elemLinkeado = elementoLinkeado;
	}

	@Override
	public double getTamanio() {
		return TAMANIO;
	}

	@Override
	public int cantArchivos() {
		return 0;
	}

	@Override
	public ArrayList<Archivo> getArchivosQueCumplen(Buscador buscador) {
		return elemLinkeado.getArchivosQueCumplen(buscador);
	}
}
