/*
Implementa una función con nombre nEsimo que busque el número que hay
dentro de un array bidimensional en la posición n-ésima contando de
izquierda a derecha y de arriba abajo, como si se estuviera leyendo.
El primer elemento es el 0. Si la posición donde se busca no existe en
el array, la función debe devolver -1. Se debe entregar tanto el
código de la función como el código de prueba que la usa. La cabecera
de la función es la siguiente:
public static int nEsimo(int[][] n, int posicion)
Si el array a es el que se muestra a continuación:
35 72 24 45 42 60
32 42 64 23 41 39
98 45 94 11 18 48
12 34 56 78 90 12
nEsimo(a, 0) devuelve 35
nEsimo(a, 2) devuelve 24
nEsimo(a, 5) devuelve 60
nEsimo(a, 6) devuelve 32
nEsimo(a, 21) devuelve 78
nEsimo(a, 23) devuelve 12
nEsimo(a, 24) devuelve -1
nEsimo(a, 100) devuelve -1
 */
package PlanRefuerzo_PrimerTrimestre;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int[][] arrayBid=new int[4][6];//4 filas y 6 columnas

        //el array se rellena de forma aleatoria de 1 a 100
        for (int i = 0; i <arrayBid.length ; i++) {
            for (int j = 0; j < arrayBid[i].length; j++) {
                arrayBid[i][j]= (int) (Math.random()*(100)+1);
                System.out.print(arrayBid[i][j]+" ");
            }
            System.out.println();
        }

        int total=(arrayBid.length*arrayBid[0].length)-1;

        System.out.println("Introduce la posicion (desde 0 hasta "+total+")");
        int posicion=teclado.nextInt();

        if(nEsimo(arrayBid,posicion)==-1){
            System.out.println("Esa posicion no está en el array -> -1");
        }else{
            System.out.println("En la posición "+posicion+" está el numero -> "+nEsimo(arrayBid,posicion));
        }

    }


    public static int nEsimo(int[][] n, int posicion){
        int res=0,cont=0;
        boolean existeResultado=false;
        for (int i = 0; i < n.length; i++) { //4 filas
            for (int j = 0; j <n[i].length ; j++) { //6 columnas
                if(cont==posicion){
                    res=n[i][j];
                    existeResultado = true;
                }
                cont++;
            }
        }

        //Si no existe ese resultado (posicion) devuelve -1
        if(!existeResultado){
            res=-1;
        }

        return res;
    }

}
