/*
Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus compañeros.
La clave ha de calcularse mediante un método que reciba un String que represente el dni, y devuelva la suma
de sus dígitos.

46221877D -> 4+6+2+2+1+8+7+7=37

Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.
 */
package UNIDAD7.Tarea3;

import java.util.HashMap;

public class Ejercicio1 {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(generar_clave("27910508Y"),"Juanito");
        m.put(generar_clave("36170259L"),"Pepito");
        m.put(generar_clave("25974136P"),"Sebas");

        System.out.println(m);
    }

    public static Integer generar_clave(String dni) {
        Integer resultado = 0;

       for (int i = 0; i < dni.length()-1; i++) {
            resultado += Integer.parseInt(Character.toString(dni.charAt(i)));
        }
        return resultado;
    }
}