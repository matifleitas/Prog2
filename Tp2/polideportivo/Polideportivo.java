package polideportivo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Polideportivo {
    private ArrayList<Cancha> listaCanchas;
    private ArrayList<Usuario> listaSocios;
    private ArrayList<Turno> listaTurnos;

    private final Double DESCUENTO = 0.9;
    private final int DIAS = 60;
    private final int CANTRESERVAS = 4;

    public Polideportivo(ArrayList<Cancha> listaCanchas) {
        this.listaCanchas = listaCanchas;
        listaSocios = new ArrayList<Usuario>();
        listaTurnos = new ArrayList<Turno>();
    }

    public ArrayList<Cancha> getListaCanchas() {
        return listaCanchas;
    }

    public ArrayList<Usuario> getListaSocios() {
        return listaSocios;
    }

    public ArrayList<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public int getCantCanchaPaddle(){
        int count =0 ;
        for (Cancha cancha: listaCanchas) {
            if (cancha.getNombre() == TipoCancha.PADDLE){
                count++;
            }
        }
        return count;
    }
    public int getCantCanchaFulbo(){
        int count =0 ;
        for (Cancha cancha: listaCanchas) {
            if (cancha.getNombre() == TipoCancha.FUTBOL){
                count++;
            }
        }
        return count;
    }

    public void cargarTurno(Turno turnoNuevo, Usuario persona){
        if(turnoDisponible(turnoNuevo)){
            listaTurnos.add(turnoNuevo);
            if(esSocio(persona)){
                listaSocios.add(persona);
                System.out.println("Turno reservado, el precio es: " + turnoNuevo.getCancha().getPrecioCancha()*DESCUENTO);
            }
        }else {
            System.out.println("No se puede guardar el turno ya que no hay canchas disponibles");
        }
    }

    public boolean turnoDisponible (Turno turnoNuevo){
        int cantCancha = 0;
        for (Turno turno:listaTurnos) {
            if (turno.getHorario().equals(turnoNuevo.getHorario()) && turno.getHora().equals(turnoNuevo.getHora())) {
                if (turno.getCancha().getNombre() == turnoNuevo.getCancha().getNombre()) {
                    cantCancha++;
                }
            }
        }

        if(turnoNuevo.getCancha().getNombre() == TipoCancha.FUTBOL){
                return cantCancha < getCantCanchaFulbo();
            }else{
                return cantCancha < getCantCanchaPaddle();
        }

    }
    public boolean esSocio (Usuario persona){
        int cant = 0;
        for (Turno turno: listaTurnos) {
            if(turno.getPersona().equals(persona)){
                Period periordo = Period.between(LocalDate.now(),turno.getHorario());
                if(periordo.getDays() <= DIAS){
                    cant++;
                }
            }
        }
        return cant >= CANTRESERVAS;
    }

}
