/*
Se nos pide hacer un programa que pida al usuario el valor del radio de una circunferencia,
y a continuación muestre un pequeño menú con 3 opciones:
1.Calcular diámetro
2.Calcular perímetro
3.Calcular área
Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
(diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)
 */
package UNIDAD2.Tarea6;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el valor del radio de la circunferencia");
    float radio = teclado.nextFloat();
    System.out.println("Elige una opcion.");
    System.out.println("1. Calcular diametro");
    System.out.println("2. Calcular perimetro");
    System.out.println("3. Calcular area");

    int opcion = teclado.nextInt();
    switch (opcion) {
      case 1:
        System.out.println("El diametro es " + 2 * radio);
        break;
      case 2:
        System.out.println("El perimetro es " + 2 * Math.PI * radio);
        break;
      case 3:
        System.out.println("El area es " + (Math.PI * radio * radio));
        break;
      default:
        System.out.println("El valor introducido no esta asignado a una opcion valida");
    }
  }
}
