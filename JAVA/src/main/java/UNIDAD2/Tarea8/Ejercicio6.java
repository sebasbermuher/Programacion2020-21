/*
Escribir todos los múltiplos de 7 menores que 100.
 */
package UNIDAD2.Tarea8;

public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Los múltiplos de 7 menores de 100 son: ");

    for (int i = 0; i < 100; i = i + 7) {
      if (i % 7 == 0) {
        System.out.println(i);
      }
    }
  }
}
