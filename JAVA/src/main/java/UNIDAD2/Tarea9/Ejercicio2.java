/*
Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña,
el segundo, debe insertar otra intentando acertarla con las pistas que le dará el programa:
número de caracteres, primera y última letra. El programa debe escribir "Acertaste" o "Fallaste".
*/
package UNIDAD2.Tarea9;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un contraseña");
    String passw = teclado.next();

    char ultima_letra = passw.charAt(passw.length() - 1);

    System.out.println("ACIERTA LA CONTRASEÑA. Pistas:");
    System.out.println("Tiene " + passw.length() + " caracteres");
    System.out.println("Su ultima letra es " + passw.charAt(0));
    System.out.println("Su ultima letra es " + ultima_letra);

    String jugador2 = teclado.next();

    if (passw.equals(jugador2)) {
      System.out.println("Acertastes");
    } else {
      System.out.println("Fallastes");
    }
  }
}
