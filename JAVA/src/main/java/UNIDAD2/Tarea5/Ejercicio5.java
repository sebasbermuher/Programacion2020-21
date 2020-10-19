/*
Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.
 */
package UNIDAD2.Tarea5;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce 3 numeros");
    long num1 = teclado.nextLong();
    long num2 = teclado.nextLong();
    long num3 = teclado.nextLong();

    if (num1 > num2 && num1 > num3) {
      System.out.println("El numero mayor es " + num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("El numero mayor es " + num2);
    } else if (num3 > num1 && num3 > num2) {
      System.out.println("El numero mayor es " + num3);
    }
  }
}
