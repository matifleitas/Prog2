package documentos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Documento d1 = new Documento("soyElUno", "llore kjdnasjdn km km nhgjjnm");
		Documento d2 = new Documento("Exsul", "ljdn km km nhgjjnm");
		Documento d3 = new Documento("Maradonaaaaa papa", "llore kjdnasjdn km km nhgjjnm");
		Documento d4 = new Documento("Neyra", "llore kjdnasjdn km km nhgjjnm");
		Documento d5 = new Documento("Sahuaraura", "ldnashdsa ass ds a ssn km km nhgjjnm");
		d1.addPalabraClave("Dios");
		d1.addPalabraClave("Messi");
		d2.addPalabraClave("Cristiano");
		d3.addPalabraClave("Maradona");
		
		Buscador buscador = new Buscador("Buscador fleitas");
		
		buscador.addDocumento(d1);
		buscador.addDocumento(d2);
		buscador.addDocumento(d3);
		buscador.addDocumento(d4);
		buscador.addDocumento(d5);
		
		
		System.out.println("\n Los de mismo titulo: ");
		ArrayList<Documento> docsMismoTitulo = buscador.buscarDocs(new CondicionXTitulo("Bibliiiia"));
		System.out.println("---------------------------");
		System.out.println(docsMismoTitulo);
		System.out.println("\n los que contengan una palabra clave dada: ");
		ArrayList<Documento> docsMismoPalClave = buscador.buscarDocs(new CondicionXPalabraClave("Maradona"));
		System.out.println("---------------------------");
		System.out.println(docsMismoPalClave);
	}

}
