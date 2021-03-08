/*
Crear un programa que duplique el contenido de un fichero. Realizar dos versiones:
  --Duplicaremos el fichero original.txt en uno que se llame copia.txt
 */
package UNIDAD6.Tarea1.Ejercicio3;

import java.io.*;

public class uno {
    public static void main(String[] args) {
        try{
            BufferedReader f1 = new BufferedReader(new FileReader("JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio3/original.txt"));
            BufferedWriter f2 = new BufferedWriter(new FileWriter("JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio3/copia.txt"));

            int c = f1.read();
            while (c != -1) {
                f2.write(c);
                c=f1.read();
            }
            f1.close();f2.close();

        } catch (EOFException eof) {
            System.out.println("Error de fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}