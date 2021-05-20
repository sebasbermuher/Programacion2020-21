package UNIDAD9.Tarea3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection con=null;
    public static Connection getConnection(){
        try{
            if( con == null ){
                String driver="com.mysql.cj.jdbc.Driver";
                String url="jdbc:mysql://localhost/classicmodels?autoReconnect=true";
                String pwd="usuario";
                String usr="usuario";
                Class.forName(driver);
                con = DriverManager.getConnection(url,usr,pwd);
                System.out.println("Conection Succesfull");
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }

    public static void close() {
        try {
            if (con != null){
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}