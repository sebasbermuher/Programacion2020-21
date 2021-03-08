/*
Implementar una función a la que se le pase una lista de nombres y devuelva una copia sin elementos repetidos
(sin modificar la original), con el prototipo:

List eliminaRepetidos (List c)
 */
package UNIDAD7.Tarea1.Ejercicio8;

import java.util.*;

public class Ejercicio8 {
    static List eliminaRepetidos(List c){
        Set temp=new LinkedHashSet(c);
        return new ArrayList(temp);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        System.out.println("Introduce un nombre. Para terminar escriba (fin): ");
        String nombre=teclado.nextLine();

        while(!nombre.equalsIgnoreCase("fin")){
            lista.add(nombre);
            System.out.println("Introduce un nombre. Para terminar escriba (fin): ");
            nombre=teclado.nextLine();
        }
        System.out.println("Lista con nombres repetidos:");
        System.out.println(lista);

        System.out.println("Lista sin nombres repetidos:");
        lista=eliminaRepetidos(lista);
        System.out.println(lista);
    }
}