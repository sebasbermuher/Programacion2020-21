package UNIDAD6.Tarea3.Ejercicio2;

public class Cliente {
    private String nombre;
    private String apellidos;
    private int edad;

    public Cliente(String nombre, String apellidos, int edad) throws EdadErroneaException, MenorEdadException {
        this.nombre = nombre;
        this.apellidos = apellidos;
        if (edad < 0 || edad > 100) {
            throw new EdadErroneaException("ERROR: La edad debe ser superior a 0 e inferior a 100");
        } else if (edad < 18) {
            throw new MenorEdadException("ERROR: Esta persona tiene menos de 18 años, por lo tanto es menor de edad");
        } else {
            this.edad = edad;
        }
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }
}