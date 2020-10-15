/*
Crea un programa que pida al usuario una temperatura en grados centígrados y calcule
(y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).
 */
package UNIDAD2.Tarea2;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce los grados centigrados");
    int grados = teclado.nextInt();
    System.out.print(
        "Los grados introducidos equivalen a " + (9 * grados / 5 + 32) + " Fahrenheit");
  }
}
