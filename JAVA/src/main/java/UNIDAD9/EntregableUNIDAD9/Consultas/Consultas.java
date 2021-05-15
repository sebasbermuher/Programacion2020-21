package UNIDAD9.EntregableUNIDAD9.Consultas;

import UNIDAD9.EntregableUNIDAD9.Transacciones.ConexionBD;

import java.sql.*;
import java.util.Scanner;

public class Consultas {
    public static void main(String[] args) {

        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println("PRIMERA FUNCION. PagosClientes()");
        PagosClientes();
        System.out.println("||||||||||||||||||||||||||||||||||||||||");

        System.out.println();

        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println("SEGUNDA FUNCION. InfoPedido()");
        InfoPedido();
        System.out.println("||||||||||||||||||||||||||||||||||||||||");

        System.out.println();

        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println("TERCERA FUNCION. DatosJefe()");
        DatosJefe();
        System.out.println("||||||||||||||||||||||||||||||||||||||||");
    }

    public static void PagosClientes() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=usuario&password=usuario");
            Statement statement = connection.createStatement();

            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca el número del cliente");
            String num_cliente = teclado.nextLine();

            String query = "select * from customers where customerNumber=" + num_cliente;
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                String nombreContactoCliente = rs.getString("contactFirstName");
                String apellidoContactoCliente = rs.getString("contactLastName");
                String pais = rs.getString("country");

                System.out.println("-------------------------");
                System.out.println("Nombre contacto de cliente: " + nombreContactoCliente);
                System.out.println("Apellido contacto de cliente: " + apellidoContactoCliente);
                System.out.println("Pais: " + pais);
                System.out.println("-------------------------");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void InfoPedido(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero del pedido:");
        int numPedido = teclado.nextInt();

        try {
            Connection con = ConexionBD.getConnection();

            String sql = "SELECT orderNumber FROM orders WHERE orderNumber = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            ResultSet rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Numero del pedido incorrecto. Vuelva a introducirlo.");
                numPedido = teclado.nextInt();
                statement.setInt(1,numPedido);
                rs = statement.executeQuery();
            }

            sql = "SELECT * from orderdetails od INNER JOIN products p ON od.productCode = p.productCode WHERE od.orderNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("----------------------------");
                System.out.println("Nombre del producto = "+rs.getString("productName"));
                System.out.println("PriceEach = "+rs.getFloat("priceEach"));
                System.out.println("Cantidad = "+rs.getInt("quantityOrdered"));
                System.out.println("----------------------------");
            }

            sql = "SELECT SUM(priceEach*quantityOrdered)'Total' FROM orderdetails WHERE orderNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            rs = statement.executeQuery();

            rs.next();
            System.out.println("----------------------------");
            System.out.println("Coste total del pedido: "+ rs.getFloat("Total") + " €");
            System.out.println("----------------------------");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void DatosJefe(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=usuario&password=usuario");
            Statement statement = connection.createStatement();

            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca el número del empleado");
            String num_empleado = teclado.nextLine();

            String query = "SELECT lastName ,firstName FROM employees WHERE employeeNumber = (SELECT reportsTo FROM " +
                    "employees WHERE employeeNumber = " + num_empleado + ")";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.println("-------------------------");
                System.out.println("Nombre del jefe: " + rs.getString("firstName"));
                System.out.println("Apellido del jefe: " + rs.getString("lastName"));
                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}