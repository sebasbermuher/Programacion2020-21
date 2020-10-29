/*
En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.
 */
package UNIDAD2.Tarea9;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un contraseña");
    String passw = teclado.next();

    char ultima_letra = passw.charAt(passw.length() - 1);

    System.out.println("ACIERTA LA CONTRASEÑA. Pistas:");
    System.out.println("Tiene " + passw.length() + " caracteres");
    System.out.println("Su ultima letra es " + passw.charAt(0));
    System.out.println("Su ultima letra es " + ultima_letra);

    String jugador2;

    do {
      jugador2 = teclado.next();
      int comparacion = passw.compareTo(jugador2);

      if (comparacion == 0) {
        System.out.println("Acertaste");
      } else if (comparacion < 0) {
        System.out.println("Es menor");
      } else {
        System.out.println("Es mayor");
      }
    } while (!passw.equals(jugador2));
  }
}
