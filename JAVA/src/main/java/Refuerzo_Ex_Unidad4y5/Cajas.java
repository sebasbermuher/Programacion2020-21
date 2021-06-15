package Refuerzo_Ex_Unidad4y5;

import java.util.Arrays;

public class Cajas {
    private int id;
    private Prendas[] prendas;

    public Cajas(int id) {
        this.id = id;
        this.prendas = new Prendas[0];
    }

    @Override
    public String toString() {
        return "Cajas{" +
                "id=" + id +
                ", prendas=" + Arrays.toString(prendas) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Prendas[] getPrendas() {
        return prendas;
    }

    public void setPrendas(Prendas[] prendas) {
        this.prendas = prendas;
    }

    public void agregarPrenda(Prendas p){
        int cont=0;
        if(prendas.length<5){
            prendas= Arrays.copyOf(prendas, prendas.length+1);
            prendas[prendas.length-1]= p;
        } else{
            System.out.println("Ya no cabe mas, todo el espacio ocupado.");
        }
        cont++;
    }

    public void eliminarPrenda(Prendas p){
        Prendas[] array = new Prendas[0];
        for (int i = 0; i < prendas.length; i++) {
            if(prendas[i]!=p){
                array= Arrays.copyOf(array, array.length+1);
                array[array.length-1]=prendas[i];
            }
        }
        prendas=array;
    }
}
