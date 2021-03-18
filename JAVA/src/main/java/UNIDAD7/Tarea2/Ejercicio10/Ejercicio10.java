/*
Hacer lo mismo que en el ejercicio anterior con la intersección , formada por los elementos comunes a los
dos conjuntos. Su prototipo es:

Set interseccion (Set conjunto1, Set conjunto2)
 */
package UNIDAD7.Tarea2.Ejercicio10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio10 {
    static Set interseccion (Set conjunto1, Set conjunto2){
        Set interseccion=new HashSet();
        for (Iterator it= conjunto1.iterator();it.hasNext();){
            Object temp=it.next();
            if (conjunto2.contains(temp)){
                interseccion.add(temp);
            }
        }
        return interseccion;
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

        System.out.println("El conjunto 2 es:");
        System.out.println(conjunto2);

        System.out.println("Conjunto de interseccion:");
        System.out.println(interseccion(conjunto1,conjunto2));
    }
}