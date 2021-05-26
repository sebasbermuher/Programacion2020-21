/*
Realiza un programa que muestre por pantalla un array de 9 filas por 9 columnas relleno con números
aleatorios entre 500 y 900. A continuación, el programa debe mostrar los números de la diagonal que va
desde la esquina inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo y la
media de los números que hay en esa diagonal.
 */
package Recu_Eval_1_Junio_2019_20;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] arrayAleatorio = new int[9][9]; // array de 9 filas y 9 columnas

        // Recorre altura y anchura y se introduce los numeros aleatorios entre 500 y 900
        for (int i = 0; i < arrayAleatorio.length; i++) {
            for (int j = 0; j < arrayAleatorio.length; j++) {
                arrayAleatorio[i][j] = (int) (Math.floor(Math.random() * 401) + 500);

                // se muestra el array y por tanto los numeros aleatorios
                System.out.print(arrayAleatorio[i][j] + " ");
            }
            System.out.println(); // salto de línea necesario para mantener la forma cuadrada (10x10)
        }
        System.out.println();

        System.out.println("Los números de la diagonal son: ");
        int columna=0;
        int fila=8;
        int aux=0;
        int suma=0;
        int maximo=0;
        int min=901;
        for (int i = 0; i < arrayAleatorio.length; i++) {
            System.out.print(arrayAleatorio[fila][columna] + " ");
            aux = arrayAleatorio[fila][columna];
            suma += aux;
            if (aux > maximo) {
                maximo = aux;
            }
            if (aux < min) {
                min = aux;
            }
            columna++;
            fila--;
        }

        System.out.println();
        System.out.println("Número máximo: " + maximo); // num max de la diagonal
        System.out.println("Número mínimo: " + min); // num min de la diagonal
        System.out.println("La media es: " + (suma / arrayAleatorio.length)); //media de la diagonal
    }
}