package UNIDAD9.U8U9_Examen.Ejercicio4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrdersModel {

    public static Integer insertarPedido(Orders orders) throws SQLException{
        Integer rowsAffected=0;
        Connection con= ConexionBD.getConnection();

        String sql="INSERT INTO orders VALUES (?,?,?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,orders.getOrderNumber());
        sentencia.setString(2,orders.getOrderDate());
        sentencia.setString(3,orders.getRequiredDate());
        sentencia.setString(4,orders.getShippedDate());
        sentencia.setString(5,orders.getStatus());
        sentencia.setString(6,orders.getComments());
        sentencia.setInt(7,orders.getCustomerNumber());


        rowsAffected=sentencia.executeUpdate();

        return rowsAffected;
    }

}

