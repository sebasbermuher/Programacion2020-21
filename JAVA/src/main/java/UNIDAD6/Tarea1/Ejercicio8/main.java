/*
Disponemos de dos ficheros perso1.txt y perso2.txt con nombres de personas (ambos ordenados).
Realizar un programa que lea ambos ficheros y que cree un tercer fichero  (todos.txt) con todos los
nombres ordenados alfabéticamente.
 */
package UNIDAD6.Tarea1.Ejercicio8;

import java.io.*;

public class main {
    public static void main(String[] args) throws Exception{

        try{
            final String perso1="JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio8/perso1.txt";
            final String perso2="JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio8/perso2.txt";
            BufferedReader p1= new BufferedReader(new FileReader(perso1));
            BufferedReader p2= new BufferedReader(new FileReader(perso2));
            BufferedWriter todos= new BufferedWriter(new FileWriter("JAVA/src/main/java/UNIDAD6/Tarea1/Ejercicio8/todos.txt"));

            String nombre1=p1.readLine();
            String nombre2=p2.readLine();

            while(nombre1!=null && nombre2!=null){
                if (nombre1.compareToIgnoreCase(nombre2)<0){
                    todos.write(nombre1);
                    todos.newLine();
                    nombre1=p1.readLine();
                }else{
                    todos.write(nombre2);
                    todos.newLine();
                    nombre2=p2.readLine();
                }
            }

            if (nombre1==null){
                todos.write(nombre2);
                todos.newLine();
                nombre2=p2.readLine();
            }else{
                while(nombre1!=null){
                    todos.write(nombre1);
                    todos.newLine();
                    nombre1=p1.readLine();
                }
            }
            p1.close();
            p2.close();
            todos.close();

        } catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");;
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
}
