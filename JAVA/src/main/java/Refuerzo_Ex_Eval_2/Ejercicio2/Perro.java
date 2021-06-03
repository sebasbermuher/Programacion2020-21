package Refuerzo_Ex_Eval_2.Ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class Perro {
    private Integer pin;
    private String fecha_nam;
    private String nombre;
    private double peso;
    List<Consultas> lista_consultas = new LinkedList<>();

    public Perro(int pin, String fecha_nam, String nombre, double peso) {
        this.pin = pin;
        this.fecha_nam = fecha_nam;
        this.nombre = nombre;
        this.peso = peso;
    }
    public List<Consultas> getLista_consultas() {
        return lista_consultas;
    }

    public void setLista_consultas(List<Consultas> lista_consultas) {
        this.lista_consultas = lista_consultas;
    }



    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getFecha_nam() {
        return fecha_nam;
    }

    public void setFecha_nam(String fecha_nam) {
        this.fecha_nam = fecha_nam;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }




    public void anadirconsulta(Consultas consultas) {
        getLista_consultas().add(consultas);
        System.out.println("Nueva consulta añadida");
    }

    public void eliminarconsulta(Consultas consultas) {
        getLista_consultas().remove(consultas);
        System.out.println("La consulta ha sido eliminada");
    }


}
