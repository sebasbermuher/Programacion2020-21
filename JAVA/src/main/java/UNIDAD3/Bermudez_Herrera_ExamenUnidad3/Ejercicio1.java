/*
Define la función mezcla con la siguiente cabecera:
public static int[] mezcla(int[] a, int[] b)
Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de mezclar
los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a, etc.
Los vectores y b pueden tener longitudes diferentes; por tanto, si se terminan los números de
un array se terminan de coger todos los que quedan del otro.
Ejemplos:
Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
 */
package UNIDAD3.Bermudez_Herrera_ExamenUnidad3;

import java.util.Arrays;

public class Ejercicio1 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3}; // creamos arrays a y b y le damos valores a los dos
    int[] b = {4, 5, 6};

    // imprimimos por pantalla la funcion mezcla de a y de b(pasando el array a string)
    System.out.println(
        "La mezcla de los numeros de ambos arrays son " + Arrays.toString(mezcla(a, b)));
  }

  // defino la funcion mezcla
  public static int[] mezcla(int[] a, int[] b) {
    int[] mezcla = new int[6]; // creo array para los 6 numeros que son en total
    int contador = 0; // contador a 0 para  a
    int contador2 = 0; // contador a 0 para b
    while (contador < mezcla.length) {
      if (contador2 < a.length) {
        mezcla[contador] = a[contador2];
        contador++;
      }
      if (contador2 < b.length) {
        mezcla[contador] = b[contador2];
        contador++;
      }
      contador2++;
    }
    return mezcla;
  }
}
