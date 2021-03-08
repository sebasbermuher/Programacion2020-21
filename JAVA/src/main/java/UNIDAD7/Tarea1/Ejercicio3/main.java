/*
Crear una colección de 20 números enteros aleatorios menores que 10, guardarlos por orden decreciente a
medida que se vayan generando y mostrar la colección por pantalla.
 */
package UNIDAD7.Tarea1.Ejercicio3;

import UNIDAD7.Tarea1.Ejercicio3.NumDecrecientes;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        Set<Integer> conj = new TreeSet<>(new NumDecrecientes());

        while (conj.size() < 20){
            Integer temp = (int)(Math.random()*10);
            conj.add(temp);
        }
        System.out.println("Los 20 numeros aleatorios ordenados en orden decreciente son: ");
        System.out.println(conj);
    }
}