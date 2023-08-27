package polideportivo;

public class Cancha {
    private TipoCancha nombre;
    private double costo;
    private final double PRECIOFUTBOL = 400;
    private final double PRECIOPADDLE = 100;

    public Cancha(TipoCancha nombre) {
        this.nombre = nombre;
        costo = getPrecioCancha();
    }

    public double getPrecioCancha(){
        if(TipoCancha.FUTBOL == nombre){
            return PRECIOFUTBOL;
        }else{
            return PRECIOPADDLE;
        }
    }
    public TipoCancha getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }
}
