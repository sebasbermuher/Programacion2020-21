/*
Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num = teclado.nextInt();

    System.out.print("Hay " + primos(num) + " numeros primos por detras de el");
  }

  public static boolean esPrimo(int num) {
    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        return false;
      }
    }
    return true;
  }

  public static int primos(int num) {
    int contador = 1;

    for (int i = 2; i < num; i++) {
      if (esPrimo(i)) {
        contador++;
      }
    }

    return contador;
  }
}
