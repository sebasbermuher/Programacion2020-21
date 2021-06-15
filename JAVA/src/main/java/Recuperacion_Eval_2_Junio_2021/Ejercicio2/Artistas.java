package Recuperacion_Eval_2_Junio_2021.Ejercicio2;

import java.io.Serializable;

public class Artistas implements Serializable, Comparable<Artistas> {
    private String nombre;
    private int cache;
    private Managers managers;
    private Estilo estilo;

    public Artistas(String nombre, int cache, Managers managers, Estilo estilo) {
        this.nombre = nombre;
        this.cache = cache;
        this.managers = managers;
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Artistas{" +
                "nombre='" + nombre + '\'' +
                ", cache=" + cache +
                ", managers=" + managers +
                ", estilo=" + estilo +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public Managers getManagers() {
        return managers;
    }

    public void setManagers(Managers managers) {
        this.managers = managers;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    @Override
    public int compareTo(Artistas o) {
        return o.getCache()-getCache();
    }
}
