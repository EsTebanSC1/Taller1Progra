package Model;

public class Entrenador extends Deportista{
private String experiencia;
private String especialidad;
    public Entrenador(String nombre, String apellido, String email, String telefono, String deporte, String rol) {
        super(nombre, apellido, email, telefono, deporte, rol);
        this.especialidad=especialidad;
        this.experiencia=experiencia;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "experiencia='" + experiencia + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
