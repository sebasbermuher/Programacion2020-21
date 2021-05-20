package UNIDAD9.Tarea3;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ADClassicModels {

    public ADClassicModels() {
    }

    public boolean insertCustomer() {
        Scanner teclado = new Scanner(System.in);

        Customer customer = new Customer();
        System.out.println("Inserta los datos del cliente:");

        System.out.println("Numero de cliente: ");
        customer.setCustomerNumber(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Nombre del cliente: ");
        customer.setCustomerName(teclado.nextLine());

        System.out.println("Apellido del contacto del cliente: ");
        customer.setContactLastName(teclado.nextLine());

        System.out.println("Nombre del contacto del cliente: ");
        customer.setContactFirstName(teclado.nextLine());

        System.out.println("Numero de contacto: ");
        customer.setPhone(teclado.nextLine());

        System.out.println("1º Dirección: ");
        customer.setAddressLine1(teclado.nextLine());

        System.out.println("2º Dircción: ");
        customer.setAddressLine2(teclado.nextLine());

        System.out.println("Ciudad: ");
        customer.setCity(teclado.nextLine());

        System.out.println("Provincia: ");
        customer.setState(teclado.nextLine());

        System.out.println("Código postal: ");
        customer.setPostalCode(teclado.nextLine());

        System.out.println("Pais: ");
        customer.setCountry(teclado.nextLine());

        System.out.println("Numero del empleado que le atiende al cliente: ");
        customer.setSalesRepEmployeeNumber(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Limite de credito: ");
        customer.setCreditLimit(teclado.nextFloat());
        teclado.nextLine();

        try {
            Connection con = ConexionBD.getConnection();

            String sql = "INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setInt(1, customer.getCustomerNumber());
            statement.setString(2,customer.getCustomerName());
            statement.setString(3,customer.getContactLastName());
            statement.setString(4,customer.getContactFirstName());
            statement.setString(5,customer.getPhone());
            statement.setString(6,customer.getAddressLine1());
            statement.setString(7,customer.getAddressLine2());
            statement.setString(8,customer.getCity());
            statement.setString(9,customer.getState());
            statement.setString(10,customer.getPostalCode());
            statement.setString(11,customer.getCountry());
            statement.setInt(12,customer.getSalesRepEmployeeNumber());
            statement.setFloat(13,customer.getCreditLimit());

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean asignarEmpleado () {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero del empleado:");
        int numEmple = teclado.nextInt();

        System.out.println("Introduce el numero del cliente:");
        int numCustom = teclado.nextInt();

        try {
            Connection con = ConexionBD.getConnection();

            String sqlEmplo = "SELECT employeeNumber FROM employees WHERE employeeNumber = ?";
            PreparedStatement statement = con.prepareStatement(sqlEmplo);
            statement.setInt(1,numEmple);
            ResultSet rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Numero de empleado incorrecto");
                System.out.println("Vuelve a introducir el numero de empleado");
                numEmple = teclado.nextInt();
                statement.setInt(1,numEmple);
                rs = statement.executeQuery();
            }

            String sqlCustom = "SELECT customerNumber FROM customers WHERE customerNumber = ?";
            statement = con.prepareStatement(sqlCustom);
            statement.setInt(1,numCustom);
            rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Numero de cliente incorrecto");
                System.out.println("Vuelve a introducir el numero de cliente");
                numCustom = teclado.nextInt();
                statement.setInt(1,numCustom);
                rs = statement.executeQuery();
            }

            String sql = "UPDATE customers SET salesRepEmployeeNumber = ? WHERE customerNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numEmple);
            statement.setInt(2,numCustom);

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean anadirProductPedido () {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el codigo del producto:");
        String codProduct = teclado.nextLine();

        System.out.println("Introduce el numero del pedido:");
        int numOrder = teclado.nextInt();
        teclado.nextLine();

        try {
            Connection con = ConexionBD.getConnection();

            String sqlProduct = "SELECT productCode FROM products WHERE productCode = ?";
            PreparedStatement statement = con.prepareStatement(sqlProduct);
            statement.setString(1,codProduct);
            ResultSet rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Codigo de producto incorrecto");
                System.out.println("Vuelve a introducir el codigo de producto");
                codProduct = teclado.nextLine();
                statement.setString(1,codProduct);
                rs = statement.executeQuery();
            }

            String sqlOrder = "SELECT orderNumber FROM orders WHERE orderNumber = ?";
            statement = con.prepareStatement(sqlOrder);
            statement.setInt(1,numOrder);
            rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Numero de pedido incorrecto");
                System.out.println("Vuelve a introducir el numero del pedido");
                numOrder = teclado.nextInt();
                statement.setInt(1,numOrder);
                rs = statement.executeQuery();
            }

            System.out.println("Introduce la cantidad del producto a añadir:");
            int cantidad = teclado.nextInt();
            System.out.println("Introduce el numero de linea del pedido(orderLineNumber): ");
            int orderLineNumber = teclado.nextInt();
            System.out.println("Introduce el precio de venta: ");
            float priceEach = teclado.nextFloat();

            String sql = "INSERT INTO orderdetails VALUES (?,?,?,?,?)";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numOrder);
            statement.setString(2,codProduct);
            statement.setInt(3,cantidad);
            statement.setFloat(4,priceEach);
            statement.setInt(5,orderLineNumber);

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void mostrarPedido () {
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
                System.out.println("ERROR - Numero del pedido incorrecto");
                System.out.println("Vuelve a introducir el numero dl pedido");
                numPedido = teclado.nextInt();
                statement.setInt(1,numPedido);
                rs = statement.executeQuery();
            }

            sql = "SELECT * FROM orders WHERE orderNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            rs = statement.executeQuery();

            rs.next();
            System.out.println("----------------------------");
            System.out.println("Pedido:");
            System.out.println("----------------------------");

            System.out.println("orderNumber = "+rs.getInt("orderNumber"));
            System.out.println("orderDate = "+rs.getString("orderDate"));
            System.out.println("requiredDate = "+rs.getString("requiredDate"));
            System.out.println("shippedDate = "+rs.getString("shippedDate"));
            System.out.println("status = "+rs.getString("status"));
            System.out.println("comments = "+rs.getString("comments"));
            System.out.println("customerNumber = "+rs.getInt("customerNumber"));
            System.out.println("----------------------------");
            System.out.println("Detalles:");

            sql = "SELECT * from orderdetails od INNER JOIN products p ON od.productCode = p.productCode WHERE od.orderNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("----------------------------");
                System.out.println("productCode = "+rs.getString("productCode"));
                System.out.println("productName = "+rs.getString("productName"));
                System.out.println("Cantidad = "+rs.getInt("quantityOrdered"));
                System.out.println("buyPrice = "+rs.getFloat("buyPrice"));
                System.out.println("PriceEach = "+rs.getFloat("priceEach"));
                System.out.println("----------------------------");
            }


            sql = "SELECT SUM(priceEach*quantityOrdered)'Total' FROM orderdetails WHERE orderNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            rs = statement.executeQuery();

            rs.next();
            System.out.println("----------------------------");
            System.out.println("Total precio pedido = "+ rs.getFloat("Total")+" €");
            System.out.println("----------------------------");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
