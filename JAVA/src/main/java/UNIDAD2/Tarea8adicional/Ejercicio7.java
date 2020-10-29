/*
Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 */
package UNIDAD2.Tarea8adicional;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero:");
    int num = teclado.nextInt();
    int i;

    for (i = 0; num > 0; num /= 10, i *= 10) {
      i += num % 10;
    }
    System.out.println(i / 10);
  }
}
