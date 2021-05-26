/*
Escribir un programa que solicita al usuario una base y un número determinado y nos diga a qué número
(exponente) hay que elevar esa base para obtener el número.
En caso de que no sea un potencia exacta mostrará “No es una potencia exacta".
Se solicitará de forma continua la base y el número hasta que la base sea 0.
El cálculo del exponente se realizará en una función aparte, calculaExponente, que devolverá -1 si no el número no es una potencia de la base. El número y tipo de los parámetros debes decidirlo tú.

Ejemplo:

Introduce base: 2
Introduce número: 16
Resultado:
2 elevado a 4 es 16. El exponente es 4.

Introduce base: 2
Introduce número 15.
Resultado:
15 no es una potencia de 2

Introduce base: 5
Introduce número: 625
Resultado:
5 elevado a 4 es 625. El exponente es 4.
 */
package Recuperacion_Eval_1_Mayo_2021;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce base:");
        int base = teclado.nextInt(); //2

        System.out.println("introduce numero:");
        int numero = teclado.nextInt(); //16



    }
}
