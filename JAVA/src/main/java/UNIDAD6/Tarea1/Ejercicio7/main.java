/*
En LINUX disponemos de un comando "more", al que se le pasa un fichero y lo muestra poco a poco (cada 24 líneas).
Implementar un programa que funcione de forma similar.
 */
package UNIDAD6.Tarea1.Ejercicio7;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner teclado=new Scanner(System.in);
        int cont=0;

        try{
            BufferedReader f = new BufferedReader(new FileReader("JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio7/fichero.txt"));
            String linea=f.readLine();
            while(linea!=null){
                System.out.println(linea);
                cont++;
                if (cont==24){
                    System.out.println();
                    System.out.println("Pulse intro para contar otros 24.");
                    teclado.nextLine();
                    System.out.println();
                    cont=0;
                }
                linea=f.readLine();
            }
            f.close();
        }catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
}