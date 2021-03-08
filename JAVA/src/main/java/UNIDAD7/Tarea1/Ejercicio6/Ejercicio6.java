/*
Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán en una colección,
de forma que se conserve el orden de inserción y que no puedan repetirse. Mostrar la estructura por pantalla.
 */
package UNIDAD7.Tarea1.Ejercicio6;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Set<String> nombres_sin_repetir= new LinkedHashSet<>();

        System.out.println("Introduce un nombre. Para terminar escriba (fin): ");
        String nombre=teclado.nextLine();

        while(!nombre.equalsIgnoreCase("fin")){
            nombres_sin_repetir.add(nombre);
            System.out.println("Introduce un nombre. Para terminar escriba (fin): ");
            nombre=teclado.nextLine();
        }
        System.out.println("Estos son los nombres en orden de inserción y sin repetiones:");
        System.out.println(nombres_sin_repetir);
    }
}
