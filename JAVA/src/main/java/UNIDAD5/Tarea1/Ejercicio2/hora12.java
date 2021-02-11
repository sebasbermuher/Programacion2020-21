package UNIDAD5.Tarea1.Ejercicio2;
import UNIDAD5.Tarea1.Ejercicio1.hora;

public class hora12 extends hora {
    protected String meridiano="";

    public hora12(int hora, int minutos) {
        super(hora, minutos);
        if (this.hora < 13) {
            meridiano="AM";
        } else {
            this.hora=this.hora-12;
            meridiano="PM";
        }
    }

    @Override
    public String toString(){
        return (super.toString()+ " " + meridiano);
    }
}
