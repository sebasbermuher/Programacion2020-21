package Refuerzo_Ex_Unidad4y5;

public class Conductor {
    private String nombre;
    private String apellidos;
    private String num_SS;

    public Conductor(String nombre, String apellidos, String num_SS) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_SS = num_SS;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", num_SS='" + num_SS + '\'' +
                '}';
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

    public String getNum_SS() {
        return num_SS;
    }

    public void setNum_SS(String num_SS) {
        this.num_SS = num_SS;
    }
}
