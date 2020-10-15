/*
 El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
 Realiza un programa que muestre si el rango de valores de un tipo se comporta de forma cíclica.
 Es decir, que muestre el valor máximo de una variable de tipo short,
 y muestre también qué ocurre si sumamos 1 a esa variable.
*/

package UNIDAD2.Tarea4;

public class Ejercicio1 {
  public static void main(String[] args) {

    Short num_max = 32767;
    Short num_min = -32768;

    System.out.println("El numero minimo y maximo de tipo Short son: " + num_min + " " + num_max);

    System.out.println("Si restamos uno al minimo y sumamos uno al maximo, da: ");
    System.out.print((num_min - 1) + " " + (num_max + 1));
  }
}
