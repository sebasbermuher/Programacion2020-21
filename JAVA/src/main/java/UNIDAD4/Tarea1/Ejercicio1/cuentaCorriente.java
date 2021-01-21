package UNIDAD4.Tarea1.Ejercicio1;

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
  boolean sacar(double cant){ //sacar dinero de la cuenta
    boolean operacionPosible;
    if ((saldo-cant)>=limite){
      saldo-=cant;
      operacionPosible=true;
      }else{
      System.out.println("No hay dinero suficiente");
      operacionPosible=false;
    }
    return(operacionPosible);
  }
  //añadir dinero a la cuenta
  void ingreso(double cant){
    saldo+=cant;
  }
  void mostrarInformacion(){ //muestra el estado de la cuenta
    System.out.println("Nombre: " + nombre);
    System.out.println("Dni; " + dni);
    System.out.println("Saldo: " + saldo);
    System.out.println("Limite descubierto: " + limite);
  }
}
