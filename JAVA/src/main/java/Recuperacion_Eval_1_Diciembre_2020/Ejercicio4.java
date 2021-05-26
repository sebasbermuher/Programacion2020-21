/*
Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación, se mostrará el contenido de ese array junto al índice (0 – 9)
utilizando para ello una tabla.
Seguidamente el programa pasará los primos a las primeras posiciones,
desplazando el resto de números (los que no son primos) de tal forma que no se pierda ninguno.
Al final se debe mostrar el array resultante.
 */
package Recuperacion_Eval_1_Diciembre_2020;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int array[] = new int[10];
    int array_final[] = new int[10];
    int contador = 0;
    int y = 0;

    System.out.println("Introduce 10 numeros para rellenar el array");
    for (int num = 0; num < 10; num++) {
      array[num] = teclado.nextInt(); // se introducen los 10 numeros del array
    }
    System.out.println();

    System.out.println("Array Inicial");
    System.out.println("Indice" + "      " + "Numeros");
    for (int x = 0; x < 10; x++) {
      System.out.println(x + "            " + array[x]);

      for (int i = 2; i <= (array[x] / 2); i++) {
        if ((array[x] % i) == 0) { // si es primo se guarda en el contador
          contador++;
        }
      }
      if (contador == 0) {
        array_final[y] = array[x]; // si no hay ningun primo se copia el array anterior al nuevo
        y++; // ya que no habria modificaciones
      }
      contador = 0;
    }

    for (int x = 0; x < 10; x++) {
      for (int i = 2; i <= (array[x] / 2); i++) {
        if ((array[x] % i) == 0) { // si es primo se guarda en el contador
          contador++;
        }
      }
      if (contador != 0) {
        array_final[y] = array[x];
        y++;
      }
      contador = 0;
    } // pasa el resto de los números al resto de las posiciones

    System.out.println("-------------------");
    // muestra el nuevo array ordenado
    System.out.println("Array Final");
    System.out.println("Indice" + "      " + "Numero");
    for (int x = 0; x < 10; x++) {
      System.out.println(x + "            " + array_final[x]);
    }
  }
}
