/*
Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.
 */
package UNIDAD2.Tarea2;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce 2 numeros:");
    int primernumero = teclado.nextInt();
    int segundonumero = teclado.nextInt();
    System.out.println("El resultado de la division es " + primernumero / segundonumero);
  }
}
