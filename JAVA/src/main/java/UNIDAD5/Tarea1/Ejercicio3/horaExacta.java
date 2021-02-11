package UNIDAD5.Tarea1.Ejercicio3;

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
    public void inc() {
        segundos+=1;
    }

    @Override
    public String toString() {
        return (super.toString() + ":" + segundos);
    }
}