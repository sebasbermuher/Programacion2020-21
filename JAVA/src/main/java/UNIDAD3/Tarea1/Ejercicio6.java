/*
Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro
de entrada corresponde con una vocal.
 */
package UNIDAD3.Tarea1;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una letra");
    String letra = teclado.nextLine();

    if (comprobarVocal(letra) == true) {
      System.out.print("Es vocal");
    } else {
      System.out.print("No es vocal");
    }
  }

  public static boolean comprobarVocal(String frase) {
    boolean booleano = false;

    if (frase.equalsIgnoreCase("a")
        || frase.equalsIgnoreCase("e")
        || frase.equalsIgnoreCase("i")
        || frase.equalsIgnoreCase("o")
        || frase.equalsIgnoreCase("u")) {
      booleano = true;
    }

    return booleano;
  }
}
