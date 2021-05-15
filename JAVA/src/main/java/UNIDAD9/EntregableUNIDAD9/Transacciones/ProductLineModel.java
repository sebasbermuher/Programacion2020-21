package UNIDAD9.EntregableUNIDAD9.Transacciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductLineModel {

    public static Integer inserProductLine(ProductLine productLine) throws SQLException{
        Integer rowsAffected=0;
        Connection con= ConexionBD.getConnection();

        String sql="INSERT INTO productlines VALUES (?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setString(1,productLine.getProductLine());
        sentencia.setString(2,productLine.getTextDecription());
        sentencia.setString(3,productLine.getHtmlDescription());
        sentencia.setString(4,productLine.getImage());

        rowsAffected=sentencia.executeUpdate();

        return rowsAffected;
    }

}
