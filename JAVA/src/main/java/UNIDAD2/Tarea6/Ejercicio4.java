/*
Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y
luego con un "operador condicional".
 */
package UNIDAD2.Tarea6;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numeros");
    byte num1 = teclado.nextByte();
    byte num2 = teclado.nextByte();
    if (num1 > num2) {
      byte menor = num2;
      System.out.println("El valor  menor es: " + menor);
    } else {
      byte menor = num1;
      System.out.println("El valor  menor es: " + menor);
    }
  }
}
