/*
Un centro de investigación de la flora urbana necesita una aplicación que muestre
cual es el árbol más alto. Para ello se introducirán por teclado las alturas en cms de
cada árbol, terminando cuando se introduzca -1.
Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.
 */
package UNIDAD2.Tarea8;

import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int altura;
    int aux = 0;

    do {
      System.out.println("Introduce la altura (cms) del arbol");
      altura = teclado.nextInt();

      if (altura > aux) {
        aux = altura;
      }

    } while (altura != -1);

    System.out.println("El arbol mas grande introducido es " + aux);
  }
}
