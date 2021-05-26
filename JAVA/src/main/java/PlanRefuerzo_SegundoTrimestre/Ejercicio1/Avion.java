package PlanRefuerzo_SegundoTrimestre.Ejercicio1;

public class Avion {
    private String aerolinea;
    private double longitud;
    private String modelo;
    private ModoVuelo ModoVuelo;

    public Avion(String aerolinea, double longitud, String modelo, PlanRefuerzo_SegundoTrimestre.Ejercicio1.ModoVuelo modoVuelo) {
        this.aerolinea = aerolinea;
        this.longitud = longitud;
        this.modelo = modelo;
        ModoVuelo = modoVuelo;
    }


    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setModoVuelo(PlanRefuerzo_SegundoTrimestre.Ejercicio1.ModoVuelo modoVuelo) {
        ModoVuelo = modoVuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getModelo() {
        return modelo;
    }

    public PlanRefuerzo_SegundoTrimestre.Ejercicio1.ModoVuelo getModoVuelo() {
        return ModoVuelo;
    }

    public void despegar(){
        System.out.println("El avion está despegando");
    }

    public void aterrizar(){
        System.out.println("El avion está aterrizando");
    }

    public void volar(){
        System.out.println("El avion está volando");
    }



    @Override
    public String toString() {
        return "Avion{" +
                "aerolinea='" + aerolinea + '\'' +
                ", longitud=" + longitud +
                ", modelo='" + modelo + '\'' +
                ", ModoVuelo=" + ModoVuelo +
                '}';
    }
}