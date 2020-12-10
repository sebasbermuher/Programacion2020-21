/*
Juego del buscaminas:
Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N columnas.
A continuación rellenar todo el vector colocando en cada casilla de manera aleatoria:
O bien un carácter X que significa que hay una bomba.
O bien un carácter - que significa que esa casilla no nada.
A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar
por pantalla la cantidad de bombas que hay en las casillas de alrededor.
Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez
(hasta que el usuario encuentre una bomba).
NOTA: Podemos hacer la lectura de la posición como consideremos más oportuno.
 */
package UNIDAD3.U3_Entregable;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el valor de N para nºfilas y nºcolumnas");
    int n = teclado.nextInt();
    int filas = n;
    int columnas = n;

    int array[][] = new int[filas][columnas];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.println(); // Aqui deberia de general X o - aleatorio (No realizado)
      }
      System.out.println();
    }
  }
}
