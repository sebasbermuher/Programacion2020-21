/*
Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre.
 Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán las vocales
 (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican.
 */
package UNIDAD3.Tarea2;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String sinVocales = "";
    char c;

    System.out.println("Introduce su nombre: ");
    String nombre = teclado.nextLine();

    for (int i = 0; i < nombre.length(); i++) {
      c = nombre.charAt(i);

      if (!esVocal(c)) {
        sinVocales = sinVocales + c;
      }
    }
    System.out.println(sinVocales);
  }

  static boolean esVocal(char c) {
    String vocales = "aeiouáéíóú";

    c = Character.toLowerCase(c);

    if (vocales.indexOf(c) == -1) {
      return false;
    } else {
      return true;
    }
  }
}
