/*
Implementar la interfaz Pila. Declararla e implementarla en las clases PilaTabla y PilaLista.
Utilizando una referencia del tipo Pila con cualquiera de las implementaciones
(es decir: Pila p=new PilaLista() o Pila p=new PilaTabla() ), mostrar por pantalla, en orden inverso,
10 números introducidos por teclado.
 */
package UNIDAD5.Tarea2.Ejercicio1;

public class main {
    public static void main(String[] args) {
        pila p = new pilaTabla();
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }
        Integer num = p.desapilar();

        while (num != null) {
            System.out.println(num);
            num = p.desapilar();
        }
    }
}