/*
Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int aprobados = 0, condicionados = 0, suspensos = 0;

    for (int i = 0; i < 6; i++) {
      System.out.println("Introduce la nota del alumno");
      int nota = teclado.nextInt();

      if (nota >= 5) {
        aprobados++;
      } else if (nota == 4) {
        condicionados++;
      } else {
        suspensos++;
      }
    }
    System.out.println(
        "En total hay: "
            + aprobados
            + " aprobados, "
            + condicionados
            + " condicionados, "
            + suspensos
            + " suspensos");
  }
}
