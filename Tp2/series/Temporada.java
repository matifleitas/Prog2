package series;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
	private int cant_episodios;
	private int cant_epi_vistos;
	private int total_calificaciones;
	private int total_episodios_calificados;
	private List<Episodio> episodios;

    public Temporada() {
    	cant_episodios = 0;
		cant_epi_vistos = 0;
		total_calificaciones = 0;
		total_episodios_calificados = 0;
        this.episodios = new ArrayList<>();
    }
	
    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }
    
    public int getCantEpisodiosVistos() {
        for (Episodio episodio : episodios) {
            if (episodio.getFlag()) { //si la variable visto es true, incremento el total
            	cant_epi_vistos++;
            }
        }
        return cant_epi_vistos;
    }
	
	public int getCantEpisodios() {
		return this.cant_episodios;
	}
	
	public void setCantEpisodios(int cant_episodios) {
		this.cant_episodios = cant_episodios;
	}
	
	public void incrementarCalificados() {
		this.cant_epi_vistos++;
	}
	
	public double getPromedioCalificaciones() {
        for (Episodio episodio : episodios) {
            if (episodio.getCalificacion() >= 1 && episodio.getCalificacion() <= 5) {
            	total_calificaciones += episodio.getCalificacion();
            	total_episodios_calificados++;
            }
        }
        if (total_episodios_calificados > 0) {
            return (double) total_calificaciones / total_episodios_calificados;
        } else {
            return 0.0; // No hay episodios calificados
        }
    }
}




