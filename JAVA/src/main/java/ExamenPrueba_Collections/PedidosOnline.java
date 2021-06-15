package ExamenPrueba_Collections;

import java.io.Serializable;
import java.util.TreeSet;

public class PedidosOnline extends Pedido implements Serializable {

    protected String ip;
    protected MetodoPago pago;

    public PedidosOnline(int id, String fecha_realizacion, String fecha_entrega, String ip, MetodoPago pago) {
        super(id, fecha_realizacion, fecha_entrega);
        this.ip = ip;
        this.pago = pago;
        productos = new TreeSet<>();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public MetodoPago getPago() {
        return pago;
    }

    public void setPago(MetodoPago pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return super.toString() +
                " PedidosOnline " + "\n"+
                "  ip: " + ip + "\n"+
                "  pago: " + pago;
    }



}
