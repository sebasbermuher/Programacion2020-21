package UNIDAD9.U8U9_Examen.Ejercicio3;


import com.google.gson.Gson;

import java.sql.*;
import java.util.ArrayList;


public class Consultas {
    public static void main(String[] args) {
        System.out.println("Las oficinas son:");
        MostrarOficinas();

        System.out.println("------------------------------------------------");
        System.out.println("Informacion de las oficinas mostradas en JSON:");

        Oficinas ofi1 = new Oficinas(1, "San Francisco", "+1 650 219 4782","100 Market Street","Suite 300","CA","USA", "94080","NA");
        Oficinas ofi2 = new Oficinas(2, "Boston", "+1 215 837 0825","1550 Court Place","Suite 102","MA","USA", "02107","NA");
        Oficinas ofi3 = new Oficinas(3, "NYC", "+1 212 555 3000","523 East 53rd Street","apt. 5A","CY","USA", "10022","NA");
        Oficinas ofi4 = new Oficinas(4, "Paris", "+33 14 723 4404","43 Rue Jouffroy D'abbans","NULL","NULL","France", "75017","EMEA");
        Oficinas ofi5 = new Oficinas(5, "Tokyo", "+81 33 224 5000","4-1 Kioicho","NULL","CA","Japan", "102-8578","Japan");
        Oficinas ofi6 = new Oficinas(6, "Sydney", "+61 2 9264 2451","5-11 Wentworth Avenue","Floor #2","NULL","Australia", "NSW 2010","APAC");
        Oficinas ofi7 = new Oficinas(7, "London", "+44 20 7877 2041","25 Old Broad Street","Level 7","NULL","UK", "EC2N 1HN","EMEA");
        Oficinas ofi8 = new Oficinas(8, "Sevilla", "+34 955 123 123","Avda Castilleja","default","","Spain", "41940","EMEA");
        Oficinas ofi9 = new Oficinas(9, "Sevilla", "662057896","Avda San Francisco","Ninguna","Andalucia","EspaÃ±a", "41920","EMEA");


        Gson gson = new Gson();


        ArrayList<Oficinas> detalles2 = new ArrayList<>();
        detalles2.add(ofi1);
        detalles2.add(ofi2);
        detalles2.add(ofi3);
        detalles2.add(ofi4);
        detalles2.add(ofi5);
        detalles2.add(ofi6);
        detalles2.add(ofi7);
        detalles2.add(ofi8);
        detalles2.add(ofi9);


        System.out.println(gson.toJson(detalles2));

        System.out.println("------------------------------------------------");
    }

    public static void MostrarOficinas(){
        try {
            Connection con = ConexionBD.getConnection();
            String sql = "SELECT * FROM `offices`";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();


            while (rs.next()) {
                System.out.println("------------------------------------------------");
                System.out.println("Codigo = "+rs.getString("officeCode"));
                System.out.println("Ciudad = "+rs.getString("city"));
                System.out.println("Telefono = "+rs.getString("phone"));
                System.out.println("Direccion 1 = "+rs.getString("addressLine1"));
                System.out.println("Direccion 2 = "+rs.getString("addressLine2"));
                System.out.println("Estado = "+rs.getString("state"));
                System.out.println("Pais = "+rs.getString("country"));
                System.out.println("Codigo Postal = "+rs.getString("postalcode"));
                System.out.println("Territorio = "+rs.getString("territory"));
                System.out.println("------------------------------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    }
