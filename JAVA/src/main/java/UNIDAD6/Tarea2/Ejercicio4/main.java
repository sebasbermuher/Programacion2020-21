/*
Pedir un entero n por consola. A continuación, pedir n números double, que iremos guardando en una tabla.
Guardar la tabla en un archivo binario.
 */
package UNIDAD6.Tarea2.Ejercicio4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        ObjectOutputStream out=null;

        try {
            System.out.println("Introduce un numero: ");
            int n=teclado.nextInt();

            double tabla[]=new double[n];
            out=new ObjectOutputStream(new FileOutputStream("JAVA/src/main/java/UNIDAD6/Tarea2/Ejercicio4/datos.dat"));
            for (int i = 0; i < tabla.length; i++) {
                System.out.println("Introduce un numero double");
                tabla[i]=teclado.nextDouble();
            }
            out.writeObject(tabla);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out!=null) {
                    out.close();
                }
            } catch (IOException e){
            }
        }
    }
}