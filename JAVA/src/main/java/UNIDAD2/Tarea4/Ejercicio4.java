/*
Sería interesante disponer de un programa que pida como entrada un número decimal y
lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5
 */
package UNIDAD2.Tarea4;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero decimal");
    float num1 = teclado.nextFloat();

    System.out.println("El numero redondeado es: " + Math.round(num1));
  }
}
