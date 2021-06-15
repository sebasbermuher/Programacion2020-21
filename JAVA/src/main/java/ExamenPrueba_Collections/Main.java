package ExamenPrueba_Collections;

public class Main {
    public static void main(String[] args) {
        Productos p1 = new Productos("Camiseta", 1,2.99, 1);
        Productos p2 = new Productos("Camiseta", 1,2.99, 1);
        Productos p3 = new Productos("Pantalon", 1,14.69, 2);
        Productos p4 = new Productos("Vestido", 1,22.01, 3);
        Productos p5 = new Productos("Jersey", 1,7.99, 4);
        Productos p6 = new Productos("Vestido", 1,22.01, 3);
        Productos p7 = new Productos("Camiseta", 1,2.99, 1);
        Productos p8 = new Productos("Camiseta", 1,2.99, 1);
        Productos p9 = new Productos("Camiseta", 1,2.99, 1);
        Productos p10 = new Productos("Camiseta", 1,2.99, 1);

        PedidosEnTienda pedido1 = new PedidosEnTienda(100,"01-01-2020","15-01-2020","Calle Almuñecar");
        PedidosEnTienda pedido2 = new PedidosEnTienda(100,"01-01-2020","15-01-2020","Calle Almuñecar");
        PedidosEnTienda pedido4 = new PedidosEnTienda(100,"01-01-2020","15-01-2020","Calle Almuñecar");
        PedidosEnTienda pedido5 = new PedidosEnTienda(100,"01-01-2020","15-01-2020","Calle Almuñecar");
        PedidosEnTienda pedido6 = new PedidosEnTienda(100,"01-01-2020","15-01-2020","Calle Almuñecar");
        PedidosEnTienda pedido7 = new PedidosEnTienda(100,"01-01-2020","15-01-2020","Calle Almuñecar");
        PedidosEnTienda pedido8 = new PedidosEnTienda(100,"01-01-2020","15-01-2020","Calle Almuñecar");

        PedidosOnline online1 = new PedidosOnline(500,"01-01-2020","15-01-2020","192.178.2.1", MetodoPago.PAYPAL );
        PedidosOnline online2 = new PedidosOnline(501,"01-01-2020","15-01-2020","192.178.2.1", MetodoPago.STRIPE );
        PedidosOnline online3 = new PedidosOnline(502,"01-01-2020","15-01-2020","192.178.2.1", MetodoPago.TARJETA_CREDITO );
        PedidosOnline online4 = new PedidosOnline(503,"01-01-2020","15-01-2020","192.178.2.1", MetodoPago.PAYPAL );
        PedidosOnline online5 = new PedidosOnline(504,"01-01-2020","15-01-2020","192.178.2.1", MetodoPago.TARJETA_CREDITO );

        EmpresaOnline empresa = new EmpresaOnline("Alicia S.A.");


        pedido1.addProductos(p1);
        pedido1.addProductos(p2);
        pedido1.addProductos(p7);
        pedido1.addProductos(p8);
        pedido1.addProductos(p4);
        pedido1.addProductos(p5);
        pedido1.deleteProductos(p5);
        pedido1.calcularTotal();

        //System.out.println(pedido1);

        empresa.CargarPedidosOnline();
        empresa.EscribirPedidosOnline();



    }
}
