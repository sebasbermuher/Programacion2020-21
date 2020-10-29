/*
Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.

Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición donde quiere insertar: 3
Introduzca el dígito que quiere insertar: 5
El número resultante es 4056783.
 */
package UNIDAD2.U2_Entrega;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String num, digito;
    int posicion;

    System.out.println("Por favor, introduzca un número entero positivo: ");
    num = teclado.next();

    System.out.println("Introduce la posición donde quieres insertar: ");
    posicion = teclado.nextInt();

    System.out.println("Introduce el dígito que quiere insertar: ");
    digito = teclado.next();

    String cadena1 = num.substring(0, posicion);
    String cadena2 = num.substring(posicion);
    String nuevo_num = cadena1 + digito + cadena2;

    System.out.println("El numero resultante es:" + nuevo_num);
  }
}
