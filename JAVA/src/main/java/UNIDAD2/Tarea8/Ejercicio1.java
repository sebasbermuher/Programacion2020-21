/*
Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo,
y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero. Para finalizar el bucle introduce el 0");
    int num = teclado.nextInt();

    while (num != 0) {
      if (num % 2 == 0) {
        System.out.println("Es par");
      }
      if (num > 0) {
        System.out.println("Es positivo");
      }
      System.out.println("El cuadrado de " + num + " es: " + Math.pow(num, 2));
      System.out.println("Introduce un numero. Para finalizar el bucle introduce el 0");
      num = teclado.nextInt();
    }
  }
}
