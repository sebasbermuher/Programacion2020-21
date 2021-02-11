package UNIDAD5.U5_Entregable;

public class Pais {
    private String nombre;
    private int participantes;

    public Pais(String nombre, int participantes) {
        this.nombre = nombre;
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return "Pais: "+nombre+
                "Participantes: " + participantes;
    }
}
