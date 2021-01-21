/*
Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar
individualmente. Para ello hacer una clase Bombilla con una variable privada que indique si está
encencida o apagada, así como un método que nos diga el estado de la bombilla.
Además, queremos poner un interruptor general, de forma que si saltan los fusibles, todas las
bombillas se muestran como apagadas. Cuando el fusible se repara, las bombillas vuelven a
estar encendidas o apagadas, según estuvieran antes del percance. Cada bombilla se enciende
o se apagan individualmente, pero solo responde si su interruptor particular está activado y
además hay luz general.
 */
package UNIDAD4.Tarea1.Ejercicio8;

public class main {
    public static void main(String[] args) {

        bombilla b1 = new bombilla();
        bombilla b2 = new bombilla(false);
        bombilla b3 = new bombilla(true);

        b1.encender();
        b1.isInGeneral(false);
        b3.apagar();

        b1.mostrarInfo();
        b2.mostrarInfo();
        b3.mostrarInfo();
    }
}
