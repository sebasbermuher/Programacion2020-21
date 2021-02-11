/*
Añadir a la clase HoraExacta un método que compare si dos horas (la invocante y la otra pasada como
parámetro de entrada al método) son iguales o distintas.
 */
package UNIDAD5.Tarea1.Ejercicio4;

public class main {
    public static void main(String[] args) {
        horaExacta hora1 = new horaExacta(12, 54, 45);
        horaExacta hora2 = new horaExacta(12, 34, 12);
        horaExacta hora3 = new horaExacta(12, 54, 45);

        System.out.println(hora1.equals(hora2));
        System.out.println(hora1.equals(hora3));

    }
}