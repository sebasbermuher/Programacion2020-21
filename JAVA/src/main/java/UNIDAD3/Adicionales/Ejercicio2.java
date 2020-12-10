/*
Escribe un programa que pida 8 palabras y las almacene en un array. Acontinuación, las palabras correspondientes
a colores se deben almacenar alcomienzo y las que no son colores a continuación. Puedes utilizar tantos arraysauxiliares
 como quieras. Los colores que conoce el programa deben estar enotro array y son los siguientes: verde, rojo,
 azul, amarillo, naranja, rosa, negro,blanco y morado.
 */
package UNIDAD3.Adicionales;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String palabras[] = new String[8];
    String colores[] = new String[8];
    Scanner s = new Scanner(System.in);
    int posicionesColores = 0;

    // Introducir los colores y palabras
    for (int i = 0; i < 8; i++) {
      System.out.print("Introduce una palabra (" + (i + 1) + " de 8) : ");
      palabras[i] = s.nextLine();
    }

    // Comprueba si la palabra es un color y lo mete en el array colores
    for (int i = 0; i < 8; i++) {
      if (palabras[i].equals("verde")
          || (palabras[i].equals("rojo")
              || (palabras[i].equals("azul")
                  || (palabras[i].equals("amarillo")
                      || (palabras[i].equals("naranja")
                          || (palabras[i].equals("rosa")
                              || (palabras[i].equals("negro")
                                  || (palabras[i].equals("blanco")
                                      || (palabras[i].equals("morado")))))))))) {
        colores[posicionesColores] = palabras[i];
        posicionesColores++;
      } else {

      }
    }
    // Comprueba si es un color, y si no lo es lo introduce en las posiciones sobrantes del array
    // colores
    for (int i = 0; i < 8; i++) {
      if (posicionesColores < 8) {
        if (palabras[i].equals("verde")
            || (palabras[i].equals("rojo")
                || (palabras[i].equals("azul")
                    || (palabras[i].equals("amarillo")
                        || (palabras[i].equals("naranja")
                            || (palabras[i].equals("rosa")
                                || (palabras[i].equals("negro")
                                    || (palabras[i].equals("blanco")
                                        || (palabras[i].equals("morado")))))))))) {

        } else {
          colores[posicionesColores] = palabras[i];
          posicionesColores++;
        }
      }
    }
    // Muestra las palabras del array colores
    for (int i = 0; i < 8; i++) {
      System.out.print(colores[i] + " ");
    }
  }
}
