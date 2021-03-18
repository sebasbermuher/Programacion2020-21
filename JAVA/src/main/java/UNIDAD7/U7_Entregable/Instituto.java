package UNIDAD7.U7_Entregable;

import java.util.*;

public class Instituto {
    Map<String, Set<Alumnos>> lista_alumnos;

    public Instituto() {
        this.lista_alumnos = new HashMap<>();
    }

    public void mostrarTodosAlumnosOrdenados() {
        List<String> apellidos = new ArrayList<>(lista_alumnos.keySet());
        List<Alumnos> alumnos = new ArrayList<>();

        for (int i = 0; i < apellidos.size(); i++) {
            alumnos.addAll(lista_alumnos.get(apellidos.get(i)));
        }
        alumnos.sort((o1, o2) -> o1.getApellidos().compareToIgnoreCase(o2.getApellidos()));
        System.out.println(alumnos);
    }


    public void mostrarAlumnosUnidad(String unidad) {
        if (!lista_alumnos.containsKey(unidad)){
            System.out.println("Esta unidad no está registrada");
        }else {
            List<Alumnos> alumnos = new ArrayList<>(lista_alumnos.get(unidad));
            alumnos.sort(new Comparator<Alumnos>() {
                @Override
                public int compare(Alumnos o1, Alumnos o2) {
                    return o1.getDni().compareTo(o2.getDni());
                }
            });
            System.out.println(alumnos);
        }
    }

    public boolean addAlumnoUnidad(Alumnos alumno, String unidad) {
        if (unidad.equals(alumno.getUnidad())) {
            if (!lista_alumnos.containsKey(unidad)) {
                lista_alumnos.put(unidad,new TreeSet<>());
            }
            lista_alumnos.get(unidad).add(alumno);
            return true;
        }else {
            System.out.println("No coincide la unidad con el alumno");
            return false;
        }
    }
}
