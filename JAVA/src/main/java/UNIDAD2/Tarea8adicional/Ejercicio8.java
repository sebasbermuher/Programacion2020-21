/*
Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir como un
número (del 1 al 7) o como una cadena (de <lunes> a <domingo>). Se debe comprobar que el usuario
introduce los datos correctamente y que el segundo día es posterior al primero.
 */
package UNIDAD2.Tarea8adicional;

import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int primerDia = 0;
    int segundoDia = 0;
    int primeraHora;
    int segundaHora;
    String primerDiaString;
    String segundoDiaString;
    String nombreDia1 = "";
    String nombreDia2 = "";
    boolean datosCorrectos = true;

    do {
      System.out.println("Introduce el dia y la hora");
      primerDiaString = teclado.next();
      primeraHora = teclado.nextInt();

      switch (primerDiaString) {
        case "lunes":
        case "1":
          primerDia = 1;
          nombreDia1 = "Lunes";
          break;
        case "martes":
        case "2":
          primerDia = 2;
          nombreDia1 = "Martes";
          break;
        case "miercoles":
        case "3":
          primerDia = 3;
          nombreDia1 = "Miercoles";
          break;
        case "jueves":
        case "4":
          primerDia = 4;
          nombreDia1 = "Jueves";
          break;
        case "viernes":
        case "5":
          primerDia = 5;
          nombreDia1 = "Viernes";
          break;
        case "sabado":
        case "6":
          primerDia = 6;
          nombreDia1 = "Sabado";
          break;
        case "domingo":
        case "7":
          primerDia = 7;
          nombreDia1 = "Domingo";
          break;
        default:
          primerDia = 0;
      }

      System.out.println("Introduce el dia y la hora");
      segundoDiaString = teclado.next();
      segundaHora = teclado.nextInt();

      switch (segundoDiaString) {
        case "lunes":
        case "1":
          segundoDia = 1;
          nombreDia2 = "Lunes";
          break;
        case "martes":
        case "2":
          segundoDia = 2;
          nombreDia2 = "Martes";
          break;
        case "miercoles":
        case "3":
          segundoDia = 3;
          nombreDia2 = "Miercoles";
          break;
        case "jueves":
        case "4":
          segundoDia = 4;
          nombreDia2 = "Jueves";
          break;
        case "viernes":
        case "5":
          segundoDia = 5;
          nombreDia2 = "Viernes";
          break;
        case "sabado":
        case "6":
          segundoDia = 6;
          nombreDia2 = "Sabado";
          break;
        case "domingo":
        case "7":
          segundoDia = 7;
          nombreDia2 = "Domingo";
          break;
        default:
          segundoDia = 0;
      }

      datosCorrectos = true;

      if (segundoDia <= primerDia) {
        System.out.println("El segundo día debe ser posterior al primero.");
        datosCorrectos = false;
      }

      if ((primerDia == 0) || (segundoDia == 0)) {
        System.out.println("No has introducido correctamente el dia de la semana.");
        System.out.println("Los días validos son: Lunes, Martes, Miercoles, Jueves y Viernes.");
        datosCorrectos = false;
      }

      if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
        System.out.println("No se ha introducido correctamente la hora del día.");
        System.out.println("Las horas validas están entre 0 y 23.");
        datosCorrectos = false;
      }

    } while (datosCorrectos = false);

    System.out.print(
        "Entre las "
            + primeraHora
            + ":00h del "
            + nombreDia1
            + " y las "
            + segundaHora
            + ":00h del "
            + nombreDia2);
    System.out.println(
        " hay "
            + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora))
            + " horas.");
  }
}
