/*
 Un libro de firmas es útil para recoger todas las personas que han pasado por un determinado lugar.
 Crear una aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre (comprobando que no
 se encuentre repetido). Llamaremos al fichero firmas.txt.
 */
package UNIDAD6.Tarea1.Ejercicio6;
import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        System.out.println("¿Que deseas hacer?");
        System.out.println("1. Mostrar libro de firmas");
        System.out.println("2. Añadir nombres:");
        int eleccion=teclado.nextInt();
        teclado.nextLine();

        switch (eleccion){
            case 1:
                verLibro();
                break;
            case 2:
                System.out.println("Introduce el nombre para añadir al libro de firmas: ");
                String nombre=teclado.nextLine();
                insertarNombre(nombre);
                break;
        }
    }

    static void insertarNombre(String nuevo) throws IOException{
        try {
            final String defecto="JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio6/firmas.txt";
            BufferedReader f = new BufferedReader(new FileReader(defecto));
            String nombre=f.readLine();
            boolean encontrado=false;

            while(nombre!=null && encontrado==false){
                if (nombre.equals(nuevo)){
                    encontrado=true;
                }
                nombre=f.readLine();
            }
            f.close();

            if (encontrado==false){
                BufferedWriter w = new BufferedWriter(new FileWriter(defecto,true));
                w.newLine();
                w.write(nuevo);
                System.out.println("Se ha insertado un nuevo nombre.");
                w.close();
            } else{
                System.out.println("Ya ha firmado anteriormente.");
            }

        } catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");;
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
    static void verLibro() throws IOException {
        try {
            final String defecto="JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio6/firmas.txt";
            BufferedReader f = new BufferedReader(new FileReader(defecto));
            String linea = f.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = f.readLine();
            }
            f.close();

        } catch (EOFException e) {
            System.out.println("No se puede abrir el archivo");
        }catch (FileNotFoundException e){
            System.out.println("No se encontró el fichero");
        }
    }
}