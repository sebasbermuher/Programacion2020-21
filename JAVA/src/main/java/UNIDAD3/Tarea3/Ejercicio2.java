/*
Escribir una aplicación que solicite al usuario cuántos números desea introducir. A continuación,
se introducirá por teclado esa cantidad de números enteros, y por último, los mostrará en el orden inverso al introducido.
 */
package UNIDAD3.Tarea3;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("¿Cuantos numeros quieres introducir?");
    int num = teclado.nextInt();

    int[] cadena = new int[num];

    System.out.println("Introduce los numeros: ");

    for (int i = 0; i < cadena.length; i++) {
      cadena[i] = teclado.nextInt();
    }

    System.out.println("Los numeros son: ");
    for (int i = cadena.length - 1; i >= 0; i--) {
      System.out.print(cadena[i] + " ");
    }
  }
}
