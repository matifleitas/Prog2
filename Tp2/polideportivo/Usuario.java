package polideportivo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
    private String nombre;
    private int tel;


    public Usuario(String nombre, int tel) {
        this.nombre = nombre;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTel() {
        return tel;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nombre.equals(usuario.nombre);
    }
}

