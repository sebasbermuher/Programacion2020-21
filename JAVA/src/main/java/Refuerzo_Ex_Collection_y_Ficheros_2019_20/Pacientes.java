package Refuerzo_Ex_Collection_y_Ficheros_2019_20;


import java.io.Serializable;


public class Pacientes implements Comparable<Pacientes>, Serializable {
    private String nombre;
    private int edad;
    private int peso;
    private boolean vacunas;
    private Medicos medicos;
    private Cepa cepa;

    public Pacientes(String nombre, int edad, int peso, boolean vacunas, Medicos medicos, Cepa cepa) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.medicos = medicos;
        this.cepa = cepa;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunas=" + vacunas +
                ", medicos=" + medicos +
                ", cepa=" + cepa +
                '}'+ '\n';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public void setMedicos(Medicos medicos) {
        this.medicos = medicos;
    }

    public Cepa getCepa() {
        return cepa;
    }

    public void setCepa(Cepa cepa) {
        this.cepa = cepa;
    }

    @Override
    public int compareTo(Pacientes o) {
        return ((int) (o.getPeso()-getPeso()));
    }

}
