package fyleSystemV2;

public class BuscadorPeso implements Buscador {

    private double peso;

    public BuscadorPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Archivo archivo) {
        return archivo.getTamanio() > this.peso;
    }
}
