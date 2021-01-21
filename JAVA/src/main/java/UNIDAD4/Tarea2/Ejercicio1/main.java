/*
Las listas son estructuras dinámicas de datos, donde se pueden insertar o eliminar elementos de
un determinado tipo sin limitación de espacio. Implementar la clase Lista correspondiente a
una lista de números de la clase Integer. Los números se guardarán en una tabla.
Cuando falte espacio para un nuevo elemento, la tabla se redimensionará, incrementando la
capacidad de la lista. Entre los métodos de la clase se incluirán:
Dos constructores, uno por defecto que cree la tabla con capacidad para 10 números, y otro al
que se le pasa como argumento el tamaño inicial de la tabla.
Obtener el número de elementos insertados en la lista.
Insertar un número al final de la lista.
Insertar un número al principio de la lista.
Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro.
Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
Obtener el elemento cuyo índice se pasa como parámetro.
Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre.
Si no está, devolver -1.
Representar la lista con una cadena de caracteres.
 */
package UNIDAD4.Tarea2.Ejercicio1;

public class main {
    public static void main(String[] args) {
        lista listasbh = new lista();
        listasbh.insertarFinal(3);
        listasbh.insertarFinal(2);
        listasbh.insertarFinal(1);
        listasbh.insertarFinal(4);
        listasbh.insertarFinal(5);
        System.out.println(listasbh.mostrar());

        listasbh.insertarPrincipio(0);
        listasbh.insertarPrincipio(1);
        listasbh.insertarPrincipio(2);
        listasbh.insertarPrincipio(3);
        listasbh.insertarPrincipio(4);
        System.out.println(listasbh.mostrar());

        listasbh.insertar(2,10);
        System.out.println(listasbh.mostrar());
        listasbh.eliminar(2);
        System.out.println(listasbh.mostrar());
    }
}
