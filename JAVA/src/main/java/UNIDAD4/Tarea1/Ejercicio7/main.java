/*
Se quiere definir una clase que permita controlar un sintonizador digital de emisoras FM;
concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar (down)
la frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display).
 Supondremos que el rango de frecuencias a manejar oscila entre los 80MHz y los 108MHz y que, al inicio,
 el controlador sintonice a 80MHz. Si durante una operación de subida o bajada se sobrepasa uno de
 los dos límites, la frecuencia sintonizada debe pasar a ser la del extremo contrario.
 Escribir un pequeño programa principal para probar su funcionamiento.
 */
package UNIDAD4.Tarea1.Ejercicio7;

public class main {
    public static void main(String[] args) {
        sintonizador EuropaFM = new sintonizador();
        sintonizador Los40 = new sintonizador(12.3);

        EuropaFM.up();
        EuropaFM.display();
        Los40.display ();

    }
}
