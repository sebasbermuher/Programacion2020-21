/*
Realiza un programa que rellene un array con 10 números aleatorios
comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por
pantalla. A continuación, el programa indicará para cada uno de ellos
si es un número primo y/o un capicúa de la forma que muestra el
ejemplo.
Ejemplos:
Array generado:
19 22 57 11 3 52 32 46 2 14
El 19 es primo y no es capicúa.
El 22 no es primo y es capicúa.
El 57 no es primo y no es capicúa.
El 11 es primo y es capicúa.
El 3 es primo y es capicúa.
El 52 no es primo y no es capicúa.
El 32 no es primo y no es capicúa.
El 46 no es primo y no es capicúa.
El 2 es primo y es capicúa.
14 no es primo y no es capicúa.
 */
package PlanRefuerzo_PrimerTrimestre;

public class Ejercicio18 {
    public static void main(String[] args) {
        int [] array=new int[10];
        boolean esPrimo=true;
        boolean esCapicua=false;

        for (int i = 0; i < array.length; i++) { //Rellenamos aleatoriamente numeros de 2 a 100
            array[i]= (int) (Math.random()*(100-2+1)+2);
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println();


        for (int i = 0; i <array.length ; i++) {
            //es primo y capicua
            if(esPrimo(array[i]) && esCapicua(array[i])){
                System.out.println("El "+array[i]+" es primo y es capicúa.");

                //es primo y no capicua
            }else if(esPrimo(array[i]) && !esCapicua(array[i])){
                System.out.println("El "+array[i]+" es primo y no es capicúa.");

                //no es primo y si capicua
            }else if(!esPrimo(array[i]) && esCapicua(array[i])){
                System.out.println("El "+array[i]+" no es primo y es capicúa.");

                //no es ni uno ni otro
            }else{
                System.out.println("El "+array[i]+" no es primo y no es capicúa.");
            }

        }
    }


    public static boolean esPrimo(int elemento){
        boolean esPrimo = true;
        if (elemento == 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < elemento; i++) {
                if (elemento % i == 0) {
                    esPrimo = false;
                }
            }
        }
        return esPrimo;
    }

    public static long voltea(long n) {
        long aux = n;
        long volteado = 0;
        while (aux > 0) {
            volteado = volteado * 10 + aux % 10;
            aux /= 10;
        }
        return volteado;
    }

    public static boolean esCapicua(long n) {
        boolean res = false;
        long aux = n;
        long volteado = voltea(aux);
        if (volteado == n) {
            res = true;
        }
        return res;
    }
}
