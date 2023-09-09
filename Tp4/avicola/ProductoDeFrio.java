package avicola;

import java.time.LocalDate;

public class ProductoDeFrio extends ProductoFresco {
    protected int codAlimentario;
    protected double tempMantenimiento;

    public ProductoDeFrio(String nombre, LocalDate fechaVto, int nroLote, LocalDate fechaEnvasado,
                          String granjaOrigen, int codAlimentario, double tempMantenimiento) {
        super(nombre, fechaVto, nroLote, fechaEnvasado, granjaOrigen);
        this.codAlimentario = codAlimentario;
        this.tempMantenimiento = tempMantenimiento;
    }
    @Override
    public String toString(){
        return super.toString() +
                ", Codigo Alimentario: " + codAlimentario +
                ", Temperatura de Mantenimiento: " + tempMantenimiento;
    }
}
