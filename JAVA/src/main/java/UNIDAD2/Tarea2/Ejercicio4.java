/*
Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
y calcule su equivalencia en metros (1 milla = 1609 m).
 */
package UNIDAD2.Tarea2;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una longitud en millas y te la convierto en metros");
    int longmillas = teclado.nextInt();
    System.out.println("Tu longitud en millas equivale a " + longmillas * 1609 + " metros");
  }
}
