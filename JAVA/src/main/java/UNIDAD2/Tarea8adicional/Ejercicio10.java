/*
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
El programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
 */
package UNIDAD2.Tarea8adicional;

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce la altura:");
    int altura = teclado.nextInt();

    if (altura > 3) {
      for (int i = 0; i < altura - 1; i++) {
        System.out.print("*");
        for (int j = 0; j < 7; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
      for (int i = 0; i < 4; i++) {
        System.out.print(" *");
      }
    } else {
      for (int i = 0; i < altura - 1; i++) {
        System.out.print("*");
        for (int j = 0; j < 5; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
      for (int i = 0; i < 3; i++) {
        System.out.print(" *");
      }
    }
  }
}
