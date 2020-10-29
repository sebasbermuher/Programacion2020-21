/*
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
números enteros a partir de uno que se introduce por teclado.
 */
package UNIDAD2.Tarea8adicional;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero");
    int num = teclado.nextInt();

    int num_aux = num - 1;

    for (int i = 0; i < 5; i++) {
      num_aux++;
      System.out.print(num_aux);
      for (int j = 0; j < 20; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 1; k++) {
        System.out.print(Math.pow(num_aux, 2));
      }
      for (int j = 0; j < 20; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 1; k++) {
        System.out.println(Math.pow(num_aux, 3));
      }
    }
  }
}
