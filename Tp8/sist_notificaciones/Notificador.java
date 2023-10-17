package sist_notificaciones;

public interface Notificador {
	void enviarNotificacion(String s); //Envía una notificación
	String getNotificacion(); // Recupera una notificación
}
