package contacto_celular;

import java.util.ArrayList;

public class Celular {
	private ArrayList<Contacto> listaContactos;
	private ArrayList<Contacto> listContactosRepetidos;	
	
	public Celular() {
		listaContactos = new ArrayList<Contacto>();
		listContactosRepetidos = new ArrayList<Contacto>();
	}
	
//	public String mostrarInformacion(Contacto contactoNuevo) {
//        return "Contacto {" +
//                "Nombre =" + contactoNuevo.getNombre() +
//                ", Apellido =" + contactoNuevo.getApellido() +
//                ", Numero_telefono =" + contactoNuevo.getNum_tel() +
//                '}';
//	}
	
	
	public void verificarNumeroRepetido(Contacto contactoNuevo) {
		if(esRepetido(contactoNuevo)) {
			listContactosRepetidos.add(contactoNuevo);
			System.out.println("Contacto repetido");
		} else {
			listaContactos.add(contactoNuevo);
			System.out.println("Contacto nuevo");
		}
	}
	
	public boolean esRepetido(Contacto contactoNuevo) {
		boolean esRep=false;
		for (Contacto contacto : listaContactos) {
			if(contacto.getNum_tel() == contactoNuevo.getNum_tel()) {
				esRep = true;
			}
		}
		return esRep;
	}
	
	public ArrayList<Contacto> getListaContactos() {
		return listaContactos;
	}

	public ArrayList<Contacto> getListContactosRepetidos() {
		return listContactosRepetidos;
	}
}
