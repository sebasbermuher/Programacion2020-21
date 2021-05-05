/*
Amplía el ejercicio anterior con las siguientes funciones:
8. posicionDeDigito: Da la posición de la primera ocurrencia de
un dígito dentro de un número entero. Si no se encuentra,
devuelve -1.
9. quitaPorDetras: Le quita a un número n dígitos por detrás (por
la derecha).
10.quitaPorDelante: Le quita a un número n dígitos por delante
(por la izquierda).
11.pegaPorDetras: Añade un dígito a un número por detrás.
12.pegaPorDelante: Añade un dígito a un número por delante.
13.trozoDeNumero: Toma como parámetros las posiciones inicial y
final dentro de un número y devuelve el trozo correspondiente.
14.juntaNumeros: Pega dos números para formar uno.
 */
package PlanRefuerzo_PrimerTrimestre;

public class Ejercicio12 {
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
        System.out.println("----------------------------------");
        System.out.println("8. Da la posicion de la primera ocurrencia de un digito dentro de un numero. NUM=1597 , DIGI=9");
        System.out.println(posicionDeDigito(1597,9));
        System.out.println("----------------------------------");
        System.out.println("9. Le quita digitos al numero por detras. NUM=58932 , DIGI=2");
        System.out.println(quitaPorDetras(58932,2));
        System.out.println("----------------------------------");
        System.out.println("10. Le quita digitos al numero por delante. NUM=58932 , DIGI=2");
        System.out.println(quitaPorDelante(58932,2));
        System.out.println("----------------------------------");
        System.out.println("11. Añade un digito al numero por detras. NUM=2589 , DIGI=5");
        System.out.println(pegaPorDetras(2589,5));
        System.out.println("----------------------------------");
        System.out.println("12. Añade un digito al numero por delante. NUM=3791 , DIGI=2");
        System.out.println(pegaPorDelante(3791,2));
        System.out.println("----------------------------------");
        System.out.println("13. Devuelve un trozo del numero. NUM=523672 , INICIO=1 , FIN=3 ");
        System.out.println(trozoDeNumero(523672,1,3));
        System.out.println("----------------------------------");
        System.out.println("14. Pega dos numeros para formar uno. PRIMER_NUM=1999 , SEGUNDO_NUM=2021");
        System.out.println(juntaNumeros(1999,2021));

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

    //posicionDeDigito: Da la posición de la primera ocurrencia de
    //un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
    public static int posicionDeDigito(int num, int digi) {
        int posiciones = -1;

        num = voltea(num);
        int digitos = digitos(num);


        boolean encontrado = false;

        for (int i = 0; i < digitos && !encontrado; i++) {
            int digito = num % 10;
            if (digito == digi) {
                encontrado = true;
                posiciones = i;
            }
            num /= 10;
        }
        return posiciones;
    }

    //quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
    public static int quitaPorDetras(int num, int digi) {
        return num /  potencia(10, digi);
    }

    //quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
    public static int quitaPorDelante(int num, int digi) {
        num = pegaPorDetras(num, 1); // "cierra" el número por si acaso termina en 0
        num = voltea(quitaPorDetras(voltea(num), digi));
        num = quitaPorDetras(num, 1);
        return num;
    }

    //pegaPorDetras: Añade un dígito a un número por detrás.
    public static int pegaPorDetras(int num, int digi) {
        return juntaNumeros(num, digi);
    }

    //pegaPorDelante: Añade un dígito a un número por delante.
    public static int pegaPorDelante(int num, int digi) {
        return juntaNumeros(digi, num);
    }

    //trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve
    // el trozo correspondiente.
    public static int trozoDeNumero(int num, int inicio, int fin) {
        int longitud = digitos(num);
        num = quitaPorDelante(num, inicio);
        num = quitaPorDetras(num, longitud - fin - 1);
        return num;
    }

    //juntaNumeros: Pega dos números para formar uno.
    public static int juntaNumeros(int primer_num, int segundo_num) {
        return (primer_num * potencia(10, digitos(segundo_num))) + segundo_num;
    }
}