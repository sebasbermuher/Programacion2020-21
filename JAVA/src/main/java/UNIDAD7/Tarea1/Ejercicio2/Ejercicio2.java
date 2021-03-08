/*
Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.
 */
package UNIDAD7.Tarea1.Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Integer num;
        for (int i = 0; i < 20; i++) {
            num=(int)(Math.random()*100);
            lista.add(num);
        }
        System.out.println("Lista en orden de creación: ");
        System.out.println(lista);
        System.out.println("Lista en orden de decreciente: ");
        lista.sort(Collections.reverseOrder());
        System.out.println(lista);
    }
}