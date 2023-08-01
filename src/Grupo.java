import java.util.ArrayList;
import java.util.List;

public class Grupo {
    //Relaciones
    public Competencia competencia;
    public List<Encuentro> encuentroList;

    //Atributos
    private String nombre;
    private List<Equipo> equipoList;

    //Constructor
    public Grupo(String nombre) {
        this.nombre = nombre;
        this.equipoList = new ArrayList<>();
        this.encuentroList = new ArrayList<>();
    }

    //Metodos
    public void agregarEquipo(Equipo equipo) {
        equipoList.add(equipo);
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    public List<Encuentro> getEncuentroList() {
        return encuentroList;
    }

    public void setEncuentroList(List<Encuentro> encuentroList) {
        this.encuentroList = encuentroList;
    }

}