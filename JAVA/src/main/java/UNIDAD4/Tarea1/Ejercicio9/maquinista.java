package UNIDAD4.Tarea1.Ejercicio9;

public class maquinista {
    String nombre;
    String dni;
    double sueldo;
    String rango;

    public maquinista (String nombre, String dni, double sueldo, String rango){
        this.nombre=nombre;
        this.dni=dni;
        this.sueldo=sueldo;
        this.rango=rango;
    }

    public void mostrarInfo(){
        System.out.println(this.nombre+" "+this.dni+" "+this.sueldo+" "+this.rango);

    }
}
