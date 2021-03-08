/*
En un fichero binario, sabemos que se ha guardado una serie de números double, pero no sabemos cuántos.
Implementar un programa que los lea todos y los muestre por pantalla.
 */
package UNIDAD6.Tarea2.Ejercicio6;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class main {
    public static void main(String[] args) {
        ObjectInputStream in=null;
        try {
            in=new ObjectInputStream(new FileInputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio4/datos.dat"));
            try{
                while (true) {
                    System.out.println(in.readDouble());
                }
            } catch (EOFException e) {
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if (in!=null) {
                    in.close();
                }
            } catch (IOException e) {
            }
        }
    }
}