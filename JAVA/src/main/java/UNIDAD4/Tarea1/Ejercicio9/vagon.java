package UNIDAD4.Tarea1.Ejercicio9;

public class vagon {
    int capacidadMax;
    int capacidadActual;
    String tipoMercancia;


    vagon(int capacidadMax, int capacidadActual, String tipoMercancia){
        this.capacidadMax=capacidadMax;
        this.capacidadActual=capacidadActual;
        this.tipoMercancia=tipoMercancia;
    }

    void mostrarInfo(){
        System.out.println(this.capacidadMax+" "+this.capacidadActual+" "+this.tipoMercancia);
    }
}
