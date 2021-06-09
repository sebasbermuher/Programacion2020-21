package PlanRefuerzo_SegundoTrimestre.Ejercicio4;

import java.util.Arrays;

public class Aeropuerto {
    private String nombre;
    private Vuelo[] vuelos;

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", vuelos=" + Arrays.toString(vuelos) +
                '}';
    }

    public Aeropuerto(String nombre) {
        this.nombre = nombre;
        this.vuelos = new Vuelo[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vuelo[] getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelo[] vuelos) {
        this.vuelos = vuelos;
    }


    public void anadirVuelo(Vuelo vuelo) {
        if (vuelo.getAeropuerto_origen().equals(getNombre())) {
            setVuelos(Arrays.copyOf(getVuelos(), getVuelos().length + 1));
            getVuelos()[getVuelos().length-1] = vuelo;
            System.out.println("El vuelo ha sido añadido");
        } else {
            System.out.println("ERROR. El aeropuerto no coincide");
        }
    }

    public void eliminarVuelo(Vuelo vuelo) {
        for (int i = 0; i < getVuelos().length; i++) {
            if (getVuelos()[i].equals(vuelo)) {
                for (int j = 0; j < getVuelos().length; j++) {
                    getVuelos()[i] = getVuelos()[j];
                }
                setVuelos(Arrays.copyOf(getVuelos(), getVuelos().length - 1));
                System.out.println("El vuelo ha sido eliminado");
                break;
            } else {
                System.out.println("ERROR. EL vuelo no está introducido");
                break;
            }
        }
    }



    public void mostrarVuelos(String fecha) {
        Vuelo[] vuelo = new Vuelo[0];
        for (int i = 0; i < getVuelos().length; i++) {
            if (getVuelos()[i].getFecha().equals(fecha)) {
                vuelo = Arrays.copyOf(vuelo, vuelo.length + 1);
                vuelo[vuelo.length - 1] = getVuelos()[i];
            }
        }
        System.out.println(Arrays.toString(vuelo));
    }

}
