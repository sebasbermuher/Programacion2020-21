/*
Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero:");
    int num = teclado.nextInt();

    System.out.println(factorial(num));
  }

  static int factorial(int n) {
    int resultado = 1;
    int aux = 0;

    if (n == 0) {
      resultado = resultado * 1;
    } else {
      resultado = n * factorial((n - 1));
    }
    return resultado;
  }
}
