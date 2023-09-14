package Model;

public class Partidos {
    private String equipoop;
    private String marcador;
    private String fecha;
    private String lugar;

    public Partidos(String equipoop, String marcador, String fecha, String lugra) {
        this.equipoop = equipoop;
        this.marcador = marcador;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public String getEquipoop() {
        return equipoop;
    }

    public void setEquipoop(String equipoop) {
        this.equipoop = equipoop;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugra() {
        return lugar;
    }

    public void setLugra(String lugra) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Partidos{" +
                "equipoop='" + equipoop + '\'' +
                ", marcador='" + marcador + '\'' +
                ", fecha='" + fecha + '\'' +
                ", lugar='" + lugar  + '\'' +
                '}';
    }
}
