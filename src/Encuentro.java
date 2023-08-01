import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Encuentro {

    //Atributos
    private List<Equipo> equipoList;
    private LocalDateTime fecha;

    //Constructor
    public Encuentro(LocalDateTime fecha) {
        this.equipoList = new ArrayList<>();
        this.fecha = fecha;
    }

    //Metodos
    public void agregarEquipo(Equipo equipo) {
        equipoList.add(equipo);
    }

    //Setters y Getters
    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    //toString
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String fechaHoraFormateada = fecha.format(formatter);

        StringBuilder sb = new StringBuilder();
        sb.append(" • Partido el ").append(fechaHoraFormateada).append(":\n");
        for (Equipo equipo : equipoList) {
            sb.append("  - ").append(equipo.getNombre()).append("\n");
        }
        return sb.toString();
    }

    }