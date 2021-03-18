/*
Diseñar un método que devuelva la diferencia de dos conjuntos (elementos que pertenecen al primero, pero no al segundo)
Con el prototipo:
Set diferencia (Set conjunto1, Set conjunto2)
 */
package UNIDAD7.Tarea2.Ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio11 {
    static Set diferencia(Set conjunto1,Set conjunto2){
        Set resultado = new HashSet(conjunto1);
        resultado.removeAll(conjunto2);
        return resultado;
    }

    public static void main(String[] args) {
        Set<Integer> conjunto1=new HashSet<>();
        Set<Integer> conjunto2=new HashSet<>();

        for (int i = 1; i <= 6 ; i++) {
            conjunto1.add(i);
        }
        for (int i = 4; i <= 9; i++) {
            conjunto2.add(i);
        }
        System.out.println("El conjunto 1 es:");
        System.out.println(conjunto1);
        System.out.println("El conjunto 2 es:");
        System.out.println(conjunto2);
        System.out.println("Diferencia:"+diferencia(conjunto1,conjunto2));
    }
}
