package UNIDAD5.Examen1920;

public class Cristal implements Mezclar {
    private String nombre;
    tipo tipo;
    enum tipo{
        TRASPARENTE, TRANSLUCIDO
    }
    public Cristal(String nombre, tipo tipo) {
        this.nombre=nombre;
        this.tipo=tipo;
    }

    @Override
    public String MezclarConMaterial(String nombreMaterial) {
        return nombre + " de " + nombreMaterial;
    }

    public Cristal.tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "El cristal " + nombre + " es " + tipo;
    }
}