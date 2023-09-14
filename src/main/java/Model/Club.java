package Model;
import java.util.ArrayList;
import java.util.List;
public class Club {
    private String equipos;

    public String getEquipos() {
        return equipos;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    public Club(String equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Club{" +
                "equipos='" + equipos + '\'' +
                '}';
    }

    public void agregarEquipo(Equipo equipo) {

    }
}

