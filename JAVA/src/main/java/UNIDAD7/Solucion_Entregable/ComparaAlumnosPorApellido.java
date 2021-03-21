package UNIDAD7.Solucion_Entregable;

import java.util.Comparator;

public class ComparaAlumnosPorApellido implements Comparator<Alumno> {
    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getApellidos().compareTo(o2.getApellidos());
    }
}
