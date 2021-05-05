/*
Realiza un programa que pinte un triángulo hueco tal como se muestra
en los ejemplos. El usuario debe introducir la altura de la figura.
Utiliza funciones para pintar las líneas.
Ejemplo 1:
Introduzca la altura de la figura: 8
********
*       *
*      *
*     *
*    *
*   *
*  *
*

Ejemplo 2:
Introduzca la altura de la figura: 5
*****
*   *
*  *
* *
*

 */
package PlanRefuerzo_PrimerTrimestre;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == 0 || i == 0 || i + j == altura - 1) {
                    System.out.print("*");
                } else {
                    //Dibujo los espacios
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
