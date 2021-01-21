package UNIDAD4.Tarea1.Ejercicio2;

class CuentaCorriente {
  double saldo;
  String nombre;
  String dni;
  double limite;

  CuentaCorriente(String nombre_titular, String dni){
    saldo=0;
    this.nombre=nombre_titular;
    this.dni=dni;
    limite=-50;
  }

  CuentaCorriente(double saldo){
    this.saldo=0;
    this.nombre="Sin asignar";
    this.dni="Sin asignar";
    this.limite=0;
  }

  CuentaCorriente(double saldo, double limite, String dni){
    this.saldo=saldo;
    this.nombre="Sin asignar";
    this.dni=dni;
    this.limite=limite;
  }
  void mostrarInformacion(){
    System.out.println("Nombre: " +nombre);
    System.out.println("Dni: " +dni);
    System.out.println("Saldo: " +saldo);
    System.out.println("Limite descubierto: " +limite);
  }

  }

