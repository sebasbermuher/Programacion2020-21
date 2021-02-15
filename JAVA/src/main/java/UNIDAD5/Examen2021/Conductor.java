package UNIDAD5.Examen2021;

public class Conductor {
    public String nombre;
    public String apellidos;
    public String num_seguridad_social;


    public Conductor(String nombre, String apellidos, String num_seguridad_social) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_seguridad_social = num_seguridad_social;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre + "\n"+
                "Apellidos: " + apellidos + "\n" +
                "Seguridad Social: " + num_seguridad_social;
    }
}