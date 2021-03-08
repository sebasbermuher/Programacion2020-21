/*
Diseñar una aplicación que pida al usuario su nombre y edad. Estos datos deben guardarse en el fichero "datos.txt".
Si este fichero existe, debe borrarse su contenido, y en caso de no existir, debe crearse.
 */
package UNIDAD6.Tarea1.Ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce el nombre y la edad:");
        String nombre=teclado.nextLine();
        int edad=teclado.nextInt();

        try{
            BufferedWriter fichero = new BufferedWriter(new FileWriter("JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio2/datos.txt"));
            fichero.write("NOMBRE: "+nombre);
            fichero.newLine();
            fichero.write("EDAD: "+edad);
            fichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}