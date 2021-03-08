/*
Crear una colección de 20 números enteros aleatorios distintos menores que 100, guardarlos por orden decreciente
a medida que se vayan generando, y mostrar la colección por pantalla.
 */
package UNIDAD7.Tarea1.Ejercicio5;

import UNIDAD7.Tarea1.Ejercicio5.decreciente;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<>(new decreciente());

        while(num.size()<20){
            Integer temp=(int)(Math.random()*100);
            num.add(temp);
        }

        System.out.println("Los 20 numeros aleatorios distintos y menores de 100 y en orden decreciente son:");
        System.out.println(num);
    }
}