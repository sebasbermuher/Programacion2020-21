/*
Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por pantalla las
palabras que estén repetidas. A continuación, mostrar las que no lo estén.
 */
package UNIDAD7.Tarea1.Ejercicio4;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase=teclado.nextLine();

        String palabras[]=frase.split(" ");
        List<String> listaPalabras= new ArrayList<>();

        for (String p:palabras) {
            listaPalabras.add(p);
        }

        Set<String> palabrasrepe=new LinkedHashSet<>();
        List<String> sinrepetir=new ArrayList<>(listaPalabras);

        while(sinrepetir.size()>0){
            String temp=sinrepetir.remove(0);
            if (sinrepetir.contains(temp)){
                palabrasrepe.add(temp);
            }
        }
        System.out.println("Estas son las palabras repetidas:");
        System.out.println(palabrasrepe);

        sinrepetir=new ArrayList<>(listaPalabras);
        sinrepetir.removeAll(palabrasrepe);

        System.out.println("Estas son las palabras sin repetir:");
        System.out.println(sinrepetir);
    }
}