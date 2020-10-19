/*
Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y
luego con un "operador condicional".
 */
package UNIDAD2.Tarea6;

import java.util.Scanner;

public class Ejercicio4b {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numeros");
    byte num1 = teclado.nextByte();
    byte num2 = teclado.nextByte();

    byte menor = (num1 > num2) ? num2 : num1;
    System.out.println("El numero menos es " + menor);
  }
}
