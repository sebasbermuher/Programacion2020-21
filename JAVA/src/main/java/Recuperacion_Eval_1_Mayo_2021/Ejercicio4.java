package Recuperacion_Eval_1_Mayo_2021;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] pais={"España","Rusia","Japon","Australia"};
        int[][] alturas=new int[4][10];
        int alturaMIN=210;
        int alturaMAX=140;
        int suma=0;
        int media;

        for(int i=0;i<alturas.length;i++){
            for(int j=0;j<10;j++){
                alturas[i][j]=(int)(Math.random()*71)+140; //aleatorio desde 140 al 210

                if(alturas[i][j]<alturaMIN){//si la altura es menor la guardamos en la variable del menor
                    alturaMIN=alturas[i][j];
                }

                if(alturas[i][j]>alturaMAX){//si la altura es mayor la guardamos en la variable mayor
                    alturaMAX=alturas[i][j];
                }
                suma=suma+alturas[i][j]; // sumamos todas las alturas para luego hacer la media
            }

            media=suma/10;

            System.out.println(pais[i]+ Arrays.toString(alturas[i])+" | Media:"+media+" MIN:"+alturaMIN+" MAX:"+alturaMAX);

            alturaMIN=210; // volvemos a iniciar los valores
            alturaMAX=140;
        }
    }
}