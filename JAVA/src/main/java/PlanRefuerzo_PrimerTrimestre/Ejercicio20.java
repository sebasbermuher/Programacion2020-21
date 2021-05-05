/*
Crea las funciones cuyas cabeceras se muestran a continuación, observa
que tienen el mismo nombre:
public static int ocurrencias(int digito, int n)
public static int ocurrencias(int digito, int[] a)
La función ocurrencias devuelve el número de veces que aparece un
dígito dentro de un número (primera función) o bien el número de veces
que aparece un dígito en una serie de números contenidos en un array
(segunda función).
Ejemplos:
ocurrencias(8, 4672) devuelve 0
ocurrencias(5, 25153) devuelve 2
ocurrencias(2, 123456) devuelve 1
Si a = {714, 81, 9, 11}, ocurrencias(1, a) devuelve 4
Si a = {42, 13, 12345, 4}, ocurrencias(4, a) devuelve 3
Si a = {6, 66, 666}, ocurrencias(6, a) devuelve 6
Utiliza estas funciones en un programa para comprobar que funcionan
bien.
 */
package PlanRefuerzo_PrimerTrimestre;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("FUNCION 1");
        System.out.println("Introduce un numero");
        int numero=teclado.nextInt();
        System.out.println("Introduce el digito que desea encontrar");
        int digito=teclado.nextInt();
        System.out.println("El digito "+digito+" aparece "+ocurrencias(digito,numero)+" veces.");

        System.out.println();

        System.out.println("FUNCION 2");
        System.out.println("Introduce el tamaño del array");
        int tamano=teclado.nextInt();

        int[] matriz=new int[tamano];
        System.out.println("Introduce los numeros del array");
        for (int i = 0; i < tamano; i++) {
            matriz[i]=teclado.nextInt();
        }
        System.out.println("Introcuce el digito que desea encontrar");
        digito=teclado.nextInt();

        System.out.println("El digito "+digito+" aparece "+ocurrencias(digito,matriz)+" veces.");
    }

    //Devuelve el número de veces que aparece un dígito dentro de un número (primera función)
    public static int ocurrencias(int digito, int n){
        int veces=0;

        while(n>0){
            if(n%10==digito){
                veces++; //cada vez que encuentre el digito suma 1 el contador.
            }
            //quita la ultima cifra de n
            n/=10;
        }
        return veces;
    }

    //Devuelve el número de veces que aparece un dígito en una serie de números contenidos en un array (segunda función)
    public static int ocurrencias(int digito, int[] a){
        int contador=0;
        for (int i = 0; i < a.length; i++) {
             contador+=ocurrencias(digito,a[i]);
        }
        return contador;
    }
}
