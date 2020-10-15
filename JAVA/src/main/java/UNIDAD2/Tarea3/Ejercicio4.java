/*
Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su
equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).
 */
package UNIDAD2.Tarea3;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una longitud en millas");
    float primernumero = teclado.nextFloat();
    System.out.println("Su equivalencia en kms es " + (primernumero * 1609) + " kms");
  }
}
