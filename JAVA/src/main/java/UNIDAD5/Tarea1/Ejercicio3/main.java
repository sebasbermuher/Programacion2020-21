/*
A partir de la clase Hora, implementar la clase HoraExacta, que incluye en la hora los segundos.
Además de los métodos visibles de Hora, dispondrá de:
HoraExacta(hora, minuto, segundo)
setSegundo(valor), que da valor a los segundos, siempre y cuando sea un valor con sentido
inc(), que incrementa la hora en un segundo
 */
package UNIDAD5.Tarea1.Ejercicio3;

public class main {
    public static void main(String[] args) {
        horaExacta prueba = new horaExacta(12, 34, 45);

        prueba.setSegundos(12);
        prueba.inc();
        System.out.println(prueba);

    }
}