/*
Crear un programa que duplique el contenido de un fichero. Realizar dos versiones:
  --Pedir el nombre del fichero fuente y duplicarlo en un fichero con el mismo nombre con el prefijo "copia_de".
 */
package UNIDAD6.Tarea1.Ejercicio3;



import java.io.*;
import java.util.Scanner;

public class dos {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Fichero fuente: ");
        String fuente = teclado.nextLine();
        String destino = nombreFichero(fuente);

        try {
            BufferedReader f1 = new BufferedReader(new FileReader(fuente));
            BufferedWriter f2 = new BufferedWriter(new FileWriter(destino));

            int c = f1.read();
            while (c != -1) {
                f2.write(c);
                c=f1.read();
            }
            f1.close();
            f2.close();
        } catch (EOFException | FileNotFoundException eof) {
            System.out.println("Error de fichero");
        }
    }

    static String nombreFichero(String nombre) {
        String newNombre;

        int pos=nombre.lastIndexOf('/');
        if (pos==-1) {
            newNombre="copia_de_"+nombre;
        } else {
            newNombre=nombre.substring(0, pos+1) + "copia_de_" + nombre.substring(pos+1);
        }
        return newNombre;
    }
}
