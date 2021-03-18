/*
Implementar la función leeCadena con el siguiente prototipo:

List<Character>leeCadena()

Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.
 */
package UNIDAD7.Tarea2.Ejercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    static List<Character> leecadena(){
        Scanner teclado=new Scanner(System.in);

        List<Character>cadena=new ArrayList<>();

        System.out.println("Introduce una frase: ");
        String frase=teclado.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            cadena.add(frase.charAt(i));
        }
        return cadena;
    }

    public static void main(String[] args) {
        List<Character>lista=leecadena();
        System.out.println(lista);
    }
}