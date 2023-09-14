package Model;
import java.util.ArrayList;
import java.util.List;
public class Equipo {
    private String nombre;
    private List<Deportista> deportistas;
    private Deporte deporte;
    private Entrenador entrenador;

    public Equipo(String nombre, Deporte deporte) {
        this.nombre = nombre;
        this.deportistas = new ArrayList<>();
        this.deporte = deporte;
    }

    public void agregarDeportista(Deportista deportista) {
        deportistas.add(deportista);
    }

    public void mostrarDeportistas() {
        System.out.println("Deportistas del equipo " + nombre + " (" + deporte.getNombre() + "):");
        for (Deportista deportista : deportistas) {
            System.out.println(deportista);
        }
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", deporte=" + deporte +
                '}';
    }

    public void asignarEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
}