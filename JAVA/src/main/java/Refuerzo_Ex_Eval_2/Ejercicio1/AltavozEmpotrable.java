package Refuerzo_Ex_Eval_2.Ejercicio1;

import java.util.Arrays;

public class AltavozEmpotrable extends AltavozCoche implements Grave{
    private LugarInstalado lugarInstalado;
    private Revisiones[] revisiones = new Revisiones[0];




    public LugarInstalado getLugarInstalado() {
        return lugarInstalado;
    }

    public void setLugarInstalado(LugarInstalado lugarInstalado) {
        this.lugarInstalado = lugarInstalado;
    }

    public AltavozEmpotrable(int num_serie, double anchura, double altura, LugarInstalado lugarInstalado) {
        super(num_serie, anchura, altura);
        this.lugarInstalado = lugarInstalado;
    }

    public Revisiones[] getRevisiones() {
        return revisiones;
    }


    public void setRevisiones(Revisiones[] revisiones) {
        this.revisiones = revisiones;
    }

    @Override
    public String toString() {
        return "AltavozEmpotrable{" +
                "lugarInstalado=" + lugarInstalado +
                '}';
    }

    @Override
    public void activarGraves() {
        System.out.println("Los graves del altavoz empotrable han sido activados.");
    }

    public void mostrarRevisiones() {
        System.out.println(Arrays.toString(getRevisiones()));
    }

    public void addRevision(Revisiones revisiones) {
        for (int i = 0; i < getRevisiones().length; i++) {
            if (revisiones.getFecha().equals(getRevisiones()[i].getFecha())) {
                System.out.println("Error. No puede haber dos revisiones en la misma fecha");
                break;
            } else if (i  == getRevisiones().length) {
                setRevisiones(Arrays.copyOf(getRevisiones(), getRevisiones().length + 1));
                getRevisiones()[getRevisiones().length - 1] = revisiones;
                break;
            }
        }
        setRevisiones(Arrays.copyOf(getRevisiones(), getRevisiones().length + 1));
        getRevisiones()[getRevisiones().length - 1] = revisiones;
        System.out.println("Revision realizada a altavoz empotrable");
    }

    public void eliminarRevision(Revisiones revisiones) {
        String x = "";
        for (int i = 0; i < getRevisiones().length; i++) {
            if (revisiones.getFecha().equals(getRevisiones()[i].getFecha())) {
                for (int j = 0; j < getRevisiones().length; j++) {
                    this.getRevisiones()[i] = getRevisiones()[j];
                }
                setRevisiones(Arrays.copyOf(getRevisiones(), getRevisiones().length - 1));
                x = "Revision eliminada (Altavoz Empotrable)";
                ;
                break;
            }
        }
        System.out.println(x);
    }
}
