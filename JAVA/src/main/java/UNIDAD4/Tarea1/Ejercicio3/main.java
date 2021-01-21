/*
Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas,
y la visibilidad de sus atributos para que:
-saldo y limite no sean visibles para otras clases
-nombre sea público para cualquier clase
-dni solo sea visible por clases vecinas
 */
package UNIDAD4.Tarea1.Ejercicio3;

public class main {
    public static void main (String[] args){
        cuentaCorriente c1;

        c1= new cuentaCorriente();
      //  c1.saldo=2000;
        c1.dni="11111111T";
        c1.nombre="Antonio";
        //c1.limite=-100;
 }
}
