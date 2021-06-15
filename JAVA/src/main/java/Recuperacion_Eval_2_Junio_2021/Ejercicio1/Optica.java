package Recuperacion_Eval_2_Junio_2021.Ejercicio1;

import java.util.Arrays;

public class Optica {
    private GafaGraduada[] gafa_Graduada = new GafaGraduada[0];
    private GafasDeSol[] gafa_de_Sol = new GafasDeSol[0];
    private Gafa[] gafas= new Gafa[0];

    public Gafa[] getGafas() {
        return gafas;
    }

    public void setGafas(Gafa[] gafas) {
        this.gafas = gafas;
    }

    public GafasDeSol[] getGafa_de_Sol() {
        return gafa_de_Sol;
    }

    public void setGafa_de_Sol(GafasDeSol[] gafa_de_Sol) {
        this.gafa_de_Sol = gafa_de_Sol;
    }

    public GafaGraduada[] getGafa_Graduada() {
        return gafa_Graduada;
    }

    public void setGafa_Graduada(GafaGraduada[] gafa_Graduada) {
        this.gafa_Graduada = gafa_Graduada;
    }

    public void addGafaGraduada(GafaGraduada gafa_graduada) {
        setGafa_Graduada(Arrays.copyOf(getGafa_Graduada(), getGafa_Graduada().length + 1));
        getGafa_Graduada()[getGafa_Graduada().length - 1] = gafa_graduada;
        System.out.println("Gafa graduada añadida a optica");
    }

    public void addGafaDeSol(GafasDeSol gafaDeSol) {
        setGafa_de_Sol(Arrays.copyOf(getGafa_de_Sol(), getGafa_de_Sol().length + 1));
        getGafa_de_Sol()[getGafa_de_Sol().length - 1] = gafaDeSol;
        System.out.println("Gafa de sol añadida a optica");
    }

    public void eliminarGafaGraduada(GafaGraduada gafa_gradudada) {
        String cadena = "";
                setGafa_Graduada(Arrays.copyOf(getGafa_Graduada(), getGafa_Graduada().length - 1));
                cadena = "La gafa graduada ha sido eliminada de Optica";
        System.out.println(cadena);
    }

    public void eliminarGafaDeSol(GafasDeSol gafa_de_sol) {
        String cadena = "";
        setGafa_de_Sol(Arrays.copyOf(getGafa_de_Sol(), getGafa_de_Sol().length - 1));
        cadena = "La gafa de sol ha sido eliminada de Optica";
        System.out.println(cadena);
    }
}

