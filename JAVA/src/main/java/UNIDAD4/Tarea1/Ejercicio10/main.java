/*
Escribir un programa que lea por teclado una hora cualquiera y un número n que representa
una cantidad de segundos. El programa mostrará la hora introducida y la hora resultante de
sumar a esa hora, la cantidad de segundos indicada. Para ello hemos de diseñar previamente
la clase Hora que dispone de los atributos hora, minuto y segundo. Los valores de los
atributos se controlarán mediante métodos set/get.
 */
package UNIDAD4.Tarea1.Ejercicio10;

import java.util.Scanner;

public class main { public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    hora h = new hora();

    System.out.println("Hora: ");
    int valor=teclado.nextInt();
    h.setHora(valor);

    System.out.println("Minuto: ");
    valor=teclado.nextInt();
    h.setMinuto(valor);

    System.out.println("Segundo: ");
    valor=teclado.nextInt();
    h.setSegundo(valor);

    System.out.println("Cuantos segundos quiere mostrar: ");
    int numSegundos=teclado.nextInt();

    for (int i = 0; i <= numSegundos; i++) {
        System.out.println(h.getHora() + ":" + h.getMinuto() + ":"+ h.getSegundo() );
        h.incrementaSegundo();
    }
}
}