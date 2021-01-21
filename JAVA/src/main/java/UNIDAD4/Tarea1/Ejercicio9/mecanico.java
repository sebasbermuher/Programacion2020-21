package UNIDAD4.Tarea1.Ejercicio9;

public class mecanico {
    String nombre;
    int tlfno;
    String especialidad;

    public mecanico (String nombre, int tlfno, String especialidad){
        this.nombre=nombre;
        this.tlfno=tlfno;
        this.especialidad=especialidad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void mostrarInfo(){
        System.out.println(this.nombre+" "+this.tlfno+" "+this.especialidad);
    }
}