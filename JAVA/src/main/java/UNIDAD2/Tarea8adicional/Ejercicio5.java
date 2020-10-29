/*
Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 */
package UNIDAD2.Tarea8adicional;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca numero de filas: ");
    int fila = teclado.nextInt();
    System.out.print("Introduzca el caracter para pintar la piramide: ");
    String caracter = teclado.next();

    System.out.println();
    for (int i = 1; i <= fila; i++) {
      for (int j = 1; j <= fila - i; j++) {
        System.out.print(" ");
      }

      for (int k = 1; k <= (i * 2) - 1; k++) {
        System.out.print(caracter);
      }
      System.out.println();
    }
  }
}
