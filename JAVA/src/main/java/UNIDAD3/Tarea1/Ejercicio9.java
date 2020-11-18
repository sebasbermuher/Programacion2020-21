/*
Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos del
número que se le pasa como parámetro
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num = teclado.nextInt();

    System.out.println("Los numeros primos que se pueden dividir entre " + num + " son: ");
    divisoresPrimos(num);
  }

  static void divisoresPrimos(int num) {
    boolean primo = true;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        for (int j = 2; j < i && primo; ++j) {
          if (i % j == 0) {
            primo = false;
          }
        }
        if (primo) {
          System.out.print(i + "  ");
        }
      }
    }
  }
}
