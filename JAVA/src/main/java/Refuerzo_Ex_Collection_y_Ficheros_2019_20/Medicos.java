package Refuerzo_Ex_Collection_y_Ficheros_2019_20;


import java.io.Serializable;

public class Medicos implements Serializable {
    private String nombre;
    private String apellidos;
    private String num_colegiado;
    private String hospital;


    public Medicos(String nombre, String apellidos, String num_colegiado, String hospital) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_colegiado = num_colegiado;
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Medicos{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", num_colegiado=" + num_colegiado +
                ", hospital='" + hospital + '\'' +
                '}';
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

    public String getNum_colegiado() {
        return num_colegiado;
    }

    public void setNum_colegiado(String num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }


}
