/*
Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado,
utilizando para ello asteriscos (*).Por ejemplo, para n=4:
* * * *
* * *
* *
*
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero para el lado del triangulo");
    int num = teclado.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = i; j <= num; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
