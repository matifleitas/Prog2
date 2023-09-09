package avicola;

import java.time.LocalDate;

public class ProductoFresco {
    protected String nombre;
    protected LocalDate fechaVto;
    protected int nroLote;
    protected LocalDate fechaEnvasado;
    protected String granjaOrigen;

    public ProductoFresco(String nombre, LocalDate fechaVto, int nroLote, LocalDate fechaEnvasado, String granjaOrigen) {
        this.nombre = nombre;
        this.fechaVto = fechaVto;
        this.nroLote = nroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaVto() {
        return fechaVto;
    }
    public void setFechaVto(LocalDate fechaVto) {
        this.fechaVto = fechaVto;
    }
    public int getNroLote() {
        return nroLote;
    }
    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }
    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getGranjaOrigen() {
        return granjaOrigen;
    }
    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String toString() {
        return "Etiqueta Producto: " + nombre +
                ", fecha de vencimiento: " + fechaVto +
                ", numero de lote: " + nroLote +
                ", fecha de envasado: " + fechaEnvasado +
                ", granja de origen: '" + granjaOrigen;
    }
}
