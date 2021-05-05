/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y
que haga lo que se especifica en los comentarios (puedes incluirla en
tu propia biblioteca de rutinas):
public static int[] filtraPrimos(int x[])
// Devuelve un array con todos los números primos que se encuentren
// en otro array que se pasa como parámetro. Obviamente el tamaño
// del array que se devuelve será menor o igual al que se pasa como
// parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien.
Para que el ejercicio resulte más fácil, las repeticiones de primos se
conservan; es decir, si en el array x el número 13 se repite 3 veces,
en el array devuelto también estará repetido 3 veces. Si no existe
ningún número primo en x, se devuelve un array con el número -1 como
único elemento.

 */
package PlanRefuerzo_PrimerTrimestre;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la longitud del array");
        int longitud_array=teclado.nextInt();

        int array[]=new int [longitud_array];

        for (int i=0;i<longitud_array;i++){
            array[i]=teclado.nextInt();
        }

        filtraprimos(array);
    }

    public static void filtraprimos(int array[]) {
        int primos[]=new int [100];
        int m=0;

        for (int j=0;j<array.length;j++) {
            int numero=array[j];
            int cont = 1;
            boolean s = false;

            for (int i = 1; i <= numero; i++) {
                cont = cont + 1;
                if (cont >= numero)
                    cont = numero - 1;
                if (numero==1){
                    continue;
                }
                if (s == false) {
                    if (numero % cont == 0) {
                        s = true;
                    } else {
                        s = false;
                    }
                }
            }

            if (s == false) {
                primos[m]=array[j];
                m=m+1;
                continue;
            }
        }
        int y;
        for (y=0;y<=m-1;y++){
            System.out.println((y+1)+"."+" "+primos[y]);
        }
    }
}
