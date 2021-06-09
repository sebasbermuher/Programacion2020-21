package PlanRefuerzo_SegundoTrimestre.Ejercicio3;


public class Avion {
    private String aerolinea;
    private double longitud;
    private String modelo;
    private  ModoVuelo ModoVuelo;
    private static int num_avion=0;

    public Avion(String aerolinea, double longitud, String modelo, PlanRefuerzo_SegundoTrimestre.Ejercicio3.ModoVuelo modoVuelo) {
        this.aerolinea = aerolinea;
        this.longitud = longitud;
        this.modelo = modelo;
        ModoVuelo = modoVuelo;
        num_avion++;
    }

    public PlanRefuerzo_SegundoTrimestre.Ejercicio3.ModoVuelo getModoVuelo() {
        return ModoVuelo;
    }

    public void setModoVuelo(PlanRefuerzo_SegundoTrimestre.Ejercicio3.ModoVuelo modoVuelo) {
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


    public String getAerolinea() {
        return aerolinea;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNum_avion(int num_avion) {
        this.num_avion = num_avion;
    }

    public static int getNum_avion() {
        return num_avion;
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
