/*
Escribe un programa que pinte por pantalla la letra V. El ancho del palo de la V es siempre de 3
asteriscos. El usuario debe introducir la altura. La altura mínima es de 3 pisos. Si el usuario introduce una
altura menor, el programa debe mostrar un mensaje de error.
 */
package Recu_Eval_1_Junio_2019_20;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura_ingresada;

        System.out.println("Introduzca la altura de la V (un numero mayor o igual a 3): ");
        altura_ingresada=teclado.nextInt();


        int altura = 0;
        int i = 0;
        int espacios_internos = altura_ingresada * 2 - 1;
        int espacios_delantes = 0;

        if(altura_ingresada < 3){
            System.out.println("La altura debe ser mayor o igual a 3");;
        } else {
            while(altura < altura_ingresada){
                for(i = 1; i <= espacios_delantes; i++){
                    System.out.print(" ");
                }
                System.out.print("***");
                for(i = 1; i < espacios_internos; i++){
                    System.out.print(" ");
                }
                System.out.println("***");

                altura++;
                espacios_delantes++;
                espacios_internos-=2;
            }
        }
    }
}
