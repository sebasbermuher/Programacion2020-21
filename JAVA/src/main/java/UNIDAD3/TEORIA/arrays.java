package UNIDAD3.TEORIA;

import java.util.Scanner;

public class arrays {
  public static void main(String[] args) {
    // Declaramos y definimos un array con 6 elementos de tipo double
    double[] a = {10, 23.5, 15, 7, 8.9};
    System.out.println(a[0]);
    double total = 0;

    // Recorremos el array, accediendo a los elementos con el operador corchete []
    for (int i = 0; i < a.length; i++) {
      total += a[i];
    }

    System.out.println("La media es:");
    System.out.println(total / 5);

    // Forma general de declarar un array de 1000 doubles en dos pasos:
    double[] datos;
    datos = new double[1000];

    // O lo podemos hacer en un mismo paso
    double[] datos1 = new double[1000];

    // ...Y ya podemos asignarles valores
    int k = 3;
    int h = 4;
    datos[25] = 100;
    datos[0] = h * 5;
    datos[k + 1] = (k + 5) * 2;

    // Podemos asignar un valor directamente en un bucle o según lo que indique el usuario (o
    // cualquier otro proceso)
    Scanner teclado = new Scanner(System.in);

    final int MAXIMO_VALOR = 5;

    int[] datos2 = new int[MAXIMO_VALOR];
    for (int i = 0; i < datos2.length; i++) {
      System.out.print("Deme el dato " + i + ": ");
      datos2[i] = teclado.nextInt();
    }

    for (int i = datos2.length - 1; i >= 0; i--) {
      System.out.println("El dato " + i + " vale " + datos2[i]);
    }

    // Si nos hacen falta más dimensiones, podemos declarar arrays bidimensionales o de más.
    int[][] bidi = new int[2][2];
    bidi[0][0] = 5;
    bidi[0][1] = 1;
    bidi[1][0] = -2;
    bidi[1][1] = 3;

    // Y así recoremos un array de dos dimensiones
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println("El dato " + i + "," + j + " vale " + bidi[i][j]);
      }
    }

    // OJO CON LAS LLAMADAS A FUNCIONES
    //    int[] array_f = {7, 7, 7, 7, 7};
    //    System.out.println("El array antes de la función: ");
    //    for (int i = 0; i < array_f.length; i++) {
    //      System.out.print(array_f[i] + ", ");
    //    }
    //    System.out.println();

    int[] array_f = {7, 7, 7, 7, 7};

    funcion(array_f);

    System.out.println("El array después de la función: ");
    for (int i = 0; i < array_f.length; i++) {
      System.out.print(array_f[i] + ", ");
    }

    System.out.println();

    int[][] array_f_bidi = {{4, 4}, {4, 4}, {4, 4}};
    funcion_bidi(array_f_bidi);
    System.out.println("El array BIDI después de la función");
    for (int i = 0; i < array_f_bidi.length; i++) {
      for (int j = 0; j < array_f_bidi[i].length; j++) {
        System.out.print(array_f_bidi[i][j] + ", ");
      }
    }
    System.out.println();
  }

  // Función para pasar un array
  public static void funcion(int[] arr) {
    System.out.println("El array EN de la función");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1;
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }

  // Lo mismo para bidimensionales o más
  public static void funcion_bidi(int[][] arr) {
    System.out.println("El array BIDI EN la función: ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = arr[i][j] + 1;
        System.out.print(arr[i][j] + ", ");
      }
    }
    System.out.println();
  }
}
