/*
Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto con todos los elementos que pertenezcan,
 al menos, a uno de los dos conjuntos. Su prototipo es:

Set union (Set conjunto1, Set conjunto2)
 */
package UNIDAD7.Tarea2.Ejercicio9;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio9 {
    static Set union (Set conjunto1, Set conjunto2){
        Set resultado=new HashSet(conjunto1);
        resultado.addAll(conjunto2);
        return resultado;
    }

    public static void main(String[] args) {
        Set <Integer> conjunto1=new HashSet<>();
        Set <Integer> conjunto2=new HashSet<>();

        for (int i = 1; i <= 6; i++) {
            conjunto1.add(i);
        }
        for (int i = 5; i <= 10; i++) {
            conjunto2.add(i);
        }
        System.out.println("El conjunto 1 es:");
        System.out.println(conjunto1);

        System.out.println("El conjuntos 2 es:");
        System.out.println(conjunto2);

        System.out.println("El conjunto de los dos es:");
        System.out.println(union(conjunto1,conjunto2));
    }
}