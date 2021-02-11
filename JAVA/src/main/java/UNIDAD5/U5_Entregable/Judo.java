package UNIDAD5.U5_Entregable;

public class Judo extends Deporte{
    int tatamis;
    public Judo(String nombre, String pabellon, int tatamis) {
        super(nombre, pabellon);
        this.tatamis =tatamis;
    }

    public int getTatamis() {
        return tatamis;
    }

    public void setTatamis(int tatamis) {
        this.tatamis = tatamis;
    }
    public void addJudoka(Judoka judoka){
        addParticipante(judoka);
    }

    @Override
    public String toString() {
        return "Tatamis: " + tatamis;
    }
}
