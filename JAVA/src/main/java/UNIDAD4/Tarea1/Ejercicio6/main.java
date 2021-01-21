/*
Diseñar la clase Banco de la que interesa guardar su nombre, capital y la dirección central.
Los bancos tienen las siguientes restricciones:
a) Siempre tienen que tener un nombre, que no puede ser modificado
b) Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de euros
al crearse.
c) El capital y la dirección de un banco son modificables.
Modificar la clase CuentaCorriente para que cada una esté vinculada a un objeto de tipo Banco.
Escribir los métodos necesarios en la clase CuentaCorriente para gestionar el banco al que pertenece
(cambiar de banco, mostrar la info de la cuenta, incluídos los datos del banco si lo tiene vinculado).
 Existe la posibilidad de que una cuenta corriente no esté vinculada a ningún banco.
 */
package UNIDAD4.Tarea1.Ejercicio6;

public class main {
    public static void main(String[] args) {
        banco b1 = new banco("Santander", "Madrid");
        banco b2 = new banco("Caixa", "Barcelona");
        cuentaCorriente c1 = new cuentaCorriente("Marta", "53343849H", b1);
        cuentaCorriente c2 = new cuentaCorriente("Carlos", "17452732P");

        c1.ingresarDinero(100);
        c1.mostrarInformacion();

        System.out.println();

        if (c1.sacarDinero(60)) {
            System.out.println("Operación realizada exitosamente.");
        } else {
            System.out.println("NO SE HA PODIDO SACAR EL DINERO.");
        }
        if (c1.sacarDinero(95)) {
            System.out.println("Operación realizada exitosamente.");
        } else {
            System.out.println("NO SE HA PODIDO SACAR EL DINERO.");
        }

        System.out.println();

        c1.cambiarNombreB(b2);
        c1.mostrarInformacion();

        System.out.println();

        c2.mostrarInformacion();
        c2.cambiarNombreB(b2);
        c2.mostrarInformacion();

    }
}