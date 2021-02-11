/*
Crea una supeclase llamada Electrodomestico con las siguientes características:
-->Los electrodomésticos tienen un precio base, un color, un consumo energético (letras entre A y F) y un peso.
Estos elementos podrán ser vistos solo por sus clases hijas y por clases vecinas.
-->Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg.
-->Los colores disponibles son blanco, negro, rojo, azul y gris.
--> Los constructores que se implementarán serán:
    -Un constructor con todos los valores por defecto.
    -Un constructor con el precio y peso. El resto por defecto.
    -Un constructor con todos los atributos.
--> Los métodos que implementará serán:
    -métodos get de todos los atributos.
    -getPrecioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también.
Esta es la lista de precios:
(LETRA - PRECIO)
A- 100€; B- 80€; C- 60€; D- 50€; E- 30€; F- 10€
(TAMAÑO - PRECIO)
Entre 0 y 29 kg - 10€;
Entre 30 y 49 kg - 60€;
Entre 50 y 79 kg - 80€;
Mayor o igual a 80 kg - 100€;

    -toString(): con el valor de todos los atributos, así como su precio final.
Crearemos una subclase llamada Lavadora con las siguientes características:

-->Un atributo carga, además de los atributos heredados.
-->Por defecto, la carga es de 5 kg.
-->Los constructores serán:
    -Un constructor por defecto.
    -Un constructor con el precio y peso. El resto por defecto.
    -Un constructor con la carga y el resto de atributos heredados.
-->Los métodos que se implementarán serán:
    -Método get de carga.
    -getPrecioFinal(): además del incremento por consumo y tamaño, si tiene una carga mayor de 30 kg,
    aumentará el precio 50 €.
    -toString(): con el valor de todos los atributos, así como su precio final.
-->Por defecto, la forma de ordenación de objetos Lavadora es la ordenación por carga. Es decir,
una lavadora se considera menor que otra si su carga es menor.
-->Queremos tener también la opción de poder comparar objetos Lavadora según su precioFinal.

Crearemos una subclase llamada Television con las siguientes características:

-->Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
-->Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
-->Los constructores que se implementaran serán:
    -Un constructor por defecto.
    -Un constructor con el precio y peso. El resto por defecto.
    -Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
-->Los métodos que se implementarán serán:
    -Método get de resolución y sintonizador TDT.
    -getPrecioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y
    si tiene un sintonizador TDT incorporado, aumentara 50 €. Recuerda que las condiciones que hemos visto
    en la clase Electrodomestico también deben afectar al precio.
    -toString(): con el valor de todos los atributos, así como su precio final.

Ahora crea una clase ejecutable que realice lo siguiente:

-->Crea un array de Electrodomesticos de 10 posiciones.
-->Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
-->Deberás mostrar el contenido del array. (Fíjate sobre ttodo en que el precio que muestra es el
correspondiente a la clase correcta)
-->Crea después un array de objetos Lavadora, y ordena el array con la ordenación por defecto de
objetos Lavadora.
-->Crea otro array y ordénalo por precioFinal.
 */
package UNIDAD5.Tarea1.Ejercicio9;

import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        electrodomestico listaElectrodomesticos[]=new electrodomestico[10];

        listaElectrodomesticos[0]=new electrodomestico(200, 60, 'C', "Verde");
        listaElectrodomesticos[1]=new lavadora(150, 30);
        listaElectrodomesticos[2]=new television(500, 80, 'E', "negro", 42, false);
        listaElectrodomesticos[3]=new electrodomestico();
        listaElectrodomesticos[4]=new electrodomestico(600, 20, 'D', "gris");
        listaElectrodomesticos[5]=new lavadora(300, 40, 'Z', "blanco", 40);
        listaElectrodomesticos[6]=new television(250, 70);
        listaElectrodomesticos[7]=new lavadora(400, 100, 'A', "verde", 15);
        listaElectrodomesticos[8]=new television(200, 60, 'C', "naranja", 30, true);
        listaElectrodomesticos[9]=new electrodomestico(50, 10);

        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;

        for(int i=0;i<listaElectrodomesticos.length;i++){
            if(listaElectrodomesticos[i] instanceof electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }

        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
    }
}
