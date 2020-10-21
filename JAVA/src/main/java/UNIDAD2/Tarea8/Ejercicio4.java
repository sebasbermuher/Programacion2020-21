/*
Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int n = teclado.nextInt();
    for (int i = 1; i <= n; i++) {
      if (i < n) {
        System.out.print(i + ", ");
      } else {
        System.out.print(i);
      }
    }
  }
}
