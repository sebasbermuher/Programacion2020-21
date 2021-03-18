/*
Definir una clase ListaOrdenada, que hereda de LinkedList, que permita la inserción ordenada.
Codificar un método que inserte un nuevo elemento con el prototipo:

void insertarOrdenado( E elemento)
 */
package UNIDAD7.Tarea2.Ejercicio15;

public class main {
    public static void main(String[] args) {
        ListaOrdenada<Integer>lista1=new ListaOrdenada<>(new ListaOrdenada.enterosDecrecientes());

        for (int i = 0; i < 20;i++) {
            Integer temp=(int)(Math.random()*10);
            lista1.insertarorden(temp);
        }

        ListaOrdenada<String>nombres=new ListaOrdenada<>(new ListaOrdenada.comparacadenas());

        nombres.insertarorden("Sebas");
        nombres.insertarorden("Juan");
        nombres.insertarorden("Pedro");
        nombres.insertarorden("Manuel");
        nombres.insertarorden("Alejandro");

        System.out.println(nombres);
    }
}