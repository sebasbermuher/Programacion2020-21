/*
Pedir números enteros positivos por consola y guardarlos en un fichero binario hasta que se introduzca un número negativo.
Leer del fichero todos los enteros guardados y mostrarlos por pantalla.
 */
package UNIDAD6.Tarea2.Ejercicio3;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        int contador=0;

        try {
            out=new ObjectOutputStream((new FileOutputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio3/datos.dat")));
            System.out.println("Introducir un numero entero: ");
            int num = teclado.nextInt();
            while (num>=0) {
                contador++;
                out.writeInt(num);
                num=teclado.nextInt();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
            }
        }
        try {
            in=new ObjectInputStream(new FileInputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio3/datos.dat"));
            System.out.println();
            System.out.println("Los numeros introducidos y almacenados en datos.dat son:");
            for (int i=0;i<contador;i++) {
                int num=in.readInt();
                System.out.println(num);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in!=null) {
                    in.close();
                }
            } catch (IOException e) {
            }
        }
    }
}