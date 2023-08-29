package contacto_celular;

import java.time.LocalDate;
import java.time.Month;

public class ManejoDeContacto {
	
	private void imprimirContacto(Contacto cont) {
		System.out.println(cont.toString());
	}
	
	public static void main(String[] args) {
		ManejoDeContacto mdc = new ManejoDeContacto();
		
		Contacto cont1 = new Contacto("Matias" , "Fleitas", LocalDate.of(2004, Month.MARCH, 16), 536859, "LaRioja 1218", "matifleitas6@gmail.com");
		
		Contacto cont2 = new Contacto("Ramon" , "Gomez", LocalDate.of(2003, Month.APRIL, 21), 235675, "SanMartin 972", "qsygamer45@gmail.com");
		
		Contacto cont3 = new Contacto("Mario" , "Ramos", LocalDate.of(2004, Month.MARCH, 16), 536859, "LaRioja 1218", "matifleitas6@gmail.com");
		mdc.imprimirContacto(cont1); //muestro el objeto cont1
		System.out.println("----------------");
		mdc.imprimirContacto(cont2); //muestro el objeto cont2
		System.out.println("----------------");
		mdc.imprimirContacto(cont3); //muestro el objeto cont3

		
		Celular cel1 = new Celular();
		System.out.println("-------DESDE ACA ATTAYLIST--------");
		cel1.verificarNumeroRepetido(cont1);//Guardo en el array el contact1
		
		cel1.verificarNumeroRepetido(cont2);//Guardo en el array el contact1
		
		cel1.verificarNumeroRepetido(cont3);//Guardo en el array el contact1
		
		System.out.println(cel1.getListaContactos()); //muestro el arrayList por pantalla
		System.out.println(cel1.getListContactosRepetidos()); //muestro el arrayList por pantalla
		
		
		
		
		
		
		
	}
}
