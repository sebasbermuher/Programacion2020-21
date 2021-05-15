package UNIDAD9.EntregableUNIDAD9.Transacciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomersMoodel {
    public static void insertCustomers(Customers customers) throws SQLException {
        Connection con= ConexionBD.getConnection();

        String sql="INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,customers.getNumber());
        sentencia.setString(2,customers.getName());
        sentencia.setString(3,customers.getContactLastName());
        sentencia.setString(4,customers.getContactFirstName());
        sentencia.setString(5,customers.getPhone());
        sentencia.setString(6,customers.getDireccion());
        sentencia.setString(7,customers.getDireccion2());
        sentencia.setString(8,customers.getCity());
        sentencia.setString(9,customers.getState());
        sentencia.setString(10,customers.getCodigopostal());
        sentencia.setString(11,customers.getCountry());
        sentencia.setString(12,customers.getEmpleado_id());
        sentencia.setString(13,customers.getLimitecred());



        sentencia.executeUpdate();
    }

}
