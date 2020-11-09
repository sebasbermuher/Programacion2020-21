/*
Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces
el mensaje "Eco..."
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduce un número:");
    int num = teclado.nextInt();
    eco(num);
  }

  public static void eco(int num) {
    for (int i = 0; i < num; i++) {
      System.out.print("Eco...");
    }
  }
}
