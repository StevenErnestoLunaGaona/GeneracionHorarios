import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Competencia {
    //Relaciones
    public Deporte deporte;
    public List<Grupo> grupoList;
    public Calendario calendario;

    //Atributos
    private List<Equipo> equipoList;
    private String nombre;
    private LocalDate periodoFechaInicio;
    private LocalDate periodoFechaFin;

    //Constructor
    public Competencia(String nombre, LocalDate periodoFechaInicio, LocalDate periodoFechaFin) {
        this.nombre = nombre;
        this.periodoFechaInicio = periodoFechaInicio;
        this.periodoFechaFin = periodoFechaFin;
        this.grupoList = new ArrayList<>();
    }

    //Metodos
    public void agregarGrupo(Grupo grupo){
        this.grupoList.add(grupo);
    }

    public void agregarGrupos(List<Grupo> grupos) {
        this.grupoList.addAll(grupos);
    }

    public void sortearEquiposEnGrupos(List<Equipo> equipos) {
        //Mezclar aleatoriamente la lista de equipos
        Collections.shuffle(equipos);

        int numGrupos = grupoList.size();
        int indexGrupo = 0;

        //Asignar equipos a cada grupo en orden
        for (Equipo equipo : equipos) {
            grupoList.get(indexGrupo).agregarEquipo(equipo);

            indexGrupo++;
            if (indexGrupo >= numGrupos) {
                indexGrupo = 0;
            }
        }
    }

    public void generarProgramacionPartidos() {
        for (Grupo grupo : grupoList) {
            List<Equipo> equipos = grupo.getEquipoList();
            int numEquipos = equipos.size();

            // Generar la programación de partidos
            for (int i = 0; i < numEquipos - 1; i++) {
                Equipo equipoLocal = equipos.get(i);

                for (int j = i + 1; j < numEquipos; j++) {
                    Equipo equipoVisitante = equipos.get(j);

                    //Generar el horario del partido
                    LocalDateTime horarioPartido = LocalDateTime.now().plusDays(i).plusHours(j);

                    //Crear el partido y agregarlo al grupo
                    Encuentro encuentro = new Encuentro(horarioPartido);
                    encuentro.agregarEquipo(equipoLocal);
                    encuentro.agregarEquipo(equipoVisitante);
                    grupo.getEncuentroList().add(encuentro);
                }
            }
        }
    }


    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getPeriodoFechaInicio() {
        return periodoFechaInicio;
    }

    public void setPeriodoFechaInicio(LocalDate periodoFechaInicio) {
        this.periodoFechaInicio = periodoFechaInicio;
    }

    public LocalDate getPeriodoFechaFin() {
        return periodoFechaFin;
    }

    public void setPeriodoFechaFin(LocalDate periodoFechaFin) {
        this.periodoFechaFin = periodoFechaFin;
    }

    public List<Grupo> getGrupoList() {
        return grupoList;
    }

    public void setGrupoList(List<Grupo> grupoList) {
        this.grupoList = grupoList;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Competencia: ").append(nombre).append(" [Fecha de Inicio: ").append(periodoFechaInicio).append(", Fecha de Fin: ").append(periodoFechaFin).append(']').append("\n");
        for (Grupo grupo : grupoList) {
                sb.append("GRUPO ").append(grupo.getNombre()).append(":\n");
            for (Encuentro encuentro : grupo.getEncuentroList()) {
                sb.append(encuentro.toString()).append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
