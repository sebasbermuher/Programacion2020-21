/*
Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
El 406783 contiene 4 dígitos pares y 2 dígitos impares.

Ejemplo 2:
Por favor, introduzca un número entero positivo: 3177840
El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
 */
package UNIDAD2.U2_Entrega;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingresa un numero: ");
    long num = teclado.nextLong();

    int longitud;
    longitud = (int) (Math.log10(num) + 1);

    int contador_par = 0;
    int contador_impar = 0;

    int i;

    for (i = 1; i <= longitud; i++) {
      if (num % 2 == 0) {
        contador_par++;
      } else {
        contador_impar++;
      }
      num = num / 10;
    }
    System.out.println(
        "El numero"
            + num
            + " contiene "
            + contador_par
            + " numeros par"
            + " y "
            + contador_impar
            + " impar.");
  }
}
