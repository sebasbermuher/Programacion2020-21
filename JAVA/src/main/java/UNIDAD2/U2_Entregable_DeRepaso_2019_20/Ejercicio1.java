/*
Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las tres notas que ha sacado
el alumno en los tres primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media
y la nota correspondiente .Atendiendo a esa media el alumno tendrá las siguientes notas:

- Suficiente si la media en mayor o igual que 5 y menor que 6.
- Bien si la media es mayor o igual que 6 y menor que 7.
- Notable si la media es mayor o igual que 7 y menor que 9.
- Sobresaliente en culaquier otro caso.

En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación
que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto,
la nota será un 5; en caso contrario, se mantienela nota media anterior.
 */
package UNIDAD2.U2_Entregable_DeRepaso_2019_20;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota,media=0;
        int opcion,num=0;
        String palabra;

        do {
            System.out.println("-------------------------------------");
            System.out.println("Elige una opcion:");
            System.out.println("1-Introducir una nota");
            System.out.println("2-Realizar media");
            System.out.println("-------------------------------------");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    num++;
                    System.out.printf("Nota Examen "+num +": ");
                    nota = teclado.nextFloat();
                    media=media+nota;
                    break;
                case 2:
                    media=media/num;
                    if (media<5){
                        do {
                            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no_apto): ");
                            palabra = teclado.next();

                            if (palabra.equals("apto")) {
                                System.out.println("Tu nota de Programación es 5 - Suficiente");
                            } else if (palabra.equals("no_apto")) {
                                System.out.printf("Tu nota de Programación es "+media+" - Suspenso");
                            } else{
                                System.out.println("Por favor, introduzca [apto] o [no_apto]");
                            }
                        }while(!palabra.equals("apto") && !palabra.equals("no_apto"));
                    }else{
                        System.out.printf("Tu nota de Programación es "+ media + " ");
                        if(media>=5 && media<6){
                            System.out.print("Suficiente");
                        }else if(media>=6 && media<7){
                            System.out.print("Bien");
                        }else if(media>=7 && media<9) {
                            System.out.print("Notable");
                        }else{
                            System.out.print("Sobresaliente");
                        }

                        System.out.println();
                    }
                    break;
            }
        } while (opcion != 0 && opcion !=2);
    }
}
