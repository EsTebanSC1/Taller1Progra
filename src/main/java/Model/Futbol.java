package Model;

public class Futbol extends Deporte {
    private String tipocesped;
    private String localia;

    public Futbol(String nombre) {
        super(nombre);
        this.localia=localia;
        this.tipocesped=tipocesped;
    }

    public String getTipocesped() {
        return tipocesped;
    }

    public void setTipocesped(String tipocesped) {
        this.tipocesped = tipocesped;
    }

    public String getLocalia() {
        return localia;
    }

    public void setLocalia(String localia) {
        this.localia = localia;
    }

    @Override
    public String toString() {
        return "Futbol{" +
                "tipocesped='" + tipocesped + '\'' +
                ", localia='" + localia + '\'' +
                '}';
    }
}
