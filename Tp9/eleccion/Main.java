package eleccion;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate ahora = LocalDate.now();
		
		Candidato candidato1 = new Candidato("Galli", "Partido A", "Agrupacion 1");
        Candidato candidato2 = new Candidato("Lunghi", "Partido A", "Agrupacion 1");
        Candidato candidato3 = new Candidato("Peron", "Partido B", "Agrupacion 2");
//        Candidato candidato4 = new Candidato("Gallli", "Partido B", "Agrupacion 2");

        // Crear una mesa
        Mesa mesa = new Mesa();
        mesa.addVotante("123456789"); // Agregar votante al padrón

        // Emitir votos
        mesa.emitirVoto("123456789", candidato1, ahora);
        mesa.emitirVoto("987654321", candidato2, ahora);
        mesa.emitirVoto("123456789", null, ahora); // Voto en blanco


        CondicionXCandidato cond1 = new CondicionXCandidato(candidato1);
        
        double porcentajeXCandidato = mesa.porcentajes(cond1);
        
        System.out.println("Porcentaje de votos para Candidato 1: " + porcentajeXCandidato + "%");

	}

}
