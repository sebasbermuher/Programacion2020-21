/*
Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas
 por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si de
 una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
 */
package UNIDAD3.Bermudez_Herrera_ExamenUnidad3;

public class Ejercicio2 {
  public static void main(String[] args) {
    int[][] num = {
      {14, 45, 57, 14, 39}, {42, 43, 23, 45, 23}, {73, 35, 25, 72, 93}, {23, 85, 72, 16, 90}
    };
    // creo array bidimensional con los numeros ya introducidos (se dijo que se podia hacer asi)

    // hago a manos las sumas, me falta el bucle para mostrarlo en tabla
    int sumafila1 = num[0][0] + num[0][1] + num[0][2] + num[0][3] + num[0][4];
    int sumafila2 = (num[1][0] + num[1][1] + num[1][2] + num[1][3] + num[1][4]);
    int sumafila3 = (num[2][0] + num[2][1] + num[2][2] + num[2][3] + num[2][4]);
    int sumafila4 = (num[3][0] + num[3][1] + num[3][2] + num[3][3] + num[3][4]);
    int sumacolu1 = (num[0][0] + num[1][0] + num[2][0] + num[3][0]);
    int sumacolu2 = (num[0][1] + num[1][1] + num[2][1] + num[3][1]);
    int sumacolu3 = (num[0][2] + num[1][2] + num[2][2] + num[3][2]);
    int sumacolu4 = (num[0][3] + num[1][3] + num[2][3] + num[3][3]);
    int sumacolu5 = (num[0][4] + num[1][4] + num[2][4] + num[3][4]);

    for (int i = 0; i < 1; i++) {
      System.out.println(
          num[0][0] + " " + num[0][1] + " " + num[0][2] + " " + num[0][3] + " " + num[0][4]
              + " SUMA=" + sumafila1);
      System.out.println(
          num[1][0] + " " + num[1][1] + " " + num[1][2] + " " + num[1][3] + " " + num[1][4]
              + " SUMA=" + sumafila2);
      System.out.println(
          num[2][0] + " " + num[2][1] + " " + num[2][2] + " " + num[2][3] + " " + num[2][4]
              + " SUMA=" + sumafila3);
      System.out.println(
          num[3][0] + " " + num[3][1] + " " + num[3][2] + " " + num[3][3] + " " + num[3][4]
              + " SUMA=" + sumafila4);
      for (int j = 0; j < 1; j++) {
        System.out.print(sumacolu1 + " ");
        System.out.print(sumacolu2 + " ");
        System.out.print(sumacolu3 + " ");
        System.out.print(sumacolu4 + " ");
        System.out.print(sumacolu5);
      }
    }
  }
}
