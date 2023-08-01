import java.util.ArrayList;
import java.util.List;

public class Equipo {
    //Relaciones
    public List<Jugador> jugadorList;
    public List<Registro> registroList;

    //Atributos
    private String nombre;
    private String nacionalidad;
    private String alineacion;

    //Metodos
    public void actualizarAlinacion(String alineacion) {
    }

    //Constructor
    public Equipo(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.jugadorList = new ArrayList<>();
    }

    //Metodos
    public void agregarJugador(Jugador jugador) {
        jugadorList.add(jugador);
    }

    public void actualizarAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public void agregarRegistro(Registro registro) {
        registroList.add(registro);
    }

    //Setters y Getters
    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    //toString
    @Override
    public String toString() {
        return nombre  + "  [Nacionalidad: " + nacionalidad + "]";
    }
}
