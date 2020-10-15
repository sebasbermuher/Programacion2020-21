/*
Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales.
*/
package UNIDAD2.Tarea4;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numeros enteros");
    int primeranota = teclado.nextInt();
    int segundanota = teclado.nextInt();
    System.out.println("La media es " + (primeranota + segundanota) / 2);
  }
}
