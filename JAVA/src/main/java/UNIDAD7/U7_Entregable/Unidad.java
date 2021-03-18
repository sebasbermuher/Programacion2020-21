package UNIDAD7.U7_Entregable;

import java.util.ArrayList;

public class Unidad extends Alumnos {
    String unidad;
    ArrayList<Alumnos> ListaAlumnos;

public Unidad(String nombre, String apellidos, String dni, String unidad, ArrayList<Alumnos> ListaAlumnos){
    super(nombre, apellidos, dni, unidad);
    this.unidad=unidad;
    this.ListaAlumnos=ListaAlumnos;

}
}
