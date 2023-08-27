package series;
import java.util.ArrayList;
import java.util.List;
/*
● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
● Obtener el total episodios vistos de una temporada particular.
● Obtener el total de episodios vistos de una serie.
● Obtener el promedio de las calificaciones dadas para una temporada particular.
● Obtener el promedio de las calificaciones dadas para una serie.
● Determinar si se vio todos los episodios de la serie.
*/

public class Serie {
	private Episodio episodio;
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private int total_episodios_vistos;
	private int total_calificaciones;
	private int total_episodios_calificados;
	private List<Temporada> temporadas;
	
	public Serie(String titulo, String descricpion, String creador, String genero) {
		this.titulo = "N";
		this.descripcion = "Aun no hay descripcion de la serie";
		this.creador = "N";
		this.genero = "N";
		this.total_episodios_vistos = 0;
		this.total_calificaciones = 0;
		this.total_episodios_calificados = 0;
        this.temporadas = new ArrayList<>();
	}
	
	public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }
	
	public int getTotalEpisodiosVistos() {
		for(Temporada temporada : temporadas) {
			total_episodios_vistos += temporada.getCantEpisodiosVistos();
		}
		return total_episodios_vistos;
	}
	
	public double getPromedioCalificaciones() {
		for (Temporada temporada : temporadas) {
			total_calificaciones += temporada.getPromedioCalificaciones();
			total_episodios_calificados++;
		}
		if(total_episodios_calificados > 0) {
			return (double) total_calificaciones / total_episodios_calificados;
		} else {
			return 0.0; //no hay episodios calificados
		}
	}
	/*
	public boolean seVieronTodosLosCapitulos() {
		for(Temporada temporada : temporadas) {
			for(Episodio episodio : episodio.getTitulo()) {
				if(!episodio.isVisto()) {
					return false;
				}
			}
		}
		return true;
	}
	*/
	public static void main(String[] args) {
		
        Episodio episodio1 = new Episodio("Titulo del episodio 1"); //instacio un nuevo episodio
        Episodio episodio2 = new Episodio("Titulo del episodio 2");
        Episodio episodio3 = new Episodio("Titulo del episodio 3"); 
        Episodio episodio4 = new Episodio("Titulo del episodio 4");
        episodio1.setCalificacion(4);//ingreso calificacion
        episodio2.setCalificacion(5);
        episodio4.setCalificacion(2); 
        
        episodio1.marcarComoVisto(); //marco el episodio como visto
        episodio2.marcarComoVisto(); 
        episodio4.marcarComoVisto(); 
        //System.out.println(episodio1.getFlag());

        Temporada temporada1 = new Temporada(); //Instancio una nueva temporada
        temporada1.agregarEpisodio(episodio1); //agrego los capitulos anteriormente instanciados a la temporada
        temporada1.agregarEpisodio(episodio2);
        temporada1.agregarEpisodio(episodio4);

        Serie serie1 = new Serie("Mi Serie", "Descripción de la serie", "Creador de la serie", "Género de la serie");
        serie1.agregarTemporada(temporada1);
        Serie serie2 = new Serie("Mi Serie", "Descripción de la serie", "Creador de la serie", "Género de la serie");
        serie2.agregarTemporada(temporada1);

        System.out.println("Total de episodios vistos en la serie: " + serie1.getTotalEpisodiosVistos());
        System.out.println("Promedio de calificaciones en la serie: " + serie1.getPromedioCalificaciones());
        System.out.println("Total de episodios vistos: " + serie1.getTotalEpisodiosVistos());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Total de episodios vistos en la serie: " + serie2.getTotalEpisodiosVistos());
        System.out.println("Promedio de calificaciones en la serie: " + serie2.getPromedioCalificaciones());
        System.out.println("Total de episodios vistos: " + serie2.getTotalEpisodiosVistos());
	}
}








