package PlanRefuerzo_SegundoTrimestre.Ejercicio3;


import java.util.Arrays;

public class Vuelo {
    private Avion avion;
    private String fecha;
    private String aeropuerto_origen;
    private String aeropuerto_destino;
    private static Pasajeros[] pasajeros=new Pasajeros[1];

    public Vuelo(Avion avion, String fecha, String aeropuerto_origen, String aeropuerto_destino, Pasajeros pasajeros) {
        this.avion = avion;
        this.fecha = fecha;
        this.aeropuerto_origen = aeropuerto_origen;
        this.aeropuerto_destino = aeropuerto_destino;
        getPasajeros()[0] = pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "avion='" + avion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", aeropuerto_origen='" + aeropuerto_origen + '\'' +
                ", aeropuerto_destino='" + aeropuerto_destino + '\'' +
                '}';
    }

    public void anadirPasajero(Pasajeros pasajero) {
        for (int i = 0; i < getPasajeros().length; i++) {
            if (pasajero.equals(getPasajeros()[i])) {
                System.out.println("ERROR: Este pasajero ya se encuentra introducido");
                break;
            } else if (i + 1 == getPasajeros().length) {
                setPasajeros(Arrays.copyOf(getPasajeros(), getPasajeros().length + 1));
                getPasajeros()[getPasajeros().length - 1] = pasajero;
                System.out.println("El pasajero ha sido añadido");
                break;
            }
        }
    }

    public void eliminarPasajero(int pasporte) {
        for (int i = 0; i < getPasajeros().length; i++) {
            if (pasporte == getPasajeros()[i].getNum_pasaporte()) {
                for (int j = i + 1; j < getPasajeros().length; j++) {
                    getPasajeros()[i] = getPasajeros()[j];
                }
            }
        }
        System.out.println("El pasajero ha sido eliminado");
        setPasajeros(Arrays.copyOf(getPasajeros(), getPasajeros().length - 1));
    }

    public void lista_de_pasajeros() {
        System.out.println(Arrays.toString(getPasajeros()));
    }



    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAeropuerto_origen() {
        return aeropuerto_origen;
    }

    public void setAeropuerto_origen(String aeropuerto_origen) {
        this.aeropuerto_origen = aeropuerto_origen;
    }

    public String getAeropuerto_destino() {
        return aeropuerto_destino;
    }

    public void setAeropuerto_destino(String aeropuerto_destino) {
        this.aeropuerto_destino = aeropuerto_destino;
    }

    public static Pasajeros[] getPasajeros() {
        return pasajeros;
    }

    public static void setPasajeros(Pasajeros[] pasajeros) {
        Vuelo.pasajeros = pasajeros;
    }
}
