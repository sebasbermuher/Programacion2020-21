/*
Crear programa que pinte una flecha doble hacia la izquierda. Se pide al usuario la altura de la figura,
que debe ser un número impar mayor o igual que 3. La distancia entre cada flecha de asteriscos es siempre de 5
espacios. Si la altura introducida por el usuario no es un número impar mayor o igual que 3, el programa
debe mostrar un mensaje de error.

Ejemplo 1:
Introduce la altura de la flecha: 7
       *   *
      *   *
     *   *
    *   *
     *   *
      *   *
       *   *


Ejemplo 2:
Introduce la altura de la flecha: 3

      *   *
    *    *
      *   *

 */
package UNIDAD2.U2_Entregable_DeRepaso_2019_20;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        System.out.println("Introduzca la altura de la flecha (debe ser impar mayor o igual a 3)");
        altura = teclado.nextInt();

        if (altura%2!=0 && altura>=3){
            for (int f=1 ; f<=altura ; f++) {
                for (int c=1 ; c<=(altura+1)/2 ; c++) {
                    if (f+c == ((altura+1)/2)+1 || f-c == altura/2) {
                        System.out.print("*     *");
                    }else {
                        System.out.print(" ");
                    }
                }System.out.println("");
            }
        }else {
            while (altura%2==0 || altura<3){
            System.out.println("El numero introducido no es impar mayor o igual a 3. Vuelva a introducirlo");
            altura=teclado.nextInt();
            }
            for (int f=1 ; f<=altura ; f++) {
                for (int c=1 ; c<=(altura+1)/2 ; c++) {
                    if (f+c == ((altura+1)/2)+1 || f-c == altura/2) {
                        System.out.print("*     *");
                    }else {
                        System.out.print(" ");
                    }
                }System.out.println("");
            }
        }


    }
}