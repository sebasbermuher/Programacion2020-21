/*
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido (incluyendo él mismo). Al lado de cada número se debe indicar
si se trata de un primo o no.

Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo
 */
package UNIDAD2.U2_Entrega;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero");
    int num = teclado.nextInt();
    int aux = num;

    for (int i = num; i < num + 5; i++) {
      int cont = 0;

      for (int j = 1; j <= i; j++) {
        if ((i % j) == 0) {
          cont++;
        }
      }
      if (cont <= 2) {
        System.out.println(i + " Si es primo");
        aux++;
      } else {
        System.out.println(i + " No es primo");
      }
    }
  }
}
