package Refuerzo_Ex_Eval_2.Ejercicio1;

public abstract class Altavoz {
    private int num_serie;
    private double anchura;
    private double altura;
    private static int cont_altavoces;



    public Altavoz(int num_serie, double altura, double anchura) {
        this.num_serie = num_serie;
        this.anchura = anchura;
        this.altura = altura;
        cont_altavoces++;
    }


    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public static int getCont_altavoces() {
        return cont_altavoces;
    }

    public static void setCont_altavoces(int cont_altavoces) {
        Altavoz.cont_altavoces = cont_altavoces;
    }



    @Override
    public String toString() {
        return "Altavoz{" +
                "num_serie=" + num_serie +
                ", altura=" + altura +
                ", anchura=" + anchura +
                '}';
    }


}
