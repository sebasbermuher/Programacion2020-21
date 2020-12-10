/*
Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios
entre 200 y 300. A continuación, el programa debe mostrar los números de la diagonal que va desde la esquinas
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo y la media de los números que
hay en esa diagonal.
 */
package UNIDAD3.Adicionales;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int[][] arrayAleatorio = new int[10][10]; // array de 10 filas y 10 columnas

    // Recorre altura y anchura y se introduce los numeros aleatorios entre 200 y 300
    for (int i = 0; i < arrayAleatorio.length; i++) {
      for (int j = 0; j < arrayAleatorio.length; j++) {
        arrayAleatorio[i][j] = (int) (Math.floor(Math.random() * 101) + 200);

        // se muestra el array y por tanto los numeros aleatorios
        System.out.print(arrayAleatorio[i][j] + " ");
      }
      System.out.println(); // salto de línea necesario para mantener la forma cuadrada (10x10)
    }
    System.out.println();

    System.out.println("Los números de la diagonal son: ");
    for (int i = 0; i < arrayAleatorio.length; i++) {
      int numDiag = arrayAleatorio[i][i];
      System.out.print(numDiag + " ");
      // Muestro los números de la diagonal superior izquierda hasta la inferior
    }

    int i = 0;
    int max;
    int min = max = arrayAleatorio[i][i];

    for (i = 0; i < arrayAleatorio.length; i++) {
      if (min > arrayAleatorio[i][i]) {
        min = arrayAleatorio[i][i];
      }

      if (max < arrayAleatorio[i][i]) {
        max = arrayAleatorio[i][i];
      }
    }
    System.out.println();
    System.out.println("Número máximo: " + max); // num max de la diagonal
    System.out.println("Número mínimo: " + min); // num min de la diagonal
  }
}
