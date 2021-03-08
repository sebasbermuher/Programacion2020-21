/*
Pedir un double por consola y guardarlo en un archivo binario.
 */
package UNIDAD6.Tarea2.Ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio1/prueba.dat"));
            System.out.println("Introducir un numero double: ");
            double num =teclado.nextDouble();

            out.writeDouble(num);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out!=null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}