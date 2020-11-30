/*
Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar
los números en el mismo orden en que se han introducido.
 */
package UNIDAD3.Tarea3;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float[] datos = new float[5];

    System.out.println("Introduce los valores: ");
    for (int i = 0; i < datos.length; i++) {
      datos[i] = teclado.nextFloat();
    }

    System.out.print("Los valores son: ");
    for (int i = 0; i < datos.length; i++) {
      System.out.print(datos[i] + " ");
    }
  }
}
