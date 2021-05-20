/*
Escribe un programa que pinte por pantalla un par de calcetines, de los que se ponen al lado del árbol de Navidad
para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una altura mayor o igual a 4.
Observa que la talla de los calcetines y la distanciaque hay entre ellos (dos espacios) no cambia, lo único
que varía es la altura.

Ejemplo 1:
Introduzca la altura de los calcetines: 6

***      ***
***      ***
***      ***
***      ***
******  ******
******  ******


Ejemplo 2:
Introduzca la altura de los calcetines: 4


***      ***
***      ***
******  ******
******  ******


 */
package U2_Entregable_DeRepaso_2020_21;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;

        System.out.println("Introduce la altura. Debe de ser mayor o igual a 4");
        altura = teclado.nextInt();

        while(altura<4){
            System.out.println("Altura incorrecta, introduce una altura mayor o igual a 4");
            altura=teclado.nextInt();
        }

        for (int i = 0; i<altura;i++){
            if(i<altura-2){
                System.out.print("***     ***");
            }else{
                System.out.print("******  ******");
            }
            System.out.println("");
        }
    }
}