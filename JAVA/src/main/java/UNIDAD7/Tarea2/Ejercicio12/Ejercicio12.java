/*
Escribir el método incluido(), que devuelve true si todos los elementos del primer conjunto pertenecen al segundo y
false si hay algún elemento del primero que no pertenezca al segundo. Su prototipo es:

boolean incluido(Set conjunto1, Set conjunto2)
 */
package UNIDAD7.Tarea2.Ejercicio12;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio12 {
    static boolean incluido(Set conjunto1, Set conjunto2){

        return conjunto2.containsAll(conjunto1);
    }

    public static void main(String[] args) {
        Set<Integer> conjunto1=new HashSet<>();
        Set<Integer> conjunto2=new HashSet<>();

        for (int i = 1; i <= 10 ; i++) {
            conjunto1.add(i);
        }
        for (int i = 5; i <= 10; i++) {
            conjunto2.add(i);
        }
        System.out.println("El conjunto 1 es:");
        System.out.println(conjunto1);

        System.out.println("El conjunto 2 es:");
        System.out.println(conjunto2);

        System.out.println("¿Todos los numeros del conjunto1 estan en el conjunto2?");
        System.out.println(incluido(conjunto1,conjunto2));

        System.out.println("¿Todos los numeros del conjunto2 estan en el conjunto1?");
        System.out.println(incluido(conjunto2,conjunto1));
    }
}
