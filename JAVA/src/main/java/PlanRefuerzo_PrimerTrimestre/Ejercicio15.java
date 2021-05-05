/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y
que haga lo que se especifica en los comentarios (puedes incluirla en
tu propia biblioteca de rutinas):
public int[] filtraCapicuas(int x[])
// Devuelve un array con todos los números capicúa que se encuentren
// en otro array que se pasa como parámetro. Obviamente el tamaño del
// array que se devuelve será menor o igual al que se pasa como
//parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien.
Para que el ejercicio resulte más fácil, las repeticiones de números
capicúa se conservan; es decir, si en el array x el número 505 se
repite 3 veces, en el array devuelto también estará repetido 3 veces.
Si no existe ningún número capicúa en x, se devuelve un array con el
número -1 como único elemento.
 */
package PlanRefuerzo_PrimerTrimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int long_array=teclado.nextInt();
        int[] array=new int[long_array];
        System.out.println("Introduce los numeros del array");
        for (int i = 0; i < array.length; i++) {
            array[i]=teclado.nextInt();
        }
        System.out.println("Los numeros capicuas son:"+ Arrays.toString(filtraCapicuas(array)));
    }


    public static int[] filtraCapicuas(int x[]){
        int[] capicuasConCeros=new int[x.length];
        boolean esCapicua=false;
        int contadorCapicuas=0;
        //recorro el array que me pasan por parametro y busco si hay algun elemento capicua.
        for (int i = 0; i <x.length ; i++) {
            if(Ejercicio11.esCapicua(x[i])){
                esCapicua=true;
                //relleno array con capicuas
                capicuasConCeros[contadorCapicuas]=x[i];
                contadorCapicuas++;
            }
        }
        int[] capicuasSinCeros=new int[contadorCapicuas];
        for (int i = 0; i <capicuasSinCeros.length ; i++) {
            capicuasSinCeros[i]=capicuasConCeros[i];
        }

        return capicuasSinCeros;
    }
}
