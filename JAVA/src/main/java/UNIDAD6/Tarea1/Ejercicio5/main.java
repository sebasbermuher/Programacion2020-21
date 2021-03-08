/*
En el archivo numeros.txt disponemos de una serie de números (uno por cada línea). Diseñar un programa que procese
el fichero y nos muestre el menor y el mayor.
*/
package UNIDAD6.Tarea1.Ejercicio5;

import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            BufferedReader fichero = new BufferedReader( new FileReader("JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio5/numeros.txt"));
            int num, mayor, menor;

            String cifra=fichero.readLine();
            num=Integer.valueOf(cifra);
            mayor=num; menor=num;
            while (cifra != null) {
                num=Integer.valueOf(cifra);
                if (num > mayor) {
                    mayor=num;
                } if (num< menor) {
                    menor=num;
                }
                cifra=fichero.readLine();
            }
            fichero.close();
            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El numero menor es: " + menor);
        } catch (EOFException eof) {
            System.out.println("Error de archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}