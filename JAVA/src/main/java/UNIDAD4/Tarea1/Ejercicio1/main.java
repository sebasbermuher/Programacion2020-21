/*
Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son:
saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero),
nombre y DNI del titular. Las operaciones típicas con una cuenta corriente son:
-Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de
descubierto será de -50 euros.
-Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe indicar,
por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación. Además, deberá devolver
un valor booleano que indique lo mismo.
-Ingresar dinero: se incrementa el saldo.
-Mostrar información: muestra la información de la cuenta corriente.
 */
package UNIDAD4.Tarea1.Ejercicio1;

public class main {
  public static void main(String[] args) {

    cuentaCorriente c1 = new cuentaCorriente();
    c1.crear_cuenta("Sebastian", "85236974J");
    c1.mostrar_informacion();

    if (c1.sacar(60)) {
      System.out.println("He podido sacar dinero");
    } else {
      System.out.println("No he podido sacar dinero");
    }
    if (c1.sacar(20)) {
      System.out.println("He podido sacar dinero");
    } else {
      System.out.println("No he podido sacar dinero");
    }
    c1.mostrar_informacion();

    c1.ingresar(519);
    c1.mostrar_informacion();
  }
}
