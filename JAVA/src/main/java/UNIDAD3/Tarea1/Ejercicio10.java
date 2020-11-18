/*
Escribir una función que decida si dos números enteros positivos son amigos.
Dos números son amigos si la suma de los divisores propios (distinto de él mismo) del primer
número es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce 2 numeros:");
    int num = teclado.nextInt();
    int num2 = teclado.nextInt();

    amigos(num, num2);
  }

  public static void amigos(int num, int num2) {
    int aux = 0;

    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        aux = aux + i;
      }
    }
    if (aux == num2) {
      System.out.print("Son amigos");
    } else {
      System.out.print("No son amigos");
    }
  }
}
