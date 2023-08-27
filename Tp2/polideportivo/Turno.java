package polideportivo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
    private Cancha cancha;
    private Usuario persona;
    private LocalDate horario;
    private LocalTime hora;

    public Turno(Cancha cancha, Usuario persona, LocalDate horario, LocalTime hora) {
        this.cancha = cancha;
        this.persona = persona;
        this.horario = horario;
        this.hora = hora;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public Usuario getPersona() {
        return persona;
    }

    public LocalDate getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "cancha=" + cancha.getNombre() +
                ", persona=" + persona.getNombre() +
                ", horario=" + horario.getDayOfMonth() +
                '}';
    }

}


