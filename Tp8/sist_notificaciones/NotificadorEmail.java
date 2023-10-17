package sist_notificaciones;

public class NotificadorEmail implements Notificador {
	private String emailEnvio;
	private String emailRecibido;
	
	public NotificadorEmail(String emailEnvio, String emailRecibido) {
		this.emailEnvio = emailEnvio;
		this.emailRecibido = emailRecibido;
	}

	@Override
	public void enviarNotificacion(String s) {
		this.emailRecibido = s; //recibo el mail 
		emailEnvio = "Te llego un Email :" + s;
	}

	@Override
	public String getNotificacion() {
		return this.emailEnvio;
	}

}
