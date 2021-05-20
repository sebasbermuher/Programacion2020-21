package UNIDAD9.transacciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee {
    private final Integer employeeNumber;
    private final String lastName;
    private final String firstName;
    private final String extension;
    private final String email;
    private final String officeCode;
    private final Integer reportsTo;
    private final String jobTittle;

    public Employee(Integer employeeNumber, String lastName, String firstName, String extension, String email, String officeCode, Integer reportsTo, String jobTittle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.reportsTo = reportsTo;
        this.jobTittle = jobTittle;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getExtension() {
        return extension;
    }

    public String getEmail() {
        return email;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public Integer getReportsTo() {
        return reportsTo;
    }

    public String getJobTittle() {
        return jobTittle;
    }
    public static void insertEmployee(Employee employee) throws SQLException {
        Connection con=ConexionBD.getConnection();

        String sql="INSERT INTO employees VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,employee.getEmployeeNumber());
        sentencia.setString(2,employee.getLastName());
        sentencia.setString(3,employee.getFirstName());
        sentencia.setString(4,employee.getExtension());
        sentencia.setString(5,employee.getEmail());
        sentencia.setString(6, employee.getOfficeCode());
        sentencia.setInt(7,employee.getReportsTo());
        sentencia.setString(8,employee.getJobTittle());

        sentencia.executeUpdate();
    }

}
