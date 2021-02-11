/*
La empresa de mensajería BiciExpress que reparte en bicicleta, para disminuir el peso a transportar por
sus empleados, solo utiliza cajas de cartón. Por motivos de privacidad, las etiquetas (con texto) que
se pegan en las cajas normales, se sustituyen por una etiqueta con un número (que determina el cliente,
la dirección del envío, etc). Además, las cajas de cartón se caracterizan porque su volumen se calcula
como el 80% del volumen real, ya que si las cajas se llenan mucho, se deforman y se rompen.
Otra característica de las cajas de cartón es que sus medidas siempre están en centímetros.
Por último, la empresa, para controlar costes, necesita saber cuál es la superficie total de cartón
utilizado para construir todas las cajas enviadas. Se pide implementar a partir de la clase Caja la
clase CajaCarton.
 */
package UNIDAD5.Tarea1.Ejercicio8;

import UNIDAD5.Tarea1.Ejercicio7.caja;

public class main {
    public static void main(String[] args) {
        caja a = new cajaCarton(100,200,200);
        a.etiqueta = "Direccion de envio";
        System.out.println(a);
        System.out.println("Volumen: " + ((cajaCarton) a).getVolumen());

        cajaCarton b = new cajaCarton(50.6, 75.5 , 100);
        b.etiqueta = 23;
        System.out.println(b.etiqueta);
        System.out.println(b);
        System.out.println("Volumen: " + b.getVolumen());
    }
}