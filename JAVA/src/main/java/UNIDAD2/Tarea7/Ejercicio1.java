/*
Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.
 */
package UNIDAD2.Tarea7;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numeros");
    int a = teclado.nextInt();
    int b = teclado.nextInt();
    int aux;
    System.out.println("Valores iniciales: A=" + a + " B=" + b);
    aux = a;
    a = b;
    b = aux;
    System.out.println("Valores iniciales: A=" + a + " B=" + b);
  }
}
