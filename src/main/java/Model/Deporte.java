package Model;

class Deporte {
    private String nombre;

    public Deporte(String nombre) {
        this.nombre = nombre;
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

