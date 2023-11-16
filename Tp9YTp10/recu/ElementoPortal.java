package recu;

import java.util.ArrayList;

public abstract class ElementoPortal {
	private String categoria;

	public ElementoPortal(String categoria) {
//		super();
		this.categoria = categoria;
	}
	
	public abstract ArrayList<String> getPalabrasClaves();
	
	public String getCategoria() {
		return this.categoria;
	}
}
