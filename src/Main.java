import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deporte deporte = new Deporte("Futbol", 8, 11);
        Competencia competencia = new Competencia("Fuchibol Champions", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31));
        deporte.agregarCompetencia(competencia);

        Jugador jugador1 = new Jugador("Lionel", "Messi", "Futbol");
        Jugador jugador2 = new Jugador("Cristiano", "Ronaldo", "Futbol");
        Jugador jugador3 = new Jugador("Neymar", "Jr", "Futbol");
        Jugador jugador4 = new Jugador("Luis", "Suarez", "Futbol");
        Jugador jugador5 = new Jugador("Edinson", "Cavani", "Futbol");
        Jugador jugador6 = new Jugador("Sergio", "Aguero", "Futbol");
        Jugador jugador7 = new Jugador("Gonzalo", "Higuain", "Futbol");
        Jugador jugador8 = new Jugador("Paulo", "Dybala", "Futbol");

        Equipo equipo1 = new Equipo("Barcelona", "Española");
        Equipo equipo2 = new Equipo("Real Madrid", "Española");
        Equipo equipo3 = new Equipo("PSG", "Francesa");
        Equipo equipo4 = new Equipo("Juventus", "Italiana");
        Equipo equipo5 = new Equipo("Manchester City", "Inglesa");
        Equipo equipo6 = new Equipo("Manchester United", "Inglesa");
        Equipo equipo7 = new Equipo("Liverpool", "Inglesa");
        Equipo equipo8 = new Equipo("Chelsea", "Inglesa");

        equipo1.agregarJugador(jugador1);
        equipo2.agregarJugador(jugador2);
        equipo3.agregarJugador(jugador3);
        equipo4.agregarJugador(jugador4);
        equipo5.agregarJugador(jugador5);
        equipo6.agregarJugador(jugador6);
        equipo7.agregarJugador(jugador7);
        equipo8.agregarJugador(jugador8);

        Grupo grupoA = new Grupo("A");
        Grupo grupoB = new Grupo("B");

        List<Equipo> equipoList = new ArrayList<>();
        equipoList.add(equipo1);
        equipoList.add(equipo2);
        equipoList.add(equipo3);
        equipoList.add(equipo4);
        equipoList.add(equipo5);
        equipoList.add(equipo6);
        equipoList.add(equipo7);
        equipoList.add(equipo8);

        competencia.agregarGrupo(grupoA);
        competencia.agregarGrupo(grupoB);

        competencia.sortearEquiposEnGrupos(equipoList);
        competencia.generarProgramacionPartidos();

        Calendario calendario = new Calendario();
        calendario.agregarEncuentrosGrupos(competencia.getGrupoList());

        System.out.println(deporte);
        System.out.println("==========================================");
        System.out.println(competencia);
        System.out.println(calendario);
    }
}