/*
Crea una biblioteca de funciones matemáticas que contenga las
siguientes funciones. Recuerda que puedes usar unas dentro de otras si
es necesario. Observa bien lo que hace cada función ya que, si las
implementas en el orden adecuado, te puedes ahorrar mucho trabajo. Por
ejemplo, la función esCapicua resulta trivial teniendo voltea y la
función siguientePrimo también es muy fácil de implementar teniendo
esPrimo.
1. esCapicua: Devuelve verdadero si el número que se pasa como
parámetro es capicúa y falso en caso contrario.
2. esPrimo: Devuelve verdadero si el número que se pasa como
parámetro es primo y falso en caso contrario.
3. siguientePrimo: Devuelve el menor primo que es mayor al número
que se pasa como parámetro.
4. potencia: Dada una base y un exponente devuelve la potencia.
5. digitos: Cuenta el número de dígitos de un número entero.
6. voltea: Le da la vuelta a un número.
7. digitoN: Devuelve el dígito que está en la posición n de un
número entero. Se empieza contando por el 0 y de izquierda a
derecha.
 */
package PlanRefuerzo_PrimerTrimestre;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("1. ¿Es capicua? NUM=444");
        System.out.println(esCapicua(444));
        System.out.println("----------------------------------");
        System.out.println("2. ¿Es primo? NUM=26");
        System.out.println(esPrimo(26));
        System.out.println("----------------------------------");
        System.out.println("3. Menor primo que es mayor al numero introducido. NUM=29");
        System.out.println(siguientePrimo(29));
        System.out.println("----------------------------------");
        System.out.println("4. ¿Cual es la potencia? BASE=5 , EXPONENTE=2");
        System.out.println(potencia(5,2));
        System.out.println("----------------------------------");
        System.out.println("5. Cuantos digitos tiene el numero introducido. NUM=45892");
        System.out.println(digitos(45892));
        System.out.println("----------------------------------");
        System.out.println("6. Voltea el numero introducido. NUM=123");
        System.out.println(voltea(123));
        System.out.println("----------------------------------");
        System.out.println("7. Devuelve el numero de la posicion que elijas. NUM=1069821 POS=2");
        System.out.println(digitoN(1069821, 2));
    }


    //esCapicua: Devuelve verdadero si el número que se pasa como
    //parámetro es capicúa y falso en caso contrario.
    public static boolean esCapicua(int numero) {
        if (numero == voltea(numero)) {
            return true;
        } else {
            return false;
        }
    }

    //esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        } else {
            for (long i = numero / 2; i >= 2; i--) {
                if (numero % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
    public static int siguientePrimo(int num) {
        while (!esPrimo(++num)) {
        }
        return num;
    }

    //potencia: Dada una base y un exponente devuelve la potencia.
    public static int potencia(int base, int exponente) {
        int potencia = 0;
        if (exponente == 0) {
            return 1;
        }

        else if (exponente < 0) {
            return (int) (1 / Math.pow(base, exponente));
        }

        else if (exponente > 0) {
            return (int) Math.pow(base, exponente);
        }
        return potencia;

    }

    //digitos: Cuenta el número de dígitos de un número entero.
    public static int digitos(long num) {
        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            return 1;
        } else {
            int n = 0;
            while (num > 0) {
                num = num / 10; // se le quita un dígito a x
                n++; // incrementa la cuenta de dígitos
            }
            return n;
        }
    }

    // voltea: Le da la vuelta a un número.
    public static int voltea(int numero) {
        int cifra, inverso = 0;
        while (numero != 0) {
            cifra = numero % 10;
            inverso = (inverso * 10) + cifra;
            numero /= 10;
        }
        return inverso;
    }

    //digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por
    // el 0 y de izquierda a derecha.
    public static char digitoN(int num, int posicion) {

        String cadena1 = Integer.toString(num);

        char cadena2 = cadena1.charAt(posicion);

        return cadena2;
    }

}