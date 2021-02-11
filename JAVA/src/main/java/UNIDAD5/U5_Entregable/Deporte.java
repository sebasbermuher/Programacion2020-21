package UNIDAD5.U5_Entregable;

import java.util.Arrays;

public abstract class Deporte {
    protected String nombre;
    protected String pabellon;
    protected Participante[] participantes;

    public Deporte(String nombre, String pabellon) {
        this.nombre = nombre;
        this.pabellon = pabellon;
        this.participantes = new Participante[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public void addParticipante(Participante jugador){
        participantes = Arrays.copyOf(participantes,participantes.length+1);
        participantes[participantes.length-1] = jugador;
    }

    public void mostrarParticipantes(){
        for (int i = 0; i < participantes.length; i++) {
            System.out.println(participantes[i]+"\n");
        }
    }

    @Override
    public String toString() {
        String participante="";
        for (int i = 0; i < participantes.length; i++) {
            participante+=participantes[i];
        }
        return  "Nombre: " + nombre +
                "Pabellon: " + pabellon  +
                "Participantes: " +participante;

    }
}
