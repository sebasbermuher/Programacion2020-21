/*
Realizar un programa que dado un número que se solicita la usuario por consola eliminará de ese número de
ese número todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado.
Deberá solicitar el número mientras que el número introducido no sea positivo.

Ejemplo 1:
Introduzca un número entero positivo: 34084091
Número resultado: 34491
Dígitos eliminados: 3

Ejemplo 2:
Introduzca un número entero positivo: 84123
Número resultado: 4123
Dígitos eliminados: 1
NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS
 */
package U2_Entregable_DeRepaso_2020_21;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        long numero, auxiliar=0;
        int contador=0;

        do{
            System.out.println("Introduzca un número entero positivo: ");
            numero = teclado.nextLong();

            if(numero<0){
                System.out.println("Error, el numero debe ser entero positivo.");
            }
        }

        while(numero<0);

        do{
            if(numero%10==0 || numero%10==8){
                numero=numero/10;
                contador++;
            }else{
                auxiliar=(auxiliar*10)+(numero%10);
                numero=numero/10;
            }
        }while(numero>0);

        while(auxiliar>0){
            numero=(numero*10)+(auxiliar%10);
            auxiliar=auxiliar/10;
        }

        System.out.println("Número resultado: "+numero);
        System.out.println("Dígitos eliminados: "+contador);

    }
}