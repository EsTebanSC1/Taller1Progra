package Model;
import java.util.ArrayList;
import java.util.List;
public class Club {
    private List<Equipo> equipos;

    public Club(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Club{" +
                "equipos=" + equipos +
                '}';
    }
}
