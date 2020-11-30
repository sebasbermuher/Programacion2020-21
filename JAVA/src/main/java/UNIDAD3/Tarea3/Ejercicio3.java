/*
Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
Realizar la media de los números positivos, la media de los negativos, y contar el número de ceros introducidos.
 */
package UNIDAD3.Tarea3;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int media_pos = 0, media_neg = 0;
    int suma_pos = 0, suma_neg = 0;
    int contador_pos = 0, contador_neg = 0, contador_cero = 0;

    System.out.println("Cuantos numeros quieres introducir");
    int n = teclado.nextInt();

    int[] tablita = new int[n];

    System.out.println("Introduce los numeros");
    for (int i = 0; i < tablita.length; i++) {
      tablita[i] = teclado.nextInt();

      if (tablita[i] > 0) {
        suma_pos = suma_pos + tablita[i];
        contador_pos++;
      } else if (tablita[i] < 0) {
        suma_neg = suma_neg + tablita[i];
        contador_neg++;
      } else {
        contador_cero++;
      }
    }

    media_pos = suma_pos / contador_pos;
    media_neg = suma_neg / contador_neg;

    System.out.print(
        "La media de los numeros positivos son: "
            + media_pos
            + " y la de los numeros negativos: "
            + media_neg
            + " .");
    System.out.println(" Hay exactamente " + contador_cero + " ceros");
  }
}
