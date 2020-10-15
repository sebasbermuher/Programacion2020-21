/*
Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
Hay que tener en cuenta que la media puede contener decimales.
*/
package UNIDAD2.Tarea4;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numeros enteros");
    float primeranota = teclado.nextFloat();
    float segundanota = teclado.nextFloat();
    System.out.println("La media es " + (primeranota + segundanota) / 2);
  }
}
