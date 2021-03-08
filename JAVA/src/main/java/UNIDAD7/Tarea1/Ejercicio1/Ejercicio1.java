/*
Crear una colección de 20 números enteros aleatorios menores que 100, y guardarlos en el orden en que se
vayan generando; mostrar por pantalla dicha lista una vez creada. Ordenarla en sentido creciente y volverla
a mostrar por pantalla.
 */
package UNIDAD7.Tarea1.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Integer num;
        for (int i = 0; i < 20; i++) {
            num=(int)(Math.random()*100);
            lista.add(num);
        }
        System.out.println("Lista en orden de creación: ");
        System.out.println(lista);
        System.out.println("Lista en orden de creciente: ");
        Collections.sort(lista);
        System.out.println(lista);
    }
}