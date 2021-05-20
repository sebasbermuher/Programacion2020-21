/*
Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.

Ejemplo:
Entrada: cad = "Hola tu"
Salida: La cantidad de vocales es 3
 */
package U2_Examen_DeRepaso_2019_20;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        String cadena, letra;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una cadena de texto:");
        cadena = teclado.nextLine();

        for (int i = 0; i <= cadena.length() - 1; i++) {
            letra = cadena.substring(i, i + 1);

            if (letra.equalsIgnoreCase("a")
                    || letra.equalsIgnoreCase("e")
                    || letra.equalsIgnoreCase("i")
                    || letra.equalsIgnoreCase("o")
                    || letra.equalsIgnoreCase("u")) {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: " + contador);
    }
}