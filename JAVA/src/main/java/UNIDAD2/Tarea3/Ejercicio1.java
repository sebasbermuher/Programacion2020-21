/*
Crea un programa que calcule y muestre la suma de
dos números de dos cifras (de tipo byte) que introduzca el usuario.
 */
package UNIDAD2.Tarea3;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numeros");
    byte primernumero = teclado.nextByte();
    byte segundonumero = teclado.nextByte();
    System.out.println("La suma de los dos numeros es " + (primernumero + segundonumero));
  }
}
