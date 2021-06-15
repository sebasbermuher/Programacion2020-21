package Recuperacion_Eval_2_Junio_2021.Ejercicio1;

public abstract class Gafa {
    private static int cont_gafas;

    @Override
    public String toString() {
        return "Gafa{" +
                "cont_gafas=" + cont_gafas +
                '}';
    }

    public Gafa() {
        cont_gafas++;
    }

    public static int getCont_gafas() {
        return cont_gafas;
    }

    public static void setCont_gafas(int cont_gafas) {
        Gafa.cont_gafas = cont_gafas;
    }
}
