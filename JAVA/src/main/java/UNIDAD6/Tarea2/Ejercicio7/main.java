/*
 Escribir por teclado una frase y guardarla en un archivo binario.
 A continuación, recuperala del archivo y mostrarla por pantalla.
 */
package UNIDAD6.Tarea2.Ejercicio7;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner teclado =new Scanner(System.in);
        ObjectOutputStream out=null;
        ObjectInputStream in=null;

        try{
            System.out.println("Escribe una frase: ");
            String frase=teclado.nextLine();
            System.out.println("/// LECTURA DEL ARCHIVO BINARIO ///");
            out=new ObjectOutputStream((new FileOutputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio7/frase.dat")));
            out.writeObject(frase);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out!=null) {
                    out.close();
                }
            } catch (IOException e) {
            }
        }
        try {
            in=new ObjectInputStream(new FileInputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio7/frase.dat"));
            System.out.println((String) in.readObject());
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