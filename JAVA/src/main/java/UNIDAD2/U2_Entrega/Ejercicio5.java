/*
Dada una cadena mostrar por pantalla la cantidad de espacios, haches y vocales
abiertas tiene, independientemente de que sean mayúsculas, minúsculas o acentuadas.
Las vocales abiertas son a, e, o.

Ejemplo:
Entrada: cad = "Hipólito el Ánodo"
Salida: La cantidad de espacios, haches y vocales abiertas es 9
*/
package UNIDAD2.U2_Entrega;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Escribe una cadena ");
    String frase = teclado.nextLine();

    int contador = 0;
    String a = "a";
    String e = "e";
    String o = "o";
    String h = "h";

    for (int i = 0; i <= frase.length(); i++) {
      for (int j = 0; j <= i; j++) {
        String car = frase.substring(j, i);

        if (car.equals(h)) {
          contador++;
        } else if (car.equals(o)) {
          contador++;
        } else if (car.equals(a)) {
          contador++;
        } else if (car.equals(e)) {
          contador++;
        } else if (car.equals(" ")) {
          contador++;
        }
      }
    }
    System.out.println("La cantidad de espacios, haches y vocales abiertas es: " + contador);
  }
}
