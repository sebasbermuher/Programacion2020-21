/*
Crear una tabla de números aleatorios menores que 100, ordenados de menor a mayor, y guardarlos en un fichero binario.
A continuación, recuperarlos y mostrarlos por consola.
 */
package UNIDAD6.Tarea2.Ejercicio8;

import java.io.*;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ObjectInputStream in=null;
        ObjectOutputStream out=null;
        int tabla[] = new int[15];

        try {
            for (int i = 0; i < tabla.length; i++) {
                tabla[i]=(int) (Math.random() *100);
            }
            out=new ObjectOutputStream((new FileOutputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio8/numerosAleatorios.dat")));
            Arrays.sort(tabla);
            out.writeObject(tabla);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (out!=null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        try {
            in=new ObjectInputStream(new FileInputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio8/numerosAleatorios.dat"));
            try {
                tabla = (int[]) in.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(Arrays.toString(tabla));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in!=null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}