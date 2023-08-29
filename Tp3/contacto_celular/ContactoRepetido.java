package contacto_celular;

import java.time.LocalDate;

public class ContactoRepetido extends Contacto {
	public ContactoRepetido(String nombre, String apellido, LocalDate fecha_nacimiento, int num_tel, String direccion, String direccion_mail) {
		super(nombre, apellido, fecha_nacimiento, num_tel, direccion, direccion_mail);
	}
}
