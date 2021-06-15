package Recuperacion_Eval_2_Junio_2021.Ejercicio1;


public class GafaGraduada extends Gafa {
    private Montura montura;
    private Lente lente;
    private static double precio_venta;



    public GafaGraduada(Montura montura, Lente lente, double precio_venta) {
        this.montura = montura;
        this.lente = lente;
        this.precio_venta = precio_venta;
        precio_venta++;
    }

    @Override
    public String toString() {
        return "GafaGraduada{" +
                "montura=" + montura +
                ", lente=" + lente +
                ", precio_venta=" + precio_venta +
                '}';
    }

    public Montura getMontura() {
        return montura;
    }

    public void setMontura(Montura montura) {
        this.montura = montura;
    }

    public Lente getLente() {
        return lente;
    }

    public void setLente(Lente lente) {
        this.lente = lente;
    }

    public static double getPrecio_venta() {
        return precio_venta;
    }

    public static void setPrecio_venta(double precio_venta) {
        GafaGraduada.precio_venta = precio_venta;
    }



}
