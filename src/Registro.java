import java.time.LocalDate;

public class Registro {

    //Relaciones
    public Equipo equipo;
    public Deporte deporte;

    //Atributos
    private String identificador;
    private LocalDate fecha;

    //Constructor
    public Registro( LocalDate fecha) {
        this.fecha = fecha;
    }

    //Setters y Getters

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
