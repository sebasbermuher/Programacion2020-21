/*
Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos".
Necesitamos almacenar en la variable booleana "jasp" el valor:
    - verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3,
            y los ingresos superan los 28000 (euros).
    - falso. En caso contrario.
escribe el código necesario para inicializar "jasp" en una línea.
 */
package UNIDAD2.Tarea7;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Edad:");
    int edad = teclado.nextInt();
    System.out.println("Nivel de estudios:");
    int nivel_estudios = teclado.nextInt();
    System.out.println("Ingresos:");
    int ingresos = teclado.nextInt();
    boolean jasp;
    jasp = ((edad <= 28) || (nivel_estudios > 3) || (ingresos > 28000));
    System.out.println(jasp);
  }
}
