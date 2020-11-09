/*
Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
Además, hemos de pasarle a la función el radio de la base y la altura.
Area total = 2*pi*r*(h+r)
Volumen = pi*r^2*h
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Elige una opción");
    System.out.println("1.- Calcular area");
    System.out.println("2.- Calcular volumen");
    int opcion = teclado.nextInt();
    float base, altura;

    switch (opcion) {
      case 1:
        System.out.println("Introduce el radio de la base y el radio de la altura");
        base = teclado.nextFloat();
        altura = teclado.nextFloat();
        area(base, altura);
        break;
      case 2:
        System.out.println("Introduce el radio de la base y el radio de la altura");
        base = teclado.nextFloat();
        altura = teclado.nextFloat();
        volumen(base, altura);
        break;
      default:
        System.out.println("Error");
    }
  }

  public static void area(float base, float altura) {
    double area_total;

    area_total = 2 * Math.PI * base * (altura + base);
    System.out.print("El area es: " + area_total);
  }

  public static void volumen(float base, float altura) {
    double volumen;

    volumen = Math.PI * Math.pow(base, 2) * altura;
    System.out.print("El volumen es: " + (float) volumen);
  }
}
