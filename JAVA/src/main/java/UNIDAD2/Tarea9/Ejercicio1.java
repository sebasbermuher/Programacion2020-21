/*
Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
*/
package UNIDAD2.Tarea9;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos palabras:");
    String palabra1 = teclado.next();
    String palabra2 = teclado.next();

    if (palabra1.length() < palabra2.length()) {
      System.out.println(palabra1 + " es mas corta que " + palabra2);
    } else if (palabra1.length() > palabra2.length()) {
      System.out.println(palabra2 + " es mas corta que " + palabra1);
    } else {
      System.out.println("Las dos palabras tienen la misma longitud");
    }
  }
}
