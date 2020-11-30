/*
Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición [n,m] debe contener n+m.
Después, se debe mostrar su contenido.
 */
package UNIDAD3.Tarea3;

import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int[][] t = new int[5][5];

    for (int i = 0; i < t.length; i++) {
      for (int j = 0; j < 5; j++) {
        t[i][j] = i + j;
      }
    }
    System.out.println("La tabla es la siguiente: ");
    for (int i = 4; i >= 0; i--) {
      System.out.println();
      for (int j = 0; j < 5; j++) {
        System.out.print(t[i][j] + " ");
      }
    }
  }
}
