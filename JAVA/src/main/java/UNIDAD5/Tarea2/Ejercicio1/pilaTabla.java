package UNIDAD5.Tarea2.Ejercicio1;

import java.util.Arrays;

public class pilaTabla implements pila{
    private int indiceCima;
    private Integer [] tabla;
    public pilaTabla () {
        indiceCima=-1;
        tabla = new Integer[10];
    }

    public pilaTabla(int capacidadInicial) {
        tabla = new Integer[capacidadInicial];
    }

    private boolean pilaVacia() {
        return indiceCima== -1;
    }

    private boolean pilaLlena() {
        return indiceCima==tabla.length-1;
    }

    Integer cima() {
        Integer elementoCima=null;
        if (!pilaVacia()) {
            elementoCima = tabla[elementoCima];
        }
        return elementoCima;
    }

    @Override
    public void apilar(Integer elemento) {
        if (pilaLlena()) {
            tabla= Arrays.copyOf(tabla, tabla.length+10);
        }
        indiceCima++;
        tabla[indiceCima] = elemento;
    }

    @Override
    public Integer desapilar() {
        Integer elemento = null;
        if (!pilaVacia()) {
            elemento=tabla[indiceCima];
            indiceCima--;
        }
        return elemento;
    }

    @Override
    public String toString() {
        String res="";
        for (int i = 0; i < indiceCima; i++) {
            res+=tabla[i] + "";
        }
        res+= "(cima es nueva)";
        return res;
    }
}
