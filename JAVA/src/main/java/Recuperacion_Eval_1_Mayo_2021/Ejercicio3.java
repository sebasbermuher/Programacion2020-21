package Recuperacion_Eval_1_Mayo_2021;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la altura de la primera piramide: ");
        int altura1 = teclado.nextInt();

        System.out.println("Introduzca la altura de la segunda piramide: ");
        int altura2 = teclado.nextInt();

        int alturaMaxima = Math.max(altura1, altura2); //altura maxima entre las dos piramide
        int espaciosPiramide1 = altura1 - 1;
        int espaciosPiramide2 = altura2 - 1;
        int basePiramide1 = altura1 * 2 - 1;
        int basePiramide2 = altura2 * 2 - 1;
        int asteriscos1 = 1;
        int asteriscos2 = 1;

        for (int i = alturaMaxima; i > 0; i--) {

            // construccion de la primera piramide
            if (i > altura1) {
                // pinta el hueco si la piramide queda por debajo de la otra
                for (int j = 0; j <= basePiramide1; j++) {
                    System.out.print(" ");
                }
            } else {
                // rellena los espacios de delante de la piramide
                for (int j = 0; j < espaciosPiramide1; j++) {
                    System.out.print(" ");
                }
                // dibuja la piramide 1
                for (int j = 0; j < asteriscos1; j++) {
                    System.out.print("*");
                }
                // rellena los espacio por detras de la piramide
                for (int j = 0; j <= espaciosPiramide1; j++) {
                    System.out.print(" ");
                }

                espaciosPiramide1--;
                asteriscos1 += 2;
            }

            // construccion de la segunda piramide
            if (i > altura2) {
                // pinta el hueco si la piramide queda por debajo de la otra
                for (int j = 0; j < basePiramide2; j++) {
                    System.out.print(" ");
                }
            } else {
                // espacio entre la piramide 1 y la piramide 2
                for (int j = 0; j < espaciosPiramide2; j++) {
                    System.out.print(" ");
                }
                // dibuja la piramide 2
                for (int j = 0; j < asteriscos2; j++) {
                    System.out.print("*");
                }

                espaciosPiramide2--;
                asteriscos2 += 2;
            }
            System.out.println();
        }
    }
}