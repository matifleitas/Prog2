package sist_notificaciones;

import java.util.ArrayList;

public class Biblioteca {
	private String texto;
	private ArrayList<Usuario> users;


	public Biblioteca(String texto) {
		this.texto = texto;
		this.users = new ArrayList<>();
		
	}
	
	public void notificar(Notificador n) {
		for(int i=0; i<textos.size(); i++) {
			if(textos.get(i) != null) {
				n.enviarNotificacion(textos.get(i));
				System.out.println(n.getNotificacion());
			} else {
				System.out.println("No hay txt");
			}
		}
		
	}
	
	public void addTextosl(String string) {
		this.textos.add(string);
	}
	
//	public void addTextosEmail(String string) {
//		this.textosEmail.add(string);
//	}
//	
//	public void addTextosSms(String string) {
//		this.textosSms.add(string);
//	}
	
	public ArrayList<Usuario> getArrayUsers(){
		return new ArrayList<>();
	}
	
	public ArrayList<String> getArrayString(){
		return new ArrayList<>();
	}
	
	
}
