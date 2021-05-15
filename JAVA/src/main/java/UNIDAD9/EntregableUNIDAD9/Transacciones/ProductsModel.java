package UNIDAD9.EntregableUNIDAD9.Transacciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductsModel {

    public static Integer insertProducts(Products products) throws SQLException{
        Integer rowsAffected=0;
        Connection con= ConexionBD.getConnection();

        String sql="INSERT INTO products VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setString(1,products.getProductCode());
        sentencia.setString(2,products.getProductName());
        sentencia.setString(3,products.getProductLine());
        sentencia.setString(4,products.getProductScale());
        sentencia.setString(5,products.getProductVendor());
        sentencia.setString(6,products.getProductDescription());
        sentencia.setString(7,products.getQuantityInStock());
        sentencia.setString(8,products.getBuyPrice());
        sentencia.setString(9,products.getMSRP());


        rowsAffected=sentencia.executeUpdate();

        return rowsAffected;
    }
}