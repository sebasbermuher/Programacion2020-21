/*
Crea un programa que calcule y muestre la división de dos números
reales de doble precisión introducidos por el usuario.
 */
package UNIDAD2.Tarea3;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce dos numeros para dividirlos");
    double primernumero = teclado.nextDouble();
    double segundonumero = teclado.nextDouble();
    System.out.println("El resultado es " + (primernumero / segundonumero));
  }
}
