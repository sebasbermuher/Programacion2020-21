/*
Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula
sumando los dos anteriores, por lo que tendríamos que los términos son
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.
 */
package UNIDAD2.Tarea8adicional;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int a = 0, b = 1, c;

    System.out.println("Introduce un numero");
    int num = teclado.nextInt();

    for (int i = 0; i < num; i++) {
      System.out.print(a + "  ");
      c = a + b;
      a = b;
      b = c;
    }
  }
}
