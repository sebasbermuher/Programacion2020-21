package UNIDAD8.Ejemplo_Venta.ventas_retrofit;


import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private Integer id;
    private Date fecha;
    private String cliente;
    private ArrayList<DetalleVenta> detalle;

    public Venta(Date fecha, String cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleVenta> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<DetalleVenta> detalle) {
        this.detalle = detalle;
    }


    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", cliente='" + cliente + '\'' +
                ", detalle=" + detalle +
                '}';
    }
}
