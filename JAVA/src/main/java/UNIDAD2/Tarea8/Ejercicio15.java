/*
 Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que
 sean primos. Un número primo es aquel que sólo es  divisible por 1 y por él mismo. Ejemplo: Para n=8:
1-> primo
2->primo
3->primo
4->no primo
5->primo
6->no primo
7->primo
8->no primo
Resultado del programa: Entre 1 y 8 hay 5 números primos.
*/
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int contador = 0;
    System.out.println("Introduce un numero");
    int num = teclado.nextInt();

    for (int i = 1; i < (num - 1); i++) {
      if ((i % 2 != 0 && i != 1) || (i == 2)) {
        contador++;
      }
    }
    System.out.println("Entre 1 y " + num + " hay " + contador + " numeros primos");
  }
}
