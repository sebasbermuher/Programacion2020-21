package Recu_Eval_2_Junio_2019_20.Ejercicio2;

public class Territorio implements Comparable<Territorio> {
    // Atributos.
    private String nombre_territorio;

    // Constructor.
    public Territorio(String nombre_territorio) {
        setNombre_territorio(nombre_territorio);
    }

    @Override
    public int compareTo(Territorio otro_territorio) {
        return this.getNombre_territorio().compareTo(otro_territorio.getNombre_territorio());
    }

    @Override
    public String toString() {
        return "Territorio{" + nombre_territorio + '\'' + '}';
    }

    // Get and Set
    public String getNombre_territorio() {
        return nombre_territorio;
    }

    public void setNombre_territorio(String nombre_territorio) {
        this.nombre_territorio = nombre_territorio;
    }
}