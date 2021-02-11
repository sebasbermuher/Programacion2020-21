package UNIDAD5.Examen1920;

public class Metal implements Mezclar {
    private String nombre;
    private boolean imantable;
    public Metal(String nombre, boolean imantable) {
        this.nombre=nombre;
        this.imantable=imantable;
    }

    @Override
    public String MezclarConMaterial(String nombreMaterial) {
        return nombre + " de " + nombreMaterial;
    }

    public boolean isImantable() {
        return imantable;
    }

    @Override
    public String toString() {
        return "El metal " + nombre + " es imantable:  " + imantable;
    }
}
