package Refuerzo_Ex_Eval_2.Ejercicio1;

import java.util.Objects;

public class Revisiones {
    private String fecha;
    private boolean BuenEstado;
    private double precio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Revisiones)) return false;
        Revisiones revisiones = (Revisiones) o;
        return Double.compare(revisiones.precio, precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }

    public Revisiones(String fecha, boolean buenEstado, double precio) {
        this.fecha = fecha;
        BuenEstado = buenEstado;
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isBuenEstado() {
        return BuenEstado;
    }

    public void setBuenEstado(boolean buenEstado) {
        BuenEstado = buenEstado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Revisiones{" +
                "fecha='" + fecha + '\'' +
                ", BuenEstado=" + BuenEstado +
                ", precio=" + precio +
                '}';
    }
}
