package avicola;

import java.time.LocalDate;

public class CongPorAgua extends ProductoDeFrio {
    private double agua;
    private double sal;

    public CongPorAgua(String nombre, LocalDate fechaVto, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codAlimentario, double tempMantenimiento, double agua, double sal) {
        super(nombre, fechaVto, nroLote, fechaEnvasado, granjaOrigen, codAlimentario, tempMantenimiento);
        this.agua = agua;
        this.sal = sal;
    }

    public double getSalinidad() {
        return this.agua*this.sal;
    }

    public double getAgua() {
        return agua;
    }

    public double getSal() {
        return sal;
    }

    public String toString(){
        return super.toString() +
                ", Porcentaje de salinidad: " + this.getSalinidad();
    }
}
