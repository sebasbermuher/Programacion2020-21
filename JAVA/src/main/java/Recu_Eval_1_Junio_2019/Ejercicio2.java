/*
Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9. Los números de la mala
suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un número es afortunado si contiene más números de
la suerte que de la mala suerte. Realiza un programa que diga si un número introducido por el usuario es
afortunado o no.
 */
package Recu_Eval_1_Junio_2019;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int cont_afortunado = 0;
        int cont_noAfortunado = 0;
        int digito = 0;


        System.out.print("Introduzca un número: ");
        num = teclado.nextInt();

        int aux_num = num;

        while (num > 0) {
            digito = num % 10;

            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                cont_afortunado++;
            } else {
                cont_noAfortunado++;
            }

            num /= 10;

        }

        if (cont_noAfortunado < cont_afortunado) {
            System.out.println("El número " + aux_num + " es afortunado");
        } else {
            System.out.println("El número " + aux_num + " no es afortunado");
        }
    }
}