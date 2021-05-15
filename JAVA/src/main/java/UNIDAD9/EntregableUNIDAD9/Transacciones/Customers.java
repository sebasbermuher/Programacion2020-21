package UNIDAD9.EntregableUNIDAD9.Transacciones;

public class Customers {
    private final Integer number;
    private final String name;
    private final String contactLastName;
    private final String contactFirstName;
    private final String phone;
    private final String direccion;
    private final String direccion2;
    private final String city;
    private final String state;
    private final String codigopostal;
    private final String country;
    private final String empleado_id;
    private final String limitecred;


    public Customers(Integer number, String name, String contactLastName, String contactFirstName, String phone, String direccion, String direccion2, String city, String state, String codigopostal, String country, String empleado_id, String limitecred) {
        this.number = number;
        this.name = name;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.phone = phone;
        this.direccion = direccion;
        this.direccion2 = direccion2;
        this.city = city;
        this.state = state;
        this.codigopostal = codigopostal;
        this.country = country;
        this.empleado_id = empleado_id;
        this.limitecred = limitecred;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getContactLastName() {
        return contactFirstName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public String getCountry() {
        return country;
    }

    public String getEmpleado_id() {
        return empleado_id;
    }

    public String getLimitecred() {
        return limitecred;
    }


}

