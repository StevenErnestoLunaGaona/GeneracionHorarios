import java.util.ArrayList;
import java.util.List;

public class Deporte {
    //Relaciones
    public List<Registro> registroList;
    public List<Competencia> competenciaList;

    //Atributos
    String nombre;
    String descripcion;
    int numEquipos;
    int numEquiposEncuentro = 2;
    int numJugadoresEquipo;

    //Constructor
    public Deporte(String nombre, int numEquipos, int numJugadoresEquipo) {
        this.nombre = nombre;
        this.numEquipos = numEquipos;
        this.numJugadoresEquipo = numJugadoresEquipo;
        this.competenciaList = new ArrayList<>();
    }

    //Metodos
    public void agregarRegistro(Registro registro) {
        registroList.add(registro);
    }

    public void agregarCompetencia(Competencia competencia) {
        competenciaList.add(competencia);
    }
    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public int getNumJugadoresEquipo() {
        return numJugadoresEquipo;
    }

    public void setNumJugadoresEquipo(int numJugadoresEquipo) {
        this.numJugadoresEquipo = numJugadoresEquipo;
    }

    //toString
    @Override
    public String toString() {
        return "|DEPORTE: {" + nombre +"}|" ;
    }
}
