package UNIDAD5.Tarea1.Ejercicio4;

import UNIDAD5.Tarea1.Ejercicio1.hora;

public class horaExacta extends hora {
    protected int segundos;

    public horaExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos=segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos>=0 && segundos<60) {
            this.segundos=segundos;
        }

    }

    @Override
    public boolean equals(Object o) {
        horaExacta horaComprobar = (horaExacta) o;
        boolean igual;
        if (this.hora==horaComprobar.hora && this.minuto==horaComprobar.minuto && this.segundos==horaComprobar.segundos) {
            igual=true;
        } else {
            igual=false;
        }
        return igual;
    }

    @Override //Detro de esto hay nive
    public void inc() {
        segundos+=1;
    }

    @Override
    public String toString() {
        return (super.toString() + ":" + segundos);
    }
}