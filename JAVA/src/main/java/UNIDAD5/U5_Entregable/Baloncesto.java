package UNIDAD5.U5_Entregable;

public class Baloncesto extends Deporte {
    int numeroEquipos;
    public Baloncesto(String nombre, String pabellon, int numEquipos) {
        super(nombre, pabellon);
        numeroEquipos = numEquipos;
    }

    public int getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(int numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }

    public void addJugadorBaloncesto(jugadorBaloncesto jugadorBaloncesto){
        addParticipante(jugadorBaloncesto);
    }


    @Override
    public String toString() {
        return "Numero de Equipos: " + numeroEquipos;
    }
}