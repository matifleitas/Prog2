package figuras;

public class ManejadorDeFiguras {
	
	public void imprimir(Figura fig) {
		System.out.println(fig.getDatosCompletos());
	}
	
	public static void main(String[] args) {
		ManejadorDeFiguras mf = new ManejadorDeFiguras();
		
		Rectangulo r1 = new Rectangulo("Rect1", 12, 6);
		
		mf.imprimir(r1);
		//
		Circulo c1 = new Circulo("Circ1", 10);
		
		mf.imprimir(c1);
		//
		MedioCirculo mc1 = new MedioCirculo("MedCirc1", 8);
		
		mf.imprimir(mc1);
		
	}

}
