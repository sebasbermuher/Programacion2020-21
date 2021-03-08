package UNIDAD6.Tarea3.Ejercicio1;

public class Edad extends Exception{
    private Integer edad;

    public Edad(Integer edad) {
        super();
        this.edad = edad;
    }
    @Override
    public String getMessage() {
        String error = "";
        if (edad < 0 || edad > 100) {
            error = "ERROR: La edad es " + edad + " y debe ser mayor de 0 o menor de 100";
        } else if (edad < 18) {
            error = "ERROR: Esta persona es menor de edad";
        }
        return error;
    }
}
