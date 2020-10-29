/*
Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
El programa nos pedira la combinación para abrirla. Si no acertamos, se nos mostrara el
mensaje <Lo siento, esa no es la combinacionn> y si acertamos se nos dira <La caja fuerte
se ha abierto satisfactoriamente>. Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package UNIDAD2.Tarea8adicional;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    short passw = 1234;
    short contador = 1;
    System.out.println("Introduce la clave de acceso");
    short clave = teclado.nextShort();

    while (clave != passw && contador <= 3) {
      System.out.println("Lo siento, esa no es la combinacion");
      clave = teclado.nextShort();
      contador++;
    }
    if (clave == 1234 && contador <= 4) {
      System.out.println("La caja fuerte se ha abierto satisfactoriamentes");
    } else if (clave != 1234 & contador == 4) {
      System.out.println("Todas las oportunidades agotadas");
    }
  }
}
