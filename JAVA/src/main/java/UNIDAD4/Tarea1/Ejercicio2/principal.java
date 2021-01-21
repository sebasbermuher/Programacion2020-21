/*
En la clase CuentaCorriente, sobrecargar los constructores para que permitan crear objetos:
-solo con el saldo inicial, no serán necesarios los datos del titular.
Por defecto el límite de descubierto será 0 euros.
-con un saldo inicial, con un límite de descubierto y con el DNI del titular de la cuenta.
 */

package UNIDAD4.Tarea1.Ejercicio2;

public class principal {
  public static void main(String[] args) {
    CuentaCorriente c1, c2, c3;
    c1=new CuentaCorriente("Sebastian", "12345678A");
    c2=new CuentaCorriente(1000);
    c3=new CuentaCorriente(1000,50,"12345678A");

    c1.mostrarInformacion();
    c2.mostrarInformacion();
    c3.mostrarInformacion();

  }
}