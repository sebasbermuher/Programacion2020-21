/*
Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura.
Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se
debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura de la X: 5
   *   *
    * *
     *
    * *
   *   *
 */
package PlanRefuerzo_PrimerTrimestre;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura para X");
        int altura = teclado.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i == j) || (j == (altura - i) + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}