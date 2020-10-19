/*
Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.
 */
package UNIDAD2.Tarea5;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numeros");
    int num1 = teclado.nextInt();
    int num2 = teclado.nextInt();

    if (num1 % 2 != 0 && num2 % 2 != 0) {
      System.out.println("Ningun numero es par");
    } else if (num1 % 2 != 0 && num2 % 2 == 0) {
      System.out.println("Un numero es par");
    } else if (num1 % 2 == 0 && num2 % 2 != 0) {
      System.out.println("Un numero es par");
    } else {
      System.out.println("Los dos numeros son pares");
    }
  }
}
