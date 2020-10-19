/*
Crea un programa que pida al usuario que introduzca
el número 12. Después debe decirle si lo ha hecho correctamente o no.
 */
package UNIDAD2.Tarea5;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el numero 12");
    int num = teclado.nextInt();
    if (num == 12) {
      System.out.println("Has introducido el numero correctamente");
    } else {
      System.out.println("Error. No lo has introducido correctamente");
    }
  }
}
