/*
Define la función mezcla con la siguiente cabecera:
public static int[] mezcla(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de mezclar los
números de ambos de forma alterna, se coge un número de a, luego de b, luego de a, etc. Los arrays a y
b pueden tener longitudes diferentes; por tanto, si se terminan los números de un array se terminan de
coger todos los que quedan del otro.
Ejemplos:
Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
 */

package Recu_Eval_1_Junio_2019;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] primer_array = {5,8,2}; // creamos arrays y le introducimos los valores
        int[] segundo_array = {9,3,7};

        // imprimimos por pantalla la funcion mezcla pasandolo a strnig
        System.out.println(
                "La mezcla de los numeros de ambos arrays son " + Arrays.toString(mezcla(primer_array, segundo_array)));
    }

    public static int[] mezcla(int[] a, int[] b) {
        int[] mezcla = new int[6];
        int cont = 0; // contador para primer_array
        int cont2 = 0; // contador para segundo_array
        while (cont < mezcla.length) {
            if (cont2 < a.length) {
                mezcla[cont] = a[cont2];
                cont++;
            }
            if (cont2 < b.length) {
                mezcla[cont] = b[cont2];
                cont++;
            }
            cont2++;
        }
        return mezcla;
    }
}