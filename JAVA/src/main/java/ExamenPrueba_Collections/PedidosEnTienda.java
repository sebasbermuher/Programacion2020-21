package ExamenPrueba_Collections;

import java.io.Serializable;
import java.util.Objects;

public class PedidosEnTienda extends Pedido implements Serializable {

    protected String direccion;

    public PedidosEnTienda(int id, String fecha_realizacion, String fecha_entrega, String direccion) {
        super(id, fecha_realizacion, fecha_entrega);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"+
                "  Pedidos En Tienda " + "\n"+
                "  direccion: " + direccion ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PedidosEnTienda that = (PedidosEnTienda) o;
        return Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), direccion);
    }
}
