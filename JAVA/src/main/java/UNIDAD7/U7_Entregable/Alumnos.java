package UNIDAD7.U7_Entregable;

import java.io.Serializable;

public class Alumnos  implements Comparable<Alumnos>, Serializable {
    private static int id = 0;
    private String nombreAlumnos;
    private String apellidos;
    private String dni;
    private String unidad;

    public Alumnos(String nombreAlumnos, String apellidos, String dni, String unidad) {
        this.nombreAlumnos = nombreAlumnos;
        this.apellidos = apellidos;
        this.dni = dni;
        this.id++;
        this.unidad = unidad;
    }

    public Alumnos(String nombreAlumnos, String apellidos, String dni) {
        this.id += 1;
        this.nombreAlumnos = nombreAlumnos;
        this.apellidos = apellidos;
        this.dni = dni;
        this.unidad = unidad;
    }

    public String getNombreAlumnos() {
        return nombreAlumnos;
    }

    public void setNombreAlumnos(String nombreAlumnos) {
        this.nombreAlumnos = nombreAlumnos;
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

    public static int getId(int id) {
        return id;
    }

    public static void setId(int id) {
        Alumnos.id = id;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public int compareTo(Alumnos o) {
        return getApellidos().compareTo(o.getApellidos());
    }

    @Override
    public String toString() {
        return "\n"+"NOMBRE:" + nombreAlumnos + "\n" +
                "APELLIDOS:" + apellidos + "\n" +
                "DNI:" + dni + "\n" +
                "UNIDAD:" + unidad + "\n";

    }
}
