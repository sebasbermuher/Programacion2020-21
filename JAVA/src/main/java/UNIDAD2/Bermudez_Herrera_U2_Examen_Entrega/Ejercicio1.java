/*
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
   1
  121
 12321
1234321
 */
package UNIDAD2.U2_Examen;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero para las filas");
    int n = teclado.nextInt();
    int altura = 0;
    int espacios = n - 1;

    while (altura <= n) {

      for (int i = 0; i <= espacios; i++) {
        System.out.print(" ");
      }
      // DIBUJA LOS NUMEROS DE IZQUIERDA A DERECHA HASTA CENTRO EN ORDEN ASCENDENTE
      for (int i = 1; i < altura; i++) {
        System.out.print(i);
      }
      // DIBUJA LOS NUMEROS DEL CENTRO HACIA LA DERECHA EN ORDEN DESCENDETE
      for (int i = altura; i > 0; i--) {
        System.out.print(i);
      }
      altura++;
      espacios--;
      System.out.println();
    }
  }
}
