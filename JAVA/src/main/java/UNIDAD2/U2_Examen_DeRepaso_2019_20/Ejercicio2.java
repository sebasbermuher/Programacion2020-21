/*
Escribe un programa que permita partir un número introducido por teclado en dos partes.
Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos, es decir, el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en este ejercicio el uso de funciones
de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).

Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición a partir de la cual quiere partir el número: 5
Los números partidos son el 4067 y el 83.
 */
package UNIDAD2.U2_Examen_DeRepaso_2019_20;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        long i, j, num, num_copia;
        double nuevo_num = 0;
        int posicion, contador = 0, contador2 = 0;

        System.out.println("Por favor, introduzca un número entero positivo:");
        num = teclado.nextLong();

        System.out.println("Introduzca la posición a partir de la cual quiere partir el número:");
        posicion = teclado.nextInt();

        posicion--;
        num_copia = num;

        for (i = 1; num_copia > 0; i++) {
            num_copia = num_copia / 10;
            contador++;
        }
        // num_temp = num;
        for (i = 1; i <= (contador - posicion); i++) {
            num_copia = num % 10;
            num = num / 10;
            nuevo_num = (nuevo_num / 10) + num_copia;
            contador2++;
        }
        for (j = 1; j <= contador2 - 1; j++) {
            nuevo_num = nuevo_num * 10;
        }

        System.out.println("Los números partidos son el " + num + " y el " + (long) nuevo_num);
    }
}