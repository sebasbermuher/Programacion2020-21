/*
Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */
package UNIDAD2.Tarea8;

public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("El producto de los 10 primeros numeros impares son:");
    for (int i = 1; i < 10; i++) {
      if (!(i % 2 == 0)) {
        System.out.println(i);
      }
    }
  }
}
