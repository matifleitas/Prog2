package agenda_personal;

public class Asistente {
	private int telefono;
	private String e_mail;


	public Asistente(int telefono, String e_mail) {
		this.telefono = telefono;
		this.e_mail = e_mail;
	}
	
	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getE_mail() {
		return e_mail;
	}


	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
	
}