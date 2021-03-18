/*
Crea una clase llamada Traductor, que contenga un atributo llamado "diccionario" de tipo HashMap y se
comporte de esta forma:
Al crear el objeto Traductor, el atributo diccionario debe ser cargado con la información de un archivo de
texto cuyo nombre se le pasará por parámetro al constructor. Este archivo debe contener varias palabras en español
y su traducción al inglés, de tal forma que las palabras en español sean la clave, y las que estén en inglés,
el valor. Por ejemplo:
                             hola, hello
                             mundo, world
                             gracias, thanks
                             adios, bye
Crear un método que reciba una palabra o una frase, y devuelva la cadena traducida al inglés.
 */
package UNIDAD7.Tarea3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ejercicio4 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();

        try {
            BufferedReader fichero = new BufferedReader(new FileReader("JAVA/src/main/java/UNIDAD7/Tarea3/traductor.txt"));
            String linea = fichero.readLine();

            while (linea!=null){
                String[] palabras = linea.split(",");
                diccionario.put(palabras[0],palabras[1]);
                linea = fichero.readLine();
            }
            fichero.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(diccionario);
        System.out.println("hola mundo , adios mundo , gracias mundo");
        System.out.println(traductor("hola mundo , adios mundo , gracias mundo"));
    }

    private static String traductor(String frase){
        HashMap<String, String> diccionario = new HashMap<>();

        try {
            BufferedReader fichero = new BufferedReader(new FileReader("JAVA/src/main/java/UNIDAD7/Tarea3/traductor.txt"));
            String linea = fichero.readLine();

            while (linea!=null){
                String[] palabras = linea.split(",");
                diccionario.put(palabras[0],palabras[1]);
                linea = fichero.readLine();
            }

            fichero.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        String[] palabras2 = frase.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras2.length; i++) {
            if (diccionario.get(palabras2[i])!=null){
                resultado += diccionario.get(palabras2[i])+" ";
            } else {
                resultado += palabras2[i]+" ";
            }
        }
        return resultado;
    }

}