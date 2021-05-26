/*
Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades.
No hay que comprobar que los datos se introducen correctamente; podemos suponer que el
usuario los introduce bien. Dentro de la pecera hay que colocar de forma aleatoria un pececito,
que puede estar situado en cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.
Ejemplo: Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7

* * * * * * *
*           *
*       &   *
* * * * * * *
 */
package Recuperacion_Eval_1_Diciembre_2020;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4):");
    int altura = teclado.nextInt();
    System.out.println("Ahora introduzca la anchura (como mínimo 4):");
    int anchura = teclado.nextInt();

    // el pez estara dentro de las variables altura y anchura
    int posicionPezAltura = (int) (Math.random() * (altura - 2) + 1);
    int posicionPezAnchura = (int) (Math.random() * (anchura - 2) + 1);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchura; j++) {
        // lo bordes de la pecera
        if ((i == 0 || i == altura - 1) || (j == 0 || j == anchura - 1)) {
          System.out.print("*");

          // los huecos de la pecera (en blanco)
        } else if (i == posicionPezAltura && j == posicionPezAnchura) {
          System.out.print("");
        } else {
          // espacios dentro de la pecera
          System.out.print(" ");
        }
        // dibujar el pez dentro de la pecer
        if (i == posicionPezAltura && j == posicionPezAnchura) {
          System.out.print("& ");

          // si i y j es distinto a los valores del pez, se dibuja espacio
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
