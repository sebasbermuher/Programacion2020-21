/*
Realizar un aplicación que genere un número aleatorio entre 1 y 100.
El jugador debe ir probando números tratando de acertarlo.
El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor
que el introducido por el usuario.
El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int num_azar = (int) (Math.random() * 101);
    System.out.println("Introduce un numero entre 1-100 para adivinar el numero aleatorio");
    int num = teclado.nextInt();

    while (num != num_azar && num != -1) {
      if (num > num_azar) {
        System.out.println("El numero aleatorio es MENOR al numero introducido");
        num = teclado.nextInt();
      }
      if (num < num_azar) {
        System.out.println("El numero aleatorio es MAYOR al numero introducido");
        num = teclado.nextInt();
      }
    }
    if (num == num_azar) {
      System.out.println("Enhorabuena, has acertado el numero");
    } else if (num == -1) {
      System.out.println("Te rendistes. No has logrado adivinar el numero aleatorio");
    }
  }
}
