/*
Pedir un número y calcular su factorial.

Ejemplo: Factorial de 5:

5! = 5x4x3x2x1 = 120
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int aux = 1;

    System.out.println("Introduce un numero para calcular su factorial");
    int num = teclado.nextInt();

    for (int i = num; i > 0; i--) {
      aux = aux * i;
    }
    System.out.println(aux);
  }
}
