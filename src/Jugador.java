import java.sql.PseudoColumnUsage;

public class Jugador extends Persona {

    //Relaciones
    public Equipo equipo;

    //Atributos
    String deporteProfesion;

    //Constructor
    public Jugador(String nombre, String apellido, String deporteProfesion) {
        super(nombre, apellido);
        this.deporteProfesion = deporteProfesion;
    }

    //Setters and Getters
    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    //toString
    @Override
    public String toString() {
        return "Jugador: {" + "Nombre: " + super.getNombre() + ", Apellido: " + super.getApellido() +  ", Profesion: " + deporteProfesion + "}";
    }


}
