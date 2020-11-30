/*
Implementar una función sinRepetidos() con el prototipo:
int[] sinRepetidos(int t[])
que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han eliminado
los datos repetidos.
 */
package UNIDAD3.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] tabla = new int[6];
    // int[] tabla2 = new int[6];
    int[] tabla3 = new int[tabla.length];

    System.out.println("Introduce 6 valores para la siguiente tabla");
    for (int i = 0; i < tabla.length; i++) {
      System.out.print(i + 1 + ". ");
      tabla[i] = teclado.nextInt();
    }

    /* System.out.println("Introduce 6 valores para la siguiente tabla");
    for (int i = 0; i < tabla2.length ; i++) {
        System.out.print(i+1 + ". ");
        tabla2[i]=teclado.nextInt();
    }*/

    Arrays.sort(tabla);
    // Arrays.sort(tabla2);
    System.out.println("Tabla 1: " + Arrays.toString(tabla));
    // System.out.println("Tabla 2: " + Arrays.toString(tabla2));

    /*int j=0;
    for (int i = 0; i <tabla.length ; i++) {
        tabla3[j]=tabla[i];
        j++;
        tabla3[j]=tabla2[i];
        j++;
    }*/

    // Arrays.sort(tabla3);
    //  System.out.println("Tabla Mezclada: " + Arrays.toString(tabla3));
    sinRepetidos(tabla);
    System.out.println("Tabla sin Repetidos: " + Arrays.toString(eliminarCeros(tabla)));
    System.out.println();
  }

  static int[] sinRepetidos(int t[]) {
    int eliminar = 0;
    for (int i = 0; i < t.length - 1; i++) {
      if (t[i] == t[i + 1]) {
        t[i + 1] = eliminar;
        eliminarNum(t, eliminar);
      }
    }
    return t;
  }

  static int[] eliminarNum(int t[], int posicionEliminar) {
    for (int i = 0; i < t.length; i++) {
      if (posicionEliminar == t[i]) {
        t[i] = 0;
      }
    }
    Arrays.sort(t);

    return t;
  }

  static int[] eliminarCeros(int t[]) {
    int contador = 0;
    for (int i = 0; i < t.length; i++) {
      if (t[i] == 0) {
        contador++;
      }
    }

    return Arrays.copyOfRange(t, contador, t.length);
  }
}
