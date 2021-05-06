package pruebaSTAX.Lectura;

public class Alumno {
    private int id;
    private String nombre;
    private String apellidos;


    //Constructor por defecto
    public Alumno() {

    }

    //Constructor para usar a la hora de escribir en el fichero
    public Alumno(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                "}\n";
    }
}
