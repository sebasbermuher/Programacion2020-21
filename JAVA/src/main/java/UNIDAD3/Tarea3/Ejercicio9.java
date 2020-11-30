/*
Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta de la primitiva,
y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.
 */
package UNIDAD3.Tarea3;

import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int apuesta[] = new int[6];
    int ganador[] = {17, 10, 7, 23, 55, 21};
    int aciertos = 0;

    for (int i = 0; i < 6; i++) {
      System.out.println("Introduzca numero de la posicion " + (i + 1));
      apuesta[i] = teclado.nextInt();
      if (apuesta[i] == ganador[i]) {
        aciertos++;
      }
    }

    System.out.println("Has acertado:  " + aciertos + " numeros");
  }
}
