/*
Crea un programa que pida un número entero al usuario y diga si es positivo
(mayor que cero) o si, por el contrario, no lo es (usando "else").
*/
package UNIDAD2.Tarea5;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero entero");
    int num = teclado.nextInt();
    if (num > 0) {
      System.out.println("El numero es positivo");
    } else {
      System.out.println("El numero es negativo");
    }
  }
}
