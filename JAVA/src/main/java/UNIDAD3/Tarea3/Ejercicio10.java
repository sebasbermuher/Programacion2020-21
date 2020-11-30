/*
Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional que debe rellenar
de la siguiente forma: se leerá por teclado una serie de números, guardando en la tabla los pares hasta que
esté llena, e ignorando los impares. La función tiene que devolver la cantidad de impares desechados.
 */
package UNIDAD3.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int num;
    System.out.println("Introduzca el tamaño de la tabla: ");
    num = teclado.nextInt();

    rellenaPares(num);
    teclado.close();
  }

  static void rellenaPares(int n) {
    Scanner teclado = new Scanner(System.in);
    int t[] = new int[n];
    int cont = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("Introduzca numeros en la posicion " + i + " de la tabla.");
      t[i] = teclado.nextInt();

      if (t[i] % 2 != 0) {
        i--;
        cont++;
      }
    }
    System.out.println("El contenido de la tabla es " + Arrays.toString(t));
    System.out.println("El numero de impares desechados es " + cont);
  }
}
