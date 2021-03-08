/*
Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por pantalla
 */
package UNIDAD6.Tarea2.Ejercicio2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class main {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio1/prueba.dat"));
            double num = in.readDouble();
            System.out.println("El numero double del ejercicio anterior es: " + num);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in!=null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}