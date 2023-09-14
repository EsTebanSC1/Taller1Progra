package Model;

public class Deporte {
    private String nombre;

    public Deporte(String nombre, String interior, String i) {
        this.nombre = nombre;
    }

    public Deporte(String nombre, String interior, int i) {
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

