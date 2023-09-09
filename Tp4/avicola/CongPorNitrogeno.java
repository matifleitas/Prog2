package avicola;

import java.time.LocalDate;

public class CongPorNitrogeno extends ProductoDeFrio{
    private int tiempo_exposicion;
    private String metodo_empleado;

    public CongPorNitrogeno(String nombre, LocalDate fechaVto, int nroLote, LocalDate fechaEnvasado, String granjaOrigen,
                            int codAlimentario, double tempMantenimiento, int tiempo_exposicion, String metodo_empleado) {
        super(nombre, fechaVto, nroLote, fechaEnvasado, granjaOrigen, codAlimentario, tempMantenimiento);
        this.tiempo_exposicion = tiempo_exposicion;
        this.metodo_empleado = metodo_empleado;
    }

    public int getTiempo_exposicion() {
        return tiempo_exposicion;
    }

    public String getMetodo_empleado() {
        return metodo_empleado;
    }



    public String toString(){
        return super.toString() +
                ", Tiempo de exposicion: " +  tiempo_exposicion +
                ", Metodo de congelamiento empleado: " + metodo_empleado;
    }
}
