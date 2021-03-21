package UNIDAD7.Solucion_Entregable;

import java.io.Serializable;

public class Alumno implements Serializable, Comparable {
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private Unidad unidad;
    private static int id_interna = 0;

    public static int getId_interna() {
        return id_interna;
    }

    public static void setId_interna(int id_interna) {
        Alumno.id_interna = id_interna;
    }

    public Alumno(String nombre, String apellidos, String dni, Unidad unidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.unidad = unidad;
        setId_interna(getId_interna() + 1);
        this.id = getId_interna();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Alumno{"
                + "id="
                + id
                + ", nombre='"
                + nombre
                + '\''
                + ", apellidos='"
                + apellidos
                + '\''
                + ", dni='"
                + dni
                + '\''
                + ", unidad'"
                + unidad
                + '\''
                + '}';
    }

    @Override
    public int compareTo(Object o) {
        Alumno otro = (Alumno) o;
        return this.dni.compareTo(otro.dni);
    }
}