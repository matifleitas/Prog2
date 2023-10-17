package sist_notificaciones;

public class NotificadorSms implements Notificador{
	private String sms;

	public NotificadorSms(String sms) {
		this.sms = sms;
	}

	@Override
	public void enviarNotificacion(String s) {
		this.sms = "Te llego un SMS: " + s;
		
	}

	@Override
	public String getNotificacion() {
		return sms;
	}

}
