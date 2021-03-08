/*Realizar un programa que lea un fichero de texto llamado carta.txt, tenemos que contar los caracteres,
las líneas y las palabras. Para facilitar el procesamiento supondremos que cada palabra está separada de otra
por un único espacio en blanco.*/

package UNIDAD6.Tarea1.Ejercicio4;

import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            BufferedReader f = new BufferedReader(new FileReader("JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio4/carta.txt"));
            int conCaracter=0, conPalabra=0, conLinea=0;
            int c= f.read();

            while (c != -1) {
                if ((char) c==' ') {
                    conCaracter++;
                    conPalabra++;
                } else if ((char) c=='\n') {
                    conPalabra++;
                    conLinea++;
                } else {
                    conCaracter++;
                }
                c = f.read();
            }
            f.close();

            if (conPalabra>0) {
                conPalabra++;
            }
            if (conLinea>=0) {
                conLinea++;
            }

            System.out.println("Hay " + conCaracter + " caracteres, " + conPalabra + " palabras y " + conLinea + " lineas.");

        } catch (EOFException ef) {
            System.out.println("Error de archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}