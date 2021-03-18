/*
Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única lista, fusión de las
dos anteriores. Desarrollar el algoritmo de forma no destructiva, es decir, que las listas utilizadas como parámetros
de entrada se mantengan intactas.
 */
package UNIDAD7.Tarea2.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio13 {
    static List<Integer> fusion(List<Integer>lista1,List<Integer>lista2) {
        List<Integer> listas_fusionadas = new ArrayList<>();
        int i = 0, j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                listas_fusionadas.add(lista1.get(i));
                i++;
            } else {
                listas_fusionadas.add(lista2.get(j));
                j++;
            }
        }
        while (i < lista1.size()) {
            listas_fusionadas.add(lista1.get(i));
            i++;
        }
        while(j<lista2.size()){
            listas_fusionadas.add(lista2.get(j));
            j++;
        }
        return listas_fusionadas;
    }

    public static void main(String[] args) {
        List<Integer> lista1=new ArrayList<>();
        lista1.add(1);lista1.add(3);lista1.add(5);lista1.add(7);lista1.add(9);lista1.add(15);

        List<Integer> lista2=new ArrayList<>();
        lista2.add(2);lista2.add(4);lista2.add(6);lista2.add(8);lista2.add(10);lista2.add(11);lista2.add(12);lista2.add(13);lista2.add(14);

        System.out.println("La lista 1 es:");
        System.out.println(lista1);

        System.out.println("La lista 2 es:");
        System.out.println(lista2);

        System.out.println("Las dos listas fusionados son:");
        System.out.println(fusion(lista1,lista2));
    }
}