package Recuperacion_Eval_2_Mayo_2021.Ejercicio2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Perro implements Serializable {
    private int pin;
    private String fecha_nac;
    private String nombre;
    private int peso;
    private List<Consulta> listaConsultas;

    public Perro(int pin, String fecha_nac, String nombre, int peso) {
        this.pin = pin;
        this.fecha_nac = fecha_nac;
        this.nombre = nombre;
        this.peso = peso;
        this.listaConsultas = new ArrayList<>();
    }
    public void addConsulta(Consulta c){
        listaConsultas.add(c);
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getfecha_nac() {
        return fecha_nac;
    }

    public void setfecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public List<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(List<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "pin=" + pin +
                ", fecha_nac='" + fecha_nac + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", listaConsultas=" + listaConsultas +
                '}';
    }
}
