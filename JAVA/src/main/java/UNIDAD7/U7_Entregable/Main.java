package UNIDAD7.U7_Entregable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Alumnos a1 = new Alumnos("Pepito","Palote Gutierrez","12345678A","1ºC");
        Alumnos a2 = new Alumnos("Jorge","Valdano Perez","91234567B","3ºD");
        Alumnos a3 = new Alumnos("Sergio","Canales Ruiz","89123456C","4ºB");
        Alumnos a4 = new Alumnos("Borja","Iglesias de la Fuente","78912345D","4ºB");


        Instituto insti = new Instituto();
        insti.addAlumnoUnidad(a1,"1ºC");
        insti.addAlumnoUnidad(a2,"3ºD");
        insti.addAlumnoUnidad(a3,"4ºB");
        insti.addAlumnoUnidad(a4,"4ºB");

        System.out.println("////LISTA DE LOS ALUMNOS POR ORDEN DE APELLIDOS////");
        insti.mostrarTodosAlumnosOrdenados();

        System.out.println();

        System.out.println("////MOSTRAR ALUMNOS DE LA UNIDAD 4ºB////");
        insti.mostrarAlumnosUnidad("4ºB");

    }

}
