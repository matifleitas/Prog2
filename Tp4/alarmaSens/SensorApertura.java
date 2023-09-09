package alarmaSens;

public class SensorApertura extends Sensor {

    private String tipoApertura;

    public SensorApertura(String nombreZona, String tipoApertura) {
        super(nombreZona);
        this.tipoApertura = tipoApertura;
    }

    public String getTipoApertura() {
        return tipoApertura;
    }
}
