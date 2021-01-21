package UNIDAD4.Tarea1.Ejercicio9;

public class jefe {
    String nombre;
    String dni;

    public jefe (String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    public void mostrarInfo(){
        System.out.println(this.nombre+" "+this.dni);
    }
}
