/*
Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco.
Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las
cuentas corrientes)
 */
package UNIDAD4.Tarea1.Ejercicio4;

public class main {
    public static void main(String[] args) {
        //cuentaCorriente c1 = new cuentaCorriente("Carlos", "123456A");
        cuentaCorriente c2 = new cuentaCorriente("Sebastian", "12345678A");
        //cuentaCorriente c3 = new cuentaCorriente("Marta", "123456C");

        // c1.mostrarInformacion();
        c2.modBanco("Santander");
        c2.mostrarInformacion();
        //c3.mostrarInformacion();

    }
}
