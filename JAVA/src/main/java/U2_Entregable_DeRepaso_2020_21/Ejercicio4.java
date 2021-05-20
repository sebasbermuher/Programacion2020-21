/*
Escribir un programa que incremente la hora de un reloj tantos segundos como le solicitemos mostrando cada
vez la hora nueva.
Se solicitará al usuario por teclado las horas, los minutos y los segundos y el número de segundos que se
quiere aumentar la hora.

Supondremos que el usuario siempre introduce valores correctos.
Ejemplo 1:

Introducza horas: 13
Introduzca minutos: 59
Introduzca segundos: 51
Introduzca segundos a incrementar: 10

Aumentando la hora...
13:59:52
13:59:53
13:59:54
13:59:55
13:59:56
13:59:57
13.59:58
13:59:59
14:00:00
14:00:01
 */
package U2_Entregable_DeRepaso_2020_21;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas,minutos,segundos,incrementar_segundos;

        do{
            System.out.print("Introduzca la hora: ");
            horas = teclado.nextInt();

            if(horas>23 || horas<0){
                System.out.println("Error, la hora debe estar entre 00 y 23. Vuelva a introducirlo.");

            }
        }while(horas>23 || horas<0);


        do{
            System.out.print("Introduzca los minutos: ");
            minutos = teclado.nextInt();

            if(minutos>59 || minutos<0){
                System.out.println("Error, los minutos deben estar entre 00 y 59. Vuelva a introducirlo.");

            }
        }while(minutos>59 || minutos<0);


        do{
            System.out.print("Introduzca los segundos: ");
            segundos = teclado.nextInt();

            if(segundos>59 || segundos<0){
                System.out.println("Error, los segundos deben estar entre 00 y 59. Vuelva a introducirlo.");
            }
        }while(segundos>59 || segundos<0);

        do {
            System.out.print("Introduzca los segundos a incrementar: ");
            incrementar_segundos = teclado.nextInt();

            if(incrementar_segundos<0){
                System.out.println("Error, el incremento tiene que ser positivo.");
            }
        }while (incrementar_segundos<0);


        System.out.println();
        System.out.println("Aumentando la hora...");

        for(long i=0;i<incrementar_segundos;i++){
            segundos=segundos+1;
            if(segundos==60){
                segundos=0;
                minutos=minutos+1;
                if(minutos==60){
                    minutos=0;
                    horas=horas+1;
                    if(horas==24){
                        horas=0;
                        System.out.print("0"+horas);
                        System.out.print(":0"+minutos);
                        System.out.print(":0"+segundos);
                    }else{
                        if(horas/10==0){
                            System.out.print("0"+horas);
                        }else{
                            System.out.print(horas);
                        }
                        System.out.print(":0"+minutos);
                        System.out.print(":0"+segundos);

                    }
                }else{
                    if(horas/10==0){
                        System.out.print("0"+horas);
                    }else{
                        System.out.print(horas);
                    }
                    if(minutos/10==0){
                        System.out.print(":0"+minutos);
                    }else{
                        System.out.print(":"+minutos);
                    }
                    System.out.print(":0"+segundos);
                }
            }else{
                if(horas/10==0){
                    System.out.print("0"+horas);
                }else{
                    System.out.print(horas);
                }
                if(minutos/10==0){
                    System.out.print(":0"+minutos);
                }else{
                    System.out.print(":"+minutos);
                }
                if(segundos/10==0){
                    System.out.print(":0"+segundos);
                }else{
                    System.out.print(":"+segundos);
                }
            }
            System.out.println();
        }
    }
}