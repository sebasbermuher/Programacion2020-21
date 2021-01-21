package UNIDAD4.Tarea2.Ejercicio1;

import java.util.Arrays;

public class lista {
    private int numeroElementos;
    private Integer[] tabla;

    public lista() {
        numeroElementos=0;
        tabla = new Integer[10];
    }

    public lista(int capacidadInicial) {
        numeroElementos=0;
        tabla = new Integer[capacidadInicial];
    }

    int getNumeroElementos() {
        return numeroElementos;
    }

    boolean listaLlena() {
        return numeroElementos==tabla.length;
    }

    void insertarPrincipio(Integer nuevo) {
        if (listaLlena()) {
            tabla=Arrays.copyOf(tabla, tabla.length+10);
        }
        for (int i = numeroElementos; i >= 1; i--) {
            tabla[i]=tabla[i-1];
        }
        tabla[0]=nuevo;
        numeroElementos++;
    }

    void insertarFinal(Integer nuevo) {
        if (listaLlena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        tabla[numeroElementos]=nuevo;
        numeroElementos++;
    }

    void ordenar() {
        Arrays.sort(tabla, 0, numeroElementos);
    }

    public String mostrar() {
        String res="";
        for (int i = 0; i < numeroElementos; i++) {
            res+=tabla[i] + " ";
        }
        return res;
    }

    void eliminar(int indice) {
        for(int i=indice ; i<tabla.length-1 ; i++) {
            tabla[i] = tabla[i+1];
        }
        Arrays.copyOf(tabla, tabla.length-1);
    }

    void insertar(Integer valor, int indice) {
        if (tabla[tabla.length-1] != null) {
            tabla = Arrays.copyOf(tabla, tabla.length+1);
        }
        for (int i=tabla.length-2 ; i<1 ; i--) {
            tabla[i+1] = tabla[i];
        }
        tabla[indice] = valor;
    }
}