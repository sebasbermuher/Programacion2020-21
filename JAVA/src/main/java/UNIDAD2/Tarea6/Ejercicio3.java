/*
Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si ese
número es par o el valor 0 si no es par.
 Hazlo primero con un "if" y luego con un "operador condicional".
 */
package UNIDAD2.Tarea6;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero entero");
    int num = teclado.nextInt();
    if (num % 2 == 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
