/*
Crea un programa que pida al usuario su año de nacimiento y el año actual
(usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.
 */
package UNIDAD2.Tarea3;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce tu año de nacimiento");
    short nacimiento = teclado.nextShort();
    System.out.println("Introduce el año actual");
    short actual = teclado.nextShort();
    System.out.println("Tienes " + (actual - nacimiento) + " años");
  }
}
