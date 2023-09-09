package alarmaSens;

public class Sensor {
	
	private String nomZona;
	private boolean activado;
	
	public Sensor(String nomZona) {
		this.nomZona = nomZona;
		activado = false;
	}

	public String getNomZona() {
		return nomZona;
	}

	public boolean isActivado() {
		return activado;
	}
	
	@Override
	   public String toString() {
        return "Sensor{" +
                "nombreZona='" + nomZona + '\'' +
                ", activado=" + activado +
                '}';
    }
}
