/*
Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos
de los alumnos. Se introducirán las edades de los elumnos hasta que una de ellas sea negativa.
La aplicación mostrará la suma de las edades, la media,
de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int suma = 0, contador = 0, mayores = 0;
    double media = 0;

    System.out.println("Introduce la edad de los alumnos");
    int edad = teclado.nextInt();

    while (edad > 0) {
      suma = suma + edad;
      contador++;
      media = suma / contador;
      if (edad >= 18) {
        mayores++;
      }
      System.out.println("Introduce la edad de los alumnos");
      edad = teclado.nextInt();
    }
    System.out.println("La suma de las edades es: " + suma);
    System.out.println("La media de edades es:" + media);
    System.out.println("Hay " + mayores + " alumnos que son mayores de edad");
  }
}
