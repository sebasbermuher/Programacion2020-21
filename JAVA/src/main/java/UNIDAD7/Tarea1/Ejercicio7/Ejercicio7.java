/*
Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán por orden alfabético
en una colección que no permita repeticiones. Mostrar luego la lista de nombres por pantalla.
 */
package UNIDAD7.Tarea1.Ejercicio7;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        Set<String> nombres_sin_repetir= new TreeSet<>();

        System.out.println("Introduce un nombre.Para terminar escriba (fin): ");
        String nombre=teclado.nextLine();

        while(!nombre.equalsIgnoreCase("fin")){
            nombres_sin_repetir.add(nombre);
            System.out.println("Introduce un nombre.Para terminar escriba (fin): ");
            nombre=teclado.nextLine();
        }
        System.out.println("Estos son los nombres en orden alfabetico y sin repeticiones:");
        System.out.println(nombres_sin_repetir);
    }
}
