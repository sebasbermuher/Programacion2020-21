package UNIDAD8.Tarea5;

import java.util.ArrayList;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private ArrayList<String> posiciones;
    private String equipo;

    private ArrayList<Futbolista> detalle;

    public Futbolista(int dorsal, String nombre, ArrayList<String> posiciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.posiciones = posiciones;
        this.equipo = equipo;
    }
    public ArrayList<String> getposiciones() {
        return posiciones;
    }

    public void setposiciones(ArrayList<String> posiciones) {
        this.posiciones = posiciones;
    }


    public void setDetalle2(ArrayList<Futbolista> detalle) {
        this.detalle = detalle;
    }

    public ArrayList<Futbolista> getDetalle() {
        return detalle;
    }
    // Getters & Setters

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }


}
