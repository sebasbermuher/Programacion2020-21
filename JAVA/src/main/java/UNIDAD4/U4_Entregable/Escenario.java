package UNIDAD4.U4_Entregable;

public class Escenario {
    double pixel_altura;
    double pixel_longitud;
    int anillos;
    int gemas;


    public Escenario (double pixel_altura, double pixel_longitud, int anillos, int gemas) {
        this.pixel_altura = pixel_altura;
        this.pixel_longitud = pixel_longitud;
        this.anillos = anillos;
        this.gemas = gemas;
    }
    public void mostrarInfo(){
        System.out.println(this.pixel_altura+" "+this.pixel_longitud+" "+this.anillos+" "+this.gemas);

    }
}
