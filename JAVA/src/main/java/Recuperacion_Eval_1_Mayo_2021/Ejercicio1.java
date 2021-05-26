/*
Los comentarios en HTML se expresan de la siguiente manera <!-- Texto del comentario -->.

Diseñar un programa que solicite un texto HTML al usuario y elimina los comentarios del mismo.

Por ejemplo si el usuario inserta:

<html><head> <title> <head><body> <!--- Cuerpo --> <h1>Hola Mundo </h1><!-- Fin --> </body> </html>

Se mostrará por pantalla:

<html><head> <title> <head><body><h1>Hola Mundo </h1></body> </html>
 */
package Recuperacion_Eval_1_Mayo_2021;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto HTML:");
        String cadena=teclado.nextLine();

        System.out.println("Cadena: " + cadena);
//replaceAll reemplaza unos caracteres por otros, en este caso los deja vacio y los "elimina" del texto
        //elimina las etiquetas abrir <!-- y cerrar --> y todo lo que contenga entre estas dos
        System.out.println("Cadena modificada: " + cadena.replaceAll("<!--.*?>",""));

    }
}
