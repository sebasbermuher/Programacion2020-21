package UNIDAD4.Tarea1.Ejercicio1;

public class cuentaCorriente {
  // Atributos:
  private long saldo;
  private long limite;
  private String nombre;
  private String dni;

  void crear_cuenta(String nombre_titular, String dni) {
    this.nombre = nombre_titular;
    this.dni = dni;
    this.saldo = 0;
    this.limite = -50;
  }

  boolean sacar(int cantidad) {
    boolean resultado = false;
    if (this.saldo - cantidad >= this.limite) {
      this.saldo -= cantidad;
    }
    return true;
  }

  void ingresar(int cantidad) {
    if (cantidad > 0) {
      this.saldo += cantidad;
    }
  }

  void mostrar_informacion() {
    System.out.println(
        "El saldo de la cuenta es "
            + saldo
            + ", el limite es "
            + limite
            + ", el nombre del titular es "
            + nombre
            + ", y su DNI es "
            + dni);
  }
}
