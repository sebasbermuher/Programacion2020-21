/*
Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor
nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Se recomienda
usar long en lugar de int ya que el primero admite números más largos. Suponemos que el
usuario introduce correctamente los datos.

Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número:3
Introduzca el nuevo dígito: 1
El número resultante es 401783
 */
package PlanRefuerzo_PrimerTrimestre;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entero positivo: ");
        String numero = teclado.nextLine();

        System.out.println("Introduzca la posición dentro del número: ");
        int posicion = teclado.nextInt();

        System.out.println("Introduzca el nuevo dígito: ");
        long digito = teclado.nextLong();

        // desde principio del numero hasta posicion-1
        String cadena1 = numero.substring(0, posicion - 1);
        // desde posicion hasta el final
        String cadena2 = numero.substring(posicion);
        // unimos las dos cadenas para tener el numero nuevo
        String nuevo_num = cadena1 + digito + cadena2;

        System.out.println("El número resultante es: " + nuevo_num);
    }
}