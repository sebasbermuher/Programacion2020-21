/*
Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
A continuación, solicitará por teclado un valor que debe estar dentro del rango. Si no es asi,
volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numeros que determinen un rango");
    System.out.println("Numero minimo del rango:");
    int min = teclado.nextInt();
    System.out.println("Numero maximo del rango:");
    int max = teclado.nextInt();

    System.out.println("Introduce un numero que este dentro del rango anterior introducido");
    int num = teclado.nextInt();

    while (!(num >= min && num <= max)) {
      System.out.println("Error. Introduzca un numero dentro del rango");
      num = teclado.nextInt();
    }
    System.out.println("El numero introducido pertenece al rango correctamente");
  }
}
