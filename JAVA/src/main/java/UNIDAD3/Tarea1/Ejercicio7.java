/*
Diseñar una función que nos diga si un número es primo.
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num = teclado.nextInt();

    System.out.print(esPrimo(num));
  }

  public static boolean esPrimo(int num) {
    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        return false;
      }
    }
    return true;
  }
}
