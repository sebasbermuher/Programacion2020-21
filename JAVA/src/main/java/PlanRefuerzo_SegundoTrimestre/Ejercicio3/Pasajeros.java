package PlanRefuerzo_SegundoTrimestre.Ejercicio3;

public class Pasajeros {
    private String nombre;
    private String direccion;
    private int num_pasaporte;

    public Pasajeros(String nombre, String direccion, int num_pasaporte) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.num_pasaporte = num_pasaporte;
    }

    @Override
    public String toString() {
        return "Pasajeros{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", num_pasaporte=" + num_pasaporte +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNum_pasaporte() {
        return num_pasaporte;
    }

    public void setNum_pasaporte(int num_pasaporte) {
        this.num_pasaporte = num_pasaporte;
    }
}
