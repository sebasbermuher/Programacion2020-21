package Recuperacion_Eval_2_Mayo_2021.Ejercicio1;

import java.util.Objects;

public class Revision implements Comparable<Revision>{
    private String fecha;
    private boolean buenEstado;
    private int precio;

    public Revision(String fecha, boolean buenEstado, int precio) {
        this.fecha = fecha;
        this.buenEstado = buenEstado;
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }

    public void setBuenEstado(boolean buenEstado) {
        this.buenEstado = buenEstado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Revision o) {
        return o.getPrecio()-this.getPrecio();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Revision revision = (Revision) o;
        return fecha.equals(revision.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha);
    }
}