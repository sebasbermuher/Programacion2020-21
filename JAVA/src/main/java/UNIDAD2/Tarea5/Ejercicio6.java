/*
Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor
de "tiempo", y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"
 */
package UNIDAD2.Tarea5;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double gravedad = 9.8;
    System.out.println("Introduce el dato tiempo");
    int tiempo = teclado.nextInt();

    if (tiempo > 0) {
      System.out.println("La velocidad es de " + gravedad * tiempo);
    } else {
      System.out.println("Error. El valor de tiempo es negativo o cero");
    }
  }
}
