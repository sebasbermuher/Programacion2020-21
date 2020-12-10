/*
Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos
entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
NOTA IMPORTANTE: Los números no pueden repetirse.
 */
package UNIDAD3.Adicionales;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[][] numeros = new int[6][10]; // array de 6 filas y 10 columnas

    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    // Información al usuario y petición de datos
    for (int i = 0; i < 6; i++) { // fila
      for (int j = 0; j < 10; j++) { // columna
        numeros[i][j] = (int) (Math.random() * 1001);
        if (numeros[i][j] > maximo) {
          maximo = numeros[i][j];
        }
        if (numeros[i][j] < minimo) {
          minimo = numeros[i][j];
        }
      }
    }

    for (int i = 0; i < 6; i++) { // fila
      for (int j = 0; j < 10; j++) { // columna
        System.out.printf("%11s ", numeros[i][j]);
        if (j == 9) {
          System.out.println("");
        }
      }
    }
    System.out.println("El valor máximo es: " + maximo);
    System.out.println("El valor mínimo es: " + minimo);
  }
}
