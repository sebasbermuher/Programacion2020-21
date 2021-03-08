package UNIDAD5.Examen1920;

public class Roca implements Mezclar {
    private String nombre;
    private int dureza;
    public Roca(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String MezclarConMaterial(String nombreMaterial) {
        return nombre + " de " + nombreMaterial;
    }

    public int getDureza() {
        return dureza;
    }

    @Override
    public String toString() {
        return "La roca " + nombre + " tiene una dureza de " + dureza;
    }
}