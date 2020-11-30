/*
Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando
las palabras introducidas con espacios en blanco. Terminar de leer la frase cuando la palabra introducida
sea "fin" escrita con cualquier combinación de mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase final.
 */
package UNIDAD3.Tarea2;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String frase = "";

    System.out.println("Escribe una palabra: ");
    String palabra = teclado.nextLine();

    while (!palabra.toLowerCase().equals("fin")) {
      frase = frase + " " + palabra;

      System.out.println("Escribe una palabra: ");
      palabra = teclado.nextLine();
    }
    System.out.println(frase);
  }
}
