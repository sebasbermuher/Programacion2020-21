/*
Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura.
Se debe comprobar que la altura sea un número impar mayor o igual a 3,
en caso contrario se debe mostrar un mensaje de error.
 */
package UNIDAD2.Tarea8adicional;

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int altura = 0;

    System.out.println("Introduce la altura para X");
    altura = teclado.nextInt();

    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= altura; j++) {
        if ((i == j) || (j == (altura - i) + 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
