/*
Define la función convierteArrayEnString con la siguiente cabecera:
public static String convierteArrayEnString(int[] a)
Esta función toma como parámetro un array que contiene números y
devuelve una cadena de caracteres con esos números. Por ejemplo, si a
= { }, convierteArrayEnString(a) devuelve ""; si a = { 8 },
convierteArrayEnString(a) devuelve "8"; si a = { 6, 2, 5, 0, 1 },
convierteArrayEnString(a) devuelve "62501".

 */
package PlanRefuerzo_PrimerTrimestre;

public class Ejercicio17 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8}; // Creamos array de 8 numeros ya puestos dentro
        System.out.println("El array convertido a String es: " + convierteArrayEnString(a));
    }

    public static String convierteArrayEnString(int[] a) {
        String cadena = ""; // creamos string vacio
        for (int i = 0; i < a.length; i++) {
            String x = a[i] + ""; // la cadenas x la creamos para que contenga los numeros del array a
            cadena = cadena + x; // esto sera ""+numero a numero del array a
        }
        return cadena;
    }
}
