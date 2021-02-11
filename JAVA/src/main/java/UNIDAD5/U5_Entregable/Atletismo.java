package UNIDAD5.U5_Entregable;

public class Atletismo extends Deporte {
    int numPruebas;
    public Atletismo(String nombre, String pabellon, int numPruebas) {
        super(nombre, pabellon);
        this.numPruebas = numPruebas;
    }

    public int getNumPruebas() {
        return numPruebas;
    }

    public void setNumPruebas(int numPruebas) {
        this.numPruebas = numPruebas;
    }

    public void addAtleta(Atleta atleta){
        addParticipante(atleta);
    }

    @Override
    public String toString() {
        return "Numero de pruebas: "+numPruebas;
    }
}
