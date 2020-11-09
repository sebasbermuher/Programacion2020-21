/*
Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int nummayor = 0;
    int nummenor = 0;

    System.out.println("Introduce dos numeros enteros: ");
    int num = teclado.nextInt();
    int num2 = teclado.nextInt();

    comprendido(num, num2);
  }

  public static void comprendido(int num1, int num2) {
    int nummayor = 0;
    int nummenor = 0;

    if (num1 > num2) {
      nummayor = num1;
      nummenor = num2;
    } else if (num1 < num2) {
      nummayor = num2;
      nummenor = num1;
    }
    for (int i = nummenor + 1; i < nummayor; i++) {
      System.out.print(i + " ");
    }
  }
}
