package muebleria;

import java.util.ArrayList;

public class Muebleria {

    private ArrayList<Mueble> listaMuebles;

    public Muebleria(){
        listaMuebles = new ArrayList<Mueble>();
    }
    public void addMueble(Mueble mueble){
        listaMuebles.add(mueble);
    }

    public double calcularCostoFab(){
        int sumaTotal = 0;
        for (Mueble mueble: listaMuebles) { //Itera por cada valor en el arrayList
            sumaTotal+= mueble.getCostoFabric();
        }
        return sumaTotal;
    }

    public double calcularValorVentaTotal(){
        int sumaTotal = 0;
        for (Mueble mueble: listaMuebles) {
            sumaTotal+=mueble.getValorVenta();
        }
        return sumaTotal;
    }
}
