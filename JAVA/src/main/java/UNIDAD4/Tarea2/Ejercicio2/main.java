/*
Una pila es una estructura dinámica de datos donde los elementos se insertan (se apilan) y se
retiran (se desapilan) siguiendo la norma de que el último que se apila será el primero en
desapilarse, como ocurre con una pila de platos. Se llama cima de la pila al último elemento
apilado (o al primero en desapilar). Las funciones fundamentales de una pila son, por tanto,
apilar() y desapilar() y cima(), que devuelve el elemento que está en la cima.
Implementar la clase PilaTabla para números Integer, donde se usa una tabla para guardar
los elementos apilados.
 */
package UNIDAD4.Tarea2.Ejercicio2;

public class main {
    public static void main(String[] args) {
    PilaTabla p = new PilaTabla();
    for (int i = 0; i < 10; i++) {
        p.apilar(i);
    }
    Integer num = p.desapilar();
    while (num != null) {
        System.out.println(num);
        num=p.desapilar();
    }
}
}