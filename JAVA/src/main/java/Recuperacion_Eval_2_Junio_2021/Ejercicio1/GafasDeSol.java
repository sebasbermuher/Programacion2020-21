package Recuperacion_Eval_2_Junio_2021.Ejercicio1;

public class GafasDeSol extends Gafa implements interfazPromocion{
    private static double precio_venta;
    private boolean promocion;


    public GafasDeSol(double precio_venta, boolean promocion) {
        this.precio_venta = precio_venta;
        this.promocion = promocion;
        precio_venta++;
    }

    @Override
    public String toString() {
        return "GafasDeSol{" +
                "precio_venta=" + precio_venta +
                ", promocion=" + promocion +
                '}';
    }

    public static double getPrecio_venta() {
        return precio_venta;
    }

    public static void setPrecio_venta(double precio_venta) {
        GafasDeSol.precio_venta = precio_venta;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public  void Promocion() {
        if (promocion=true){
            double cont = precio_venta;
            cont=(precio_venta%20);
            System.out.println("Promocion aplicada. Se ahorra: "+cont +" Euros. Debe de pagar " + (precio_venta-cont) + " Euros.");

        }else {
            precio_venta=precio_venta;
        }
    }
}
