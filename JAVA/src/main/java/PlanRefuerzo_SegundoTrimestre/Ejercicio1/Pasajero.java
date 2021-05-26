package PlanRefuerzo_SegundoTrimestre.Ejercicio1;

public class Pasajero {
    private String nombre;
    private String direccion;
    private int num_pasaporte;
    private Estado Estado;


    public Pasajero(String nombre, String direccion, int num_pasaporte, PlanRefuerzo_SegundoTrimestre.Ejercicio1.Estado estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.num_pasaporte = num_pasaporte;
        Estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNum_pasaporte(int num_pasaporte) {
        this.num_pasaporte = num_pasaporte;
    }

    public void setEstado(PlanRefuerzo_SegundoTrimestre.Ejercicio1.Estado estado) {
        Estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNum_pasaporte() {
        return num_pasaporte;
    }

    public PlanRefuerzo_SegundoTrimestre.Ejercicio1.Estado getEstado() {
        return Estado;
    }

    public void embarcar(){
        if(Estado==Estado.EMBARCADO){
            System.out.println("El pasajero "+nombre+" ha embarcado");
        }else{
            System.out.println("El pasajero "+ nombre+" está pendiente de embarcar");
        }

    }

    public void sonreir(){
        System.out.println("El pasajero esta sonriendo");
    }

    public void andar(){
        System.out.println("El pasajero esta sonriendo");
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", num_pasaporte=" + num_pasaporte +
                ", Estado=" + Estado +
                '}';
    }


}
