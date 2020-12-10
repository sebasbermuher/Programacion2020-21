/*
Crea una función con la siguiente cabecera:
public String convierteEnMorse(int n)
Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal.
1 . _ _ _ _ 6 _ . . . .
2 . . _ _ _ 7 _ _ . . .
3 . . . _ _ 8 _ _ _ . .
4 . . . . _ 9 _ _ _ _ .
5 . . . . . 0 _ _ _ _ _
 */
package UNIDAD3.U3.Entregable;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = teclado.nextInt();

    System.out.println("El número en morse es:");
    System.out.println(convierteEnMorse(numero));
  }

  public static String convierteEnMorse(int n) {
    String[] codigoMorse = new String[10];
    codigoMorse[0] = "_ _ _ _ _";
    codigoMorse[1] = ". _ _ _ _";
    codigoMorse[2] = ". . _ _ _";
    codigoMorse[3] = ". . . _ _";
    codigoMorse[4] = ". . . . _";
    codigoMorse[5] = ". . . . .";
    codigoMorse[6] = "_ . . . .";
    codigoMorse[7] = "_ _ . . .";
    codigoMorse[8] = "_ _ _ . .";
    codigoMorse[9] = "_ _ _ _ .";

    String morse = "";
    // mide longitud del numero
    int contadorUno = 0;
    int numero = n;
    while (numero > 0) {
      numero = numero / 10;
      contadorUno++;
    }
    // crea divisor
    int contadorDos = contadorUno;
    int divisor = 1;
    while (contadorUno > 1) {
      divisor = divisor * 10;
      contadorUno--;
    }
    // se genera el string morse
    while (contadorDos > 0) {
      int resultado = n / divisor;
      morse = morse + codigoMorse[resultado] + " ";
      n = n % divisor;
      divisor = divisor / 10;
      contadorDos--;
    }
    return morse;
  }
}
