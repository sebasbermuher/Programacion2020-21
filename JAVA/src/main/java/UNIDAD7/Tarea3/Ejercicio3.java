/*
Recorre el Map anterior, extrayendo cada pareja clave-valor, y mostrándolas, de tal forma que se escriban
los datos así:
La clave 37 está asociada al nombre "Pedro Gonzalez Jimenez".
La clave ... está asociada al nombre ....
 */
package UNIDAD7.Tarea3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(generar_clave("27910508Y"), "Juanito");
        m.put(generar_clave("36170259L"), "Pepito");
        m.put(generar_clave("25974136P"), "Sebas");

        System.out.println(m);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un dni");
        String dni = teclado.nextLine();

        if (m.containsKey(generar_clave(dni))) {
            System.out.println("La clave generada por el dni introducido está asociada a: " + m.get(generar_clave(dni)));
        } else {
            System.out.println("La clave generada por el dni introducido no existe");
        }

        System.out.println();

        Set<Map.Entry<Integer, String>> e1 = m.entrySet();
        for (Map.Entry<Integer, String> entrada : e1) {
            System.out.println("La clave " + entrada.getKey() + " esta asociada al nombre " + entrada.getValue());
        }
    }

    public static Integer generar_clave(String dni) {
        Integer resultado = 0;

        for (int i = 0; i < dni.length()-1; i++) {
            resultado += Integer.parseInt(Character.toString(dni.charAt(i)));
        }
        return resultado;
    }
}
