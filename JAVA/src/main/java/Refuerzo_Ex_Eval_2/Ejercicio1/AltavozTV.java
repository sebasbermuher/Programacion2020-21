package Refuerzo_Ex_Eval_2.Ejercicio1;


import java.util.Arrays;

public class AltavozTV extends Altavoz {
    private TipoDeInterfaz tipo_interfaz;
    private Revisiones[] revisiones = new Revisiones[0];



    public AltavozTV(int num_serie, double anchura, double altura, TipoDeInterfaz interfaz) {
        super(num_serie, altura, anchura);
        this.tipo_interfaz = tipo_interfaz;
        setCont_altavoces(getCont_altavoces());
    }

    public TipoDeInterfaz getTipo_interfaz() {
        return tipo_interfaz;
    }

    public void setTipo_interfaz(TipoDeInterfaz tipo_interfaz) {
        this.tipo_interfaz = tipo_interfaz;
    }

    public Revisiones[] getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(Revisiones[] revisiones) {
        this.revisiones = revisiones;
    }



    @Override
    public String toString() {
        return "AltavozTV{" +
                "tipo_interfaz=" + tipo_interfaz +
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
        System.out.println("Revision realizada");
    }

    public void eliminarRevision(Revisiones revisiones) {
        String x = "";
        for (int i = 0; i < getRevisiones().length; i++) {
            if (revisiones.getFecha().equals(getRevisiones()[i].getFecha())) {
                for (int j = 0; j < getRevisiones().length; j++) {
                    this.getRevisiones()[i] = getRevisiones()[j];
                }
                setRevisiones(Arrays.copyOf(getRevisiones(), getRevisiones().length - 1));
                x = "Revision eliminada (AltavozTV)";
                ;
                break;
            }
        }
        System.out.println(x);
    }


}
