/*
Añada al programa anterior la siguiente funcionalidad. El programa pedirá al usuario un dni, calculará la clave
que ha de consultar, comprobará que dicha clave existe, y, en tal caso, mostrará el valor asociado a esa
clave en el HashMap.
 */
package UNIDAD7.Tarea3;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(generar_clave("27910508Y"),"Juanito");
        m.put(generar_clave("36170259L"),"Pepito");
        m.put(generar_clave("25974136P"),"Sebas");

        System.out.println(m);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un dni");
        String dni = teclado.nextLine();

        if (m.containsKey(generar_clave(dni))){
            System.out.println("La clave generada por el dni introducido está asociada a: " + m.get(generar_clave(dni)));
        }else {
            System.out.println("La clave generada por el dni introducido no existe");
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
