package ej1;

public class Mainpersona {
	public static void main(String[] args) {
		Persona matias = new Persona();
		Persona valentinca = new Persona();
		 
		matias.setNombre("nicolas");
		valentinca.setEdad(19);
		valentinca.setPeso(21.5);
		
		System.out.println(valentinca.getEdad());
		//System.out.println(matias.getNombre()+" "+valentinca.getNombre());
		System.out.println(valentinca.getMasaCorporal());
	}
}
