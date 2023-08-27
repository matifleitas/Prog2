package muebleria;

import javax.lang.model.element.NestingKind;

public class Mueble {
    private TipoMueble tipo;
    private double peso;
    private double costoFabric;
    private double valorVenta;
    private String tipoMadera;
    private String color;

    public Mueble(TipoMueble tipo, double peso, double costoFabric, String tipoMadera, String color,double ganancia) {
        this.tipo = tipo;
        this.peso = peso;
        this.costoFabric = costoFabric;
        this.tipoMadera = tipoMadera;
        this.color = color;
        valorVenta = calcularValorVenta(ganancia);
    }

    public double calcularValorVenta(double ganancia){
        return costoFabric*ganancia;
    }

    public TipoMueble getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public double getCostoFabric() {
        return costoFabric;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public String getColor() {
        return color;
    }
}
