package predio;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Predio tinca = new Predio("Valentica", "Olavarria");
		
		Cancha areaChica = new Cancha(2, 5000);
		Cancha nanu = new Cancha(13, 9000);
		Cancha cae = new Cancha(12, 1000);
		Cancha rac = new Cancha(13, 2000);
		
		
		Socio oscar = new Socio("oscar", "Cimeon", 19);
		Socio cristian = new Socio("Abel", "Xergentino", 29);
		Socio angel = new Socio("Angel", "Biza", 9);
		Socio jose = new Socio("jose", "Runa", 15);
		Socio vanesa = new Socio("Vanesa", "Urquiza", 12);
		Socio damian = new Socio("Fabricio", "Zodriguez", 22);
		Socio simo = new Socio("Simon", "gentino", 6);
		
		oscar.addCanchaAlq(rac);
		oscar.addCanchaAlq(areaChica);
		simo.addCanchaAlq(areaChica);
		damian.addCanchaAlq(cae);
		jose.addCanchaAlq(nanu);
		
		tinca.addSocio(cristian);
		tinca.addSocio(jose);
		tinca.addSocio(damian);
		tinca.addSocio(oscar);
		tinca.addSocio(vanesa);
		tinca.addSocio(angel);
		tinca.addSocio(simo);
		tinca.addCancha(rac);
		tinca.addCancha(nanu);
		tinca.addCancha(areaChica);
		tinca.addCancha(cae);
		
        Comparator<Socio> comparadorXApellido= new CompararXapellido();

        FiltroXEdad filtrarXEdad = new FiltroXEdad();
        
        ArrayList<Socio> listaSocs = tinca.getSocios(comparadorXApellido, filtrarXEdad);

        System.out.println("Lista de los que cumplen con la edad y ordenados x nombre");
        System.out.println(listaSocs);
        System.out.println("---------------------");
        
        System.out.println("socios menores de edad, ordenados x edad");
        FiltroMenoresEdad menores = new FiltroMenoresEdad();
        ArrayList<Socio> listaSocsMenores = tinca.getSocios(null, menores);
        System.out.println(listaSocsMenores);
        System.out.println("----------------------");
        
        FiltroCancha cancha = new FiltroCancha(13);
        ArrayList<Socio> socios = tinca.getSocios(null, cancha);
        System.out.println(socios);
        System.out.println("-------------------------");
        
        FiltroAND and = new FiltroAND(menores, cancha);
        ArrayList<Socio> sociosAND = tinca.getSocios(comparadorXApellido, and);
        System.out.println(sociosAND);
        
        
        
	}

}
