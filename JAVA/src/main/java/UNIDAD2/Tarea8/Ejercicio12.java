/*
Pedir 5 calificaciones de alumnos. El programa debe decir, al final,
si hay algún suspenso o no lo hay.
Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int notas;
    boolean suspensos = false;

    for (int i = 0; i < 5; i++) {
      System.out.println("Introduce una nota");
      notas = teclado.nextInt();

      if (notas < 5) {
        suspensos = true;
      }
    }
    if (suspensos = true) {
      System.out.println("Hay alumnos suspensos");
    } else System.out.println("No hay alumnos suspensos");
  }
}
