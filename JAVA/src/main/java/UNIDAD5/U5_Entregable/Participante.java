package UNIDAD5.U5_Entregable;

public abstract class Participante {
    protected String nombre;
    protected int edad;

    public Participante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public abstract void hacerJuramento();

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n" +
                "Edad: " + edad;
    }
    }
