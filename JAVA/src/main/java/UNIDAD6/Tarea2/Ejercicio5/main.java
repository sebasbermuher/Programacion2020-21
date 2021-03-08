/*
Leer de un fichero binario una tabla de números double. Mostrar el contenido de la tabla por consola.
(del ejercicio anterior)
 */
package UNIDAD6.Tarea2.Ejercicio5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class  main {
    public static void main(String[] args) throws ClassNotFoundException {
        ObjectInputStream in = null;

        try {
            in=new ObjectInputStream(new FileInputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio4/datos.dat"));
            double tabla[]=(double[]) in.readObject();
            System.out.println(Arrays.toString(tabla));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in!=null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}