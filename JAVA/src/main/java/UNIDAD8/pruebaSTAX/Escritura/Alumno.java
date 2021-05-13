package UNIDAD8.pruebaSTAX.Escritura;

public class Alumno {
    private String nombre;
    private String apellidos;


    //Constructor por defecto
    public Alumno() {

    }

    //Constructor para usar a la hora de escribir en el fichero
    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    @Override
    public String toString() {
        return "Alumno{" +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                "}\n";
    }
}
