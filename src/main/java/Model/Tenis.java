package Model;

public class Tenis extends Deporte{
    private String superficie;
    private String tipopartido;
    public Tenis(String nombre) {
        super(nombre, "Interior", 4);
        this.superficie=superficie;
        this.tipopartido=tipopartido;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getTipopartido() {
        return tipopartido;
    }

    public void setTipopartido(String tipopartido) {
        this.tipopartido = tipopartido;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "superficie='" + superficie + '\'' +
                ", tipopartido='" + tipopartido + '\'' +
                '}';
    }
}
