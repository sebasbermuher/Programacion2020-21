/*
Realiza un programa que pinte por pantalla diez líneas formadas por carac-
teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres.
 */
package UNIDAD2.U2_Examen;

import java.util.Scanner;

public class EjercicioDos {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i <= 9; i++) {
      int longitud = (int) (Math.random() * 41); // LA LONGITUD ES ALEATORIA, DESDE 1 HASTA 40
      int caracter = (int) (Math.random() * 6); // CARACTER ALEATORIO DE CADA UNO DE LOS 6 QUE HAY
      String linea = "";

      // SWITCH PARA LA ELECCION DE CADA CARACTER
      switch (caracter) {
        case 0:
          linea = "*";
          break;
        case 1:
          linea = "-";
          break;
        case 2:
          linea = "=";
          break;
        case 3:
          linea = ".";
          break;
        case 4:
          linea = "|";
          break;
        case 5:
          linea = "@";
          break;
        default:
      }
      // DIBUJAS LAS LINEAS
      for (int x = 1; x <= longitud; x++) {
        System.out.print(linea);
      }
      System.out.println();
    }
  }
}
