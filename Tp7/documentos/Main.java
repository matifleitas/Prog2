package documentos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Documento d1 = new Documento("soyElUno", " of the over the last decade his performance on this ");
		Documento d2 = new Documento("Exsul", "had so much song is a masterpiece  he best groups putting their twist on one of the be utilizando he best groups puttine utilizando");
		Documento d3 = new Documento("Maradonaaaaa papa", "is time my go to song.. Rap in peace");
		Documento d4 = new Documento("Neyra", "This song jumonstro, sempre");
		Documento d5 = new Documento("Sahuaraura es vida en la naturaleza", "One of the best groups putting their twist on one of the be utilizando espacios en blanco como separadores. Veamos qué hace ");
		
		Autor neruda = new Autor("Pablo", "Neruda", "Mexico");
		Autor king = new Autor("Stephen", "King", "EEUU");
		Autor borges = new Autor("Jorge", "Borges", "Argentina");
		
		
		d1.addPalabraClave("Dios");
		d1.addPalabraClave("Messi");
		d2.addPalabraClave("Cristiano");
		d3.addPalabraClave("Maradona");
		d5.addPalabraClave("ysyA");
		
		d2.addAutor(neruda);
		d2.addAutor(king);
		d2.addAutor(borges);
		d5.addAutor(king);
		
		Buscador buscador = new Buscador("Buscador fleitas");
		
		buscador.addDocumento(d1);
		buscador.addDocumento(d2);
		buscador.addDocumento(d3);
		buscador.addDocumento(d4);
		buscador.addDocumento(d5);
		
		
		System.out.println("\n Los de mismo titulo: ");
		ArrayList<Documento> docsMismoTitulo = buscador.buscarDocs(new CondicionXTitulo("Bibliiiia"));
		System.out.println(docsMismoTitulo);
		System.out.println("---------------------------");
		System.out.println("\n los que contengan una palabra clave dada: ");
		ArrayList<Documento> docsMismoPalClave = buscador.buscarDocs(new CondicionXPalabraClave("Maradona"));
		System.out.println(docsMismoPalClave);
		System.out.println("---------------------------");
		System.out.println("\n Los de un autor determinado: ");
		ArrayList<Documento> autorDeterminado = buscador.buscarDocs(new CondicionXAutor("Borges"));
		System.out.println(autorDeterminado);
		System.out.println("---------------------------");
		System.out.println("\n Los que no contengan ninguna palabra clave: ");
		ArrayList<Documento> ningunaClave = buscador.buscarDocs(new CondicionSinPlabraClave());
		System.out.println(ningunaClave);
		System.out.println("---------------------------");
		System.out.println("\n Los que contengan una frase o palabra dada, en su contenido: ");
		ArrayList<Documento> contenidoTengaPalabOFrase = buscador.buscarDocs(new CondicionXContenidoTengaFrase("song"));
		System.out.println(contenidoTengaPalabOFrase);
		System.out.println("---------------------------");
		System.out.println("\n Los que contengan mas de 20 palabras en su contenido: ");
		ArrayList<Documento> masDeVeintePalabras = buscador.buscarDocs(new ContenidoVeintePalabras());
		System.out.println(masDeVeintePalabras);
		System.out.println("---------------------------");
		
		Condicion c1 = new CondicionXAutor("King");
		Condicion c2 = new CondicionXContenidoTengaFrase("twist");
		Condicion c3 = new CondicionXPalabraClave("ysyA");
		Condicion c4 = new CondicionXTitulo("Sahuaraura es vida en la naturaleza");
		Condicion c5 = new ContenidoVeintePalabras();
		Condicion c6 = new CondicionTituloTengaFrase("Sahuaraura es");
		
		System.out.println("\n Los que cumplan todo: ");
		ArrayList<Documento> CondicionAND = buscador.buscarDocs(new CondicionANDTodo(c1, c2, c3, c4, c5, c6));
		System.out.println(CondicionAND);
	}

}
