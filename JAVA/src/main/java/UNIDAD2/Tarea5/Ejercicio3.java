/*
Crea un programa que diga si el número introducido por el usuario es impar o no lo es.
 */
package UNIDAD2.Tarea5;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num = teclado.nextInt();

    if (num % 2 != 0) {
      System.out.println("El numero introducido es impar");
    } else {
      System.out.println("El numero introducido es par");
    }
  }
}
