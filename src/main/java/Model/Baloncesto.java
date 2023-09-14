package Model;

public class Baloncesto extends Deporte{
    private String tipocancha;
    private String tiempos;
    public Baloncesto(String nombre) {
        super(nombre, "Interior", 4);
        this.tiempos=tiempos;
        this.tipocancha=tipocancha;
    }
}
