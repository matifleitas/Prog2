package avicola;

import java.time.LocalDate;

public class CongPorAire extends ProductoDeFrio{
    private double cantNitrogeno, cantOxigeno, canDioxido, cantVaporDeAgua;

    public CongPorAire(String nombre, LocalDate fechaVto, int nroLote, LocalDate fechaEnvasado, String granjaOrigen,
                       int codAlimentario, double tempMantenimiento, double cantNitrogeno, double cantOxigeno,
                       double canDioxido, double cantVaporDeAgua) {
        super(nombre, fechaVto, nroLote, fechaEnvasado, granjaOrigen, codAlimentario, tempMantenimiento);
        this.cantNitrogeno = cantNitrogeno;
        this.cantOxigeno = cantOxigeno;
        this.canDioxido = canDioxido;
        this.cantVaporDeAgua = cantVaporDeAgua;
    }

    public double getCantNitrogeno() {
        return cantNitrogeno;
    }
    public double getCantOxigeno() {
        return cantOxigeno;
    }
    public double getCanDioxido() {
        return canDioxido;
    }
    public double getCantVaporDeAgua() {
        return cantVaporDeAgua;
    }

    public String toString(){
        return super.toString() +
                ", Porcentaje de nitrogeno: " + cantNitrogeno +
                ", Porcentaje de dioxido: " + canDioxido +
                ", Porcentaje de oxigeno: " + cantOxigeno +
                ", Vapor de agua: " + cantVaporDeAgua;
    }
}
