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
    CuentaCorriente c1= new CuentaCorriente("Sebastian", "12345678A");
    c1.limite=-100;
    c1.ingreso(1000);
    c1.sacar(300);
    c1.mostrarInformacion();

    System.out.println("Puedo sacar 700€: " + c1.sacar(700));
    System.out.println("Puedo sacar 300€: " + c1.sacar(500));
  }
}
