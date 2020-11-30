/*
Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
Cada clase está compuesta por 5 alumnos. Se pide leer las notas (números enteros) de cada uno de los
alumnos en el primer trimestre, luego, las del segundo, y luego, las del tercero. Debemos mostrar, al final,
la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición pos
(que se lee por teclado). (Podéis hacerlo usando 3 vectores -uno por trimestre-, o usando una matriz bidimensional
en la que las filas sean los trimestres y las columnas los alumnos).
 */
package UNIDAD3.Tarea3;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] primer_trimestre = new int[5];
    int[] segundo_trimestre = new int[5];
    int[] tercer_trimestre = new int[5];
    String[] nombres = {"Sebas", "Jorge", "Andres", "Pepe", "Alejandro"};
    int alumno;
    int suma_primer = 0, suma_segundo = 0, suma_tercer = 0;
    double media_alumno;

    System.out.println("Notas de primer trimestre:");
    for (int i = 0; i < primer_trimestre.length; i++) {
      System.out.print(nombres[i] + "): ");
      primer_trimestre[i] = teclado.nextInt();
    }

    System.out.println("Notas del segundo trimestre:");
    for (int i = 0; i < segundo_trimestre.length; i++) {
      System.out.print(nombres[i] + "): ");
      segundo_trimestre[i] = teclado.nextInt();
    }

    System.out.println("Notas del tercer trimestre:");
    for (int i = 0; i < tercer_trimestre.length; i++) {
      System.out.print(nombres[i] + "): ");
      tercer_trimestre[i] = teclado.nextInt();
    }

    for (int i = 0; i < 5; i++) {
      suma_primer += primer_trimestre[i];
      suma_segundo += segundo_trimestre[i];
      suma_tercer += tercer_trimestre[i];
    }

    System.out.println("Media grupal primer trimestre: " + suma_primer / 5.0);
    System.out.println("Media grupal segundo trimestre: " + suma_segundo / 5.0);
    System.out.println("Media grupal tercer trimestre: " + suma_tercer / 5.0);
    System.out.println();

    System.out.print("Introduzca posición del alumno (de 0 a 9): ");
    alumno = teclado.nextInt();

    media_alumno =
        (double) (primer_trimestre[alumno] + segundo_trimestre[alumno] + tercer_trimestre[alumno])
            / 3;
    System.out.println("La media del alumno " + nombres[alumno] + " es: " + media_alumno);
  }
}
