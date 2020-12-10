/*
Hacer una algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N filas y N columnas
con número aleatorios entre 100 y 200.
Mostrar dicho array y a continuación rotarlo 90 grados:
 */
package UNIDAD3.U3_Entregable;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el valor de N para nºfilas y nºcolumnas");
    int n = teclado.nextInt();
    int filas = n;
    int columnas = n;

    int array[][] = new int[filas][columnas];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = generaNumAleatorio(100, 201);
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int generaNumAleatorio(int minimo, int maximo) {
    return (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
  }
}
