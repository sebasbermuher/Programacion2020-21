package UNIDAD9.EntregableUNIDAD9.Transacciones;

import java.sql.Connection;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        Connection con= ConexionBD.getConnection();

        try{
            con.setAutoCommit(false);

            //Inserta nueva oficina
            OfficeModel.insertOffice(
                    new Office(
                            "9",
                            "Sevilla",
                            "662057896",
                            "Avda San Francisco",
                            "Ninguna",
                            "Andalucia",
                            "España",
                            "41920",
                            "EMEA"));

            System.out.println("Nueva oficina insertada");

            //Inserta dos nuevos empleados
            EmployeeModel.insertEmployee(
                    new Employee(3000,
                            "Montilla",
                            "Kike",
                            "8282",
                            "kikemontilla@gmail.com",
                            "9",
                            1102,
                            "Marketing"));
            con.commit();
            System.out.println("Nuevo empleado insertado");

            EmployeeModel.insertEmployee(
                    new Employee(
                            4000,
                            "Pellegrini",
                            "Manuel",
                            "8585",
                            "manolopellegrini@gmail.com",
                            "9",
                            1102,
                            "Ingeniero"));
            con.commit();
            System.out.println("Nuevo empleado insertado");


            //Inserta un nuevo cliente relacionado con uno de los empleados nuevo introducido anteriormente
            CustomersMoodel.insertCustomers(
                    new Customers(4000,
                            "Pipas Tijuanas",
                            "Bermudez",
                            "Sebastian",
                            "66258741",
                            "Calle",
                            "Ninguna",
                            "Sevilla",
                            "Andalucia",
                            "41940",
                            "España",
                            "4000",
                            "10000000"));
            con.commit();
            System.out.println("Nuevo cliente insertado");

            //Inserta una nueva categoria de producto
            ProductLineModel.inserProductLine(
                    new ProductLine("Bebidas",
                            "Todo tipo de bebidas",
                            "NULL",
                            ""));
            con.commit();
            System.out.println("Nueva categoria de producto insertada");


            //Inserta un nuevo producto relacionado con la categoria insertada anteriormente
            ProductsModel.insertProducts(
                    new Products("BH_1010",
                            "Coca-Cola",
                            "Bebidas",
                            "1:10",
                            "Alimentaciones Paquito",
                            "Un coacolita fresquito",
                            "150",
                            "0.75",
                            "1.50"));
            con.commit();
            System.out.println("Nuevo producto insertado");

        }catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (con!=null){
                    System.out.println("Dejamos la BBDD en estado consistente.");
                    con.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }
    }
}

