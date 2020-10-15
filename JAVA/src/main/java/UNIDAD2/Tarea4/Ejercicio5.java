/*
Escribe un programa que muestre la hora actual
 */
package UNIDAD2.Tarea4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejercicio5 {
  public static void main(String[] args) {
    Calendar calendario = new GregorianCalendar();

    int hora = calendario.get(Calendar.HOUR_OF_DAY);
    int minutos = calendario.get(Calendar.MINUTE);
    int segundos = calendario.get(Calendar.SECOND);

    System.out.println("La hora actual es: " + hora + ":" + minutos + ":" + segundos);
  }
}
