/*
Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
y cuántos son negativos.
 */
package UNIDAD2.Tarea8adicional;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int pos = 0, neg = 0;

    System.out.println("Introduce 10 numeros");
    for (int i = 0; i < 10; i++) {
      int num = teclado.nextInt();

      if (num > 0) {
        pos++;
      } else {
        neg++;
      }
    }
    System.out.println("Hay " + pos + " numeros positivos");
    System.out.println("Hay " + neg + " numeros negativos");
  }
}
