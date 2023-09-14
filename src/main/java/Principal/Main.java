package Principal;
import Model.Tenis;
import  Model.Entrenador;
import Model.Partidos;
import Model.Club;
import Model.Baloncesto;
import Model.Deportista;
import Model.Futbol;
import Model.Deporte;
import Model.Equipo;

        
public class Main {
    public static void main(String[] args) {

        Deporte futbol = new Deporte("Fútbol", "Cesped Natural", "Local");
        Deporte baloncesto = new Deporte("Baloncesto", "Interior", 4);
        Deporte tenis = new Deporte("Tenis", "Césped", "Individual");


        Club club1 = new Club("Club A");
        Club club2 = new Club("Club B");


        Deportista jugador1 = new Deportista("Esteban", "Serón", "e.seron01@ufromail.cl", "+56912345678", "Futbol", "Delantero");
        Deportista jugador2 = new Deportista("María", "Pangui", "m.pangui01@ufromail.cl", "+56987654321", "Baloncesto", "Ala-pívot");
        Deportista jugador3 = new Deportista("Benjamin", "Wilhelm", "b.wilhelm01@ufromail.cl", "+56915283456", "Tenis", "Individual");


        Entrenador entrenador1 = new Entrenador("Marco", "Serón", "marco@gmail.com", "+56976543567", futbol, "Entrenador", 10, "Táctica");
        Entrenador entrenador2 = new Entrenador("Jeanette", "Correa", "jeanette@gmail.com", "+56987612394", baloncesto, "Entrenador", 15, "Defensa");
        Entrenador entrenador3 = new Entrenador("Catalina", "Serón", "cata@gmail.com", "+56998126374", tenis, "Entrenador", 5, "Técnica");


        Equipo equipo1 = new Equipo("Equipo 1", futbol);
        Equipo equipo2 = new Equipo("Equipo 2", baloncesto);
        Equipo equipo3 = new Equipo("Equipo 3", tenis);


        equipo1.agregarDeportista(jugador1);
        equipo2.agregarDeportista(jugador2);
        equipo3.agregarDeportista(jugador3);

        equipo1.asignarEntrenador(entrenador1);
        equipo2.asignarEntrenador(entrenador2);
        equipo3.asignarEntrenador(entrenador3);


        club1.agregarEquipo(equipo1);
        club1.agregarEquipo(equipo2);
        club2.agregarEquipo(equipo3);


        imprimirInformacionDetallada(jugador1);
        imprimirInformacionDetallada(jugador2);
        imprimirInformacionDetallada(jugador3);

      
    }

    private static void imprimirInformacionDetallada(Deportista deportista) {
        System.out.println("| Nombre       | " + deportista.getNombre());
        System.out.println("| Apellido     | " + deportista.getApellido());
        System.out.println("| Email        | " + deportista.getEmail());
        System.out.println("| Teléfono     | " + deportista.getTelefono());
        System.out.println("| Deporte      | " + deportista.getDeporte());
        System.out.println("| Rol          | " + deportista.getRol());
        System.out.println();
    }

}