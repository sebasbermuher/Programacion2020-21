/*
Escribe un programa que diga si un número introducido por teclado es o no capicúa.
Los números capicúa se leen igual hacia delante y hacia atrás. El programa debe aceptar números de cualquier
longitud siempre que lo permita el tipo, en caso contrario el ejercicio no se dará por bueno.
Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 */
package U2_Entregable_DeRepaso_2019_20;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num, aux, aux2=0;

        System.out.println("Introduce un numero: ");
        num = teclado.nextLong();
        aux=num;

        while(num<0){
            System.out.println("Error. Introduce un numero entero positivo");
            num=teclado.nextInt();
        }

        while (num > 0) {
            aux2 = (aux2 * 10) + (num % 10);
            num = num/ 10;
        }



        if (aux2 == aux) {
            System.out.printf("El numero " + aux +" es capicua");
        } else {
            System.out.printf("El número "+ aux +" no es capicua");
        }
        System.out.println();
    }
}