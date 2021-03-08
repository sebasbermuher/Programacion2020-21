/*
Realizar un programa que solicite al usuario el nombre de un fichero de texto y muestre su contenido en pantalla.
Si no se proporciona ningún nombre de fichero, la aplicación utilizará por defecto "prueba.txt".
 */
package UNIDAD6.Tarea1.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String defecto="JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio1/prueba.txt";

        System.out.println("Escribe el nombre del fichero. Por defecto es prueba.txt");
        String fichero=teclado.nextLine();

        if (fichero.isEmpty()) {
            fichero=defecto;
        }
        try {
            BufferedReader f = new BufferedReader(new FileReader(fichero));
            int x = f.read();
            while (x != -1) {
                System.out.println((char) x);
                x=f.read();
            }
            f.close();
        } catch (EOFException eof) {
            System.out.println("El fichero no se pudo abrir");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}