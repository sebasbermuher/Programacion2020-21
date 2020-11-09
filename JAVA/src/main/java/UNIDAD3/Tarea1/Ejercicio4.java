/*
Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numero y te digo cual es el mayor");
    int num = teclado.nextInt();
    int num2 = teclado.nextInt();
    mayor(num, num2);
  }

  public static void mayor(int n1, int n2) {
    int mayor = 0;
    if (n1 > n2) {
      mayor = n1;
    } else if (n1 < n2) {
      mayor = n2;
    } else if (n1 == n2) {
      mayor = n1;
    }
    System.out.println("El numero mayor es " + mayor);
  }
}
