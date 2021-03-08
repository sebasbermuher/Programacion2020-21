package UNIDAD6.Tarea3.Ejercicio1;

public class Cliente {
    private int edad;

    public Cliente(int edad) throws Edad {
        setEdad(edad);
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws Edad {
        if (edad < 0 || edad > 100) {
            throw new Edad(edad);
        } else if (edad < 18) {
            throw new Edad(edad);
        }
        this.edad = edad;
    }
}