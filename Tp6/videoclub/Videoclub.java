package videoclub;

import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {
	private String nombreVideoClub;
	private String barrio;
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Alquiler> listaALquileres;

	
	public Videoclub(String nombreVideoClub, String barrio) {
		listaALquileres = new ArrayList<Alquiler>();
		listaClientes = new ArrayList<Cliente>();
		this.nombreVideoClub = nombreVideoClub;
		this.barrio = barrio;
	}

	public void addCliente(Cliente clienteN ) {
		for (Cliente cliente : listaClientes) {
			if(cliente.equals(clienteN)) {
				System.out.println("Este cliente ya esta registrado");
			} else {
				listaClientes.add(clienteN);
			}
		}
	}
	
	//addPeli
	public void alquilarPeli(ItemAlquilable item, LocalDate fechaDevolucion, Cliente cliente) {
		if(item.quedanStock()) {
			Alquiler alquiler = new Alquiler(cliente, item, fechaDevolucion);
			listaALquileres.add(alquiler);
			item.alquilar();
		}
	}

	public String getNombreVideoClub() {
		return nombreVideoClub;
	}

	public void setNombreVideoClub(String nombreVideoClub) {
		this.nombreVideoClub = nombreVideoClub;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
	
}
