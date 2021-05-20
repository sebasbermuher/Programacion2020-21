package UNIDAD9.U8U9_Examen.Ejercicio4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailsModel {

    public static Integer insertarPedidoDetails(OrderDetails ordersdetails) throws SQLException{
        Integer rowsAffected=0;
        Connection con= ConexionBD.getConnection();

        String sql="INSERT INTO orderdetails VALUES (?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,ordersdetails.getOrderNumber());
        sentencia.setString(2,ordersdetails.getProductCode());
        sentencia.setInt(3,ordersdetails.getQuantityOrdered());
        sentencia.setInt(4,ordersdetails.getPriceEach());
        sentencia.setInt(5,ordersdetails.getOrderLineNumber());

        rowsAffected=sentencia.executeUpdate();

        return rowsAffected;
    }

}

