package Refuerzo_Ex_Eval_2.Ejercicio1;


import java.util.Arrays;

public class AltavozMovil extends Altavoz{
    private int peso;
    private Revisiones[] revisiones = new Revisiones[0];


    public Revisiones[] getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(Revisiones[] revisiones) {
        this.revisiones = revisiones;
    }

    public AltavozMovil(int num_serie, double anchura, double altura, int peso) {
        super(num_serie, anchura, altura);
        this.peso = peso;
        setCont_altavoces(getCont_altavoces());
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "AltavozMovil{" +
                "peso=" + peso +
                '}';
    }

    public void mostrarRevisiones() {
        System.out.println(Arrays.toString(getRevisiones()));
    }

    public void addRevision(Revisiones revisiones) {
        for (int i = 0; i < getRevisiones().length; i++) {
            if (revisiones.getFecha().equals(getRevisiones()[i].getFecha())) {
                System.out.println("Error. No puede haber dos revisiones en la misma fecha");
                break;
            } else if (i + 1 == getRevisiones().length) {
                setRevisiones(Arrays.copyOf(getRevisiones(), getRevisiones().length + 1));
                getRevisiones()[getRevisiones().length - 1] = revisiones;
                break;
            }
        }
        setRevisiones(Arrays.copyOf(getRevisiones(), getRevisiones().length + 1));
        getRevisiones()[getRevisiones().length - 1] = revisiones;
        System.out.println("Revision realizada a altavoz movil");
    }

    public void eliminarRevision(Revisiones revisiones) {
        String x = "false";
        for (int i = 0; i < getRevisiones().length; i++) {
            if (revisiones.getFecha().equals(getRevisiones()[i].getFecha())) {
                for (int j = 0; j < getRevisiones().length; j++) {
                    this.getRevisiones()[i] = getRevisiones()[j];
                }
                setRevisiones(Arrays.copyOf(getRevisiones(), getRevisiones().length - 1));
                x = "Revision eliminada a altavoz movil";
                ;
                break;
            }
        }
        System.out.println(x);
    }

}
