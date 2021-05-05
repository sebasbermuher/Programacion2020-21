/*
Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos
pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int
donde sea necesario para admitir números largos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22

Ejemplo 2:
Por favor, introduzca un número entero positivo: 31779
Dígitos pares:
Suma de los dígitos pares: 0

Ejemplo 3:
Por favor, introduzca un número entero positivo: 2404
Dígitos pares: 2 4 0 4
Suma de los dígitos pares: 10
 */
package PlanRefuerzo_PrimerTrimestre;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = teclado.nextLong();

        // Le da la vueta al número y calcula la longitud
        long num_nuevo = num;
        long volteado = 0;
        int longitud = 0;

        if (num_nuevo == 0) {
            longitud = 1;
        }

        while (num_nuevo > 0) {
            volteado = (volteado * 10) + (num_nuevo % 10);
            num_nuevo /= 10;
            longitud++;
        }

        // Muestra los dígitos pares
        System.out.print("Dígitos pares: ");
        int digito;
        int sumaPares = 0;

        for (int i = 0; i < longitud; i++) {
            digito = (int)(volteado % 10);
            if ((digito % 2) == 0) {
                System.out.print(digito + " ");
                sumaPares += digito;
            }
            volteado /= 10;
        }
        System.out.println();

        // Muestra la suma de los dígitos pares
        System.out.println("Suma de los dígitos pares: " + sumaPares);
    }
}