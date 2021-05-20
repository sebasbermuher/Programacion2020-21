package UNIDAD9.U8U9_Examen.Ejercicio4;

import java.sql.Connection;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) {
        Connection con= ConexionBD.getConnection();

        try{
            con.setAutoCommit(false);

            //Insertar nuevo pedido
            OrdersModel.insertarPedido(
                    new Orders(
                            100,
                            "2020/05/17",
                            "2020/05/23",
                            "2020/05/20",
                            "Shipped",
                            "Sin comentarios",
                            199));
            con.commit();
            System.out.println("Nueva pedidio creado");

            //Insertar nuevo detalle de pedido
            OrderDetailsModel.insertarPedidoDetails(
                    new OrderDetails(
                            100,
                            "S18_2325",
                            1,
                            48,
                            3));
            con.commit();
            System.out.println("Nuevo detalle de pedido creado");

            //Insertar nuevo detalle de pedido
            OrderDetailsModel.insertarPedidoDetails(
                    new OrderDetails(
                            100,
                            "S24_2022",
                            30,
                            136,
                            3));
            con.commit();
            System.out.println("Nuevo detalle de pedido creado");



        }catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (con!=null){
                    System.out.println("Estado consistente");
                    con.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }
    }
}

