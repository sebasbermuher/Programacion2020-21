/*
Realiza un programa lea un número entero positivo de la pantalla y que lo pase a binario.
 */
package UNIDAD2.U2_Entregable_DeRepaso_2019_20;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        String aux = "";
        int numerito;


        do {
            System.out.println("Introduzca un numero entero positivo: ");
            num = teclado.nextInt();
            numerito = num;

            if (num < 0) {
                System.out.println("Error. El numero debe ser entero positivo. Vuelva a intentarlo");
            }

        } while (num < 0);

        while (num != 0) {
            if (num % 2 == 0) {
                aux = aux + "0";
            } else {
                aux = aux + "1";
            }
            num = num / 2;
        }


        if (num != 0) {
            for (int i = aux.length() - 1; i >= 0; i--) {
                aux.charAt(i);
            }
            System.out.println("El numero " + numerito + " en binario es: " + aux);

        }else {
            System.out.println("El numero " + numerito + " en binario es: 0");
        }
    }
}
