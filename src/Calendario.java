import java.util.ArrayList;
import java.util.List;

public class Calendario {
    //Relaciones
    public List<Encuentro> encuentroList;

    //Constructor
    public Calendario() {
        this.encuentroList = new ArrayList<>();
    }

    //Metodos
    public void agregarEncuentros(List<Encuentro> encuentroList) {
        encuentroList.addAll(encuentroList);
    }

    public void agregarEncuentrosGrupos(List<Grupo> grupos) {
        for (Grupo grupo : grupos) {
            agregarEncuentros(grupo.getEncuentroList());
        }
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Encuentro encuentro : encuentroList) {
            sb.append(encuentro.toString()).append("\n");
        }
        return sb.toString();
    }

}
