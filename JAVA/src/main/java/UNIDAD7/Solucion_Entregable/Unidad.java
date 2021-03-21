package UNIDAD7.Solucion_Entregable;

import java.io.Serializable;
import java.util.List;

public class Unidad implements Comparable, Serializable {
    private String nombre;
    private List<Alumno> alumnos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Unidad(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Unidad{" + "nombre='" + nombre + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unidad unidad = (Unidad) o;
        return nombre.equals(unidad.getNombre());
    }

    public void add_alumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        Unidad unidad = (Unidad) o;
        return nombre.compareTo(unidad.getNombre());
    }
}