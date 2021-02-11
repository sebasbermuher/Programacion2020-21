package UNIDAD5.Tarea1.Ejercicio1;

public class hora {
    protected int hora;
    protected int minuto;

    public hora(int hora, int minuto) {
        this.hora=0;
        this.minuto=0;
        setHora(hora);
        setMinuto(minuto);
    }

    public void inc() {
        minuto+=1;
    }

    public void setMinuto(int minuto) {
        if (minuto>=0 && minuto<60) {
            this.minuto=minuto;
        }
    }

    public void setHora (int hora) {
        if (hora>=0 && hora<24) {
            this.hora=hora;
        }
    }

    @Override
    public String toString() {
        String cad = hora + ":" + minuto;
        return cad;
    }
}